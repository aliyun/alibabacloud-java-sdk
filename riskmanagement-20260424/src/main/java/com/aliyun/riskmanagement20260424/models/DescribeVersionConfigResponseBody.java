// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeVersionConfigResponseBodyData data;

    /**
     * <p>The response message. A success message is returned if the request succeeds. An error message is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6D462855-7835-5F91-835E-A62E44EC01CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. Valid values: true: The operation is successful. false: The operation failed.</p>
     * 
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
         * <p>The agentless detection quota.</p>
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
         * <p>Indicates whether pay-as-you-go purchase is allowed.</p>
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
         * <p>The allocated anti-ransomware capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1680</p>
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
         * <p>0</p>
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
         * <p>The number of purchased server authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AssetLevel")
        public Integer assetLevel;

        /**
         * <p>Indicates whether the pay-as-you-go trial plan can be activated. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanTryPostPaidPackage")
        public Integer canTryPostPaidPackage;

        /**
         * <p>The allocated Cloud Security Posture Management (CSPM) scan quota. Unit: times/month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CspmCapacity")
        public Long cspmCapacity;

        /**
         * <p>The highest purchased edition of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * <li><strong>10</strong>: Value-added services only.<blockquote>
         * <p>If a single edition is purchased, this value indicates the corresponding edition. If multiple editions are purchased, this value indicates the highest edition among them.</p>
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
         * <p>The allocated number of honeypot authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HoneypotCapacity")
        public Long honeypotCapacity;

        /**
         * <p>The number of purchased image scan authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>1900</p>
         */
        @NameInMap("ImageScanCapacity")
        public Long imageScanCapacity;

        /**
         * <p>The instance purchase type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Self-purchased.</li>
         * <li><strong>1</strong>: Allocated by multi-account management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceBuyType")
        public Integer instanceBuyType;

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
         * <li><p><strong>true</strong>: The instance is the latest edition.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance is not the latest edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNewContainerVersion")
        public Boolean isNewContainerVersion;

        /**
         * <p>Indicates whether the instance is the new multi-edition version.</p>
         * <ul>
         * <li><p><strong>true</strong>: The instance is the latest multi-edition version.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance is not the latest multi-edition version.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNewMultiVersion")
        public Boolean isNewMultiVersion;

        /**
         * <p>Indicates whether the number of existing servers exceeds the maximum purchased authorization quota. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not exceeded.</li>
         * <li><strong>true</strong>: Exceeded.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: This parameter is deprecated. You can ignore it.</p>
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
         * <p>Indicates whether the current Security Center edition is a trial version. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not a trial version.</li>
         * <li><strong>1</strong>: A trial version.</li>
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
         * <p>The higher protection edition when both subscription and pay-as-you-go host and container security services are enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The total number of authorizations when multiple editions are purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MvAuthCount")
        public Integer mvAuthCount;

        /**
         * <p>The total number of remaining authorizations when multiple editions are purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MvUnusedAuthCount")
        public Integer mvUnusedAuthCount;

        /**
         * <p>Indicates whether the new version of Cloud Threat Detection and Response (CTDR) is enabled. The new version supports purchasing access traffic and log storage capacity for Cloud Threat Detection and Response (CTDR). Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NewThreatAnalysis")
        public Integer newThreatAnalysis;

        /**
         * <p>The AI digital human managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The highest protection edition for bound assets when the pay-as-you-go host and container security service is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostPayHostVersion")
        public Integer postPayHostVersion;

        /**
         * <p>The pay-as-you-go instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-frme8vjfiw2j</p>
         */
        @NameInMap("PostPayInstanceId")
        public String postPayInstanceId;

        /**
         * <p>The switch status of pay-as-you-go modules in JSON string format. Valid values:</p>
         * <ul>
         * <li>Key:<ul>
         * <li><strong>VUL</strong>: Vulnerability fix module.</li>
         * <li><strong>CSPM</strong>: Cloud Security Posture Management module.</li>
         * <li><strong>AGENTLESS</strong>: Agentless detection module.</li>
         * <li><strong>SERVERLESS</strong>: Serverless security module.</li>
         * <li><strong>CTDR</strong>: Threat detection and response module.</li>
         * <li><strong>POST_HOST</strong>: Host and container security module.</li>
         * <li><strong>SDK</strong>: Malicious file detection SDK module.</li>
         * <li><strong>RASP</strong>: Application protection module.</li>
         * </ul>
         * </li>
         * <li>Value: 0 indicates disabled. 1 indicates enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;BASIC_SERVICE\&quot;:0,\&quot;VUL\&quot;:0}</p>
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
         * <p>The number of purchased application protection quotas. Unit: count/month.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RaspCapacity")
        public Long raspCapacity;

        /**
         * <p>The UNIX timestamp that indicates when the Security Center instance expires. Unit: milliseconds.</p>
         * <blockquote>
         * <p>If you do not perform renewal within 7 days after the instance expires, your paid edition instance is downgraded to Free Edition. You can no longer use the features of the paid edition, and your previous Security Center configuration data and historical alerting data (such as DDoS alerts) become inaccessible. In this case, you must repurchase Security Center to re-enable the paid edition. For more information, refer to the Security Center purchase documentation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1625846400000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The request ID of Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>A6FB9AC3-4431-538F-BA8A-2A13AEA208A4</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>Indicates whether log analysis has been purchased. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not purchased.</li>
         * <li><strong>1</strong>: Purchased.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SasLog")
        public Integer sasLog;

        /**
         * <p>Indicates whether the security dashboard has been purchased. Valid values:</p>
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
         * <p>The number of malicious file detection SDK authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SdkCapacity")
        public Long sdkCapacity;

        /**
         * <p>The purchased log storage capacity. Unit: GB. Value range: 0 to 200000.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SlsCapacity")
        public Long slsCapacity;

        /**
         * <p>The purchased threat analysis capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ThreatAnalysisCapacity")
        public Long threatAnalysisCapacity;

        /**
         * <p>The purchased threat detection and response log access traffic. Unit: GB/day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ThreatAnalysisFlow")
        public Integer threatAnalysisFlow;

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
         * <p>The purchased edition of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * <li><strong>8</strong>: Multi-edition.</li>
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
         * <p>The number of purchased vulnerability fix quotas. Unit: times/month.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("VulFixCapacity")
        public Long vulFixCapacity;

        /**
         * <p>Indicates whether the web tamper proofing service is enabled. Valid values:</p>
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
         * <p>The number of purchased web tamper proofing authorizations. One authorization enables web tamper proofing protection for one server. Value range: 0 to N.</p>
         * <blockquote>
         * <p>N is the number of servers that you own.</p>
         * </blockquote>
         * 
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
        /**
         * <p>The message body content encoded by the Base64 algorithm.</p>
         */
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
