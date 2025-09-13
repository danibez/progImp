package outros;
public class JogoVelha {
    public static boolean verificaLinha(char[] linha, char c){
        if (linha[0] == linha[1] && linha[1] == linha[2]) {
            if (linha[0] == c)
                return true;   
        }
        return false;
    }

    public static boolean verificaColuna(char[][] m, char c, int coluna){
        // COMO LER UMA MATRIZ PELAS COLUNAS E NÃO POR LINHNAS
        // =========================================
        // char temp[] = new char[3];
        // for (int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 3; j++){
        //         temp[j] = m[j][i];
        //     }
        //     System.out.println(verificaLinha(temp, c));
        // }
        // =========================================
        
        if (m[0][coluna] == m[1][coluna] && m[1][coluna] == m[2][coluna]) {
            if (m[0][coluna] == c)
                return true;
        }
        return false;
    }

    public static boolean verificaDiagonalPrincipal(char[][] m, char c){
        if(m[0][0] == m[1][1] && m[1][1] == m[2][2]){
            if (c == m[0][0]) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificaDiagonalSecundaria(char[][] m, char c){
        if(m[0][2] == m[1][1] && m[1][1] == m[2][0]){
            if (c == m[0][2]) {
                return true;
            }
        }
        return false;
    }

   public static void main(String[] args) {
        char[][] m = {
                {'X', 'X', 'O'},
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
            };
        int vencedor = -1;
        // VERIFICAR LINHAS
        for (int i = 0; i < m.length; i++) {
            if(verificaLinha(m[i], 'X'))
                vencedor = 1;
            else if(verificaLinha(m[i], 'O'))
                vencedor = 0;
        }
        // VERIFICAR COLUNA
        for (int i = 0; i < m.length; i++) {
            if(verificaColuna(m, 'X', i))
                vencedor = 1;
            if(verificaColuna(m, 'O', i))
                vencedor = 0;
        }
        
        // VERIFICAR DIAGONAL PRINCIPAL
        if(verificaDiagonalPrincipal(m, 'X'))
            vencedor = 1;
        if(verificaDiagonalPrincipal(m, 'O'))
            vencedor = 0;

        // VERIFICAR DIAGONAL SECUNDARIA
        if(verificaDiagonalSecundaria(m, 'X'))
            vencedor = 1;
        if(verificaDiagonalSecundaria(m, 'O'))
            vencedor = 0;
        
        if (vencedor == 1) {
            System.out.println("X venceu");
        } else if (vencedor == 0){
            System.out.println("O venceu");
        } else
            System.out.println("Empate");
   } 
}
