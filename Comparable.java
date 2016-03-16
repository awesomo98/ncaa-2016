import java.io.*;
import java.util.*;

public class Comparable {
	int compare (Team t) {
		if (this.seed < getSeed()) {
			return -1;
		} else if (this.seed == getSeed()) {
			return 0;
		}	else {
			return 1;
		}
	}
}