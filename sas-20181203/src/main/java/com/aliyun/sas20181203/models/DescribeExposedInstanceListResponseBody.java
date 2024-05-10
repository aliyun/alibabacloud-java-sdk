// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details about the exposed asset.</p>
     */
    @NameInMap("ExposedInstances")
    public java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> exposedInstances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeExposedInstanceListResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExposedInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedInstanceListResponseBody self = new DescribeExposedInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedInstanceListResponseBody setExposedInstances(java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> exposedInstances) {
        this.exposedInstances = exposedInstances;
        return this;
    }
    public java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> getExposedInstances() {
        return this.exposedInstances;
    }

    public DescribeExposedInstanceListResponseBody setPageInfo(DescribeExposedInstanceListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeExposedInstanceListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeExposedInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExposedInstanceListResponseBodyExposedInstances extends TeaModel {
        /**
         * <p>The number of high-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         */
        @NameInMap("AsapVulCount")
        public Integer asapVulCount;

        /**
         * <p>The total number of servers that are exposed on the Internet.</p>
         */
        @NameInMap("ExploitHealthCount")
        public Integer exploitHealthCount;

        /**
         * <p>The server component that is exposed on the Internet.</p>
         */
        @NameInMap("ExposureComponent")
        public String exposureComponent;

        /**
         * <p>The public IP address that is exposed on the Internet.</p>
         */
        @NameInMap("ExposureIp")
        public String exposureIp;

        /**
         * <p>The port that is exposed on the Internet.</p>
         */
        @NameInMap("ExposurePort")
        public String exposurePort;

        /**
         * <p>The resource from which the asset is exposed. Valid values:</p>
         * <br>
         * <p>*   **INTERNET_IP**: the public IP address of an ECS instance</p>
         * <p>*   **SLB**: the public IP address of a Server Load Balancer (SLB) instance</p>
         * <p>*   **EIP**: an elastic IP address (EIP)</p>
         * <p>*   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature</p>
         */
        @NameInMap("ExposureType")
        public String exposureType;

        /**
         * <p>The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the ExposureType parameter.</p>
         * <br>
         * <p>*   If the value of the ExposureType parameter is **INTERNET_IP**, this parameter is empty.</p>
         * <p>*   If the value of the ExposureType parameter is **SLB**, the value of this parameter is the ID of the SLB instance.</p>
         * <p>*   If the value of the ExposureType parameter is **EIP**, the value of this parameter is the ID of the EIP.</p>
         * <p>*   If the value of the ExposureType parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.</p>
         */
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the server group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The number of medium-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         */
        @NameInMap("LaterVulCount")
        public Integer laterVulCount;

        /**
         * <p>The number of low-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         */
        @NameInMap("NntfVulCount")
        public Integer nntfVulCount;

        /**
         * <p>The ID of the region where the server resides.</p>
         * <br>
         * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](https://help.aliyun.com/document_detail/40654.html).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The total number of vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         */
        @NameInMap("TotalVulCount")
        public Integer totalVulCount;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeExposedInstanceListResponseBodyExposedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceListResponseBodyExposedInstances self = new DescribeExposedInstanceListResponseBodyExposedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setAsapVulCount(Integer asapVulCount) {
            this.asapVulCount = asapVulCount;
            return this;
        }
        public Integer getAsapVulCount() {
            return this.asapVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExploitHealthCount(Integer exploitHealthCount) {
            this.exploitHealthCount = exploitHealthCount;
            return this;
        }
        public Integer getExploitHealthCount() {
            return this.exploitHealthCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureComponent(String exposureComponent) {
            this.exposureComponent = exposureComponent;
            return this;
        }
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureIp(String exposureIp) {
            this.exposureIp = exposureIp;
            return this;
        }
        public String getExposureIp() {
            return this.exposureIp;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposurePort(String exposurePort) {
            this.exposurePort = exposurePort;
            return this;
        }
        public String getExposurePort() {
            return this.exposurePort;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureType(String exposureType) {
            this.exposureType = exposureType;
            return this;
        }
        public String getExposureType() {
            return this.exposureType;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setExposureTypeId(String exposureTypeId) {
            this.exposureTypeId = exposureTypeId;
            return this;
        }
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setLaterVulCount(Integer laterVulCount) {
            this.laterVulCount = laterVulCount;
            return this;
        }
        public Integer getLaterVulCount() {
            return this.laterVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setNntfVulCount(Integer nntfVulCount) {
            this.nntfVulCount = nntfVulCount;
            return this;
        }
        public Integer getNntfVulCount() {
            return this.nntfVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setTotalVulCount(Integer totalVulCount) {
            this.totalVulCount = totalVulCount;
            return this;
        }
        public Integer getTotalVulCount() {
            return this.totalVulCount;
        }

        public DescribeExposedInstanceListResponseBodyExposedInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeExposedInstanceListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries about the servers that are exposed on the Internet.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeExposedInstanceListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposedInstanceListResponseBodyPageInfo self = new DescribeExposedInstanceListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeExposedInstanceListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
