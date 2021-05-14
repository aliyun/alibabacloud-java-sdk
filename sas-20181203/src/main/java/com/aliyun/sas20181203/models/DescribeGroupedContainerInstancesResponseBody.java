// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedContainerInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeGroupedContainerInstancesResponseBodyPageInfo pageInfo;

    @NameInMap("GroupedContainerInstanceList")
    public java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> groupedContainerInstanceList;

    public static DescribeGroupedContainerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedContainerInstancesResponseBody self = new DescribeGroupedContainerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedContainerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedContainerInstancesResponseBody setPageInfo(DescribeGroupedContainerInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeGroupedContainerInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeGroupedContainerInstancesResponseBody setGroupedContainerInstanceList(java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> groupedContainerInstanceList) {
        this.groupedContainerInstanceList = groupedContainerInstanceList;
        return this;
    }
    public java.util.List<DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList> getGroupedContainerInstanceList() {
        return this.groupedContainerInstanceList;
    }

    public static class DescribeGroupedContainerInstancesResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeGroupedContainerInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedContainerInstancesResponseBodyPageInfo self = new DescribeGroupedContainerInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList extends TeaModel {
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Pod")
        public String pod;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("CusterState")
        public String custerState;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("AlarmCount")
        public Integer alarmCount;

        @NameInMap("RiskInstanceCount")
        public Integer riskInstanceCount;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList self = new DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setPod(String pod) {
            this.pod = pod;
            return this;
        }
        public String getPod() {
            return this.pod;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setCusterState(String custerState) {
            this.custerState = custerState;
            return this;
        }
        public String getCusterState() {
            return this.custerState;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setAlarmCount(Integer alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Integer getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setRiskInstanceCount(Integer riskInstanceCount) {
            this.riskInstanceCount = riskInstanceCount;
            return this;
        }
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        public DescribeGroupedContainerInstancesResponseBodyGroupedContainerInstanceList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
