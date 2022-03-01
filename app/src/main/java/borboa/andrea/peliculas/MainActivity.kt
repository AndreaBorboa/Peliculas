package borboa.andrea.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas:ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()
        var adapter=AdaptadorMovies(this,peliculas)
        var listView:ListView=findViewById(R.id.listv)
        listView.adapter=adapter
    }


    fun llenar_peliculas(){
        val pelicula1=Pelicula(1,"Batman","El director Matt Reeves (películas de “El Planeta de los Simios”) está al frente con Robert Pattinson (“Tenet”, “El Faro”, “Good Time: Viviendo al Límite”) quien protagoniza a Batman —el detective vigilante de Ciudad Gótica— y a el multimillonario Bruce Wayne.",176,R.drawable.batman)
        peliculas.add(pelicula1)

        val pelicula2=Pelicula(2,"El contador de cartas","Un thriller de venganza que cuenta la historia de William Tell (Oscar Isaac) un exmilitar convertido en jugador profesional de póker, atormentado por los fantasmas de su pasado y que esta decidido a ejecutar un plan de venganza contra un coronel militar. Producida por Martin Scorsese y dirigida por Paul Schrader.",112,R.drawable.elcontador)
        peliculas.add(pelicula2)

        val pelicula3=Pelicula(3,"Digimon Adventure: La Última Evolución Kizuna","Ocurre un fenómeno sin precedentes y los Niños Elegidos descubren que crecer significa el fin de su conexión con sus Digimon. Además de eso, los Elegidos se dan cuenta que cuanto mas luchan con su Digimon, mas rápido se rompe su vínculo. ¿Lucharan por los demás arriesgándose a perder? El momento de elegir y decidir se acerca rápidamente. Tai, Agumon y los demás, se verán obligados a arriesgarlo todo en su última aventura épica.",95,R.drawable.digimon)
        peliculas.add(pelicula3)

        val pelicula4=Pelicula(4,"Uncharted: Fuera del Mapa","Basado en uno de los juegos más aclamados por la critica y que más ha vendido en la historia, Uncharted: Fuera del mapa, narra la historia de Nathan Drake y la primer aventura con su socio-rival Victor “Sully” Sullivan. Estelarizada por Tom Holland como Nathan Drake y Mark Wahlberg como el bromista de intelecto rápido Sully. Uncharted: Fuera del mapa presenta al público la manera en que Nathan Drake se convierte en un cazador de tesoros mientras que resuelve los más grandes misterios en una aventura llena de aventura y acción épica alrededor del mundo.",116,R.drawable.fueradelmapa)
        peliculas.add(pelicula4)

        val pelicula5=Pelicula(5,"Muerte en el Nilo","MUERTE EN EL NILO es una película de suspenso basada en la novela de Agatha Christie de 1937 acerca del caos emocional y las drásticas consecuencias de un amor obsesivo. Kenneth Branagh regresa como el icónico detective Hércules Poirot y a él se le suma un reparto estelar con la participación de Tom Bateman, Annette Bening (nominada en 4 oportunidades al premio Oscar®), Russell Brand, Ali Fazal, Dawn French, Gal Gadot, Armie Hammer, Rose Leslie, Emma Mackey, Sophie Okonedo, Jennifer Saunders y Letitia Wright.",127,R.drawable.nilos)
        peliculas.add(pelicula5)

    }
}