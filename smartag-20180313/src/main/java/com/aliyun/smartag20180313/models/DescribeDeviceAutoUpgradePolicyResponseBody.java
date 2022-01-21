// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeDeviceAutoUpgradePolicyResponseBody extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("Jitter")
    public String jitter;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("TimeZone")
    public String timeZone;

    @NameInMap("UpgradeType")
    public String upgradeType;

    public static DescribeDeviceAutoUpgradePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceAutoUpgradePolicyResponseBody self = new DescribeDeviceAutoUpgradePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setJitter(String jitter) {
        this.jitter = jitter;
        return this;
    }
    public String getJitter() {
        return this.jitter;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public DescribeDeviceAutoUpgradePolicyResponseBody setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

}
