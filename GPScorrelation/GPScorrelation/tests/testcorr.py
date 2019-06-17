from unittest import TestCase

import GPScorrelation

class Testcorr(TestCase):
    def test_is_string(self):
        s = GPScorrelation.correl()
        self.assertTrue(isinstance(s, basestring))
