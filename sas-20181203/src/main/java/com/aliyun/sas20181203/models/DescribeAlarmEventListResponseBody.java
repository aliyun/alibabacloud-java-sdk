// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageInfo")
    public DescribeAlarmEventListResponseBodyPageInfo pageInfo;

    @NameInMap("SuspEvents")
    public java.util.List<DescribeAlarmEventListResponseBodySuspEvents> suspEvents;

    public static DescribeAlarmEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventListResponseBody self = new DescribeAlarmEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmEventListResponseBody setPageInfo(DescribeAlarmEventListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAlarmEventListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAlarmEventListResponseBody setSuspEvents(java.util.List<DescribeAlarmEventListResponseBodySuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeAlarmEventListResponseBodySuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public static class DescribeAlarmEventListResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Count")
        public Integer count;

        public static DescribeAlarmEventListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventListResponseBodyPageInfo self = new DescribeAlarmEventListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAlarmEventListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAlarmEventListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeAlarmEventListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class DescribeAlarmEventListResponseBodySuspEvents extends TeaModel {
        @NameInMap("Dealed")
        public Boolean dealed;

        @NameInMap("Stages")
        public String stages;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("SuspiciousEventCount")
        public Integer suspiciousEventCount;

        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        @NameInMap("ContainerImageId")
        public String containerImageId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("AlarmEventNameOriginal")
        public String alarmEventNameOriginal;

        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("ContainerImageName")
        public String containerImageName;

        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        @NameInMap("Description")
        public String description;

        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("SaleVersion")
        public String saleVersion;

        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("K8sPodName")
        public String k8sPodName;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("AlarmEventType")
        public String alarmEventType;

        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        @NameInMap("AlarmEventName")
        public String alarmEventName;

        @NameInMap("Level")
        public String level;

        public static DescribeAlarmEventListResponseBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventListResponseBodySuspEvents self = new DescribeAlarmEventListResponseBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventListResponseBodySuspEvents setDealed(Boolean dealed) {
            this.dealed = dealed;
            return this;
        }
        public Boolean getDealed() {
            return this.dealed;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setStages(String stages) {
            this.stages = stages;
            return this;
        }
        public String getStages() {
            return this.stages;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSuspiciousEventCount(Integer suspiciousEventCount) {
            this.suspiciousEventCount = suspiciousEventCount;
            return this;
        }
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setK8sClusterName(String k8sClusterName) {
            this.k8sClusterName = k8sClusterName;
            return this;
        }
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setContainerImageId(String containerImageId) {
            this.containerImageId = containerImageId;
            return this;
        }
        public String getContainerImageId() {
            return this.containerImageId;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmEventNameOriginal(String alarmEventNameOriginal) {
            this.alarmEventNameOriginal = alarmEventNameOriginal;
            return this;
        }
        public String getAlarmEventNameOriginal() {
            return this.alarmEventNameOriginal;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSecurityEventIds(String securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setContainerImageName(String containerImageName) {
            this.containerImageName = containerImageName;
            return this;
        }
        public String getContainerImageName() {
            return this.containerImageName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setK8sNodeId(String k8sNodeId) {
            this.k8sNodeId = k8sNodeId;
            return this;
        }
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setHasTraceInfo(Boolean hasTraceInfo) {
            this.hasTraceInfo = hasTraceInfo;
            return this;
        }
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setK8sPodName(String k8sPodName) {
            this.k8sPodName = k8sPodName;
            return this;
        }
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setK8sNodeName(String k8sNodeName) {
            this.k8sNodeName = k8sNodeName;
            return this;
        }
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
