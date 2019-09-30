int sum=0;
for(int i=1;i<=100;i++){
  sum+=Math.pow(i,2);
}

int sumx=0;
for(int j=1;j<=100;j++){
  sumx+=j;
}

sumx*=sumx;
System.out.println(sumx-sum);
