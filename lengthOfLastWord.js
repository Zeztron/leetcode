var lengthOfLastWord = function (s) {
  var arr = s.split(" ");
  var filtered = arr.filter((el) => el.length > 0);
  return filtered.pop().length;
};
