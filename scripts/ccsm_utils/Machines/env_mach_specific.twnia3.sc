#! /bin/csh -f
# -------------------------------------------------------------------------
# Bluefire build specific settings
# -------------------------------------------------------------------------
source /usr/share/lmod/lmod/init/csh 
module purge
module use /opt/ohpc/pkg/rcec/opt/modulefiles
module load rcec/stack-intel-ompi
module load esmf/8.6.0
module load cmake/3.23.1

setenv MPI_PATH ${MPI_ROOT}
setenv MPIEXEC "mpirun"
setenv esmf_ROOT `dirname $ESMFMKFILE|xargs dirname`
setenv netcdf_fortran_ROOT `nf-config --prefix`
#setenv openmpi_ROOT `dirname $MPICC|xargs dirname`
setenv parallel_netcdf_ROOT `pnetcdf-config --prefix`
setenv NETCDF_FORTRAN_PATH $netcdf_fortran_ROOT
setenv NETCDF_FORTRAN_DIR $netcdf_fortran_ROOT
setenv PNETCDF_DIR $parallel_netcdf_ROOT
setenv ESMF_LIBSDIR $esmf_ROOT/lib

# -------------------------------------------------------------------------
# Build and runtime environment variables - edit before the initial build 
# -------------------------------------------------------------------------
#setenv OMP_STACKSIZE 512M
