#include <stdio.h>

int main(void)
{
	float weight, height, height_,  bmi;

	printf("■ bmi 지수 계산하기 ■\n");
	printf("bmi 지수 계산법 : 몸무게 / 신장의 제곱\n");
	printf("\n몸무게(kg) : ");
	scanf_s("%f", &weight);
	printf("신장(cm) : ");
	scanf_s("%f", &height);
	height_ = height / 100;
	printf("\n몸무게(kg) : %.2fkg\n", weight);
	printf("신장(m) : %.2fm\n", height_);
	bmi = weight / (height_ * height_);
	printf("\nbmi 지수 = %.1f\n", bmi);
	if (bmi <= 18.5)
		printf("저체중\n");
	else if (bmi > 18.5 && bmi <= 24.9)
		printf("정상 체중\n");
	else if (bmi > 24.9 && bmi <= 29.9)
		printf("과체중\n");
	else if(bmi > 29.9 && bmi <= 34.9)
	{
		printf("비만\n");
		printf("관련질환 발병위험성 : 높다\n");
	}
	else if (bmi > 34.9 && bmi <= 39.9)
	{
		printf("비만\n");
		printf("관련질환 발병위험성 : 매우 높다\n");
	}
	else
	{
		printf("극단적 비만\n");
		printf("관련질환 발병위험성 : 극단적으로 높다\n");
	}
	return 0;
}