// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsResponseBody extends TeaModel {
    @NameInMap("ExposedAsapVulCount")
    public Integer exposedAsapVulCount;

    @NameInMap("ExposedComponentCount")
    public Integer exposedComponentCount;

    @NameInMap("ExposedInstanceCount")
    public Integer exposedInstanceCount;

    @NameInMap("ExposedIpCount")
    public Integer exposedIpCount;

    @NameInMap("ExposedLaterVulCount")
    public Integer exposedLaterVulCount;

    @NameInMap("ExposedNntfVulCount")
    public Integer exposedNntfVulCount;

    @NameInMap("ExposedPortCount")
    public Integer exposedPortCount;

    @NameInMap("ExposedWeekPasswordMachineCount")
    public Integer exposedWeekPasswordMachineCount;

    @NameInMap("GatewayAssetCount")
    public Integer gatewayAssetCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExposedStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsResponseBody self = new DescribeExposedStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsResponseBody setExposedAsapVulCount(Integer exposedAsapVulCount) {
        this.exposedAsapVulCount = exposedAsapVulCount;
        return this;
    }
    public Integer getExposedAsapVulCount() {
        return this.exposedAsapVulCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedComponentCount(Integer exposedComponentCount) {
        this.exposedComponentCount = exposedComponentCount;
        return this;
    }
    public Integer getExposedComponentCount() {
        return this.exposedComponentCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedInstanceCount(Integer exposedInstanceCount) {
        this.exposedInstanceCount = exposedInstanceCount;
        return this;
    }
    public Integer getExposedInstanceCount() {
        return this.exposedInstanceCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedIpCount(Integer exposedIpCount) {
        this.exposedIpCount = exposedIpCount;
        return this;
    }
    public Integer getExposedIpCount() {
        return this.exposedIpCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedLaterVulCount(Integer exposedLaterVulCount) {
        this.exposedLaterVulCount = exposedLaterVulCount;
        return this;
    }
    public Integer getExposedLaterVulCount() {
        return this.exposedLaterVulCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedNntfVulCount(Integer exposedNntfVulCount) {
        this.exposedNntfVulCount = exposedNntfVulCount;
        return this;
    }
    public Integer getExposedNntfVulCount() {
        return this.exposedNntfVulCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedPortCount(Integer exposedPortCount) {
        this.exposedPortCount = exposedPortCount;
        return this;
    }
    public Integer getExposedPortCount() {
        return this.exposedPortCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedWeekPasswordMachineCount(Integer exposedWeekPasswordMachineCount) {
        this.exposedWeekPasswordMachineCount = exposedWeekPasswordMachineCount;
        return this;
    }
    public Integer getExposedWeekPasswordMachineCount() {
        return this.exposedWeekPasswordMachineCount;
    }

    public DescribeExposedStatisticsResponseBody setGatewayAssetCount(Integer gatewayAssetCount) {
        this.gatewayAssetCount = gatewayAssetCount;
        return this;
    }
    public Integer getGatewayAssetCount() {
        return this.gatewayAssetCount;
    }

    public DescribeExposedStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
