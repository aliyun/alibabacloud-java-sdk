// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExposedLaterVulCount")
    public Integer exposedLaterVulCount;

    @NameInMap("ExposedComponentCount")
    public Integer exposedComponentCount;

    @NameInMap("ExposedPortCount")
    public Integer exposedPortCount;

    @NameInMap("ExposedInstanceCount")
    public Integer exposedInstanceCount;

    @NameInMap("ExposedWeekPasswordMachineCount")
    public Integer exposedWeekPasswordMachineCount;

    @NameInMap("ExposedNntfVulCount")
    public Integer exposedNntfVulCount;

    @NameInMap("GatewayAssetCount")
    public Integer gatewayAssetCount;

    @NameInMap("ExposedIpCount")
    public Integer exposedIpCount;

    @NameInMap("ExposedAsapVulCount")
    public Integer exposedAsapVulCount;

    public static DescribeExposedStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsResponseBody self = new DescribeExposedStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposedStatisticsResponseBody setExposedLaterVulCount(Integer exposedLaterVulCount) {
        this.exposedLaterVulCount = exposedLaterVulCount;
        return this;
    }
    public Integer getExposedLaterVulCount() {
        return this.exposedLaterVulCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedComponentCount(Integer exposedComponentCount) {
        this.exposedComponentCount = exposedComponentCount;
        return this;
    }
    public Integer getExposedComponentCount() {
        return this.exposedComponentCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedPortCount(Integer exposedPortCount) {
        this.exposedPortCount = exposedPortCount;
        return this;
    }
    public Integer getExposedPortCount() {
        return this.exposedPortCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedInstanceCount(Integer exposedInstanceCount) {
        this.exposedInstanceCount = exposedInstanceCount;
        return this;
    }
    public Integer getExposedInstanceCount() {
        return this.exposedInstanceCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedWeekPasswordMachineCount(Integer exposedWeekPasswordMachineCount) {
        this.exposedWeekPasswordMachineCount = exposedWeekPasswordMachineCount;
        return this;
    }
    public Integer getExposedWeekPasswordMachineCount() {
        return this.exposedWeekPasswordMachineCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedNntfVulCount(Integer exposedNntfVulCount) {
        this.exposedNntfVulCount = exposedNntfVulCount;
        return this;
    }
    public Integer getExposedNntfVulCount() {
        return this.exposedNntfVulCount;
    }

    public DescribeExposedStatisticsResponseBody setGatewayAssetCount(Integer gatewayAssetCount) {
        this.gatewayAssetCount = gatewayAssetCount;
        return this;
    }
    public Integer getGatewayAssetCount() {
        return this.gatewayAssetCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedIpCount(Integer exposedIpCount) {
        this.exposedIpCount = exposedIpCount;
        return this;
    }
    public Integer getExposedIpCount() {
        return this.exposedIpCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedAsapVulCount(Integer exposedAsapVulCount) {
        this.exposedAsapVulCount = exposedAsapVulCount;
        return this;
    }
    public Integer getExposedAsapVulCount() {
        return this.exposedAsapVulCount;
    }

}
