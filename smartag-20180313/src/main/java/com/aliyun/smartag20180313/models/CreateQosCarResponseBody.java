// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateQosCarResponseBody extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("LimitType")
    public String limitType;

    @NameInMap("MaxBandwidthAbs")
    public Integer maxBandwidthAbs;

    @NameInMap("MaxBandwidthPercent")
    public Integer maxBandwidthPercent;

    @NameInMap("MinBandwidthAbs")
    public Integer minBandwidthAbs;

    @NameInMap("MinBandwidthPercent")
    public Integer minBandwidthPercent;

    @NameInMap("PercentSourceType")
    public String percentSourceType;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("QosCarId")
    public String qosCarId;

    @NameInMap("QosId")
    public String qosId;

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
