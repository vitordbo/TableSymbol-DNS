import java.util.Scanner;

import hash.*;

public class Server {
    //Crie uma classe específica para realizar as operações do servidor
    private static final Scanner scanner = new Scanner(System.in);

    public void userOptions() throws InterruptedException {
        System.out.println("----------------------------------------");
        TabelaHash TabelaHash = new TabelaHash(25);
        
        System.out.println("----------------------------------------");
        System.out.println("Adicionando..."); 
        System.out.println("----------------------------------------");

        // priemiros 25 = sites reais  
        TabelaHash.set("google.com", "216.239.41.99:5000"); // 1
        TabelaHash.set("espn.com", "199.181.135.201:6000"); //2
        TabelaHash.set("yahoo.com", "216.109.118.65:7000"); // 3
        TabelaHash.set("facebook.com", "212.169.12.98:4000"); // 4
        TabelaHash.set("bing.com", "197.181.135.231:9000"); // 5
        TabelaHash.set("wpp.com", "206.109.158.65:7000"); // 6
        TabelaHash.set("zapzap.com", "278.229.32.99:5000"); // 7
        TabelaHash.set("telgram.com", "178.111.105.201:6000"); //8 
        TabelaHash.set("jus.com", "266.165.168.25:7000");//9
        TabelaHash.set("globo.com", "213.229.41.95:5000");//10
        TabelaHash.set("sigaa.com", "129.181.135.201:6000");//11
        TabelaHash.set("googledocs.com", "246.169.418.65:7000");//12
        TabelaHash.set("googleimages.com", "226.239.61.69:5000");//13
        TabelaHash.set("ge.com", "159.141.135.201:6000");//14
        TabelaHash.set("tecmundo.com", "211.106.518.65:7000"); //15
        TabelaHash.set("techtudo.com", "216.229.49.99:5000"); //16
        TabelaHash.set("uol.com", "239.131.145.201:6000");//17
        TabelaHash.set("clickjogos.com", "206.105.128.45:7000");//18
        TabelaHash.set("jogos.com", "206.239.41.59:4000");//19
        TabelaHash.set("pdi.com", "119.111.125.201:6000");//20
        TabelaHash.set("steam.com", "25.169.128.65:7000");//21
        TabelaHash.set("ensoft.com", "218.229.61.99:5000"); //22
        TabelaHash.set("csgo.com", "105.181.635.201:6000"); //23
        TabelaHash.set("tiktok.com", "216.169.418.65:7000"); //24
        TabelaHash.set("twitter.com", "116.259.31.99:5000"); //25

        Thread.sleep(10000); // 10segundos
        System.out.println("25 valores foram adiconados!");
        
        System.out.println("----------------------------------------");
        System.out.println("Adicionando..."); 
        System.out.println("----------------------------------------");

        
        // segunda onda de 25 = objetos
        TabelaHash.set("mouse.com", "274.122.46.99:5000"); // 1
        TabelaHash.set("pc.com", "199.381.235.261:6500"); //2
        TabelaHash.set("monitor.com", "266.509.128.15:1000"); // 3
        TabelaHash.set("ram.com", "212.169.12.98:4000"); // 4
        TabelaHash.set("driver.com", "137.11.15.271:9000"); // 5
        TabelaHash.set("lan.com", "296.19.128.15:7000"); // 6
        TabelaHash.set("disk.com", "278.229.82.49:5000"); // 7
        TabelaHash.set("ssd.com", "178.161.149.201:6000"); //8 
        TabelaHash.set("teclado.com", "266.125.158.25:7000");//9
        TabelaHash.set("usb.com", "213.129.41.55:8000");//10
        TabelaHash.set("usbc.com", "129.121.105.201:6000");//11
        TabelaHash.set("fone.com", "246.164.438.25:7000");//12
        TabelaHash.set("airpods.com", "226.459.64.69:5000");//13
        TabelaHash.set("ipad.com", "159.141.335.201:6000");//14
        TabelaHash.set("iphone.com", "211.186.560.65:7000"); //15
        TabelaHash.set("internet.com", "216.229.69.97:6000"); //16
        TabelaHash.set("bateria.com", "239.531.145.241:6000");//17
        TabelaHash.set("carregador.com", "206.125.118.45:7000");//18
        TabelaHash.set("microfone.com", "206.139.41.69:4000");//19
        TabelaHash.set("luz.com", "119.111.625.201:6000");//20
        TabelaHash.set("tablet.com", "65.469.128.65:7000");//21
        TabelaHash.set("arcond.com", "818.229.66.109:5000"); //22
        TabelaHash.set("projetor.com", "105.121.615.201:6000"); //23
        TabelaHash.set("lona.com", "216.160.718.65:7000"); //24
        TabelaHash.set("quadro.com", "116.259.301.909:5000"); //25

        
        Thread.sleep(10000); // 10segundos
        System.out.println("25 valores foram adiconados!");
        System.out.println("----------------------------------------");
        System.out.println("Adicionando..."); 
        System.out.println("----------------------------------------");
        
        // terceira onda de 25 = nomes 
        TabelaHash.set("dudu.com", "206.2912.41.99:5000"); // 1
        TabelaHash.set("edu.com", "194.181.139.271:6000"); //2
        TabelaHash.set("duda.com", "216.1979.7018.775:7000"); // 3
        TabelaHash.set("bianca.com", "202.769.12.98:4000"); // 4
        TabelaHash.set("lice.com", "197.681.105.281:9000"); // 5
        TabelaHash.set("auri.com", "296.199.178.75:9000"); // 6
        TabelaHash.set("luiz.com", "268.209.355.99:5000"); // 7
        TabelaHash.set("messi.com", "168.111.155.201:6000"); //8 
        TabelaHash.set("neymar.com", "246.165.158.25:7000");//9
        TabelaHash.set("bale.com", "253.229.401.95:5000");//10
        TabelaHash.set("saka.com", "629.101.136.201:6000");//11
        TabelaHash.set("pedro.com", "446.569.618.65:7000");//12
        TabelaHash.set("fabio.com", "626.439.611.69:5000");//13
        TabelaHash.set("paulo.com", "569.541.135.201:6000");//14
        TabelaHash.set("gabriel.com", "311.206.418.65:7000"); //15
        TabelaHash.set("amanda.com", "316.529.494.99:5000"); //16
        TabelaHash.set("vitor.com", "439.161.155.801:6000");//17
        TabelaHash.set("helcio.com", "306.605.528.45:7000");//18
        TabelaHash.set("leiva.com", "106.539.551.59:4000");//19
        TabelaHash.set("jaco.com", "169.121.655.201:6000");//20
        TabelaHash.set("yaskara.com", "225.159.428.65:7000");//21
        TabelaHash.set("brega.com", "278.269.641.99:5000"); //22
        TabelaHash.set("pv.com", "185.171.645.201:6000"); //23
        TabelaHash.set("caio.com", "716.769.218.65:7000"); //24
        TabelaHash.set("ingrid.com", "316.759.321.99:5000"); //25

        Thread.sleep(10000); // 10segundos
        System.out.println("25 valores foram adiconados!");

        System.out.println("----------------------------------------");
        System.out.println("Adicionando..."); // colcoar time 
        System.out.println("----------------------------------------");
        
        // 25 finais = cidades 
        TabelaHash.set("london.com", "266.369.451.99:5000"); // 1
        TabelaHash.set("manchester.com", "139.151.115.201:6000"); //2
        TabelaHash.set("bolton.com", "206.169.188.655:7000"); // 3
        TabelaHash.set("liverpool.com", "202.159.12.958:4000"); // 4
        TabelaHash.set("paris.com", "197.181.145.531:9000"); // 5
        TabelaHash.set("lisboa.com", "246.409.358.465:7000"); // 6
        TabelaHash.set("fortaleza.com", "258.249.552.99:5000"); // 7
        TabelaHash.set("natal.com", "198.141.145.241:6000"); //8 
        TabelaHash.set("pdf.com", "276.185.148.25:7000");//9
        TabelaHash.set("mossoro.com", "273.279.421.95:5000");//10
        TabelaHash.set("tibau.com", "219.141.125.201:6000");//11
        TabelaHash.set("assu.com", "246.149.818.65:7000");//12
        TabelaHash.set("quixada.com", "286.299.651.69:5000");//13
        TabelaHash.set("gramado.com", "149.141.145.201:6000");//14
        TabelaHash.set("parnamirin.com", "241.146.568.685:7000"); //15
        TabelaHash.set("ny.com", "616.229.49.979:5000"); //16
        TabelaHash.set("vegas.com", "539.181.245.201:6000");//17
        TabelaHash.set("montreal.com", "296.155.168.45:7000");//18
        TabelaHash.set("vancouver.com", "856.259.211.59:4000");//19
        TabelaHash.set("alaska.com", "569.141.155.201:6000");//20
        TabelaHash.set("recife.com", "225.189.158.65:7000");//21
        TabelaHash.set("sp.com", "258.249.611.99:5000"); //22
        TabelaHash.set("rio.com", "165.181.635.201:6000"); //23
        TabelaHash.set("jp.com", "256.169.498.645:7000"); //24
        TabelaHash.set("manaus.com", "166.269.341.99:5000"); //25

        System.out.println("Finalizando adições..."); 
        System.out.println("----------------------------------------");
  
        TabelaHash.showTable(); // mostrando 

        int opcao;
        System.out.println("Todos os 100 valores foram adiconados!");
        System.out.println("----------------");

        System.out.println("Escolha a opção:");
        System.out.println(" 0 - Sair");
        System.out.println(" 1 - Buscar por url"); 
        System.out.println(" 2 - Mostrar frequencia");  
        System.out.println(" 3 - Inserção por url (chave)"); 
        System.out.println(" 4 - Excluir"); 
       

        opcao = scanner.nextInt();

        while (opcao !=0) {
            switch (opcao) {
                case 1:{ // buscar por url
                    System.out.println("----------------");
                    System.out.println("Digite a url: ");
                    scanner.nextLine();
                    String url = scanner.nextLine(); 
                    String ip = TabelaHash.buscar(url);

                    if(ip != null){
                        System.out.println("----------------");
                        System.out.println("Url: " + url );
                        System.out.println("IP: " + ip );
                        System.out.println("----------------");
                    } else{
                        System.out.println("----------------");
                        System.out.println("Url não encontrada");
                        System.out.println("----------------");
                    }

                    break;
                }
                case 2:{ // mostrar frequencia
                    System.out.println("----------------");
                    System.out.println("Mostrando frequencia atualizada: ");
                    TabelaHash.showTable();
                    break;
                }
                case 3:{ //inserção por url 
                    System.out.println("----------------");
                    System.out.println("Digite a url que deseja inserir: ");
                    scanner.nextLine();
                    String url = scanner.nextLine(); 
                    String ip = TabelaHash.buscar(url); // testar se tem 

                    if(ip != null){ // se já tem 
                        System.out.println("----------------");
                        System.out.println("A url já se encontra no servidor: ");
                        System.out.println("Url: " + url );
                        System.out.println("IP: " + ip );
                        System.out.println("----------------");
                        System.out.println("Deseja atualizar o ip?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não" );
                        int atualizar = scanner.nextInt();

                        if(atualizar == 1){ // caso o cliente queira atualizar o ip
                            TabelaHash.remove(url); // iria ficar duplicada => mas remove antes 
                            System.out.println("Defina seu ip para a nova url");
                            scanner.nextLine();
                            String ipNovo = scanner.nextLine(); 
                            TabelaHash.set(url, ipNovo);
                            System.out.println("----------------");
                            System.out.println("Valor atualizado com sucesso");
                            System.out.println("----------------");
                            break;
                        } else{
                            System.out.println("----------------");
                            break;
                        }
                    } else{ // se não tem => escolher o novo ip
                        System.out.println("----------------");
                        System.out.println("Url não encontrada");
                        System.out.println("Defina seu ip para a nova url");
                        //scanner.nextLine();
                        String ipNovo = scanner.nextLine(); 
                        TabelaHash.set(url, ipNovo);
                        System.out.println("----------------");
                    }
                    
                    String ipNovoBuscar = TabelaHash.buscar(url);

                    // retornando o novo para mostrar que inseriu
                    if(ipNovoBuscar != null){
                        System.out.println("----------------");
                        System.out.println("Url e ip foram adicionados com sucesso!");
                        System.out.println("Url: " + url );
                        System.out.println("IP: " + ipNovoBuscar );
                        System.out.println("----------------");
                    } else{ // não cadatrou = erro 
                        System.out.println("----------------");
                        System.out.println("Url não encontrada");
                        System.out.println("----------------");
                    }
                    break;
                }
                case 4:{
                    System.out.println("----------------");
                    System.out.println("Digite a url para ser removida: ");
                    scanner.nextLine();
                    String url = scanner.nextLine(); 
                    String ip = TabelaHash.buscar(url);

                    if(ip != null){
                        System.out.println("----------------");
                        System.out.println("A url foi encontrada");

                        System.out.println("Deseja remover a url?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não" );
                        int atualizar = scanner.nextInt();

                        if(atualizar == 1){ // caso o cliente queira atualizar o ip
                            TabelaHash.remove(url); // iria ficar duplicada => mas remove antes 
                            System.out.println("----------------");
                            System.out.println("Valor removido com sucesso");
                            System.out.println("----------------");
                            break;
                        } else{
                            System.out.println("----------------");
                            break;
                        }

                    } else{
                        System.out.println("----------------");
                        System.out.println("Url não encontrada");
                        System.out.println("----------------");
                    }
                    break;
                }
                default:{
                    break;
                }
            }

            System.out.println("----------------");
            System.out.println("Escolha a opção:");
            System.out.println(" 0 - Sair");
            System.out.println(" 1 - Buscar por url"); 
            System.out.println(" 2 - Mostrar frequencia");  
            System.out.println(" 3 - Inserção por url (chave)"); 
            System.out.println(" 4 - Excluir"); 
            opcao = scanner.nextInt();
        }

        }

    }
