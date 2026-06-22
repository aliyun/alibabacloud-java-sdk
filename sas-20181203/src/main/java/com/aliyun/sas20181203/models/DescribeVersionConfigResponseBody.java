// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    /**
     * <p>The number of agentless detection quotas.</p>
     * <blockquote>
     * <p>Agentless detection is not available for purchase. You can ignore this field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AgentlessCapacity")
    public Long agentlessCapacity;

    /**
     * <p>Indicates whether pay-as-you-go purchasing is allowed.</p>
     * <ul>
     * <li><strong>0</strong>: not allowed</li>
     * <li><strong>1</strong>: allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    /**
     * <p>The anti-ransomware backup capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("AntiRansomwareCapacity")
    public Integer antiRansomwareCapacity;

    /**
     * <p>The status of the anti-ransomware managed service. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not activated</li>
     * <li><strong>1</strong>: activated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AntiRansomwareService")
    public Integer antiRansomwareService;

    /**
     * <p>Indicates whether the application whitelist is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>2</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AppWhiteList")
    public Integer appWhiteList;

    /**
     * <p>The number of application whitelist authorizations.</p>
     * <blockquote>
     * <p>One authorization allows you to apply an application whitelist policy to one server. After the application whitelist feature is enabled, the account has 20 authorizations by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AppWhiteListAuthCount")
    public Long appWhiteListAuthCount;

    /**
     * <p>The number of purchased server authorization quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AssetLevel")
    public Integer assetLevel;

    /**
     * <p>Indicates whether the pay-as-you-go trial plan can be activated. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not supported</li>
     * <li><strong>1</strong>: supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CanTryPostPaidPackage")
    public Integer canTryPostPaidPackage;

    /**
     * <p>The number of purchased Cloud Security Posture Management (CSPM) scans. Unit: times per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CspmCapacity")
    public Long cspmCapacity;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CspmInstanceCapacity")
    public Integer cspmInstanceCapacity;

    /**
     * <p>The highest purchased edition of Security Center. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Pro Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * <li><strong>10</strong>: Value-added services only<blockquote>
     * <p>If a single edition is purchased, this value indicates the corresponding edition. If multiple editions are purchased, this value indicates the highest edition among the purchased editions.</p>
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
     * <p>The number of purchased honeypot authorization quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HoneypotCapacity")
    public Long honeypotCapacity;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HybridPaidModuleSwitchMap")
    public Integer hybridPaidModuleSwitchMap;

    @NameInMap("HybridPaidStatus")
    public Integer hybridPaidStatus;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HybridSwitch")
    public Integer hybridSwitch;

    /**
     * <p>The number of purchased image scan authorization quotas.</p>
     * 
     * <strong>example:</strong>
     * <p>8954</p>
     */
    @NameInMap("ImageScanCapacity")
    public Long imageScanCapacity;

    /**
     * <p>The instance purchase type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: self-purchased</li>
     * <li><strong>1</strong>: allocated from a multi-account setup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceBuyType")
    public Integer instanceBuyType;

    /**
     * <p>The instance ID of the purchased Security Center instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-vg6hafdsafs****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The AI digital human analysis traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("IntelligentAnalysisFlow")
    public Integer intelligentAnalysisFlow;

    /**
     * <p>Indicates whether the instance is the new Ultimate Edition.</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is the latest version.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is not the latest version.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsNewContainerVersion")
    public Boolean isNewContainerVersion;

    /**
     * <p>Indicates whether the instance is the new Multi-version Edition.</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is the latest multi-version.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is not the latest multi-version.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsNewMultiVersion")
    public Boolean isNewMultiVersion;

    /**
     * <p>Indicates whether the number of existing servers exceeds the maximum number of purchased authorizations. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: The number does not exceed the limit.</li>
     * <li><strong>true</strong>: The number exceeds the limit.</li>
     * </ul>
     * <blockquote>
     * <p>Notice: This parameter is deprecated. You can ignore it..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsOverBalance")
    public Boolean isOverBalance;

    /**
     * <p>Indicates whether pay-as-you-go billing is enabled. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: disabled</li>
     * <li><strong>true</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPostpay")
    public Boolean isPostpay;

    /**
     * <p>Indicates whether the current Security Center edition is a trial version. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not a trial version</li>
     * <li><strong>1</strong>: trial version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    /**
     * <p>The end timestamp of the last trial of Security Center. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1603934844000</p>
     */
    @NameInMap("LastTrailEndTime")
    public Long lastTrailEndTime;

    /**
     * <p>The total number of authorizations when multiple editions are purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("MVAuthCount")
    public Integer MVAuthCount;

    /**
     * <p>The total number of remaining authorizations when multiple editions are purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MVUnusedAuthCount")
    public Integer MVUnusedAuthCount;

    /**
     * <p>The higher protection edition between the subscription and pay-as-you-go host and container security services of Security Center when both are activated. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>5</strong>: Premium Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>7</strong>: Ultimate Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("MergedVersion")
    public Integer mergedVersion;

    /**
     * <p>The multi-version edition numbers and authorization usage.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MultiVersion")
    public String multiVersion;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NewPostPaidCspm")
    public Integer newPostPaidCspm;

    /**
     * <p>Indicates whether the new version of Cloud Threat Detection and Response (CTDR) is enabled. The new version supports purchasing ingestion traffic and log storage capacity for Cloud Threat Detection and Response (CTDR). Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewThreatAnalysis")
    public Integer newThreatAnalysis;

    /**
     * <p>The number of AI digital human managed instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OnboardedAssets")
    public Integer onboardedAssets;

    /**
     * <p>The timestamp when the service was activated. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657244824669</p>
     */
    @NameInMap("OpenTime")
    public Long openTime;

    /**
     * <p>The highest protection edition for bound assets when the pay-as-you-go host and container security service is activated. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Pro Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>7</strong>: Ultimate Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPayHostVersion")
    public Integer postPayHostVersion;

    /**
     * <p>The instance ID of the pay-as-you-go instance.</p>
     * 
     * <strong>example:</strong>
     * <p>postpay-sas-**</p>
     */
    @NameInMap("PostPayInstanceId")
    public String postPayInstanceId;

    /**
     * <p>The status of pay-as-you-go module switches, in JSON string format. Valid values:</p>
     * <ul>
     * <li>Key:<ul>
     * <li><strong>VUL</strong>: vulnerability fix module</li>
     * <li><strong>CSPM</strong>: Cloud Security Posture Management (CSPM) module</li>
     * <li><strong>AGENTLESS</strong>: agentless detection module</li>
     * <li><strong>SERVERLESS</strong>: serverless security module</li>
     * <li><strong>CTDR</strong>: threat detection and response module</li>
     * <li><strong>POST_HOST</strong>: host and container security module</li>
     * <li><strong>SDK</strong>: malicious file detection SDK module</li>
     * <li><strong>RASP</strong>: application protection module</li>
     * </ul>
     * </li>
     * <li>Value: 0 indicates disabled, 1 indicates enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    /**
     * <p>The time when pay-as-you-go billing was activated.</p>
     * 
     * <strong>example:</strong>
     * <p>1698915219000</p>
     */
    @NameInMap("PostPayOpenTime")
    public Long postPayOpenTime;

    /**
     * <p>The instance status of the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Normal.</li>
     * <li><strong>2</strong>: Suspended due to overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPayStatus")
    public Integer postPayStatus;

    /**
     * <p>The number of purchased application protection quotas. Unit: per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RaspCapacity")
    public Long raspCapacity;

    /**
     * <p>The UNIX timestamp when the Security Center instance expires. Unit: milliseconds.</p>
     * <blockquote>
     * <p>If you do not complete renewal within 7 days after the instance expires, your paid instance is downgraded to Free Edition. You can no longer use the features of the paid edition, and the Security Center configuration data and historical alerting data (such as DDoS alerts) become inaccessible. In this case, you must repurchase Security Center to enable the paid edition. For more information, see <a href="https://help.aliyun.com/document_detail/42308.html">Purchase Security Center</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625846400000</p>
     */
    @NameInMap("ReleaseTime")
    public Long releaseTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2DC96D2-DD2E-49D9-A28E-85590475DF55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether log analysis is purchased. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not purchased</li>
     * <li><strong>1</strong>: purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SasLog")
    public Integer sasLog;

    /**
     * <p>Indicates whether the security dashboard is purchased. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: not purchased</li>
     * <li><strong>1</strong>: purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SasScreen")
    public Integer sasScreen;

    /**
     * <p>The number of malicious file detection SDK authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SdkCapacity")
    public Long sdkCapacity;

    /**
     * <p>The purchased log storage capacity. Unit: GB. Valid values: 0 to 200000.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("SlsCapacity")
    public Long slsCapacity;

    /**
     * <p>The purchased threat analysis capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("ThreatAnalysisCapacity")
    public Long threatAnalysisCapacity;

    /**
     * <p>The purchased log ingestion traffic for threat detection and response. Unit: GB per day.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ThreatAnalysisFlow")
    public Integer threatAnalysisFlow;

    /**
     * <p>Indicates whether the custom alerting feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>2</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UserDefinedAlarms")
    public Integer userDefinedAlarms;

    /**
     * <p>The purchased edition of Security Center. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Pro Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition    </li>
     * <li><strong>7</strong>: Ultimate Edition   </li>
     * <li><strong>8</strong>: Multi-version Edition   </li>
     * <li><strong>10</strong>: Value-added services only.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <p>The number of purchased authorized cores.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VmCores")
    public Integer vmCores;

    /**
     * <p>The number of purchased vulnerability fixes. Unit: times per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VulFixCapacity")
    public Long vulFixCapacity;

    /**
     * <p>Indicates whether web tamper-proofing is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WebLock")
    public Integer webLock;

    /**
     * <p>The number of purchased web tamper-proofing authorizations. One authorization allows you to enable web tamper-proofing for one server. Valid values: 0 to N.</p>
     * <blockquote>
     * <p>N is the number of servers that you own.</p>
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

    public DescribeVersionConfigResponseBody setCspmInstanceCapacity(Integer cspmInstanceCapacity) {
        this.cspmInstanceCapacity = cspmInstanceCapacity;
        return this;
    }
    public Integer getCspmInstanceCapacity() {
        return this.cspmInstanceCapacity;
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

    public DescribeVersionConfigResponseBody setHybridPaidModuleSwitchMap(Integer hybridPaidModuleSwitchMap) {
        this.hybridPaidModuleSwitchMap = hybridPaidModuleSwitchMap;
        return this;
    }
    public Integer getHybridPaidModuleSwitchMap() {
        return this.hybridPaidModuleSwitchMap;
    }

    public DescribeVersionConfigResponseBody setHybridPaidStatus(Integer hybridPaidStatus) {
        this.hybridPaidStatus = hybridPaidStatus;
        return this;
    }
    public Integer getHybridPaidStatus() {
        return this.hybridPaidStatus;
    }

    public DescribeVersionConfigResponseBody setHybridSwitch(Integer hybridSwitch) {
        this.hybridSwitch = hybridSwitch;
        return this;
    }
    public Integer getHybridSwitch() {
        return this.hybridSwitch;
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

    public DescribeVersionConfigResponseBody setNewPostPaidCspm(Integer newPostPaidCspm) {
        this.newPostPaidCspm = newPostPaidCspm;
        return this;
    }
    public Integer getNewPostPaidCspm() {
        return this.newPostPaidCspm;
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
