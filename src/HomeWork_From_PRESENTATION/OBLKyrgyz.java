package HomeWork_From_PRESENTATION;
//Enum түзүп 7 областты жазыңыз.
//Областка жараша барынын
//өзгөчөлүктөрүн консолго
//чыгарыңыз.
public enum OBLKyrgyz {
    BATKEN{
        @Override
        public void infoRegion() {
            System.out.println("""
                    The name Batkent is from the Iranian language 
                    of Sogdian and means "The city of wind". 
                    Batken became the administrative headquarters 
                    of the youngest of Kyrgyzstan's seven regions, 
                    created from the three westernmost districts of 
                    Osh Region in 1999, after concerns over radical 
                    Islamist activities in neighboring Tajikistan and 
                    Uzbekistan led to demands for a more direct and 
                    visible governmental presence in this remote and 
                    mountainous region.[citation needed] Batken Airport 
                    links the town with Bishkek. Since 2000, there is 
                    a small university in Batken.
                    """);
        }
    },
    JALAL_ABAD{
        @Override
        public void infoRegion() {
            System.out.println("""
                    The Jalal-Abad region in western Kyrgyzstan is 
                    famous for its long and rich history, wild walnut 
                    forests, green expanses, and pristine nature. It's 
                    a land of sacred religious sites and devout people, 
                    and is known for energy and power as it is home 
                    to the country's largest hydro-electric plants.
                    """);

        }
    },
    ISSYK_KUL{
        @Override
        public void infoRegion() {
            System.out.println("""
                    Issyk-Kul translates as "hot lake". The water 
                    temperature here does not drop to minus even 
                    in winter, so the lake never freezes. It is 
                    located at an altitude of 1,608 meters above 
                    sea level and ranks seventh in the list of 
                    the deepest lakes in the world.""");
        }
    },
    NARYN{
        @Override
        public void infoRegion() {
            System.out.println("""
                    Naryn (Kyrgyz: Нарын, romanized: Naryn,
                    Mongolian : Нарийн, Nariin, Traditional
                    Mongolian ) is the regional administrative
                    center of Naryn Region in central Kyrgyzstan.
                    Its area is 84 square kilometres (32 sq mi),
                    and its estimated population was 41,178 as of
                    January 2021.[1] The town was established
                    as a fortress on the caravan route in 1868.
                    It is situated on both banks of the river
                    Naryn (one of the main head waters of the
                    Syr Darya), which cuts a picturesque gorge
                    through the town. The city has two regional
                    museums and some hotels, but is otherwise residential.""");
        }
    },
    OSH{
        @Override
        public void infoRegion() {
            System.out.println("""
                    Osh (Kyrgyz and Russian: Ош; Uzbek: Osh/Ош) 
                    is the second-largest city in Kyrgyzstan,
                    located in the Fergana Valley in the south 
                    of the country and often referred to as the 
                    "capital of the south".[4] It is the oldest 
                    city in the country (estimated to be more 
                    than 3,000 years old) and has served as the 
                    administrative center of Osh Region since 1939. 
                    The city has an ethnically mixed population 
                    of 322,164 in 2021,[3] comprising Kyrgyz, 
                    Uzbeks, Ukrainians, Koreans, and other smaller 
                    ethnic groups. It is about 5 km from the 
                    Kyrgyzstan-Uzbekistan border. It is known for 
                    famous islamic scholar.                 
                    """);
        }
    },
    TALAS{
        @Override
        public void infoRegion() {
            System.out.println("""
                    Talas is a town in northwestern Kyrgyzstan, 
                    located in the Talas river valley between two 
                    mountain ranges. Its area is 13 square kilometres 
                    (5.0 sq mi),[1] and its resident population was 
                    40,308 in 2021.[2] It is the administrative 
                    headquarters of Talas Region. The town was founded 
                    by East Slavic settlers in 1877.[3] To the south 
                    is the Besh-Tash (‘five rocks’) valley with the 
                    Besh-Tash National Park.The Historic Battle of 
                    Talas was also fought here between the armies of 
                    the Abbasid Caliphate and the Tang Dynasty in 751. 
                    The Abbasids defeated the Chinese Empire.
                    """);
        }
    },
    CHUY{
        @Override
        public void infoRegion() {
            System.out.println("""
                    Chuy Region (Kyrgyz: Чүй облусу, romanized: Chüy oblusu; 
                    Russian: Чуйская область, romanized: Chuyskaya oblast) 
                    is the northernmost region (oblast) of the Kyrgyz Republic. 
                    This region surrounds the national capital of Kyrgyzstan, 
                    Bishkek. It is bounded on the north by Kazakhstan, and 
                    clockwise, Issyk-Kul Region, Naryn Region, Jalal-Abad Region, 
                    and Talas Region. Its administrative center is Bishkek. 
                    Its total area is 19,895 km2 (7,682 sq mi). The resident 
                    population of the region was 974,984 as of January 2021. 
                    The region has sizeable Russian (20.8% in 2009) and Dungan 
                    (6.2% in 2009) minorities.[4] It takes its name from the river 
                    Chuy, that flows through the region.
                    """);
        }
    };

    public abstract void infoRegion();
}
