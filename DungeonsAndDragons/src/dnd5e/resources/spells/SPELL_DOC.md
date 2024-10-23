# Spell Format

Top Line: The identifier for the spell file.

Line 2: The 4 bit spell level (0 for cantrips), followed by type following this format (4 bits):

- Conjuration: 1
- Necromancy: 2
- Evocation: 3
- Abjuration: 4
- Transmutation: 5
- Divination: 6
- Enchantment: 7
- Illusion: 8
- Homebrew: 9

Line 3: The name of the spell

Line 4: Casting Time

First is the quantity (4 bits), then the units following this guide (4 bits).

- Reaction: 1
- Bonus Action: 2
- Action: 3
- Minute: 4
- Hour: 5

Line 5: The range in feet, preceded by 0 for self, 1 for not (1 bit, 8 bits).

Line 6: The components of the spell in the order Visual, Somatic, and Material.

Line 7: Duration following this guide, with concentration first (1 bit, 4 bits, 3 bits):

- Instantaneous: 0
- Round: 1
- Minute: 2
- Hour: 3
- Special: 4

Line 8: Spell Lists, in this order:

- Artificer
- Bard
- Cleric
- Druid
- Paladin
- Ranger
- Sorcerer
- Warlock
- Wizard
- Homebrew

Line 9: Leave blank

Line 10: Description

Line 11: Leave blank

Line 12: Higher Level Rules