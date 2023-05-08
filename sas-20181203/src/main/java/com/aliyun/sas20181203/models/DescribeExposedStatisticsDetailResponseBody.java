// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailResponseBody extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageInfo")
    public DescribeExposedStatisticsDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The resource from which the asset is exposed. Valid values:</p>
     * <br>
     * <p>*   **INTERNET_IP**: the IP address of the Elastic Compute Service (ECS) instance</p>
     * <p>*   **SLB**: the public IP address of the SLB instance</p>
     * <p>*   **EIP**: the elastic IP address (EIP)</p>
     * <p>*   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The region ID of the asset.</p>
     */
    @NameInMap("StatisticsDetails")
    public java.util.List<DescribeExposedStatisticsDetailResponseBodyStatisticsDetails> statisticsDetails;

    public static DescribeExposedStatisticsDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsDetailResponseBody self = new DescribeExposedStatisticsDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsDetailResponseBody setPageInfo(DescribeExposedStatisticsDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeExposedStatisticsDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeExposedStatisticsDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposedStatisticsDetailResponseBody setStatisticsDetails(java.util.List<DescribeExposedStatisticsDetailResponseBodyStatisticsDetails> statisticsDetails) {
        this.statisticsDetails = statisticsDetails;
        return this;
    }
    public java.util.List<DescribeExposedStatisticsDetailResponseBodyStatisticsDetails> getStatisticsDetails() {
        return this.statisticsDetails;
    }

    public static class DescribeExposedStatisticsDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <p>An array consisting of the gateway assets, ports, system components, or public IP addresses that are exposed on the Internet and are returned.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>exposureType</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The port that is exposed on the Internet.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>lb-2ze4rso39h4nczcqs****</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeExposedStatisticsDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedStatisticsDetailResponseBodyPageInfo self = new DescribeExposedStatisticsDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeExposedStatisticsDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeExposedStatisticsDetailResponseBodyStatisticsDetails extends TeaModel {
        /**
         * <p>The total number of system vulnerabilities that are detected on your server and are exposed on the Internet.</p>
         */
        @NameInMap("ExposedCount")
        public Integer exposedCount;

        /**
         * <p>Queries the gateway assets, ports, system components, or public IP addresses that are exposed on the Internet.</p>
         */
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        /**
         * <p>The type of the gateway asset. This parameter is required when the **StatisticsType** parameter is set to **exposureType**. Valid values:</p>
         * <br>
         * <p>*   **SLB**: the public IP address of a Server Load Balancer (SLB) instance</p>
         * <p>*   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature</p>
         */
        @NameInMap("ExposureIp")
        public String exposureIp;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("ExposurePort")
        public String exposurePort;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("ExposureType")
        public String exposureType;

        /**
         * <p>DescribeExposedStatisticsDetail</p>
         */
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        /**
         * <p>The name of the gateway asset that is exposed on the Internet.</p>
         */
        @NameInMap("ExposureTypeInstanceName")
        public String exposureTypeInstanceName;

        /**
         * <p>20</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeExposedStatisticsDetailResponseBodyStatisticsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedStatisticsDetailResponseBodyStatisticsDetails self = new DescribeExposedStatisticsDetailResponseBodyStatisticsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposedCount(Integer exposedCount) {
            this.exposedCount = exposedCount;
            return this;
        }
        public Integer getExposedCount() {
            return this.exposedCount;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureComponent(String exposureComponent) {
            this.exposureComponent = exposureComponent;
            return this;
        }
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureIp(String exposureIp) {
            this.exposureIp = exposureIp;
            return this;
        }
        public String getExposureIp() {
            return this.exposureIp;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposurePort(String exposurePort) {
            this.exposurePort = exposurePort;
            return this;
        }
        public String getExposurePort() {
            return this.exposurePort;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureType(String exposureType) {
            this.exposureType = exposureType;
            return this;
        }
        public String getExposureType() {
            return this.exposureType;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureTypeId(String exposureTypeId) {
            this.exposureTypeId = exposureTypeId;
            return this;
        }
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setExposureTypeInstanceName(String exposureTypeInstanceName) {
            this.exposureTypeInstanceName = exposureTypeInstanceName;
            return this;
        }
        public String getExposureTypeInstanceName() {
            return this.exposureTypeInstanceName;
        }

        public DescribeExposedStatisticsDetailResponseBodyStatisticsDetails setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
