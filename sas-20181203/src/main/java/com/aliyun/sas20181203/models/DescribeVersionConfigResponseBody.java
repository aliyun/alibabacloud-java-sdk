// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVersionConfigResponseBody extends TeaModel {
    @NameInMap("AllowPartialBuy")
    public Integer allowPartialBuy;

    @NameInMap("AppWhiteList")
    public Integer appWhiteList;

    @NameInMap("AppWhiteListAuthCount")
    public Long appWhiteListAuthCount;

    @NameInMap("AssetLevel")
    public Integer assetLevel;

    @NameInMap("HighestVersion")
    public Integer highestVersion;

    @NameInMap("HoneypotCapacity")
    public Long honeypotCapacity;

    @NameInMap("ImageScanCapacity")
    public Long imageScanCapacity;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsNewContainerVersion")
    public Boolean isNewContainerVersion;

    @NameInMap("IsNewMultiVersion")
    public Boolean isNewMultiVersion;

    @NameInMap("IsOverBalance")
    public Boolean isOverBalance;

    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    @NameInMap("LastTrailEndTime")
    public Long lastTrailEndTime;

    @NameInMap("MVAuthCount")
    public Integer MVAuthCount;

    @NameInMap("MVUnusedAuthCount")
    public Integer MVUnusedAuthCount;

    @NameInMap("OpenTime")
    public Long openTime;

    @NameInMap("ReleaseTime")
    public Long releaseTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SasLog")
    public Integer sasLog;

    @NameInMap("SasScreen")
    public Integer sasScreen;

    @NameInMap("SlsCapacity")
    public Long slsCapacity;

    @NameInMap("ThreatAnalysisCapacity")
    public Long threatAnalysisCapacity;

    @NameInMap("UserDefinedAlarms")
    public Integer userDefinedAlarms;

    @NameInMap("Version")
    public Integer version;

    @NameInMap("VmCores")
    public Integer vmCores;

    @NameInMap("WebLock")
    public Integer webLock;

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
