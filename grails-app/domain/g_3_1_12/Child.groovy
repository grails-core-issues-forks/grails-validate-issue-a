package g_3_1_12

class Child {

	String dummy

	static belongsTo = [ parent : Parent ]

    static constraints = {
		parent nullable: false
    }
}
