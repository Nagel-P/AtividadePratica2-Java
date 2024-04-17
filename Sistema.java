class Sistema {

    public static void executar() {
        int op;
        do {
            menu();
            op = Console.lerInt();

            switch (op) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    editar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    listar();
                    break;
                case 6:
                    excluirTodos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }
    
    private static void menu() {
        System.out.println("\n===== Menu =====\n");
        System.out.println("(1) Cadastrar");
        System.out.println("(2) Buscar");
        System.out.println("(3) Editar");
        System.out.println("(4) Excluir");
        System.out.println("(5) Listar");
        System.out.println("(6) Excluir Todos");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
    }
private static void cadastrar() { }

private static void buscar() { }

 private static void editar() { }

private static void excluir() { }

private static void listar() { }

private static void excluirTodos() { }
