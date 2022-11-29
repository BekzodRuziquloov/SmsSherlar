package space.beka.smssherlar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*
import space.beka.smssherlar.R
import space.beka.smssherlar.models.sherlar

class SmsAdapter(var context: Context, var sherList: List<sherlar>, var onMyItemClickListener: OnMyItemClickListener,
                  var like:Int = 0)
    : RecyclerView.Adapter<SmsAdapter.MyViewHolder>(){

    inner class MyViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView){

        fun onBind(sher: sherlar, position: Int){

            itemView.txt_sher_nomi.text = sher.name
            itemView.txt_sher_matni.text = sher.matni
            if (like == 1){
                itemView.image_rv_saqlanganlar.setImageResource(R.drawable.ic_sher_saqlanganda)
            }

            itemView.setOnClickListener{
//                Toast.makeText(context, "$sher", Toast.LENGTH_SHORT).show()
//                val intent = Intent(context, MainActivity2::class.java)
//                context.startActivity(intent)
                onMyItemClickListener.onMyItemClck(sher, position)
            }

            //Lekin LongClick onClick bilan birga ishlamadi
//            itemView.setOnLongClickListener(object : View.OnLongClickListener{
//                override fun onLongClick(v: View?): Boolean {
//                    onMyItemClickListener.onMyItemLongCLick(sher)
//                    return true
//                }
//
//            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        val myViewHolder = MyViewHolder(itemView)
        return myViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val sher = sherList[position]
        holder.onBind(sher, position)
    }

    override fun getItemCount(): Int {
        return sherList.size
    }

    interface OnMyItemClickListener{
        fun onMyItemClck(sher: sherlar, position: Int)
        //   fun onMyItemLongCLick(sher: sherlar)
    }
}