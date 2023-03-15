# RecyclerViewDemo

- Project to learn about recycler view
- recyclerview only create view objects which are visible to the user, it recycles the old view objects to display new items
- we have adapter class for recyclerview, it binds data with recyclerview components
- we pass data to adapter which displays it on recyclerview
- onCreateViewHolder - it create empty view objects for the recycler view
- onBindViewHolder - it binds data with the view objects created by the onCreateViewHolder
- getItemCount - it tells what is the size of the data, ie total no of items in the recycler view.
