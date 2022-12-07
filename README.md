# favornet
FavorNET is a professional network where you can search for any kind of service you need - mechanic, plumber, accountant, electrician, etc

The network is decentralized (p2p) and hierarchical. No central storage of user information. It uses the kotlin-ipv8 library p2p functionality.

Search is free, but a token payment to the Network (may be) made to view service providers' telephone.

Users are only visible when online (standard with decentralized apps).

User id is one-way encrypted string using cellphone as a seed.

There are only 2 roles - commender and commendee. The commender serves to only hold the information of contacts who are professionals and require commendation. Commendees are contacts who are professionals and will provide services.

When the app is launched, if the user is not connected to any community (sphere of influence), he is prompted to select a contact to join that contact's community. Subsequently the user can switch communities simply by selecting a new primary contact. Each contact has a tree of nodes which are the contacts of that contact in a recursive manner.

A service provider is of course a contact with a job description. The job description comes directly from the service provider (and linked into the contact profile of the user on whose contact list the service provider exists). This frees the user from the responsibility of providing the job descriptions himself; and puts the onus of being found based on the selected job description (has to be a drop-down list).

The app can be pre-loaded on cellphones and presented as a basic functionality of the device - such as the Google Search Bar.

2 models -
1. Prepaid service charge
2. Postpaid service charge.

Prepaid service charge requires the escrow model and is handled by the Network. The service provider is paid either a flat service charge fee or precomputed hour based fee (which is pre-agreed to).

Postpaid service charge is completely left to the buyer and seller. They decide the fees and the Network is only preoccupied with serving as platform of connection.

Use of a contract might also help; in which case the seller sends the buyer a contract through the app and this governs the payment.

A model may exist where all commenders are paid a share of the Network charge on a service.

Create tree structure as a series of p2p connections.

When a search is done for a service provider, it is akin to discovering files/content/shared resources on a p2p network. In this case, the shared resource is the service provider's profile. The search is limited by the location of the searcher within the p2p network tree. For instance on usual file sharing p2p networks, the aim of the search is to find peers/nodes to connect to and download shared files. Here, the aim of the search is to find ONLY peers that the searcher has visibility to. That is, the peers that the searcher can navigate to on the network tree structure.

On launch of the app (which is always launched and stays on once the device is on), it uses the contact list to create a list of devices with which to create p2p cnnections. Likewise all devices that have the current device as a contact and have been *waiting* will create p2p connections to the current device.

Clout - sphere of influence.

Recommendation of service provider will be determined by clout of the commender. The clout of the commender will determine the ranking of the service provider and therefore where the service provider will appear in a list of service providers (for instance several people within the same sphere of influence who recommend different service providers means the commendees will be listed in a search for the service based on the clout of the commender).

Favor = doing a good job for free (no payment for service rendered) - only payment made is for service parts...or sale at a discount of quality products (a trader). The entire service is recorded and serves as a vetting tool (provides evidence) when the service provider comes up in a search.

Premise - it forces service providers to deliver (and maintain) quality.

Any favor you do for me grants you favors (translated to mean access to my sphere of influence). You get marketed to all my followers automatically by me giving
you commendation and your business blossoms. Favor is the currency...and people with large following are hot commodities - they are sought after by service providers who will work for free to get commendation.

Clout can be purchased - payment is made to the Network and your sphere of influence grows. Favor can be purchased - you are marketed (bumped up the list) in a search for service providers based on how much you are willing to pay to the Network.

Poor service quality - demarketing. Any poor service (or provision of goods) will reduce visibility of the service provider (each poor service delivered will affect the score that determines the ranking in a search list). It could even reduce the clout of the commender, therefore a commender will be careful about who he commends.
