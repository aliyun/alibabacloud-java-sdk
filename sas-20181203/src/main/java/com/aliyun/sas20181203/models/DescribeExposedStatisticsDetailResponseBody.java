// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeExposedStatisticsDetailResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7CBAFB3F-1ED7-4A23-986A-6F67F0466BD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the gateway assets, ports, system components, or public IP addresses that are exposed on the Internet and are returned.</p>
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExposedCount")
        public Integer exposedCount;

        /**
         * <p>The system component that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>tomcat</p>
         */
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        /**
         * <p>The public IP address that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>123.57.XX.XX</p>
         */
        @NameInMap("ExposureIp")
        public String exposureIp;

        /**
         * <p>The port that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ExposurePort")
        public String exposurePort;

        /**
         * <p>The resource from which the asset is exposed. Valid values:</p>
         * <ul>
         * <li><strong>INTERNET_IP</strong>: the IP address of the Elastic Compute Service (ECS) instance</li>
         * <li><strong>SLB</strong>: the public IP address of the SLB instance</li>
         * <li><strong>EIP</strong>: the elastic IP address (EIP)</li>
         * <li><strong>DNAT</strong>: the NAT gateway that connects to the Internet by using the DNAT feature</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        @NameInMap("ExposureType")
        public String exposureType;

        /**
         * <p>The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the value of the ExposureType parameter.</p>
         * <ul>
         * <li>If the value of the <strong>ExposureType</strong> parameter is <strong>INTERNET_IP</strong>, the value of this parameter is an empty string.</li>
         * <li>If the value of the <strong>ExposureType</strong> parameter is <strong>SLB</strong>, the value of this parameter is the ID of the Internet-facing SLB instance.</li>
         * <li>If the value of the <strong>ExposureType</strong> parameter is <strong>EIP</strong>, the value of this parameter is the ID of the EIP.</li>
         * <li>If the value of the <strong>ExposureType</strong> parameter is <strong>DNAT</strong>, the value of this parameter is the ID of the NAT gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lb-2ze4rso39h4nczcqs****</p>
         */
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        /**
         * <p>The name of the gateway asset that is exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1vkbju8f3w87c9v****</p>
         */
        @NameInMap("ExposureTypeInstanceName")
        public String exposureTypeInstanceName;

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
