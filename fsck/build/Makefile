include ../../build/Makefile

main := ../source/program/Main.cpp
sources := $(filter-out $(main), $(shell find ../source -iname '*.cpp'))

$(call build-static-library,\
   Fsck,\
   $(sources),\
   common dl,\
   ../source)

$(call define-dep-lib,\
   Fsck,\
   -I ../source,\
   $(build_dir)/libFsck.a)

$(call build-executable,\
   beegfs-fsck,\
   $(main),\
   Fsck common dl)

$(call build-test,\
   test-runner,\
   $(shell find ../tests -name '*.cpp'),\
   Fsck common dl,\
   ../tests)

CXXFLAGS += -DBOOST_RESULT_OF_USE_DECLTYPE
