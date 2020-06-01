#declaration de variables :

CC = gcc

SRCS = tp1.c fichiers.c chaines.c fonctions.c
HEADS = chaines.h fichiers.h fonctions.h
PROG = shell

#fichiers .o
OBJS = $(SRCS:.c=.o)

#make par defaut
defaut: $(SRCS)
	make tp1
	make $(PROG)

#roles
tp1: $(SRCS) $(HEADS)
	$(CC) -c $(SRCS)

#Edition des liens
$(PROG): $(OBJS)
	$(CC) $(OBJS) -o $(PROG)
