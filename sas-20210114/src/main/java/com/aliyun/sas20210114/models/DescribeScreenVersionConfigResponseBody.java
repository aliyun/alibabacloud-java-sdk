// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenVersionConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AssetLevel")
    public Integer assetLevel;

    /**
     * <strong>example:</strong>
     * <p>sas-b5***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsTrialVersion")
    public Integer isTrialVersion;

    /**
     * <strong>example:</strong>
     * <p>1625846400000</p>
     */
    @NameInMap("ReleaseTime")
    public Long releaseTime;

    /**
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-1XXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>3</p>
     */
    @NameInMap("Version")
    public Integer version;

    public static DescribeScreenVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenVersionConfigResponseBody self = new DescribeScreenVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenVersionConfigResponseBody setAssetLevel(Integer assetLevel) {
        this.assetLevel = assetLevel;
        return this;
    }
    public Integer getAssetLevel() {
        return this.assetLevel;
    }

    public DescribeScreenVersionConfigResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeScreenVersionConfigResponseBody setIsTrialVersion(Integer isTrialVersion) {
        this.isTrialVersion = isTrialVersion;
        return this;
    }
    public Integer getIsTrialVersion() {
        return this.isTrialVersion;
    }

    public DescribeScreenVersionConfigResponseBody setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    public DescribeScreenVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenVersionConfigResponseBody setSasLog(Integer sasLog) {
        this.sasLog = sasLog;
        return this;
    }
    public Integer getSasLog() {
        return this.sasLog;
    }

    public DescribeScreenVersionConfigResponseBody setSasScreen(Integer sasScreen) {
        this.sasScreen = sasScreen;
        return this;
    }
    public Integer getSasScreen() {
        return this.sasScreen;
    }

    public DescribeScreenVersionConfigResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
