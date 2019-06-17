from setuptools import setup, find_packages

setup(name='GPScorrelation',
      version='0.1',
      description='googleplaystore analysis',
      url='https://github.com/viethor/googleplay',
      author='Matus Marton',
      author_email='matuscogscimarton@gmail.com',
      license='MIT',
      packages=find_packages(),
      test_suite='nose.collector',
      tests_require=['nose'],
      install_requires=[
          'pandas'
      ],
      zip_safe=False
     )

