// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsResponseBody extends TeaModel {
    /**
     * <p>The total number of high-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExposedAsapVulCount")
    public Integer exposedAsapVulCount;

    /**
     * <p>The total number of system components that are exposed on the Internet. The components include OpenSSL and OpenSSH.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ExposedComponentCount")
    public Integer exposedComponentCount;

    /**
     * <p>The number of ApsaraDB for MongoDB instances that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExposedDdsCount")
    public Integer exposedDdsCount;

    /**
     * <p>The number of Elastic Compute Service (ECS) instances that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExposedEcsCount")
    public Integer exposedEcsCount;

    /**
     * <p>The total number of assets that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ExposedInstanceCount")
    public Integer exposedInstanceCount;

    /**
     * <p>The total number of IP addresses that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ExposedIpCount")
    public Integer exposedIpCount;

    /**
     * <p>The number of ApsaraDB for Redis instances that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExposedKvstoreCount")
    public Integer exposedKvstoreCount;

    /**
     * <p>The total number of medium-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ExposedLaterVulCount")
    public Integer exposedLaterVulCount;

    /**
     * <p>The total number of low-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ExposedNntfVulCount")
    public Integer exposedNntfVulCount;

    /**
     * <p>The total number of ports that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("ExposedPortCount")
    public Integer exposedPortCount;

    /**
     * <p>The number of ApsaraDB RDS instances that are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExposedRdsCount")
    public Integer exposedRdsCount;

    /**
     * <p>The total number of system keys that are detected on your servers and are exposed on the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ExposedWeekPasswordMachineCount")
    public Integer exposedWeekPasswordMachineCount;

    /**
     * <p>The total number of gateway assets that are exposed on the Internet. The gateway assets include NAT gateways and Server Load Balancer (SLB) instances.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("GatewayAssetCount")
    public Integer gatewayAssetCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4B897D10-B3CD-4A93-A5FA-591F3ED12A86</p>
     */
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

    public DescribeExposedStatisticsResponseBody setExposedDdsCount(Integer exposedDdsCount) {
        this.exposedDdsCount = exposedDdsCount;
        return this;
    }
    public Integer getExposedDdsCount() {
        return this.exposedDdsCount;
    }

    public DescribeExposedStatisticsResponseBody setExposedEcsCount(Integer exposedEcsCount) {
        this.exposedEcsCount = exposedEcsCount;
        return this;
    }
    public Integer getExposedEcsCount() {
        return this.exposedEcsCount;
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

    public DescribeExposedStatisticsResponseBody setExposedKvstoreCount(Integer exposedKvstoreCount) {
        this.exposedKvstoreCount = exposedKvstoreCount;
        return this;
    }
    public Integer getExposedKvstoreCount() {
        return this.exposedKvstoreCount;
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

    public DescribeExposedStatisticsResponseBody setExposedRdsCount(Integer exposedRdsCount) {
        this.exposedRdsCount = exposedRdsCount;
        return this;
    }
    public Integer getExposedRdsCount() {
        return this.exposedRdsCount;
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
