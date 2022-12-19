// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeExposedStatisticsDetailResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array consisting of the gateway assets, ports, system components, or public IP addresses that are exposed on the Internet and are returned.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
        // The total number of system vulnerabilities that are detected on your server and are exposed on the Internet.
        @NameInMap("ExposedCount")
        public Integer exposedCount;

        // The system component that is exposed on the Internet.
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        // The public IP address that is exposed on the Internet.
        @NameInMap("ExposureIp")
        public String exposureIp;

        // The port that is exposed on the Internet.
        @NameInMap("ExposurePort")
        public String exposurePort;

        // The resource from which the asset is exposed. Valid values:
        // 
        // *   **INTERNET_IP**: the IP address of the Elastic Compute Service (ECS) instance
        // *   **SLB**: the public IP address of the SLB instance
        // *   **EIP**: the elastic IP address (EIP)
        // *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
        @NameInMap("ExposureType")
        public String exposureType;

        // The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.
        // 
        // *   If the value of the **ExposureType** parameter is **INTERNET_IP**, the value of this parameter is an empty string.
        // *   If the value of the **ExposureType** parameter is **SLB**, the value of this parameter is the ID of the Internet-facing SLB instance.
        // *   If the value of the **ExposureType** parameter is **EIP**, the value of this parameter is the ID of the EIP.
        // *   If the value of the **ExposureType** parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        // The name of the gateway asset that is exposed on the Internet.
        @NameInMap("ExposureTypeInstanceName")
        public String exposureTypeInstanceName;

        // The region ID of the asset.
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
