// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEngineVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    @NameInMap("MinorVersion")
    public String minorVersion;

    @NameInMap("EnableUpgradeMinorVersion")
    public Boolean enableUpgradeMinorVersion;

    @NameInMap("MajorVersion")
    public String majorVersion;

    @NameInMap("EnableUpgradeMajorVersion")
    public Boolean enableUpgradeMajorVersion;

    public static DescribeEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEngineVersionResponseBody self = new DescribeEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEngineVersionResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeEngineVersionResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeEngineVersionResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribeEngineVersionResponseBody setEnableUpgradeMinorVersion(Boolean enableUpgradeMinorVersion) {
        this.enableUpgradeMinorVersion = enableUpgradeMinorVersion;
        return this;
    }
    public Boolean getEnableUpgradeMinorVersion() {
        return this.enableUpgradeMinorVersion;
    }

    public DescribeEngineVersionResponseBody setMajorVersion(String majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public String getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeEngineVersionResponseBody setEnableUpgradeMajorVersion(Boolean enableUpgradeMajorVersion) {
        this.enableUpgradeMajorVersion = enableUpgradeMajorVersion;
        return this;
    }
    public Boolean getEnableUpgradeMajorVersion() {
        return this.enableUpgradeMajorVersion;
    }

}
