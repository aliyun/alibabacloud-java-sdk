// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedInstanceListResponseBody extends TeaModel {
    @NameInMap("ExposedInstances")
    public java.util.List<DescribeExposedInstanceListResponseBodyExposedInstances> exposedInstances;

    @NameInMap("PageInfo")
    public DescribeExposedInstanceListResponseBodyPageInfo pageInfo;

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
        @NameInMap("AsapVulCount")
        public Integer asapVulCount;

        @NameInMap("ExploitHealthCount")
        public Integer exploitHealthCount;

        @NameInMap("ExposureComponent")
        public String exposureComponent;

        @NameInMap("ExposureIp")
        public String exposureIp;

        @NameInMap("ExposurePort")
        public String exposurePort;

        @NameInMap("ExposureType")
        public String exposureType;

        @NameInMap("ExposureTypeId")
        public String exposureTypeId;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LaterVulCount")
        public Integer laterVulCount;

        @NameInMap("NntfVulCount")
        public Integer nntfVulCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TotalVulCount")
        public Integer totalVulCount;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
