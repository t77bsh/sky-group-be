package com.sky.getyourway.utils;

public class TestData {
    public static String getFutureWeatherData() {
        return "{\"location\":{\"name\":\"Suvarnabhumi Airport\",\"region\":\"Bangkok\",\"country\":\"Thailand\",\"lat\":13.69,\"lon\":100.75,\"tz_id\":\"Asia/Bangkok\",\"localtime_epoch\":1691344428,\"localtime\":\"2023-08-07 0:53\"},\"forecast\":{\"forecastday\":[{\"date\":\"2024-04-21\",\"date_epoch\":1713657600,\"day\":{\"maxtemp_c\":34.8,\"maxtemp_f\":94.7,\"mintemp_c\":28.8,\"mintemp_f\":83.9,\"avgtemp_c\":31.3,\"avgtemp_f\":88.3,\"maxwind_mph\":13.4,\"maxwind_kph\":21.6,\"totalprecip_mm\":1.19,\"totalprecip_in\":0.05,\"avgvis_km\":9.9,\"avgvis_miles\":6.0,\"avghumidity\":62.0,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/day/305.png\",\"code\":1192},\"uv\":0.0},\"astro\":{\"sunrise\":\"06:00 AM\",\"sunset\":\"06:31 PM\",\"moonrise\":\"04:31 PM\",\"moonset\":\"04:13 AM\",\"moon_phase\":\"Waxing Gibbous\",\"moon_illumination\":\"92\"},\"hour\":[{\"time_epoch\":1713632400,\"time\":\"2024-04-21 00:00\",\"temp_c\":29.5,\"temp_f\":85.1,\"is_day\":0,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/night/113.png\",\"code\":1000},\"wind_mph\":10.1,\"wind_kph\":16.2,\"wind_degree\":189,\"wind_dir\":\"S\",\"pressure_mb\":1008.0,\"pressure_in\":29.77,\"precip_mm\":0.0,\"precip_in\":0.0,\"humidity\":71,\"cloud\":17,\"feelslike_c\":34.4,\"feelslike_f\":93.9,\"windchill_c\":29.5,\"windchill_f\":85.1,\"heatindex_c\":34.4,\"heatindex_f\":93.9,\"dewpoint_c\":24.0,\"dewpoint_f\":75.3,\"will_it_rain\":0,\"chance_of_rain\":0,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":10.0,\"vis_miles\":6.0,\"gust_mph\":14.6,\"gust_kph\":23.4},{\"time_epoch\":1713643200,\"time\":\"2024-04-21 03:00\",\"temp_c\":29.2,\"temp_f\":84.6,\"is_day\":0,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/night/176.png\",\"code\":1063},\"wind_mph\":8.9,\"wind_kph\":14.3,\"wind_degree\":193,\"wind_dir\":\"SSW\",\"pressure_mb\":1007.0,\"pressure_in\":29.74,\"precip_mm\":0.02,\"precip_in\":0.0,\"humidity\":74,\"cloud\":21,\"feelslike_c\":34.2,\"feelslike_f\":93.6,\"windchill_c\":29.2,\"windchill_f\":84.6,\"heatindex_c\":34.2,\"heatindex_f\":93.6,\"dewpoint_c\":24.3,\"dewpoint_f\":75.7,\"will_it_rain\":0,\"chance_of_rain\":64,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":9.9,\"vis_miles\":6.0,\"gust_mph\":12.7,\"gust_kph\":20.4},{\"time_epoch\":1713654000,\"time\":\"2024-04-21 06:00\",\"temp_c\":29.0,\"temp_f\":84.2,\"is_day\":0,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/night/176.png\",\"code\":1063},\"wind_mph\":7.2,\"wind_kph\":11.5,\"wind_degree\":203,\"wind_dir\":\"SSW\",\"pressure_mb\":1009.0,\"pressure_in\":29.78,\"precip_mm\":0.03,\"precip_in\":0.0,\"humidity\":73,\"cloud\":20,\"feelslike_c\":33.8,\"feelslike_f\":92.9,\"windchill_c\":29.0,\"windchill_f\":84.2,\"heatindex_c\":33.8,\"heatindex_f\":92.9,\"dewpoint_c\":24.2,\"dewpoint_f\":75.5,\"will_it_rain\":0,\"chance_of_rain\":65,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":9.9,\"vis_miles\":6.0,\"gust_mph\":9.3,\"gust_kph\":15.0},{\"time_epoch\":1713664800,\"time\":\"2024-04-21 09:00\",\"temp_c\":32.2,\"temp_f\":90.0,\"is_day\":1,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/day/176.png\",\"code\":1063},\"wind_mph\":8.0,\"wind_kph\":12.9,\"wind_degree\":205,\"wind_dir\":\"SSW\",\"pressure_mb\":1010.0,\"pressure_in\":29.81,\"precip_mm\":0.02,\"precip_in\":0.0,\"humidity\":56,\"cloud\":14,\"feelslike_c\":37.6,\"feelslike_f\":99.7,\"windchill_c\":32.2,\"windchill_f\":90.0,\"heatindex_c\":37.6,\"heatindex_f\":99.7,\"dewpoint_c\":23.2,\"dewpoint_f\":73.7,\"will_it_rain\":1,\"chance_of_rain\":71,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":9.9,\"vis_miles\":6.0,\"gust_mph\":11.3,\"gust_kph\":18.1},{\"time_epoch\":1713675600,\"time\":\"2024-04-21 12:00\",\"temp_c\":34.2,\"temp_f\":93.6,\"is_day\":1,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/day/176.png\",\"code\":1063},\"wind_mph\":9.6,\"wind_kph\":15.4,\"wind_degree\":193,\"wind_dir\":\"SSW\",\"pressure_mb\":1007.0,\"pressure_in\":29.75,\"precip_mm\":0.06,\"precip_in\":0.0,\"humidity\":50,\"cloud\":13,\"feelslike_c\":39.7,\"feelslike_f\":103.5,\"windchill_c\":34.2,\"windchill_f\":93.6,\"heatindex_c\":39.7,\"heatindex_f\":103.5,\"dewpoint_c\":22.6,\"dewpoint_f\":72.7,\"will_it_rain\":1,\"chance_of_rain\":86,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":9.9,\"vis_miles\":6.0,\"gust_mph\":14.5,\"gust_kph\":23.3},{\"time_epoch\":1713686400,\"time\":\"2024-04-21 15:00\",\"temp_c\":34.6,\"temp_f\":94.2,\"is_day\":1,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/day/176.png\",\"code\":1063},\"wind_mph\":11.2,\"wind_kph\":18.1,\"wind_degree\":184,\"wind_dir\":\"S\",\"pressure_mb\":1005.0,\"pressure_in\":29.69,\"precip_mm\":0.1,\"precip_in\":0.0,\"humidity\":47,\"cloud\":19,\"feelslike_c\":39.6,\"feelslike_f\":103.3,\"windchill_c\":34.6,\"windchill_f\":94.2,\"heatindex_c\":39.6,\"heatindex_f\":103.3,\"dewpoint_c\":21.9,\"dewpoint_f\":71.5,\"will_it_rain\":1,\"chance_of_rain\":88,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":9.9,\"vis_miles\":6.0,\"gust_mph\":15.4,\"gust_kph\":24.8},{\"time_epoch\":1713697200,\"time\":\"2024-04-21 18:00\",\"temp_c\":31.7,\"temp_f\":89.0,\"is_day\":1,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/day/176.png\",\"code\":1063},\"wind_mph\":10.6,\"wind_kph\":17.0,\"wind_degree\":183,\"wind_dir\":\"S\",\"pressure_mb\":1006.0,\"pressure_in\":29.7,\"precip_mm\":0.02,\"precip_in\":0.0,\"humidity\":60,\"cloud\":18,\"feelslike_c\":36.5,\"feelslike_f\":97.7,\"windchill_c\":31.7,\"windchill_f\":89.0,\"heatindex_c\":36.5,\"heatindex_f\":97.7,\"dewpoint_c\":22.9,\"dewpoint_f\":73.3,\"will_it_rain\":0,\"chance_of_rain\":60,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":10.0,\"vis_miles\":6.0,\"gust_mph\":15.8,\"gust_kph\":25.5},{\"time_epoch\":1713708000,\"time\":\"2024-04-21 21:00\",\"temp_c\":30.1,\"temp_f\":86.2,\"is_day\":0,\"condition\":{\"text\":\"\",\"icon\":\"//cdn.weatherapi.com/weather/64x64/night/113.png\",\"code\":1000},\"wind_mph\":12.5,\"wind_kph\":20.0,\"wind_degree\":190,\"wind_dir\":\"S\",\"pressure_mb\":1008.0,\"pressure_in\":29.77,\"precip_mm\":0.0,\"precip_in\":0.0,\"humidity\":68,\"cloud\":14,\"feelslike_c\":35.2,\"feelslike_f\":95.4,\"windchill_c\":30.1,\"windchill_f\":86.2,\"heatindex_c\":35.2,\"heatindex_f\":95.4,\"dewpoint_c\":23.9,\"dewpoint_f\":75.0,\"will_it_rain\":0,\"chance_of_rain\":0,\"will_it_snow\":0,\"chance_of_snow\":0,\"vis_km\":10.0,\"vis_miles\":6.0,\"gust_mph\":17.1,\"gust_kph\":27.6}]}]}}";
    }
}