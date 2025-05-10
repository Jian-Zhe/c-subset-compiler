進入python虛擬環境: （否則無法執行antlr4）
source venv/bin/activate

產生Parser及編譯Parser與testParser:
make

僅產生Parser:
make antlr

僅編譯:
make compile

執行: （預設為使用testLiteral.c作為input）
make run

修改input檔案:
Makefile -> 規則run -> 將testLiteral.c替換成其他測試程式

清理:
make clean