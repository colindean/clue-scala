trait Card
trait Room extends Card
trait Weapon extends Card
trait Suspect extends Card
case object Plum extends Suspect
case object Scarlet extends Suspect
case object Green extends Suspect
case object White extends Suspect
case object Peacock extends Suspect
case object Mustard extends Suspect
case object Revolver extends Weapon
case object LeadPipe extends Weapon
case object Rope extends Weapon
case object Candleholder extends Weapon
case object Wrench extends Weapon
case object Knife extends Weapon
case object Ballroom extends Room
case object Hall extends Room
case object Conservatory extends Room
case object Lounge extends Room
case object Study extends Room
case object Kitchen extends Room
case object DiningRoom extends Room
case object Library extends Room
case object BilliardRoom extends Room

import scala.collection.Set

val Rooms: Set[Room] = Set(Ballroom, Hall, Conservatory, Lounge, Study, Kitchen, DiningRoom, Library, BilliardRoom)
val Weapons: Set[Weapon] = Set(Revolver, LeadPipe, Rope, Candleholder, Wrench, Knife)
val Suspects: Set[Suspect] = Set(Plum, Scarlet, Green, White, Peacock, Mustard)
val Deck: Set[Card] = Rooms ++ Weapons ++ Suspects

class Player(hand: Set[Card], moves: Suspect)

class Guess(room: Room, weapon: Weapon, suspect: Suspect, player: Player)

var Log: List[Guess] = List.empty
