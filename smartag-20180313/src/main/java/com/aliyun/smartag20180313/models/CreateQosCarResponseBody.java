// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosCarResponseBody extends TeaModel {
    /**
     * <p>The description of the QoS rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>Qosdesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The type of rate limiting. Valid values:</p>
     * <ul>
     * <li><p><strong>Absolute</strong>: by bandwidth value.</p>
     * </li>
     * <li><p><strong>Percent</strong>: by percentage.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Percent</p>
     */
    @NameInMap("LimitType")
    public String limitType;

    /**
     * <p>The maximum bandwidth value. Unit: Mbit/s.</p>
     * <p>This parameter is required when <strong>LimitType</strong> is set to <strong>Absolute</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("MaxBandwidthAbs")
    public Integer maxBandwidthAbs;

    /**
     * <p>The maximum bandwidth percentage. Unit: percent (%).</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("MaxBandwidthPercent")
    public Integer maxBandwidthPercent;

    /**
     * <p>The minimum bandwidth value. Unit: Mbit/s.</p>
     * <p>This parameter is required when <strong>LimitType</strong> is set to <strong>Absolute</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinBandwidthAbs")
    public Integer minBandwidthAbs;

    /**
     * <p>The minimum bandwidth percentage. Unit: percent (%).</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MinBandwidthPercent")
    public Integer minBandwidthPercent;

    /**
     * <p>The bandwidth type when rate limiting by percentage. Valid values:</p>
     * <ul>
     * <li><p><strong>CcnBandwidth</strong>: CCN bandwidth.</p>
     * </li>
     * <li><p><strong>InternetUpBandwidth</strong>: total Internet bandwidth.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CcnBandwidth</p>
     */
    @NameInMap("PercentSourceType")
    public String percentSourceType;

    /**
     * <p>The priority of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The instance ID of the QoS rate limiting rule.</p>
     * 
     * <strong>example:</strong>
     * <p>qoscar-n5k8g97lihlph****</p>
     */
    @NameInMap("QosCarId")
    public String qosCarId;

    /**
     * <p>The instance ID of the QoS policy.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-xitd8690ucu8ro****</p>
     */
    @NameInMap("QosId")
    public String qosId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC13E8FF-4D61-40AD-868E-817F2D3AC86A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateQosCarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQosCarResponseBody self = new CreateQosCarResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQosCarResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateQosCarResponseBody setLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }
    public String getLimitType() {
        return this.limitType;
    }

    public CreateQosCarResponseBody setMaxBandwidthAbs(Integer maxBandwidthAbs) {
        this.maxBandwidthAbs = maxBandwidthAbs;
        return this;
    }
    public Integer getMaxBandwidthAbs() {
        return this.maxBandwidthAbs;
    }

    public CreateQosCarResponseBody setMaxBandwidthPercent(Integer maxBandwidthPercent) {
        this.maxBandwidthPercent = maxBandwidthPercent;
        return this;
    }
    public Integer getMaxBandwidthPercent() {
        return this.maxBandwidthPercent;
    }

    public CreateQosCarResponseBody setMinBandwidthAbs(Integer minBandwidthAbs) {
        this.minBandwidthAbs = minBandwidthAbs;
        return this;
    }
    public Integer getMinBandwidthAbs() {
        return this.minBandwidthAbs;
    }

    public CreateQosCarResponseBody setMinBandwidthPercent(Integer minBandwidthPercent) {
        this.minBandwidthPercent = minBandwidthPercent;
        return this;
    }
    public Integer getMinBandwidthPercent() {
        return this.minBandwidthPercent;
    }

    public CreateQosCarResponseBody setPercentSourceType(String percentSourceType) {
        this.percentSourceType = percentSourceType;
        return this;
    }
    public String getPercentSourceType() {
        return this.percentSourceType;
    }

    public CreateQosCarResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateQosCarResponseBody setQosCarId(String qosCarId) {
        this.qosCarId = qosCarId;
        return this;
    }
    public String getQosCarId() {
        return this.qosCarId;
    }

    public CreateQosCarResponseBody setQosId(String qosId) {
        this.qosId = qosId;
        return this;
    }
    public String getQosId() {
        return this.qosId;
    }

    public CreateQosCarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
