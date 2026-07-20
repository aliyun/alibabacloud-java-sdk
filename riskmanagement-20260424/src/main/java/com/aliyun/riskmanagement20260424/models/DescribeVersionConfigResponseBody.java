// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeVersionConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6D462855-7835-5F91-835E-A62E44EC01CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigResponseBody self = new DescribeVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeVersionConfigResponseBody setData(DescribeVersionConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeVersionConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeVersionConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVersionConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeVersionConfigResponseBodyDataBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AgentlessCapacity")
        public Long agentlessCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowPartialBuy")
        public Integer allowPartialBuy;

        /**
         * <strong>example:</strong>
         * <p>1680</p>
         */
        @NameInMap("AntiRansomwareCapacity")
        public Integer antiRansomwareCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AntiRansomwareService")
        public Integer antiRansomwareService;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AppWhiteList")
        public Integer appWhiteList;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AppWhiteListAuthCount")
        public Long appWhiteListAuthCount;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AssetLevel")
        public Integer assetLevel;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanTryPostPaidPackage")
        public Integer canTryPostPaidPackage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CspmCapacity")
        public Long cspmCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HighestVersion")
        public Integer highestVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HoneypotCapacity")
        public Long honeypotCapacity;

        /**
         * <strong>example:</strong>
         * <p>1900</p>
         */
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceBuyType")
        public Integer instanceBuyType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("IntelligentAnalysisFlow")
        public Integer intelligentAnalysisFlow;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNewContainerVersion")
        public Boolean isNewContainerVersion;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNewMultiVersion")
        public Boolean isNewMultiVersion;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOverBalance")
        public Boolean isOverBalance;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPostpay")
        public Boolean isPostpay;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsTrialVersion")
        public Integer isTrialVersion;

        /**
         * <strong>example:</strong>
         * <p>1603934844000</p>
         */
        @NameInMap("LastTrailEndTime")
        public Long lastTrailEndTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MergedVersion")
        public Integer mergedVersion;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MultiVersion")
        public String multiVersion;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MvAuthCount")
        public Integer mvAuthCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MvUnusedAuthCount")
        public Integer mvUnusedAuthCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NewThreatAnalysis")
        public Integer newThreatAnalysis;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnboardedAssets")
        public Integer onboardedAssets;

        /**
         * <strong>example:</strong>
         * <p>1657244824669</p>
         */
        @NameInMap("OpenTime")
        public Long openTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostPayHostVersion")
        public Integer postPayHostVersion;

        /**
         * <strong>example:</strong>
         * <p>postpay-sas-frme8vjfiw2j</p>
         */
        @NameInMap("PostPayInstanceId")
        public String postPayInstanceId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;BASIC_SERVICE\&quot;:0,\&quot;VUL\&quot;:0}</p>
         */
        @NameInMap("PostPayModuleSwitch")
        public String postPayModuleSwitch;

        /**
         * <strong>example:</strong>
         * <p>1698915219000</p>
         */
        @NameInMap("PostPayOpenTime")
        public Long postPayOpenTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostPayStatus")
        public Integer postPayStatus;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RaspCapacity")
        public Long raspCapacity;

        /**
         * <strong>example:</strong>
         * <p>1625846400000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <strong>example:</strong>
         * <p>A6FB9AC3-4431-538F-BA8A-2A13AEA208A4</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SasLog")
        public Integer sasLog;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SasScreen")
        public Integer sasScreen;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SdkCapacity")
        public Long sdkCapacity;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SlsCapacity")
        public Long slsCapacity;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ThreatAnalysisCapacity")
        public Long threatAnalysisCapacity;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ThreatAnalysisFlow")
        public Integer threatAnalysisFlow;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UserDefinedAlarms")
        public Integer userDefinedAlarms;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Version")
        public Integer version;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VmCores")
        public Integer vmCores;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("VulFixCapacity")
        public Long vulFixCapacity;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebLock")
        public Integer webLock;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebLockAuthCount")
        public Long webLockAuthCount;

        public static DescribeVersionConfigResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionConfigResponseBodyDataBody self = new DescribeVersionConfigResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public DescribeVersionConfigResponseBodyDataBody setAgentlessCapacity(Long agentlessCapacity) {
            this.agentlessCapacity = agentlessCapacity;
            return this;
        }
        public Long getAgentlessCapacity() {
            return this.agentlessCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setAllowPartialBuy(Integer allowPartialBuy) {
            this.allowPartialBuy = allowPartialBuy;
            return this;
        }
        public Integer getAllowPartialBuy() {
            return this.allowPartialBuy;
        }

        public DescribeVersionConfigResponseBodyDataBody setAntiRansomwareCapacity(Integer antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }
        public Integer getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setAntiRansomwareService(Integer antiRansomwareService) {
            this.antiRansomwareService = antiRansomwareService;
            return this;
        }
        public Integer getAntiRansomwareService() {
            return this.antiRansomwareService;
        }

        public DescribeVersionConfigResponseBodyDataBody setAppWhiteList(Integer appWhiteList) {
            this.appWhiteList = appWhiteList;
            return this;
        }
        public Integer getAppWhiteList() {
            return this.appWhiteList;
        }

        public DescribeVersionConfigResponseBodyDataBody setAppWhiteListAuthCount(Long appWhiteListAuthCount) {
            this.appWhiteListAuthCount = appWhiteListAuthCount;
            return this;
        }
        public Long getAppWhiteListAuthCount() {
            return this.appWhiteListAuthCount;
        }

        public DescribeVersionConfigResponseBodyDataBody setAssetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }
        public Integer getAssetLevel() {
            return this.assetLevel;
        }

        public DescribeVersionConfigResponseBodyDataBody setCanTryPostPaidPackage(Integer canTryPostPaidPackage) {
            this.canTryPostPaidPackage = canTryPostPaidPackage;
            return this;
        }
        public Integer getCanTryPostPaidPackage() {
            return this.canTryPostPaidPackage;
        }

        public DescribeVersionConfigResponseBodyDataBody setCspmCapacity(Long cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }
        public Long getCspmCapacity() {
            return this.cspmCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setHighestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }
        public Integer getHighestVersion() {
            return this.highestVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setHoneypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }
        public Long getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setImageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setInstanceBuyType(Integer instanceBuyType) {
            this.instanceBuyType = instanceBuyType;
            return this;
        }
        public Integer getInstanceBuyType() {
            return this.instanceBuyType;
        }

        public DescribeVersionConfigResponseBodyDataBody setIntelligentAnalysisFlow(Integer intelligentAnalysisFlow) {
            this.intelligentAnalysisFlow = intelligentAnalysisFlow;
            return this;
        }
        public Integer getIntelligentAnalysisFlow() {
            return this.intelligentAnalysisFlow;
        }

        public DescribeVersionConfigResponseBodyDataBody setIsNewContainerVersion(Boolean isNewContainerVersion) {
            this.isNewContainerVersion = isNewContainerVersion;
            return this;
        }
        public Boolean getIsNewContainerVersion() {
            return this.isNewContainerVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setIsNewMultiVersion(Boolean isNewMultiVersion) {
            this.isNewMultiVersion = isNewMultiVersion;
            return this;
        }
        public Boolean getIsNewMultiVersion() {
            return this.isNewMultiVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setIsOverBalance(Boolean isOverBalance) {
            this.isOverBalance = isOverBalance;
            return this;
        }
        public Boolean getIsOverBalance() {
            return this.isOverBalance;
        }

        public DescribeVersionConfigResponseBodyDataBody setIsPostpay(Boolean isPostpay) {
            this.isPostpay = isPostpay;
            return this;
        }
        public Boolean getIsPostpay() {
            return this.isPostpay;
        }

        public DescribeVersionConfigResponseBodyDataBody setIsTrialVersion(Integer isTrialVersion) {
            this.isTrialVersion = isTrialVersion;
            return this;
        }
        public Integer getIsTrialVersion() {
            return this.isTrialVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setLastTrailEndTime(Long lastTrailEndTime) {
            this.lastTrailEndTime = lastTrailEndTime;
            return this;
        }
        public Long getLastTrailEndTime() {
            return this.lastTrailEndTime;
        }

        public DescribeVersionConfigResponseBodyDataBody setMergedVersion(Integer mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }
        public Integer getMergedVersion() {
            return this.mergedVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setMultiVersion(String multiVersion) {
            this.multiVersion = multiVersion;
            return this;
        }
        public String getMultiVersion() {
            return this.multiVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setMvAuthCount(Integer mvAuthCount) {
            this.mvAuthCount = mvAuthCount;
            return this;
        }
        public Integer getMvAuthCount() {
            return this.mvAuthCount;
        }

        public DescribeVersionConfigResponseBodyDataBody setMvUnusedAuthCount(Integer mvUnusedAuthCount) {
            this.mvUnusedAuthCount = mvUnusedAuthCount;
            return this;
        }
        public Integer getMvUnusedAuthCount() {
            return this.mvUnusedAuthCount;
        }

        public DescribeVersionConfigResponseBodyDataBody setNewThreatAnalysis(Integer newThreatAnalysis) {
            this.newThreatAnalysis = newThreatAnalysis;
            return this;
        }
        public Integer getNewThreatAnalysis() {
            return this.newThreatAnalysis;
        }

        public DescribeVersionConfigResponseBodyDataBody setOnboardedAssets(Integer onboardedAssets) {
            this.onboardedAssets = onboardedAssets;
            return this;
        }
        public Integer getOnboardedAssets() {
            return this.onboardedAssets;
        }

        public DescribeVersionConfigResponseBodyDataBody setOpenTime(Long openTime) {
            this.openTime = openTime;
            return this;
        }
        public Long getOpenTime() {
            return this.openTime;
        }

        public DescribeVersionConfigResponseBodyDataBody setPostPayHostVersion(Integer postPayHostVersion) {
            this.postPayHostVersion = postPayHostVersion;
            return this;
        }
        public Integer getPostPayHostVersion() {
            return this.postPayHostVersion;
        }

        public DescribeVersionConfigResponseBodyDataBody setPostPayInstanceId(String postPayInstanceId) {
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }
        public String getPostPayInstanceId() {
            return this.postPayInstanceId;
        }

        public DescribeVersionConfigResponseBodyDataBody setPostPayModuleSwitch(String postPayModuleSwitch) {
            this.postPayModuleSwitch = postPayModuleSwitch;
            return this;
        }
        public String getPostPayModuleSwitch() {
            return this.postPayModuleSwitch;
        }

        public DescribeVersionConfigResponseBodyDataBody setPostPayOpenTime(Long postPayOpenTime) {
            this.postPayOpenTime = postPayOpenTime;
            return this;
        }
        public Long getPostPayOpenTime() {
            return this.postPayOpenTime;
        }

        public DescribeVersionConfigResponseBodyDataBody setPostPayStatus(Integer postPayStatus) {
            this.postPayStatus = postPayStatus;
            return this;
        }
        public Integer getPostPayStatus() {
            return this.postPayStatus;
        }

        public DescribeVersionConfigResponseBodyDataBody setRaspCapacity(Long raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }
        public Long getRaspCapacity() {
            return this.raspCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeVersionConfigResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeVersionConfigResponseBodyDataBody setSasLog(Integer sasLog) {
            this.sasLog = sasLog;
            return this;
        }
        public Integer getSasLog() {
            return this.sasLog;
        }

        public DescribeVersionConfigResponseBodyDataBody setSasScreen(Integer sasScreen) {
            this.sasScreen = sasScreen;
            return this;
        }
        public Integer getSasScreen() {
            return this.sasScreen;
        }

        public DescribeVersionConfigResponseBodyDataBody setSdkCapacity(Long sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }
        public Long getSdkCapacity() {
            return this.sdkCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setSlsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }
        public Long getSlsCapacity() {
            return this.slsCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setThreatAnalysisCapacity(Long threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }
        public Long getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setThreatAnalysisFlow(Integer threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }
        public Integer getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        public DescribeVersionConfigResponseBodyDataBody setUserDefinedAlarms(Integer userDefinedAlarms) {
            this.userDefinedAlarms = userDefinedAlarms;
            return this;
        }
        public Integer getUserDefinedAlarms() {
            return this.userDefinedAlarms;
        }

        public DescribeVersionConfigResponseBodyDataBody setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public DescribeVersionConfigResponseBodyDataBody setVmCores(Integer vmCores) {
            this.vmCores = vmCores;
            return this;
        }
        public Integer getVmCores() {
            return this.vmCores;
        }

        public DescribeVersionConfigResponseBodyDataBody setVulFixCapacity(Long vulFixCapacity) {
            this.vulFixCapacity = vulFixCapacity;
            return this;
        }
        public Long getVulFixCapacity() {
            return this.vulFixCapacity;
        }

        public DescribeVersionConfigResponseBodyDataBody setWebLock(Integer webLock) {
            this.webLock = webLock;
            return this;
        }
        public Integer getWebLock() {
            return this.webLock;
        }

        public DescribeVersionConfigResponseBodyDataBody setWebLockAuthCount(Long webLockAuthCount) {
            this.webLockAuthCount = webLockAuthCount;
            return this;
        }
        public Long getWebLockAuthCount() {
            return this.webLockAuthCount;
        }

    }

    public static class DescribeVersionConfigResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public DescribeVersionConfigResponseBodyDataBody body;

        public static DescribeVersionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionConfigResponseBodyData self = new DescribeVersionConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeVersionConfigResponseBodyData setBody(DescribeVersionConfigResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public DescribeVersionConfigResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
