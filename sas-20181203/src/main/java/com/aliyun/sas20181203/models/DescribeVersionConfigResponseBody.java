// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    /**
     * <p>The agentless detection quota.</p>
     * <blockquote>
     * <p>Agentless detection is not yet available for sale. You can ignore this field.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AgentlessCapacity")
    public Long agentlessCapacity;

    /**
     * <p>Indicates whether pay-as-you-go purchase is allowed. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not allowed.</li>
     * <li><strong>1</strong>: Allowed.</li>
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
     * <p>Indicates whether the anti-ransomware managed service is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not enabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AntiRansomwareService")
    public Integer antiRansomwareService;

    /**
     * <p>Indicates whether the application whitelist feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not enabled.</li>
     * <li><strong>2</strong>: Enabled.</li>
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
     * <p>One authorization allows you to apply a whitelist policy to one server. After you enable the application whitelist feature, your account is granted 20 authorizations by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("AppWhiteListAuthCount")
    public Long appWhiteListAuthCount;

    /**
     * <p>The number of purchased server authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AssetLevel")
    public Integer assetLevel;

    /**
     * <p>Indicates whether Endpoint Detection and Response (EDR) is purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BuySasEdr")
    public String buySasEdr;

    /**
     * <p>Indicates whether the pay-as-you-go trial plan is supported. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not supported.</li>
     * <li><strong>1</strong>: Supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CanTryPostPaidPackage")
    public Integer canTryPostPaidPackage;

    /**
     * <p>The number of purchased cloud platform configuration check scans. Unit: scans per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CspmCapacity")
    public Long cspmCapacity;

    /**
     * <p>The AI digital human analysis traffic.</p>
     * 
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
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * <li><strong>10</strong>: Value-added services only<blockquote>
     * <p>If a single edition is purchased, this value indicates the corresponding edition. If multiple editions are purchased, this value indicates the highest edition among the purchased editions of Security Center.</p>
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
     * <p>The number of purchased honeypot authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("HoneypotCapacity")
    public Long honeypotCapacity;

    /**
     * <p>The canary release module for elastic billing.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CSPM_INSTANCE&quot;:1}</p>
     */
    @NameInMap("HybridPaidGrayStatus")
    public String hybridPaidGrayStatus;

    /**
     * <p>The AI digital human analysis traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HybridPaidModuleSwitchMap")
    public Integer hybridPaidModuleSwitchMap;

    /**
     * <p>The elastic billing switch status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HybridPaidStatus")
    public Integer hybridPaidStatus;

    /**
     * <p>The AI digital human analysis traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("HybridSwitch")
    public Integer hybridSwitch;

    /**
     * <p>The number of purchased image scan authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>8954</p>
     */
    @NameInMap("ImageScanCapacity")
    public Long imageScanCapacity;

    /**
     * <p>The instance purchase type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Self-purchased.</li>
     * <li><strong>1</strong>: Multi-account allocation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceBuyType")
    public Integer instanceBuyType;

    /**
     * <p>The instance ID of the purchased Security Center.</p>
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
     * <p>Indicates whether the instance is the latest Ultimate Edition. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance is the latest version.</li>
     * <li><strong>false</strong>: The instance is not the latest version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsNewContainerVersion")
    public Boolean isNewContainerVersion;

    /**
     * <p>Indicates whether the instance is the latest multi-edition. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The instance is the latest multi-edition.</li>
     * <li><strong>false</strong>: The instance is not the latest multi-edition.</li>
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
     * <li><strong>false</strong>: Not exceeded.</li>
     * <li><strong>true</strong>: Exceeded.<blockquote>
     * <p>Notice: <strong>[Deprecated]</strong> This parameter is deprecated. You can ignore it.</notice></p>
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
     * <p>Indicates whether the pay-as-you-go billing method is enabled. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Not enabled.</li>
     * <li><strong>true</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPostpay")
    public Boolean isPostpay;

    /**
     * <p>Indicates whether the current Security Center edition is a trial edition. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No, it is not a trial edition.</li>
     * <li><strong>1</strong>: Yes, it is a trial edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    /**
     * <p>The end timestamp of the last Security Center trial. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1603934844000</p>
     */
    @NameInMap("LastTrailEndTime")
    public Long lastTrailEndTime;

    /**
     * <p>The total number of authorizations for the multi-edition purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("MVAuthCount")
    public Integer MVAuthCount;

    /**
     * <p>The total number of remaining authorizations for the multi-edition purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MVUnusedAuthCount")
    public Integer MVUnusedAuthCount;

    /**
     * <p>The higher protection edition between the subscription and pay-as-you-go services when both are enabled for Security Center host and container security. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("MergedVersion")
    public Integer mergedVersion;

    /**
     * <p>The multi-edition version numbers and authorization usage.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MultiVersion")
    public String multiVersion;

    /**
     * <p>The AI digital human analysis traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NewPostPaidCspm")
    public Integer newPostPaidCspm;

    /**
     * <p>Indicates whether the new version of Cloud Threat Detection and Response (CTDR) is enabled. The new version of CTDR supports the purchase of inbound traffic and log storage capacity. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewThreatAnalysis")
    public Integer newThreatAnalysis;

    /**
     * <p>The AI digital human managed instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OnboardedAssets")
    public Integer onboardedAssets;

    /**
     * <p>The timestamp when the service is enabled. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1657244824669</p>
     */
    @NameInMap("OpenTime")
    public Long openTime;

    /**
     * <p>The first trial time for the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>1657244824669</p>
     */
    @NameInMap("PostPaidFirstTrialTime")
    public Long postPaidFirstTrialTime;

    /**
     * <p>The latest trial time for the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>1657244824669</p>
     */
    @NameInMap("PostPaidLastTrialTime")
    public Long postPaidLastTrialTime;

    /**
     * <p>The trial expiration time for the pay-as-you-go billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>1657244824669</p>
     */
    @NameInMap("PostPaidTrialExpiredTime")
    public Long postPaidTrialExpiredTime;

    /**
     * <p>The highest protection edition for bound assets when the pay-as-you-go service for host and container security is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Free Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition</li>
     * <li><strong>7</strong>: Ultimate Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PostPayHostVersion")
    public Integer postPayHostVersion;

    /**
     * <p>The pay-as-you-go instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>postpay-sas-**</p>
     */
    @NameInMap("PostPayInstanceId")
    public String postPayInstanceId;

    /**
     * <p>The switch status of pay-as-you-go modules. The value is a JSON string. Valid values:</p>
     * <ul>
     * <li>Key:<ul>
     * <li><strong>VUL</strong>: Vulnerability fixing module</li>
     * <li><strong>CSPM</strong>: Cloud Security Posture Management (CSPM) module</li>
     * <li><strong>AGENTLESS</strong>: Agentless detection module</li>
     * <li><strong>SERVERLESS</strong>: Serverless security module</li>
     * <li><strong>CTDR</strong>: Cloud Threat Detection and Response (CTDR) module</li>
     * <li><strong>POST_HOST</strong>: Host and container security module</li>
     * <li><strong>SDK</strong>: Malicious file detection SDK module</li>
     * <li><strong>RASP</strong>: Application protection module</li>
     * </ul>
     * </li>
     * <li>Value: 0 indicates disabled, and 1 indicates enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;VUL&quot;:1}</p>
     */
    @NameInMap("PostPayModuleSwitch")
    public String postPayModuleSwitch;

    /**
     * <p>The time when the pay-as-you-go billing method is enabled. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1698915219000</p>
     */
    @NameInMap("PostPayOpenTime")
    public Long postPayOpenTime;

    /**
     * <p>The pay-as-you-go instance status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Normal.</li>
     * <li><strong>2</strong>: Stopped due to overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PostPayStatus")
    public Integer postPayStatus;

    /**
     * <p>The number of purchased application protection authorizations. Unit: authorizations per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RaspCapacity")
    public Long raspCapacity;

    /**
     * <p>The expiration UNIX timestamp of the Security Center instance. Unit: milliseconds.</p>
     * <blockquote>
     * <p>If you do not complete the renewal within 7 days after the instance expires, your paid instance is downgraded to the Free Edition. You cannot continue to use the features of the paid edition, and you cannot view your previous Security Center configuration data and historical alerting data, such as DDoS alerting. In this case, you must repurchase the paid edition of Security Center to enable the service. For more information, see <a href="https://help.aliyun.com/document_detail/42308.html">Purchase Security Center</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1625846400000</p>
     */
    @NameInMap("ReleaseTime")
    public Long releaseTime;

    /**
     * <p>The unique identifier generated by Alibaba Cloud for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2DC96D2-DD2E-49D9-A28E-85590475DF55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of machines purchased for EDR.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SasEdrClientAuthCount")
    public String sasEdrClientAuthCount;

    /**
     * <p>The pay-as-you-go EDR instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-edr-postpaid-fadaf</p>
     */
    @NameInMap("SasEdrPostPaidInstanceId")
    public String sasEdrPostPaidInstanceId;

    /**
     * <p>The subscription EDR instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-edr-sfkhakhk</p>
     */
    @NameInMap("SasEdrPrePaidInstanceId")
    public String sasEdrPrePaidInstanceId;

    /**
     * <p>The upfront EDR instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>RELEASED</p>
     */
    @NameInMap("SasEdrPrePaidInstanceStatus")
    public String sasEdrPrePaidInstanceStatus;

    /**
     * <p>The purchased EDR edition.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SasEdrVersion")
    public String sasEdrVersion;

    /**
     * <p>Indicates whether the log analysis feature is purchased. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not purchased.</li>
     * <li><strong>1</strong>: Purchased.</li>
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
     * <li><strong>0</strong>: Not purchased.</li>
     * <li><strong>1</strong>: Purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SasScreen")
    public Integer sasScreen;

    /**
     * <p>The canary release status for the pay-as-you-go SDK.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SdkAiPostPaidGray")
    public Integer sdkAiPostPaidGray;

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
     * <p>The purchased log inbound traffic for Cloud Threat Detection and Response (CTDR). Unit: GB per day.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ThreatAnalysisFlow")
    public Integer threatAnalysisFlow;

    /**
     * <p>The list of child trial modules.</p>
     */
    @NameInMap("TrialModuleList")
    public java.util.List<DescribeVersionConfigResponseBodyTrialModuleList> trialModuleList;

    /**
     * <p>The trial edition.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TrialVersion")
    public Integer trialVersion;

    /**
     * <p>Indicates whether the custom alert feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not enabled.</li>
     * <li><strong>2</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("UserDefinedAlarms")
    public Integer userDefinedAlarms;

    /**
     * <p>The purchased Security Center edition. Valid values:  </p>
     * <ul>
     * <li><strong>1</strong>: Free Edition </li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>5</strong>: Advanced Edition</li>
     * <li><strong>6</strong>: Anti-virus Edition    </li>
     * <li><strong>7</strong>: Ultimate Edition   </li>
     * <li><strong>8</strong>: Multi-edition   </li>
     * <li><strong>10</strong>: Value-added services only</li>
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
     * <p>The number of purchased vulnerability fixing quotas. Unit: fixes per month.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("VulFixCapacity")
    public Long vulFixCapacity;

    /**
     * <p>Indicates whether the web tamper-proofing service is enabled. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not enabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WebLock")
    public Integer webLock;

    /**
     * <p>The number of purchased web tamper-proofing authorizations. One authorization enables web tamper-proofing for one server. Valid values: 0 to N.</p>
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

    public DescribeVersionConfigResponseBody setBuySasEdr(String buySasEdr) {
        this.buySasEdr = buySasEdr;
        return this;
    }
    public String getBuySasEdr() {
        return this.buySasEdr;
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

    public DescribeVersionConfigResponseBody setHybridPaidGrayStatus(String hybridPaidGrayStatus) {
        this.hybridPaidGrayStatus = hybridPaidGrayStatus;
        return this;
    }
    public String getHybridPaidGrayStatus() {
        return this.hybridPaidGrayStatus;
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

    public DescribeVersionConfigResponseBody setPostPaidFirstTrialTime(Long postPaidFirstTrialTime) {
        this.postPaidFirstTrialTime = postPaidFirstTrialTime;
        return this;
    }
    public Long getPostPaidFirstTrialTime() {
        return this.postPaidFirstTrialTime;
    }

    public DescribeVersionConfigResponseBody setPostPaidLastTrialTime(Long postPaidLastTrialTime) {
        this.postPaidLastTrialTime = postPaidLastTrialTime;
        return this;
    }
    public Long getPostPaidLastTrialTime() {
        return this.postPaidLastTrialTime;
    }

    public DescribeVersionConfigResponseBody setPostPaidTrialExpiredTime(Long postPaidTrialExpiredTime) {
        this.postPaidTrialExpiredTime = postPaidTrialExpiredTime;
        return this;
    }
    public Long getPostPaidTrialExpiredTime() {
        return this.postPaidTrialExpiredTime;
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

    public DescribeVersionConfigResponseBody setSasEdrClientAuthCount(String sasEdrClientAuthCount) {
        this.sasEdrClientAuthCount = sasEdrClientAuthCount;
        return this;
    }
    public String getSasEdrClientAuthCount() {
        return this.sasEdrClientAuthCount;
    }

    public DescribeVersionConfigResponseBody setSasEdrPostPaidInstanceId(String sasEdrPostPaidInstanceId) {
        this.sasEdrPostPaidInstanceId = sasEdrPostPaidInstanceId;
        return this;
    }
    public String getSasEdrPostPaidInstanceId() {
        return this.sasEdrPostPaidInstanceId;
    }

    public DescribeVersionConfigResponseBody setSasEdrPrePaidInstanceId(String sasEdrPrePaidInstanceId) {
        this.sasEdrPrePaidInstanceId = sasEdrPrePaidInstanceId;
        return this;
    }
    public String getSasEdrPrePaidInstanceId() {
        return this.sasEdrPrePaidInstanceId;
    }

    public DescribeVersionConfigResponseBody setSasEdrPrePaidInstanceStatus(String sasEdrPrePaidInstanceStatus) {
        this.sasEdrPrePaidInstanceStatus = sasEdrPrePaidInstanceStatus;
        return this;
    }
    public String getSasEdrPrePaidInstanceStatus() {
        return this.sasEdrPrePaidInstanceStatus;
    }

    public DescribeVersionConfigResponseBody setSasEdrVersion(String sasEdrVersion) {
        this.sasEdrVersion = sasEdrVersion;
        return this;
    }
    public String getSasEdrVersion() {
        return this.sasEdrVersion;
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

    public DescribeVersionConfigResponseBody setSdkAiPostPaidGray(Integer sdkAiPostPaidGray) {
        this.sdkAiPostPaidGray = sdkAiPostPaidGray;
        return this;
    }
    public Integer getSdkAiPostPaidGray() {
        return this.sdkAiPostPaidGray;
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

    public DescribeVersionConfigResponseBody setTrialModuleList(java.util.List<DescribeVersionConfigResponseBodyTrialModuleList> trialModuleList) {
        this.trialModuleList = trialModuleList;
        return this;
    }
    public java.util.List<DescribeVersionConfigResponseBodyTrialModuleList> getTrialModuleList() {
        return this.trialModuleList;
    }

    public DescribeVersionConfigResponseBody setTrialVersion(Integer trialVersion) {
        this.trialVersion = trialVersion;
        return this;
    }
    public Integer getTrialVersion() {
        return this.trialVersion;
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

    public static class DescribeVersionConfigResponseBodyTrialModuleList extends TeaModel {
        /**
         * <p>The name of the child trial module.</p>
         * 
         * <strong>example:</strong>
         * <p>EDR</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeVersionConfigResponseBodyTrialModuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVersionConfigResponseBodyTrialModuleList self = new DescribeVersionConfigResponseBodyTrialModuleList();
            return TeaModel.build(map, self);
        }

        public DescribeVersionConfigResponseBodyTrialModuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
