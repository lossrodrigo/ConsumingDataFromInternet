package com.example.consumingdatafrominternetapp

/*class PhotoAdapter: ListAdapter<Cat, PhotoAdapter.CatImageViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatImageViewHolder {
        return CatImageViewHolder(ItemViewListBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: CatImageViewHolder, position: Int) {
        val catImage = getItem(position)
        holder.binding(catImage)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Cat>() {
        override fun areItemsTheSame(oldItem: Cat, newItem: Cat): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Cat, newItem: Cat): Boolean {
            return oldItem == newItem
        }

    }

    class CatImageViewHolder(private var binding: ItemViewListBinding):
        RecyclerView.ViewHolder(binding.root)  {

            fun binding(cat: Cat){
                binding.cat = cat
                binding.executePendingBindings()
            }

    }

}*/