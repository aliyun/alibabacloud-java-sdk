// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    // Indicates whether the pay-as-you-go billing method is supported.
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    // Indicates whether the application whitelist feature is enabled. Valid values:
    // 
    // *   **0**: no
    // *   **2**: yes
    @NameInMap("AppWhiteList")
    public Integer appWhiteList;

    // The quota for the application whitelist feature.
    // 
    // >  The quantity of servers that are allowed by the quota is deducted by one each time you apply an application whitelist to a server. After you enable the application whitelist feature, the quota is 20 by default.
    @NameInMap("AppWhiteListAuthCount")
    public Long appWhiteListAuthCount;

    // The quota for servers that can be protected.
    @NameInMap("AssetLevel")
    public Integer assetLevel;

    // The most advanced edition that is used. Valid values:
    // 
    // *   **1**: Basic edition
    // *   **3**: Enterprise edition
    // *   **5**: Advanced edition
    // *   **6**: Anti-virus edition
    // *   **7**: Ultimate edition
    // *   **10**: Value-added Plan edition
    // 
    // >  If you purchase the Multi-version edition of Security Center, the value indicates the most advanced edition that is used in the Multi-version edition. If you do not purchase the Multi-version edition of Security Center, the value indicates the edition of Security Center.
    @NameInMap("HighestVersion")
    public Integer highestVersion;

    // The number of honeypots.
    @NameInMap("HoneypotCapacity")
    public Long honeypotCapacity;

    // The quota for the container image scan feature.
    @NameInMap("ImageScanCapacity")
    public Long imageScanCapacity;

    // The ID of purchased Security Center.
    @NameInMap("InstanceId")
    public String instanceId;

    // Indicates whether Security Center runs the latest version of the Ultimate edition.
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("IsNewContainerVersion")
    public Boolean isNewContainerVersion;

    // Indicates whether the number of existing servers exceeds the purchased quota. Valid values:
    // 
    // *   **false**: no
    // *   **true**: yes
    @NameInMap("IsOverBalance")
    public Boolean isOverBalance;

    // Indicates whether Security Center runs the free trial edition. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    // The timestamp when the last trial ends. Unit: milliseconds.
    @NameInMap("LastTrailEndTime")
    public Long lastTrailEndTime;

    // The total quota in the Multi-version edition of purchased Security Center.
    @NameInMap("MVAuthCount")
    public Integer MVAuthCount;

    // The total remaining quota in the Multi-version edition of purchased Security Center.
    @NameInMap("MVUnusedAuthCount")
    public Integer MVUnusedAuthCount;

    // The timestamp when Security Center is purchased. Unit: milliseconds.
    @NameInMap("OpenTime")
    public Long openTime;

    // The timestamp when Security Center is released. Unit: milliseconds. The value of this parameter is seven days after Security Center expires.
    // 
    // >  If you do not renew the subscription within seven days after the expiration date, the Value-added Plan, Basic Anti-Virus, Advanced, or Enterprise edition is downgraded to the Basic edition. In this case, you can no longer view the configurations of Security Center or historical statistics such as DDoS alerts. You must purchase another subscription of the Basic Anti-Virus, Advanced, or Enterprise edition to continue using relevant features. For more information, see [Purchase Security Center](~~42308~~).
    @NameInMap("ReleaseTime")
    public Long releaseTime;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether log analysis is purchased. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("SasLog")
    public Integer sasLog;

    // Indicates whether the security screen feature is purchased. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("SasScreen")
    public Integer sasScreen;

    // The log storage capacity that you purchase. Unit: GB. Valid values: 0 to 200000.
    @NameInMap("SlsCapacity")
    public Long slsCapacity;

    // The purchased log storage capacity for threat analysis. Unit: GB.
    @NameInMap("ThreatAnalysisCapacity")
    public Long threatAnalysisCapacity;

    // Indicates whether the custom alert feature is enabled. Valid values:
    // 
    // *   **0**: no
    // *   **2**: yes
    @NameInMap("UserDefinedAlarms")
    public Integer userDefinedAlarms;

    // The edition of purchased Security Center. Valid values:
    // 
    // *   **1**: Basic edition
    // *   **3**: Enterprise edition
    // *   **5**: Advanced edition
    // *   **6**: Anti-virus edition
    // *   **7**: Ultimate edition
    // *   **8**: Multi-version edition
    // *   **10**: Value-added Plan edition
    @NameInMap("Version")
    public Integer version;

    // The quota for the cores of servers that can be protected.
    @NameInMap("VmCores")
    public Integer vmCores;

    // Indicates whether the web tamper proofing feature is enabled. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("WebLock")
    public Integer webLock;

    // The quota for the web tamper proofing feature. The quantity of servers that are allowed by the quota is deducted by one each time a server is protected by the web tamper proofing feature. Valid values: 0 to N.
    // 
    // >  N indicates the number of servers that you own.
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
