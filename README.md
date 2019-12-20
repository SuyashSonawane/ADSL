# ADSL
cd Documents/Suyash/adsl
mkdir $1
cd $1
touch main.cpp
touch run.sh
echo "#include <iostream>

using namespace std; 
int main()
{

}
" >> main.cpp
echo "g++ main.cpp" >>run.sh
echo "./a.out" >> run.sh
subl ./main.cpp
g++ main.cpp
./a.out

