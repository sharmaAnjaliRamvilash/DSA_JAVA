from django.shortcuts import render ,HttpResponse

# Create your views here.

def index(response):
    return HttpResponse("This is a new Https response")

