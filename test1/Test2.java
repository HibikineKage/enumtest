
public class Test1{

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        // intでシーン管理すると……
        int scene = 0;

        // メインループ
        while (true) {
            switch(scene){
                // 0の時って……ソースコード見ただけじゃ分からない
                case 0:
                    System.out.println("タイトル画面");
                    break;

                case 1:
                    System.out.println("キャラクター選択画面");
                    break;
                // ここにロード画面を挟みたくなったらどうするの……？
                case 2:
                    System.out.println("ゲーム画面");
                    break;

                case 3:
                    System.out.println("結果画面");
                    break;

                default:
                    System.out.println("エラー");
                    break;
            }

            // 入力でシーン遷移
            String str = scan.next();
            // タイトルへ移動
            if(str.equals("title")) {
                scene = 0;
            } else if(str.equals("select")) {
                scene = 1;
            } else if(str.equals("game")) {
                scene = 2;
            } else if(str.equals("result")) {
                scene = 3;
            } else if(str.equals("exit")) {
                break;
            }
        }
    }
}
