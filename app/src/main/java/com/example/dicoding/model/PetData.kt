package com.example.dicoding.model

import com.example.dicoding.R

object PetData {
    private val petNames = arrayOf(
        "Amy",
        "Coco",
        "Snowy",
        "Miko",
        "Akira",
        "Browny",
        "Ace",
        "Timmy",
        "Aiko",
        "Tama")

    private val petLocations = arrayOf(
        "Malang, Jawa Timur",
        "Bandung, Jawa Barat",
        "Pekalongan, Jawa Tengah",
        "Kediri, Jawa Timur",
        "Bekasi, Jawa Barat",
        "Semarang, Jawa Tengah",
        "Surabaya, Jawa Timur",
        "Batu, Jawa Timur",
        "Bogor, Jawa Barat",
        "Magelang, Jawa Tengah",
    )

    private val petWeights = arrayOf(
        "2 kg",
        "5 kg",
        "34 kg",
        "7 kg",
        "3.5 kg",
        "3.3 kg",
        "31 kg",
        "7 kg",
        "10 kg",
        "6 kg"
    )

    private val petAges = arrayOf(
        "2 Tahun",
        "3 Tahun",
        "7 Tahun",
        "4 Tahun",
        "2 Tahun",
        "3 Tahun",
        "9 Tahun",
        "4 Tahun",
        "6 Tahun",
        "4 Tahun",
    )

    private val petTypes = arrayOf(
        "Chihuahua",
        "Anggora",
        "Alaskan Malamute",
        "Maine Coon",
        "Pomeranian",
        "Munchkin",
        "Golden Retriever",
        "Persia",
        "Shiba Inu",
        "Ragdoll"
    )

    private val petDetails = arrayOf(
        "Amy adalah seekor Anjing Chihuahua yang berukuran kecil (Tiny Toy Size), memiliki tubuh yang lebih panjang daripada tingginya, bentuk kepalanya bulat seperti buah apel, bentuk moncong pendek, telinga tegak dan mempunyai ekor yang panjang. Amy memiliki bulu pendek dan lurus yang berwarna coklat dan putih. Amy merupakan anjing yang lincah dan penuh semangat, ia dapat belajar dengan cepat dan mendapatkan respon yang bagus saat dilatih. Amy suka dengan cuaca yang hangat dan ia suka berlari-lari di ruangan yang besar.",
        "Coco adalah seekor kucing Anggora dengan ciri khas berbulu putih panjang yang indah. Coco memiliki tubuh yang sedang dengan badan berotot yang panjang, ramping, langsing dan elegan. Coco memiliki hidung yang panjang, kepala yang berbentuk segitiga, serta telinga yang panjang, lebar, dan berbentuk segitiga. Coco suka menggoda dan mencari perhatian dari pemiliknya, sehingga ia dapat sedikit aktif saat berada di rumah. Coco cukup ramah terhadap kucing yang berada dilingkungan sekitarnya.",
        "Snowy merupakan anjing yang memiliki jenis Alaskan Malmute, ia memiliki tubuh yang besar, kuat, seimbang, bertenaga, dan memiliki tulang kaki yang besar. Ia memiliki warna bulu dominan putih yang bercorak abu-abu dan hitam dibagian atas. Snowy memiliki sifat yang bersahabat, pintar, serta mudah menyerap pelajaran apa yang diberikan. Memiliki sifat yang aktif dan energik. Snowy memiliki sifat yang ramah terhadap orang asing dan sangat patuh serta senang sekali bermain.",
        "Miko adalah kucing berjenis Maine Coon yang berukuran sedang, berotot, dan berdada lebar, serta dengan penampilan tubuhnya panjang seimbang. Bulu Miko merupakan ciri khas yang ada pada dirinya, bulunya berat dan panjang, shaggy, serta halus di sepanjang badannya. Ia menyukai saat bulunya disikat dan dibawa pemiliknya melakukan olahraga seperti jalan-jalan ringan. Coco memiliki kepala yang sedang dan lebar dengan dahi yang sedikit melengkung dan tulang pipi yang menonjol. Matanya besar dan berbentuk seperti oval. Hidungnya lebar dan di bagian ujungnya sedikit melengkung dan dagunya terlihat tajam. Telinganya besar dengan bagian bawahnnya lebar dan dibagian ujungnya lancip.",
        "Akira adalah seekor Anjing Pomeranian bertubuh kecil, mempunyai moncong pendek, warna hidungnya mengikuti warna bulu tubuhnya yaitu putih dengan variasi kuning, mata berbentuk almond berwarna gelap dan berukuran medium. Akira adalah anjing yang pintar, bersemangat untuk belajar, aktif, dapat dijadikan teman yang menyenangkan serta sangat setia pada majikan dan keluarganya. Akira biasanya mudah bersahabat dengan anjing lain. Akira sangat aktif di dalam ruangan dan ia tidak suka dengan cuaca panas.",
        "Browny adalah Kucing Munchkin yang memiliki ciri yang khas berupa kakinya yang pendek di mana adanya mutasi genetik secara alami. Cara duduk Browny terlihat sangat mirip dengan kelinci yang tengah duduk. Sehingga, ia mampu menarik banyak orang untuk menyukainya karena bentuknya yang lucu serta mudah untuk beradaptasi. Tak hanya lucu saja, Browny juga terlihat sangan menggemaskan karena memiliki karakteristik sifatnya yang lucu. Sifat yang paling menonjol pada kucing ini adalah mudah untuk beradaptasi dengan lingkungan baru, suka berinteraksi dengan manusia, dan kucing lainnya.",
        "Ace merupakan Anjing Golden Retriever dengan ukuran menengah besar. Memiliki tengkorak yang luas dan moncong yang lurus. Hidung berwarna hitam kecoklatan. Mata berukuran menengah besar berwarna coklat gelap, telinga yang pendek menggantung dekat pipi. Ace tidak hanya bisa dijadikan sebagai hewan peliharaan saja, ia juga bisa dijadikan sebagai anjing penjaga rumah. Hal tersebut dikarenakan tingkat kesetiaan yang dimiliki anjing golden kepada pemiliknya sehingga membuatnya banyak dijadikan anjing penjaga rumah.",
        "Timmy adalah Kucing jenis Persia yang merupakan ras yang paling terkenal dan populer di Indonesia, ia merupakan ras kucing domestik berbulu panjang dengan karakter wajah bulat. Timmy memiliki bentuk tubuh yang gemuk, besar, dan tambun. Selain itu, yang menjadi khas juga dari Timmy adalah bentuk hidungnya yang pesek, wajahnya terlihat bulat, dan memiliki bulu putih yang cukup lebat. Jika diamati dari samping, dahi, hidung, dan dagu terlihat sangat datar. Timmy memiliki sifat yang manja dan ia membutuhkan perawatan khusus agar tetap sehat",
        "Aiko adalah seekor anjing berjenis Shiba Inu, ia memiliki ciri khusus bulu tebal dan panjang berwarna kuning kecoklatan. Ia adalah anjing yang sangat aktif dan menyukai kegiatan mandiri dan sangat bersih dalam aktivitas buang kotoran, Aiko sangat pandai menggunakan kotak kotoran yang tersedia. Ia juga merupakan anjing yang memiliki naluri waspada kuat terhadap hal asing yang mencurigakan. Aiko adalah anjing yang banyak dikagumi lingkungan sekitarnya karena pintar dan patuh dengan majikan.",
        "Tama adalah Kucing Ragdoll yang memiliki kepala sedang, ia mempunyai bulu yang lebat sehingga memberikan kesan bahwa kepalanya cukup besar, kakinya cukup kuat karena bisa melompat tinggi, Tama memiliki warna mata yang sangat indah dan mempesona. Ia memiliki suara yang cukup lembut. Tama memiliki sifat yang ramah dan cukup manja, tetapi ia tidak suka mengganggu atau melekat pada orang lain."
    )

    private val petGender = intArrayOf(
        R.drawable.detail_female,
        R.drawable.detail_female,
        R.drawable.detail_male,
        R.drawable.detail_male,
        R.drawable.detail_female,
        R.drawable.detail_male,
        R.drawable.detail_male,
        R.drawable.detail_male,
        R.drawable.detail_female,
        R.drawable.detail_female,
    )

    private val petImages = intArrayOf(
        R.drawable.anjing_chihuahua,
        R.drawable.kucing_anggora,
        R.drawable.anjing_malamute,
        R.drawable.kucing_mainecoon,
        R.drawable.anjing_pomeranian,
        R.drawable.kucing_munchkin,
        R.drawable.anjing_retriever,
        R.drawable.kucing_persia,
        R.drawable.anjing_shibainu,
        R.drawable.kucing_ragdoll)

    val listData: ArrayList<Pet>
        get() {
            val list = arrayListOf<Pet>()
            for (position in petNames.indices){
                val pet = Pet()
                pet.name = petNames[position]
                pet.gender = petGender[position]
                pet.location = petLocations[position]
                pet.weight = petWeights[position]
                pet.age = petAges[position]
                pet.type = petTypes[position]
                pet.detail = petDetails[position]
                pet.photo = petImages[position]
                list.add(pet)
            }
            return list
        }
}