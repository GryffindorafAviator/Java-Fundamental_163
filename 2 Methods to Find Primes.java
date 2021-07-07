// 1, eliminate even numbers, number of cycles is approximate to n/2
if(x==1 || x%2==0 && x!=2)
{
	isPrime = false;
}
else
{
	for(int 1=3; i<x; i+=2)
	{
		if(x%i == 0)
		{
			isPrime = false;
			break;
		}
	}
}
    
//2, to sqrt(x), number of cycles is sqrt(x)
for(int i=3; i<Math.sqrt(x); i+=2)
{
	if(x%i == 0)
	{
		isPrime = false;
		break;
	}
}
