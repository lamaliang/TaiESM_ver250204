# TaiESM_ver250204
Taiwan Earth System Model 1 

# TaiESM1 Quick Start

### 在/work1底下創建資料夾
1. cd /work1/你的帳號
2. mkdir taiesm_work

### 複製創建case的shell script至taiesm_work資料夾  
3. cd taiesm_work  
4. cp /work1/j07hcl00/taiesm_work/run_taiesm1_case-setup_example.sh . 

### 建立模擬case，並且檢查是否有問題  
5. cat setup.case.csh  
6. ./setup.case.csh  

### 環境配置檢查  
7. cd f09.F2000.ESMclass.t01 
8. ./cesm_setup  

### 修改模擬時間，從模擬五天改為一個月(擇一)：使用xmlchange   
9. ./xmlchange STOP_OPTION=nmonths  
10. ./xmlchange STOP_N=1  

### 修改模擬時間，從模擬五天改為一個月(擇一)：使用vi  
9. vi env_run.xml  
10. STOP_OPTION 從ndays改為'__nmonths__' ; STOP_N 從5改為'__1'__  

### compiler TaiESM1  
11. ./f09.F2000.ESMclass.t01.build

### 使用排成軟體將模擬程式送出去  
12. vi f09.F2000.ESMclass.t01.run 

### 根據cpu數量使用不同的queue 
13. 修改第六行 #SBATCH -p '__ct1k__' or '__ct2k__'等等之類的

### 將job丟置排程系統上
14. ./f09.F2000.ESMclass.t01.submit

### 檢查模擬情況 
15. cat or tail -f run/cesm.log.xxxxxx-xxxxxx
16. cat or tail -f run/atm.log.xxxxxx-xxxxxx

# TaiESM1 其他資訊
### 變數參考 https://www2.cesm.ucar.edu/models/cesm2/atmosphere/docs/ug6/hist_flds_f2000.html

