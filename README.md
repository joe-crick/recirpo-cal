![logo](https://raw.githubusercontent.com/joe-crick/recirpo-cal/master/public/images/logo.svg) Recipro-cal
=======

[![Greenkeeper badge](https://badges.greenkeeper.io/recipro-cal/recipro-cal.svg)](https://greenkeeper.io/)
[![Build Status](https://travis-ci.org/recipro-cal/recipro-cal.svg?branch=master)](https://travis-ci.org/reduxigen/Reduxigen)
![Dependencies](https://img.shields.io/badge/dependencies-up%20to%20date-brightgreen.svg)
![Current Version](https://img.shields.io/badge/version-0.0.1-green.svg)

# Recipro-cal

Recipro-cal: Recipe/calorie. Recipro-cal allows users to manage both their recipes and their caloric intake. 
Manually add or import recipes from your favorite site, or simply use our calculator. It couldn't be easier.
Once your a recipe has been entered in to Recipro-cal, we analyse its ingredients and provide you with a
caloric estimate per serving. Now, you can make your favorite recipes, and be in charge of your health!

### Development mode
```
npm install
npx shadow-cljs watch app
```
start a ClojureScript REPL
```
npx shadow-cljs browser-repl
```
### Building for production

```
npx shadow-cljs release app
```
