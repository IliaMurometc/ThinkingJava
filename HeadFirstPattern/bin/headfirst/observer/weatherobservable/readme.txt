DisplayElement
Observer���������Java�Դ���Observable�࣬���ṩ��ĳ��ʵ��
	CurrentConditionsDisplay
	ForecastDisplay
	HeatIndexDisplay
	StatisticsDisplay
Subject
	WeatherData
������
	WeatherStation
	WeatherStationHeatIndex
	
��Ҫ��ϵĵ�
	WeatherData�����setMeasurements -> measurementsChanged -> notifyObservers
	���캯��StatisticsDisplay(WeatherData weatherData)
	subject��register��remove������������list
	
