// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceHistoryEventsResponseBody extends TeaModel {
    /**
     * <p>Details about the instance system event.</p>
     */
    @NameInMap("InstanceSystemEventSet")
    public java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSet> instanceSystemEventSet;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>866F5EB8-4650-4061-87F0-379F6F968BCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instance events.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The state code of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The state name of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>Executed</p>
         */
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
        /**
         * <p>The code of the system event type.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the system event type.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceExpiration.Stop</p>
         */
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
        /**
         * <p>The time when the disk was created. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26T03:33:56Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The category of the cloud disk or local disk. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: ultra disk</li>
         * <li><strong>cloud_ssd</strong>: standard SSD</li>
         * <li><strong>cloud_essd</strong>: ESSD</li>
         * <li><strong>cloud_auto</strong>: Premium ESSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DeviceCategory")
        public String deviceCategory;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DeviceSize")
        public String deviceSize;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: system disk.</li>
         * <li><strong>data</strong>: data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time when the disk was released. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26T03:33:56Z</p>
         */
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
        /**
         * <p>Indicates whether the event can be handled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanAccept")
        public String canAccept;

        /**
         * <p>The code of the security violation.</p>
         * 
         * <strong>example:</strong>
         * <p>PR111</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The device name of the local disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/vda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The ID of the local disk.</p>
         * 
         * <strong>example:</strong>
         * <p>rcd-****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>dh-bp1ewce1gk3iwv2****</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The type of the host. Valid values:</p>
         * <ul>
         * <li><strong>ddh</strong>: dedicated host</li>
         * <li><strong>managehost</strong>: physical machine in a smart hosting pool</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ddh</p>
         */
        @NameInMap("HostType")
        public String hostType;

        /**
         * <p>The inactive disks that have been released and whose data must be cleared.</p>
         */
        @NameInMap("InactiveDisks")
        public java.util.List<DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttributeInactiveDisks> inactiveDisks;

        /**
         * <p>The migration solutions of the instance.</p>
         */
        @NameInMap("MigrationOptions")
        public java.util.List<String> migrationOptions;

        /**
         * <p>The online repair policy for the damaged disk. Valid value: IsolateOnly, which indicates that damaged disks are isolated but not repaired.</p>
         * 
         * <strong>example:</strong>
         * <p>IsolateOnly</p>
         */
        @NameInMap("OnlineRepairPolicy")
        public String onlineRepairPolicy;

        /**
         * <p>The illegal domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1228.test.com</p>
         */
        @NameInMap("PunishDomain")
        public String punishDomain;

        /**
         * <p>The type of the penalty.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs_message_alert</p>
         */
        @NameInMap("PunishType")
        public String punishType;

        /**
         * <p>The illegal URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1228.test.com/1">http://1228.test.com/1</a></p>
         */
        @NameInMap("PunishUrl")
        public String punishUrl;

        /**
         * <p>The rack number of the cloud box.</p>
         * 
         * <strong>example:</strong>
         * <p>A01</p>
         */
        @NameInMap("Rack")
        public String rack;

        /**
         * <p>The response result of the event. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: the event was handled.</li>
         * <li><strong>false</strong>: the event failed to be handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The lifecycle state of the system event.</p>
         */
        @NameInMap("EventCycleStatus")
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventCycleStatus eventCycleStatus;

        /**
         * <p>The time when the system event ended. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01T06:32:31Z</p>
         */
        @NameInMap("EventFinishTime")
        public String eventFinishTime;

        /**
         * <p>The ID of the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>e-uf64yvznlao4jl2c****</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The time when the system event was published. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-30T06:32:31Z</p>
         */
        @NameInMap("EventPublishTime")
        public String eventPublishTime;

        /**
         * <p>The type of the system event.</p>
         */
        @NameInMap("EventType")
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetEventType eventType;

        /**
         * <p>The extended attribute of the system event.</p>
         */
        @NameInMap("ExtendedAttribute")
        public DescribeRCInstanceHistoryEventsResponseBodyInstanceSystemEventSetExtendedAttribute extendedAttribute;

        /**
         * <p>The impact level of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ImpactLevel")
        public String impactLevel;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-yuf59nplc45t2tzn****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The start time of the scheduled execution of the system event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01T06:32:31Z</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>The reason why the system event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>System maintenance is scheduled due to ***.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The reason code category for the system event.</p>
         * 
         * <strong>example:</strong>
         * <p>VPCMigrationEcs</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The resource type. The value is fixed to INSTANCE.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
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
