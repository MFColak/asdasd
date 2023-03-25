package comprmto.rickyandmorty.util

import comprmto.rickyandmorty.domain.CharactersDomain

class ItemClickListener(val clickListener: (id: Int) -> Unit) {
    fun onClick(id: Int) = clickListener(id)
}
