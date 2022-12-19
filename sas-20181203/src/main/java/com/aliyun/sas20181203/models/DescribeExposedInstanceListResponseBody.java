// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListResponseBody extends TeaModel {
    // An array that consists of the details about the exposed asset.
    @NameInMap("ExposedInstances")
    public java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> exposedInstances;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeExposedInstanceListResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The number of high-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.
        @NameInMap("AsapVulCount")
        public Integer asapVulCount;

        // The total number of servers that are exposed on the Internet.
        @NameInMap("ExploitHealthCount")
        public Integer exploitHealthCount;

        // The server component that is exposed on the Internet.
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
        // *   **INTERNET_IP**: the public IP address of an ECS instance
        // *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
        // *   **EIP**: an elastic IP address (EIP)
        // *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
        @NameInMap("ExposureType")
        public String exposureType;

        // The ID of the instance to which the resource belongs. The valid values of this parameter vary based on the ExposureType parameter.
        // 
        // *   If the value of the ExposureType parameter is **INTERNET_IP**, this parameter is empty.
        // *   If the value of the ExposureType parameter is **SLB**, the value of this parameter is the ID of the SLB instance.
        // *   If the value of the ExposureType parameter is **EIP**, the value of this parameter is the ID of the EIP.
        // *   If the value of the ExposureType parameter is **DNAT**, the value of this parameter is the ID of the NAT gateway.
        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        // The ID of the server group.
        @NameInMap("GroupId")
        public Long groupId;

        // The name of the server group.
        @NameInMap("GroupName")
        public String groupName;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the server.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The number of medium-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.
        @NameInMap("LaterVulCount")
        public Integer laterVulCount;

        // The number of low-severity vulnerabilities that are exposed on the Internet and can be exploited by attackers.
        @NameInMap("NntfVulCount")
        public Integer nntfVulCount;

        // The ID of the region where the server resides.
        // 
        // >  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).
        @NameInMap("RegionId")
        public String regionId;

        // The total number of vulnerabilities that are exposed on the Internet and can be exploited by attackers.
        @NameInMap("TotalVulCount")
        public Integer totalVulCount;

        // The UUID of the server.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries about the servers that are exposed on the Internet.
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
