cd C:\Users\Ahmed.ElKady\Documents\NetBeansProjects\LaserDataShow_Update
git pull origin master
git add .
git diff --cached --quiet || git commit -m "Update some data"
git push origin master