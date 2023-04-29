// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the pay-as-you-go billing method is supported.</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    /**
     * <p>Indicates whether the application whitelist feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **2**: yes</p>
     */
    @NameInMap("AppWhiteList")
    public Integer appWhiteList;

    /**
     * <p>The quota for the application whitelist feature.</p>
     * <br>
     * <p>> The quantity of servers that are allowed by the quota is deducted by one each time you apply an application whitelist to a server. After you enable the application whitelist feature, the quota is 20 by default.</p>
     */
    @NameInMap("AppWhiteListAuthCount")
    public Long appWhiteListAuthCount;

    /**
     * <p>The quota for servers that can be protected.</p>
     */
    @NameInMap("AssetLevel")
    public Integer assetLevel;

    /**
     * <p>The most advanced edition that is used. Valid values:</p>
     * <br>
     * <p>*   **1**: Basic edition</p>
     * <p>*   **3**: Enterprise edition</p>
     * <p>*   **5**: Advanced edition</p>
     * <p>*   **6**: Anti-virus edition</p>
     * <p>*   **7**: Ultimate edition</p>
     * <p>*   **10**: Value-added Plan edition</p>
     * <br>
     * <p>> If you purchase the Multi-version edition of Security Center, the value indicates the most advanced edition that is used in the Multi-version edition. If you do not purchase the Multi-version edition of Security Center, the value indicates the edition of Security Center.</p>
     */
    @NameInMap("HighestVersion")
    public Integer highestVersion;

    /**
     * <p>The number of honeypots.</p>
     */
    @NameInMap("HoneypotCapacity")
    public Long honeypotCapacity;

    /**
     * <p>The quota for the container image scan feature.</p>
     */
    @NameInMap("ImageScanCapacity")
    public Long imageScanCapacity;

    /**
     * <p>The ID of purchased Security Center.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether Security Center runs the latest version of the Ultimate edition.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsNewContainerVersion")
    public Boolean isNewContainerVersion;

    /**
     * <p>Indicates whether Security Center runs the latest version of the Multi-version edition.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IsNewMultiVersion")
    public Boolean isNewMultiVersion;

    /**
     * <p>Indicates whether the number of existing servers exceeds the purchased quota. Valid values:</p>
     * <br>
     * <p>*   **false**: no</p>
     * <p>*   **true**: yes</p>
     */
    @NameInMap("IsOverBalance")
    public Boolean isOverBalance;

    /**
     * <p>Indicates whether Security Center runs the free trial edition. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    /**
     * <p>The timestamp when the last trial ends. Unit: milliseconds.</p>
     */
    @NameInMap("LastTrailEndTime")
    public Long lastTrailEndTime;

    /**
     * <p>The total quota in the Multi-version edition of purchased Security Center.</p>
     */
    @NameInMap("MVAuthCount")
    public Integer MVAuthCount;

    /**
     * <p>The total remaining quota in the Multi-version edition of purchased Security Center.</p>
     */
    @NameInMap("MVUnusedAuthCount")
    public Integer MVUnusedAuthCount;

    /**
     * <p>The timestamp when Security Center is purchased. Unit: milliseconds.</p>
     */
    @NameInMap("OpenTime")
    public Long openTime;

    /**
     * <p>The timestamp when Security Center is released. Unit: milliseconds. The value of this parameter is seven days after Security Center expires.</p>
     * <br>
     * <p>> If you do not renew the subscription within seven days after the expiration date, the Value-added Plan, Anti-virus, Advanced, or Enterprise edition is downgraded to the Basic edition. In this case, you can no longer view the existing configurations or statistics such as DDoS alerts. You must purchase the Anti-virus, Advanced, or Enterprise edition to continue using relevant features. For more information, see [Purchase Security Center](~~42308~~).</p>
     */
    @NameInMap("ReleaseTime")
    public Long releaseTime;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the log analysis feature is purchased. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("SasLog")
    public Integer sasLog;

    /**
     * <p>Indicates whether the security screen feature is purchased. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("SasScreen")
    public Integer sasScreen;

    /**
     * <p>The log storage capacity that you purchase. Unit: GB. Valid values: 0 to 200000.</p>
     */
    @NameInMap("SlsCapacity")
    public Long slsCapacity;

    /**
     * <p>The purchased log storage capacity for threat analysis. Unit: GB.</p>
     */
    @NameInMap("ThreatAnalysisCapacity")
    public Long threatAnalysisCapacity;

    /**
     * <p>Indicates whether the custom alerting feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **2**: yes</p>
     */
    @NameInMap("UserDefinedAlarms")
    public Integer userDefinedAlarms;

    /**
     * <p>The edition of purchased Security Center. Valid values:</p>
     * <br>
     * <p>*   **1**: Basic edition</p>
     * <p>*   **3**: Enterprise edition</p>
     * <p>*   **5**: Advanced edition</p>
     * <p>*   **6**: Anti-virus edition</p>
     * <p>*   **7**: Ultimate edition</p>
     * <p>*   **8**: Multi-version edition</p>
     * <p>*   **10**: Value-added Plan edition</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <p>The quota for the cores of servers that can be protected.</p>
     */
    @NameInMap("VmCores")
    public Integer vmCores;

    /**
     * <p>Indicates whether the web tamper proofing feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **0**: no</p>
     * <p>*   **1**: yes</p>
     */
    @NameInMap("WebLock")
    public Integer webLock;

    /**
     * <p>The quota for the web tamper proofing feature. The quantity of servers that are allowed by the quota is deducted by one each time you enable the web tamper proofing feature for a server. Valid values: 0 to N.</p>
     * <br>
     * <p>> N indicates the number of servers that you own.</p>
     */
    @NameInMap("WebLockAuthCount")
    public Long webLockAuthCount;

    public static DescribeVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVersionConfigResponseBody self = new DescribeVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVersionConfigResponseBody setAllowPartialBuy(Integer allowPartialBuy) {
        this.allowPartialBuy = allowPartialBuy;
        return this;
    }
    public Integer getAllowPartialBuy() {
        return this.allowPartialBuy;
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

    public DescribeVersionConfigResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public DescribeVersionConfigResponseBody setOpenTime(Long openTime) {
        this.openTime = openTime;
        return this;
    }
    public Long getOpenTime() {
        return this.openTime;
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
