import java.util.*;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine();

        Map<String, Long> eventosPorServico = new HashMap<>();
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            eventosPorServico.merge(servico, 1L, (existingValue, newValue) -> existingValue + 1);
        }
        
        Long maiorLogs = Long.MIN_VALUE;
        Map.Entry<String, Long> servicoComMaiorLogs = null;

        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            if (entry.getValue() > maiorLogs) {
                maiorLogs = entry.getValue();
                servicoComMaiorLogs = entry;
            }
        }
        
        Long menorLogs = Long.MAX_VALUE;
        Map.Entry<String, Long> servicoComMenorLogs = null;

        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            if (entry.getValue() < menorLogs) {
                menorLogs = entry.getValue();
                servicoComMenorLogs = entry;
            }
        }
        
        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        
        System.out.println("Maior:" + servicoComMaiorLogs.getKey());
        System.out.println("Menor:" + servicoComMenorLogs.getKey());
    }
}