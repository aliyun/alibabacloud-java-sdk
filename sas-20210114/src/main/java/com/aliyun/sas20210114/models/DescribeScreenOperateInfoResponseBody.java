// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenOperateInfoResponseBody extends TeaModel {
    @NameInMap("DateArray")
    public java.util.List<String> dateArray;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HealthCheckDealedCount")
    public Integer healthCheckDealedCount;

    @NameInMap("HealthCheckValueArray")
    public java.util.List<String> healthCheckValueArray;

    /**
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-6xxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecurityEventDealedCount")
    public Integer securityEventDealedCount;

    @NameInMap("SuspEventValueArray")
    public java.util.List<String> suspEventValueArray;

    @NameInMap("VulValueArray")
    public java.util.List<String> vulValueArray;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulnerabilityDealedCount")
    public Integer vulnerabilityDealedCount;

    public static DescribeScreenOperateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenOperateInfoResponseBody self = new DescribeScreenOperateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenOperateInfoResponseBody setDateArray(java.util.List<String> dateArray) {
        this.dateArray = dateArray;
        return this;
    }
    public java.util.List<String> getDateArray() {
        return this.dateArray;
    }

    public DescribeScreenOperateInfoResponseBody setHealthCheckDealedCount(Integer healthCheckDealedCount) {
        this.healthCheckDealedCount = healthCheckDealedCount;
        return this;
    }
    public Integer getHealthCheckDealedCount() {
        return this.healthCheckDealedCount;
    }

    public DescribeScreenOperateInfoResponseBody setHealthCheckValueArray(java.util.List<String> healthCheckValueArray) {
        this.healthCheckValueArray = healthCheckValueArray;
        return this;
    }
    public java.util.List<String> getHealthCheckValueArray() {
        return this.healthCheckValueArray;
    }

    public DescribeScreenOperateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenOperateInfoResponseBody setSecurityEventDealedCount(Integer securityEventDealedCount) {
        this.securityEventDealedCount = securityEventDealedCount;
        return this;
    }
    public Integer getSecurityEventDealedCount() {
        return this.securityEventDealedCount;
    }

    public DescribeScreenOperateInfoResponseBody setSuspEventValueArray(java.util.List<String> suspEventValueArray) {
        this.suspEventValueArray = suspEventValueArray;
        return this;
    }
    public java.util.List<String> getSuspEventValueArray() {
        return this.suspEventValueArray;
    }

    public DescribeScreenOperateInfoResponseBody setVulValueArray(java.util.List<String> vulValueArray) {
        this.vulValueArray = vulValueArray;
        return this;
    }
    public java.util.List<String> getVulValueArray() {
        return this.vulValueArray;
    }

    public DescribeScreenOperateInfoResponseBody setVulnerabilityDealedCount(Integer vulnerabilityDealedCount) {
        this.vulnerabilityDealedCount = vulnerabilityDealedCount;
        return this;
    }
    public Integer getVulnerabilityDealedCount() {
        return this.vulnerabilityDealedCount;
    }

}
