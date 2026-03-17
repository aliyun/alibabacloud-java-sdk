// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeDeviceAutoUpgradePolicyResponseBody extends TeaModel {
    /**
     * <p>The time when upgrades start. The time was configured by using a cron expression.</p>
     * <p>Example value: <code>0 0 4 1/1 * ?</code>. The example value indicates that upgrades start at 04:00:00 (UTC+8) on the first day of each month.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 4 1/1 * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The time period during which upgrades are performed.</p>
     * <p>Valid values: <strong>30 to 120</strong>.</p>
     * <p>Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The time differences between upgrades. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Jitter")
    public String jitter;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0E20FBB8-BCFC-4F5E-BD94-77FF6A2133D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sage62x022502****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-kxe2cv7hot7qrv****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The time zone in which the trigger period takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>The update type. Valid values:</p>
     * <ul>
     * <li><strong>scheduled</strong>: scheduled upgrade.</li>
     * <li><strong>boot</strong>: automatic upgrade upon instance startup.</li>
     * <li><strong>manual</strong>: manual upgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>scheduled</p>
     */
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
