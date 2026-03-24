// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    /**
     * <p>Number of agentless detections. </p>
     * <blockquote>
     * <p>Agentless detection is not yet available for sale, so there\&quot;s no need to pay attention to this field at the moment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AgentlessCapacity")
    public Long agentlessCapacity;

    /**
     * <p>Whether to allow pay-as-you-go purchases.</p>
     * <ul>
     * <li><strong>0</strong>: Not allowed </li>
     * <li><strong>1</strong>: Allowed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    /**
     * <p>Ransomware protection backup capacity, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("AntiRansomwareCapacity")
    public Integer antiRansomwareCapacity;

    /**
     * <p>Ransomware Guardian Service. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Not activated</li>
     * <li><strong>1</strong>: Activated</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AntiRansomwareService")
    public Integer antiRansomwareService;

    /**
     * <p>Whether to enable the application whitelist. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Not enabled </li>
     * <li><strong>2</strong>: Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AppWhiteList")
    public Integer appWhiteList;

    /**
     * <p>Number of application whitelist authorizations. </p>
     * <blockquote>
     * <p>One authorization allows the application of a whitelist policy to one server. After enabling the application whitelist function, the account will have 20 authorizations by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AppWhiteListAuthCount")
    public Long appWhiteListAuthCount;

    /**
     * <p>Number of purchased server licenses.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AssetLevel")
    public Integer assetLevel;

    /**
     * <p>Whether it supports the activation of a post-paid trial package. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Not supported</li>
     * <li><strong>1</strong>: Supported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CanTryPostPaidPackage")
    public Integer canTryPostPaidPackage;

    /**
     * <p>Purchased cloud platform configuration check scan count. Unit: times/month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CspmCapacity")
    public Long cspmCapacity;

    /**
     * <p>Purchase the highest version of the Security Center. Values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition </li>
     * <li><strong>5</strong>: Advanced Edition </li>
     * <li><strong>6</strong>: Anti-Virus Edition</li>
     * <li><strong>7</strong>: Flagship Edition </li>
     * <li><strong>10</strong>: Purchase Additional Services Only <blockquote>
     * <p>When purchasing a single version, it indicates the corresponding version. When purchasing multiple versions, this value represents the highest version among the purchased multi-versions of Cloud Security Center.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HighestVersion")
    public Integer highestVersion;

    /**
     * <p>Number of purchased honeypot licenses.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HoneypotCapacity")
    public Long honeypotCapacity;

    /**
     * <p>Number of purchased image scanning authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>8954</p>
     */
    @NameInMap("ImageScanCapacity")
    public Long imageScanCapacity;

    /**
     * <p>Instance purchase type. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Self-purchased</li>
     * <li><strong>1</strong>: Allocated from multiple accounts</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceBuyType")
    public Integer instanceBuyType;

    /**
     * <p>ID of the purchased Cloud Security Center instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-vg6hafdsafs****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>AI digital human analyzes traffic</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("IntelligentAnalysisFlow")
    public Integer intelligentAnalysisFlow;

    /**
     * <p>Whether it is the new flagship version.</p>
     * <ul>
     * <li><strong>true</strong>: It is the latest version</li>
     * <li><strong>false</strong>: It is not the latest version</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsNewContainerVersion")
    public Boolean isNewContainerVersion;

    /**
     * <p>Whether it is the latest multi-version.</p>
     * <ul>
     * <li><strong>true</strong>: It is the latest multi-version </li>
     * <li><strong>false</strong>: It is not the latest multi-version</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsNewMultiVersion")
    public Boolean isNewMultiVersion;

    /**
     * <p>Whether the number of existing servers exceeds the maximum authorized purchase quantity. Values: </p>
     * <ul>
     * <li><strong>false</strong>: Not exceeded </li>
     * <li><strong>true</strong>: Exceeded<blockquote>
     * <p>Notice: This parameter is deprecated, and you do not need to pay attention to it.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOverBalance")
    public Boolean isOverBalance;

    /**
     * <p>Whether to enable pay-as-you-go. Values: </p>
     * <ul>
     * <li><strong>false</strong>: Not enabled </li>
     * <li><strong>true</strong>: Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPostpay")
    public Boolean isPostpay;

    /**
     * <p>Indicates whether the current Cloud Security Center version is a trial version. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Not a trial version </li>
     * <li><strong>1</strong>: Trial version</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    /**
     * <p>The timestamp of the last trial expiration for Cloud Security Center, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1603934844000</p>
     */
    @NameInMap("LastTrailEndTime")
    public Long lastTrailEndTime;

    /**
     * <p>Total number of licenses when purchasing multiple versions.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("MVAuthCount")
    public Integer MVAuthCount;

    /**
     * <p>Total remaining licenses when purchasing multiple versions.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MVUnusedAuthCount")
    public Integer MVUnusedAuthCount;

    /**
     * <p>When both the annual/monthly and pay-as-you-go services for Cloud Security Center\&quot;s host and container security are activated, the higher protection version of the two is selected. Values: </p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>6</strong>: Anti-Virus Edition </li>
     * <li><strong>5</strong>: Advanced Edition </li>
     * <li><strong>3</strong>: Enterprise Edition </li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("MergedVersion")
    public Integer mergedVersion;

    /**
     * <p>Usage of multiple version numbers and license counts</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MultiVersion")
    public String multiVersion;

    /**
     * <p>Whether to enable the new version of Threat Analysis and Response service. The new version of Threat Analysis and Response service refers to the one that supports purchasing access traffic and log storage capacity. Values: </p>
     * <ul>
     * <li><strong>0</strong>: No </li>
     * <li><strong>1</strong>: Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewThreatAnalysis")
    public Integer newThreatAnalysis;

    /**
     * <p>AI Digital Human Management Instance</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OnboardedAssets")
    public Integer onboardedAssets;

    /**
     * <p>Service activation timestamp, unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657244824669</p>
     */
    @NameInMap("OpenTime")
    public Long openTime;

    /**
     * <p>When activating the pay-as-you-go service for host and container security, it represents the highest protection version of the already bound assets. Values: </p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-Virus Edition </li>
     * <li><strong>7</strong>: Flagship Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPayHostVersion")
    public Integer postPayHostVersion;

    /**
     * <p>Pay-As-You-Go instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>postpay-sas-**</p>
     */
    @NameInMap("PostPayInstanceId")
    public String postPayInstanceId;

    /**
     * <p>Pay-as-you-go module switch status, in the format of JsonString, with values as follows:</p>
     * <ul>
     * <li>Key:<ul>
     * <li><strong>VUL</strong>: Vulnerability Repair Module </li>
     * <li><strong>CSPM</strong>: Cloud Security Posture Management Module </li>
     * <li><strong>AGENTLESS</strong>: Agentless Detection Module </li>
     * <li><strong>SERVERLESS</strong>: Serverless Security Module </li>
     * <li><strong>CTDR</strong>: Threat Analysis and Response Module </li>
     * <li><strong>POST_HOST</strong>: Host and Container Security Module </li>
     * <li><strong>SDK</strong>: Malicious File Detection SDK Module </li>
     * <li><strong>RASP</strong>: Application Protection Module</li>
     * </ul>
     * </li>
     * <li>Value: 0 indicates off, 1 indicates on</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    /**
     * <p>Pay-as-you-go activation time</p>
     * 
     * <strong>example:</strong>
     * <p>1698915219000</p>
     */
    @NameInMap("PostPayOpenTime")
    public Long postPayOpenTime;

    /**
     * <p>Pay-As-You-Go instance status. Values: </p>
     * <ul>
     * <li><strong>1</strong>: Normal </li>
     * <li><strong>2</strong>: Stopped due to unpaid bills</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPayStatus")
    public Integer postPayStatus;

    /**
     * <p>Number of purchased application protections. Unit: per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RaspCapacity")
    public Long raspCapacity;

    /**
     * <p>The timestamp of when the Cloud Security Center instance will expire, in milliseconds.</p>
     * <blockquote>
     * <p>If you do not renew the service within 7 days after it expires, your paid instance will be downgraded to a free version, and you will no longer be able to use the features of the paid version. Your previous Cloud Security Center configuration data and historical alert data (e.g., DDoS alerts) will become inaccessible. At this point, you can only re-enable the paid version of Cloud Security Center by repurchasing it. For more information, see <a href="https://help.aliyun.com/document_detail/42308.html">Purchasing Cloud Security Center</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625846400000</p>
     */
    @NameInMap("ReleaseTime")
    public Long releaseTime;

    /**
     * <p>The unique identifier generated by Alibaba Cloud for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2DC96D2-DD2E-49D9-A28E-85590475DF55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether log analysis has been purchased. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Not purchased </li>
     * <li><strong>1</strong>: Purchased</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SasLog")
    public Integer sasLog;

    /**
     * <p>Whether the security dashboard has been purchased. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Not purchased </li>
     * <li><strong>1</strong>: Purchased</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SasScreen")
    public Integer sasScreen;

    /**
     * <p>Number of SDK authorizations for malicious file detection</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SdkCapacity")
    public Long sdkCapacity;

    /**
     * <p>Purchased log storage capacity in GB. Range: 0 to 200000.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("SlsCapacity")
    public Long slsCapacity;

    /**
     * <p>Purchased threat analysis capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("ThreatAnalysisCapacity")
    public Long threatAnalysisCapacity;

    /**
     * <p>Purchased threat analysis and response log access traffic. Unit is GB/day.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ThreatAnalysisFlow")
    public Integer threatAnalysisFlow;

    /**
     * <p>Whether to enable the custom alarm function. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Not enabled </li>
     * <li><strong>2</strong>: Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UserDefinedAlarms")
    public Integer userDefinedAlarms;

    /**
     * <p>Purchased Cloud Security Center version. Values:   </p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition </li>
     * <li><strong>5</strong>: Advanced Edition </li>
     * <li><strong>6</strong>: Anti-Virus Edition     </li>
     * <li><strong>7</strong>: Flagship Edition   </li>
     * <li><strong>8</strong>: Multi-Edition  </li>
     * <li><strong>10</strong>: Value-Added Services Only</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <p>Number of authorized cores purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VmCores")
    public Integer vmCores;

    /**
     * <p>Number of purchased vulnerability fixes. Unit: times/month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VulFixCapacity")
    public Long vulFixCapacity;

    /**
     * <p>Indicates whether the web tamper-proof service is enabled. Values: </p>
     * <ul>
     * <li><strong>0</strong>: Not enabled </li>
     * <li><strong>1</strong>: Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WebLock")
    public Integer webLock;

    /**
     * <p>The number of purchased web tamper-proof licenses. One license can enable web tamper protection for one server. Value range: 0~N.</p>
     * <blockquote>
     * <p>N is the number of servers you have.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WebLockAuthCount")
    public Long webLockAuthCount;

    public static DescribeVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigResponseBody self = new DescribeVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigResponseBody setAgentlessCapacity(Long agentlessCapacity) {
        this.agentlessCapacity = agentlessCapacity;
        return this;
    }
    public Long getAgentlessCapacity() {
        return this.agentlessCapacity;
    }

    public DescribeVersionConfigResponseBody setAllowPartialBuy(Integer allowPartialBuy) {
        this.allowPartialBuy = allowPartialBuy;
        return this;
    }
    public Integer getAllowPartialBuy() {
        return this.allowPartialBuy;
    }

    public DescribeVersionConfigResponseBody setAntiRansomwareCapacity(Integer antiRansomwareCapacity) {
        this.antiRansomwareCapacity = antiRansomwareCapacity;
        return this;
    }
    public Integer getAntiRansomwareCapacity() {
        return this.antiRansomwareCapacity;
    }

    public DescribeVersionConfigResponseBody setAntiRansomwareService(Integer antiRansomwareService) {
        this.antiRansomwareService = antiRansomwareService;
        return this;
    }
    public Integer getAntiRansomwareService() {
        return this.antiRansomwareService;
    }

    public DescribeVersionConfigResponseBody setAppWhiteList(Integer appWhiteList) {
        this.appWhiteList = appWhiteList;
        return this;
    }
    public Integer getAppWhiteList() {
        return this.appWhiteList;
    }

    public DescribeVersionConfigResponseBody setAppWhiteListAuthCount(Long appWhiteListAuthCount) {
        this.appWhiteListAuthCount = appWhiteListAuthCount;
        return this;
    }
    public Long getAppWhiteListAuthCount() {
        return this.appWhiteListAuthCount;
    }

    public DescribeVersionConfigResponseBody setAssetLevel(Integer assetLevel) {
        this.assetLevel = assetLevel;
        return this;
    }
    public Integer getAssetLevel() {
        return this.assetLevel;
    }

    public DescribeVersionConfigResponseBody setCanTryPostPaidPackage(Integer canTryPostPaidPackage) {
        this.canTryPostPaidPackage = canTryPostPaidPackage;
        return this;
    }
    public Integer getCanTryPostPaidPackage() {
        return this.canTryPostPaidPackage;
    }

    public DescribeVersionConfigResponseBody setCspmCapacity(Long cspmCapacity) {
        this.cspmCapacity = cspmCapacity;
        return this;
    }
    public Long getCspmCapacity() {
        return this.cspmCapacity;
    }

    public DescribeVersionConfigResponseBody setHighestVersion(Integer highestVersion) {
        this.highestVersion = highestVersion;
        return this;
    }
    public Integer getHighestVersion() {
        return this.highestVersion;
    }

    public DescribeVersionConfigResponseBody setHoneypotCapacity(Long honeypotCapacity) {
        this.honeypotCapacity = honeypotCapacity;
        return this;
    }
    public Long getHoneypotCapacity() {
        return this.honeypotCapacity;
    }

    public DescribeVersionConfigResponseBody setImageScanCapacity(Long imageScanCapacity) {
        this.imageScanCapacity = imageScanCapacity;
        return this;
    }
    public Long getImageScanCapacity() {
        return this.imageScanCapacity;
    }

    public DescribeVersionConfigResponseBody setInstanceBuyType(Integer instanceBuyType) {
        this.instanceBuyType = instanceBuyType;
        return this;
    }
    public Integer getInstanceBuyType() {
        return this.instanceBuyType;
    }

    public DescribeVersionConfigResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeVersionConfigResponseBody setIntelligentAnalysisFlow(Integer intelligentAnalysisFlow) {
        this.intelligentAnalysisFlow = intelligentAnalysisFlow;
        return this;
    }
    public Integer getIntelligentAnalysisFlow() {
        return this.intelligentAnalysisFlow;
    }

    public DescribeVersionConfigResponseBody setIsNewContainerVersion(Boolean isNewContainerVersion) {
        this.isNewContainerVersion = isNewContainerVersion;
        return this;
    }
    public Boolean getIsNewContainerVersion() {
        return this.isNewContainerVersion;
    }

    public DescribeVersionConfigResponseBody setIsNewMultiVersion(Boolean isNewMultiVersion) {
        this.isNewMultiVersion = isNewMultiVersion;
        return this;
    }
    public Boolean getIsNewMultiVersion() {
        return this.isNewMultiVersion;
    }

    public DescribeVersionConfigResponseBody setIsOverBalance(Boolean isOverBalance) {
        this.isOverBalance = isOverBalance;
        return this;
    }
    public Boolean getIsOverBalance() {
        return this.isOverBalance;
    }

    public DescribeVersionConfigResponseBody setIsPostpay(Boolean isPostpay) {
        this.isPostpay = isPostpay;
        return this;
    }
    public Boolean getIsPostpay() {
        return this.isPostpay;
    }

    public DescribeVersionConfigResponseBody setIsTrialVersion(Integer isTrialVersion) {
        this.isTrialVersion = isTrialVersion;
        return this;
    }
    public Integer getIsTrialVersion() {
        return this.isTrialVersion;
    }

    public DescribeVersionConfigResponseBody setLastTrailEndTime(Long lastTrailEndTime) {
        this.lastTrailEndTime = lastTrailEndTime;
        return this;
    }
    public Long getLastTrailEndTime() {
        return this.lastTrailEndTime;
    }

    public DescribeVersionConfigResponseBody setMVAuthCount(Integer MVAuthCount) {
        this.MVAuthCount = MVAuthCount;
        return this;
    }
    public Integer getMVAuthCount() {
        return this.MVAuthCount;
    }

    public DescribeVersionConfigResponseBody setMVUnusedAuthCount(Integer MVUnusedAuthCount) {
        this.MVUnusedAuthCount = MVUnusedAuthCount;
        return this;
    }
    public Integer getMVUnusedAuthCount() {
        return this.MVUnusedAuthCount;
    }

    public DescribeVersionConfigResponseBody setMergedVersion(Integer mergedVersion) {
        this.mergedVersion = mergedVersion;
        return this;
    }
    public Integer getMergedVersion() {
        return this.mergedVersion;
    }

    public DescribeVersionConfigResponseBody setMultiVersion(String multiVersion) {
        this.multiVersion = multiVersion;
        return this;
    }
    public String getMultiVersion() {
        return this.multiVersion;
    }

    public DescribeVersionConfigResponseBody setNewThreatAnalysis(Integer newThreatAnalysis) {
        this.newThreatAnalysis = newThreatAnalysis;
        return this;
    }
    public Integer getNewThreatAnalysis() {
        return this.newThreatAnalysis;
    }

    public DescribeVersionConfigResponseBody setOnboardedAssets(Integer onboardedAssets) {
        this.onboardedAssets = onboardedAssets;
        return this;
    }
    public Integer getOnboardedAssets() {
        return this.onboardedAssets;
    }

    public DescribeVersionConfigResponseBody setOpenTime(Long openTime) {
        this.openTime = openTime;
        return this;
    }
    public Long getOpenTime() {
        return this.openTime;
    }

    public DescribeVersionConfigResponseBody setPostPayHostVersion(Integer postPayHostVersion) {
        this.postPayHostVersion = postPayHostVersion;
        return this;
    }
    public Integer getPostPayHostVersion() {
        return this.postPayHostVersion;
    }

    public DescribeVersionConfigResponseBody setPostPayInstanceId(String postPayInstanceId) {
        this.postPayInstanceId = postPayInstanceId;
        return this;
    }
    public String getPostPayInstanceId() {
        return this.postPayInstanceId;
    }

    public DescribeVersionConfigResponseBody setPostPayModuleSwitch(String postPayModuleSwitch) {
        this.postPayModuleSwitch = postPayModuleSwitch;
        return this;
    }
    public String getPostPayModuleSwitch() {
        return this.postPayModuleSwitch;
    }

    public DescribeVersionConfigResponseBody setPostPayOpenTime(Long postPayOpenTime) {
        this.postPayOpenTime = postPayOpenTime;
        return this;
    }
    public Long getPostPayOpenTime() {
        return this.postPayOpenTime;
    }

    public DescribeVersionConfigResponseBody setPostPayStatus(Integer postPayStatus) {
        this.postPayStatus = postPayStatus;
        return this;
    }
    public Integer getPostPayStatus() {
        return this.postPayStatus;
    }

    public DescribeVersionConfigResponseBody setRaspCapacity(Long raspCapacity) {
        this.raspCapacity = raspCapacity;
        return this;
    }
    public Long getRaspCapacity() {
        return this.raspCapacity;
    }

    public DescribeVersionConfigResponseBody setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    public DescribeVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVersionConfigResponseBody setSasLog(Integer sasLog) {
        this.sasLog = sasLog;
        return this;
    }
    public Integer getSasLog() {
        return this.sasLog;
    }

    public DescribeVersionConfigResponseBody setSasScreen(Integer sasScreen) {
        this.sasScreen = sasScreen;
        return this;
    }
    public Integer getSasScreen() {
        return this.sasScreen;
    }

    public DescribeVersionConfigResponseBody setSdkCapacity(Long sdkCapacity) {
        this.sdkCapacity = sdkCapacity;
        return this;
    }
    public Long getSdkCapacity() {
        return this.sdkCapacity;
    }

    public DescribeVersionConfigResponseBody setSlsCapacity(Long slsCapacity) {
        this.slsCapacity = slsCapacity;
        return this;
    }
    public Long getSlsCapacity() {
        return this.slsCapacity;
    }

    public DescribeVersionConfigResponseBody setThreatAnalysisCapacity(Long threatAnalysisCapacity) {
        this.threatAnalysisCapacity = threatAnalysisCapacity;
        return this;
    }
    public Long getThreatAnalysisCapacity() {
        return this.threatAnalysisCapacity;
    }

    public DescribeVersionConfigResponseBody setThreatAnalysisFlow(Integer threatAnalysisFlow) {
        this.threatAnalysisFlow = threatAnalysisFlow;
        return this;
    }
    public Integer getThreatAnalysisFlow() {
        return this.threatAnalysisFlow;
    }

    public DescribeVersionConfigResponseBody setUserDefinedAlarms(Integer userDefinedAlarms) {
        this.userDefinedAlarms = userDefinedAlarms;
        return this;
    }
    public Integer getUserDefinedAlarms() {
        return this.userDefinedAlarms;
    }

    public DescribeVersionConfigResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public DescribeVersionConfigResponseBody setVmCores(Integer vmCores) {
        this.vmCores = vmCores;
        return this;
    }
    public Integer getVmCores() {
        return this.vmCores;
    }

    public DescribeVersionConfigResponseBody setVulFixCapacity(Long vulFixCapacity) {
        this.vulFixCapacity = vulFixCapacity;
        return this;
    }
    public Long getVulFixCapacity() {
        return this.vulFixCapacity;
    }

    public DescribeVersionConfigResponseBody setWebLock(Integer webLock) {
        this.webLock = webLock;
        return this;
    }
    public Integer getWebLock() {
        return this.webLock;
    }

    public DescribeVersionConfigResponseBody setWebLockAuthCount(Long webLockAuthCount) {
        this.webLockAuthCount = webLockAuthCount;
        return this;
    }
    public Long getWebLockAuthCount() {
        return this.webLockAuthCount;
    }

}
