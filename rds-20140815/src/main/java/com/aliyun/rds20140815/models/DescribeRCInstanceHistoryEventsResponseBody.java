// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceHistoryEventsResponseBody extends TeaModel {
    @NameInMap("InstanceSystemEventSet")
    public java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet> instanceSystemEventSet;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCInstanceHistoryEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceHistoryEventsResponseBody self = new DescribeRCInstanceHistoryEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceHistoryEventsResponseBody setInstanceSystemEventSet(java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet> instanceSystemEventSet) {
        this.instanceSystemEventSet = instanceSystemEventSet;
        return this;
    }
    public java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet> getInstanceSystemEventSet() {
        return this.instanceSystemEventSet;
    }

    public DescribeRCInstanceHistoryEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRCInstanceHistoryEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInstanceHistoryEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInstanceHistoryEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCInstanceHistoryEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus self = new DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType self = new DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeviceCategory")
        public String deviceCategory;

        @NameInMap("DeviceSize")
        public String deviceSize;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ReleaseTime")
        public String releaseTime;

        public static DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks self = new DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks setDeviceCategory(String deviceCategory) {
            this.deviceCategory = deviceCategory;
            return this;
        }
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks setDeviceSize(String deviceSize) {
            this.deviceSize = deviceSize;
            return this;
        }
        public String getDeviceSize() {
            return this.deviceSize;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks setReleaseTime(String releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public String getReleaseTime() {
            return this.releaseTime;
        }

    }

    public static class DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute extends TeaModel {
        @NameInMap("CanAccept")
        public String canAccept;

        @NameInMap("Code")
        public String code;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostType")
        public String hostType;

        @NameInMap("InactiveDisks")
        public java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks> inactiveDisks;

        @NameInMap("MigrationOptions")
        public java.util.List<String> migrationOptions;

        @NameInMap("OnlineRepairPolicy")
        public String onlineRepairPolicy;

        @NameInMap("PunishDomain")
        public String punishDomain;

        @NameInMap("PunishType")
        public String punishType;

        @NameInMap("PunishUrl")
        public String punishUrl;

        @NameInMap("Rack")
        public String rack;

        @NameInMap("ResponseResult")
        public String responseResult;

        public static DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute self = new DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setCanAccept(String canAccept) {
            this.canAccept = canAccept;
            return this;
        }
        public String getCanAccept() {
            return this.canAccept;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setHostType(String hostType) {
            this.hostType = hostType;
            return this;
        }
        public String getHostType() {
            return this.hostType;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setInactiveDisks(java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks> inactiveDisks) {
            this.inactiveDisks = inactiveDisks;
            return this;
        }
        public java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks> getInactiveDisks() {
            return this.inactiveDisks;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setMigrationOptions(java.util.List<String> migrationOptions) {
            this.migrationOptions = migrationOptions;
            return this;
        }
        public java.util.List<String> getMigrationOptions() {
            return this.migrationOptions;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setOnlineRepairPolicy(String onlineRepairPolicy) {
            this.onlineRepairPolicy = onlineRepairPolicy;
            return this;
        }
        public String getOnlineRepairPolicy() {
            return this.onlineRepairPolicy;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setPunishDomain(String punishDomain) {
            this.punishDomain = punishDomain;
            return this;
        }
        public String getPunishDomain() {
            return this.punishDomain;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setPunishType(String punishType) {
            this.punishType = punishType;
            return this;
        }
        public String getPunishType() {
            return this.punishType;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setPunishUrl(String punishUrl) {
            this.punishUrl = punishUrl;
            return this;
        }
        public String getPunishUrl() {
            return this.punishUrl;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setRack(String rack) {
            this.rack = rack;
            return this;
        }
        public String getRack() {
            return this.rack;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute setResponseResult(String responseResult) {
            this.responseResult = responseResult;
            return this;
        }
        public String getResponseResult() {
            return this.responseResult;
        }

    }

    public static class DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet extends TeaModel {
        @NameInMap("EventCycleStatus")
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus eventCycleStatus;

        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        @NameInMap("EventType")
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType eventType;

        @NameInMap("ExtendedAttribute")
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute extendedAttribute;

        @NameInMap("ImpactLevel")
        public String impactLevel;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NotBefore")
        public String notBefore;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet self = new DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setEventCycleStatus(DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus eventCycleStatus) {
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setEventFinishTime(String eventFinishTime) {
            this.eventFinishTime = eventFinishTime;
            return this;
        }
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setEventPublishTime(String eventPublishTime) {
            this.eventPublishTime = eventPublishTime;
            return this;
        }
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setEventType(DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType eventType) {
            this.eventType = eventType;
            return this;
        }
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType getEventType() {
            return this.eventType;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setExtendedAttribute(DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute extendedAttribute) {
            this.extendedAttribute = extendedAttribute;
            return this;
        }
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setImpactLevel(String impactLevel) {
            this.impactLevel = impactLevel;
            return this;
        }
        public String getImpactLevel() {
            return this.impactLevel;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
