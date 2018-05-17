enum Scene {
    TITLE,
    CHARACTER_SELECT,
    GAME,
    RESULT,
}

public class Test1{
    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        // タイトルで初期化
        Scene scene = Scene.Title;

        // メインループ
        while (true) {
            switch(scene){
                case Scene.TITLE:
                    System.out.println("タイトル画面");
                    break;

                case Scene.CHARACTER_SELECT:
                    System.out.println("キャラクター選択画面");
                    break;

                case Scene.GAME:
                    System.out.println("ゲーム画面");
                    break;

                case Scene.RESULT:
                    System.out.println("結果画面");
                    break;

                default:
                    System.out.println("エラー");
                    break;
            }

            String str = scan.next();
            // タイトルへ移動
            if(str.equals("title")) {
                scene = Scene.Title;
            } else if(str.equals("select")) {
                scene = Scene.CHARACTER_SELECT;
            } else if(str.equals("game")) {
                scene = Scene.GAME;
            } else if(str.equals("result")) {
                scene = Scene.RESULT;
            } else if(str.equals("exit")) {
                break;
            }
        }
    }
}
