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
private static void cadastrar() {
    System.out.println("\n===== Cadastro de Usuário =====\n");
        System.out.print("Nome: ");
        String nome = Console.lerString();
        System.out.print("Email: ");
        String email = Console.lerString();
        System.out.print("Tipo (1 - Professor, 2 - Coordenador, 3 - Diretor): ");
        int tipo = Console.lerInt();

        Usuario novoUser = null;
        switch (tipo) {
            case 1:
                novoUser = cadstrProf(nome, email);
                break;
            case 2:
                novoUser = cadstrCoord(nome, email);
                break;
            case 3:
                novoUser = cadstrDiret(nome, email);
                break;
            default:
                System.out.println("usuário inválido.");
        }

        if (novoUser != null) {
            Usuario.getListaUsers().add(novoUser);
            System.out.println("Usuário cadastrado.");
        }
}

private static void buscar() { }

 private static void editar() { }

private static void excluir() { }

private static void listar() { }

private static void excluirTodos() { }
