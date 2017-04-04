#!/bin/bash
#
#  auth: rbw
#  date: 20170329
#  desc: 
#
#- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
BASE_DIR=`cd "${0%/*}/." && pwd`

curl -v -X GET  --header 'Accept: application/prs.openbanking.opendata.v1.3+json' 'http://localhost:8080/atmsXXX'
curl -v -X HEAD --header 'Accept: application/prs.openbanking.opendata.v1.3+json' 'http://localhost:8080/atmsXXX'

#- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
echo "Done."
#//EOF
