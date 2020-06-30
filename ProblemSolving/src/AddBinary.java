
class AddBinary {
    
  public String addBinary(String a, String b) {
    int p = a.length(), q = b.length();
    if (p < q) return addBinary(b, a);
    int L = Math.max(p, q);

    StringBuilder nb = new StringBuilder();
    int carry = 0, j = q - 1;
    for(int i = L - 1; i > -1; --i) {
      if (a.charAt(i) == '1') ++carry;
      if (j > -1 && b.charAt(j--) == '1') ++carry;

      if (carry % 2 == 1) nb.append('1');
      else nb.append('0');

      carry /= 2;
    }
    if (carry == 1) nb.append('1');
    nb.reverse();

    return nb.toString();
  }
}