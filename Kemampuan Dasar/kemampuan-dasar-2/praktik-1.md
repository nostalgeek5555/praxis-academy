#kemampuan dasar 2
##alice & bob git collaboration example


naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2
$ git init
Initialized empty Git repository in E:/praxisAcademy/kemampuandasar2/.git/

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ touch README.txt

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git add README.txt

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git commit -m 'first commit.'
[master (root-commit) fa56bc4] first commit.
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 README.txt

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git status
On branch master
nothing to commit, working tree clean

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ echo 'this repo is a collection of my favorite nursery rhymes.' >> README.txt

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   README.txt

no changes added to commit (use "git add" and/or "git commit -a")

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git diff
warning: LF will be replaced by CRLF in README.txt.
The file will have its original line endings in your working directory
diff --git a/README.txt b/README.txt
index e69de29..56dacca 100644
--- a/README.txt
+++ b/README.txt
@@ -0,0 +1 @@
+this repo is a collection of my favorite nursery rhymes.

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git add README.txt
warning: LF will be replaced by CRLF in README.txt.
The file will have its original line endings in your working directory

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git commit -m 'added project overview to README.txt'
[master 46c3736] added project overview to README.txt
 1 file changed, 1 insertion(+)

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ wget https://www.acquia.com/sites/default/files/blog/all-around-the-mulberry-bush.txt
bash: wget: command not found

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ wget
bash: wget: command not found

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        all-around-the-mulberry-bush.txt
        hickory-dickory-dock.txt
        hokey-pokey.txt
        jack-and-jill.txt
        old-mother-hubbard.txt
        roses-are-red.txt
        twinkle-twinkle.txt

nothing added to commit but untracked files present (use "git add" to track)

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git add
Nothing specified, nothing added.
Maybe you wanted to say 'git add .'?

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git add .
warning: LF will be replaced by CRLF in all-around-the-mulberry-bush.txt.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in hickory-dickory-dock.txt.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in hokey-pokey.txt.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in jack-and-jill.txt.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in old-mother-hubbard.txt.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in roses-are-red.txt.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in twinkle-twinkle.txt.
The file will have its original line endings in your working directory

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git commit -m 'Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt'
[master 3182e2e] Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
 7 files changed, 100 insertions(+)
 create mode 100644 all-around-the-mulberry-bush.txt
 create mode 100644 hickory-dickory-dock.txt
 create mode 100644 hokey-pokey.txt
 create mode 100644 jack-and-jill.txt
 create mode 100644 old-mother-hubbard.txt
 create mode 100644 roses-are-red.txt
 create mode 100644 twinkle-twinkle.txt

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git log
commit 3182e2ef6b4e6497a43e8c99e33680c006c44b9f (HEAD -> master)
Author: Naufal Asyhab <naufalasyhab@gmail.com>
Date:   Sun Oct 20 02:36:25 2019 +0700

    Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

commit 46c37361d6f0277a66a8135cdef329470161c35f
Author: Naufal Asyhab <naufalasyhab@gmail.com>
Date:   Sun Oct 20 01:11:12 2019 +0700

    added project overview to README.txt

commit fa56bc41ca24f431fb0a6b46a989f7ffde95f9f6
Author: Naufal Asyhab <naufalasyhab@gmail.com>
Date:   Sun Oct 20 01:09:01 2019 +0700

    first commit.

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git log --oneline
3182e2e (HEAD -> master) Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt
46c3736 added project overview to README.txt
fa56bc4 first commit.

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git log -p
commit 3182e2ef6b4e6497a43e8c99e33680c006c44b9f (HEAD -> master)
Author: Naufal Asyhab <naufalasyhab@gmail.com>
Date:   Sun Oct 20 02:36:25 2019 +0700

    Added old-mother-hubbard.txt, twinkle-twinkle.txt, hokey-pokey.txt

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git remote add origin https://github.com/nostalgeek5555/rhymes.git

naufa@DESKTOP-OKQN8AI MINGW64 /e/praxisAcademy/kemampuandasar2 (master)
$ git push -u origin master
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 4 threads
Compressing objects: 100% (12/12), done.
Writing objects: 100% (15/15), 2.11 KiB | 432.00 KiB/s, done.
Total 15 (delta 0), reused 0 (delta 0)
To https://github.com/nostalgeek5555/rhymes.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.