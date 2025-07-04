// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceHistoryEventsRequest extends TeaModel {
    @NameInMap("EventPublishTime")
    public DescribeRCInstanceHistoryEventsRequestEventPublishTime eventPublishTime;

    @NameInMap("NotBefore")
    public DescribeRCInstanceHistoryEventsRequestNotBefore notBefore;

    /**
     * <p>The lifecycle state of the system event. This parameter is valid only when the <strong>InstanceEventCycleStatus.N</strong> parameter is not specified. Valid values:</p>
     * <ul>
     * <li><strong>Scheduled</strong></li>
     * <li><strong>Avoided</strong></li>
     * <li><strong>Executing</strong></li>
     * <li><strong>Executed</strong></li>
     * <li><strong>Canceled</strong></li>
     * <li><strong>Failed</strong></li>
     * <li><strong>Inquiring</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executed</p>
     */
    @NameInMap("EventCycleStatus")
    public String eventCycleStatus;

    /**
     * <p>The IDs of one or more system events.</p>
     */
    @NameInMap("EventId")
    public java.util.List<String> eventId;

    /**
     * <p>The system event type. This parameter is valid only when the <strong>InstanceEventType.N</strong> parameter is not specified. Valid values:</p>
     * <ul>
     * <li><strong>SystemMaintenance.Reboot</strong>: The instance was restarted due to system maintenance.</li>
     * <li><strong>SystemMaintenance.Redeploy</strong>: The instance was redeployed due to system maintenance.</li>
     * <li><strong>SystemFailure.Reboot</strong>: The instance was restarted due to system failures.</li>
     * <li><strong>SystemFailure.Redeploy</strong>: The instance was redeployed due to system failures.</li>
     * <li><strong>SystemFailure.Delete</strong>: The instance was released due to an instance creation failure.</li>
     * <li><strong>InstanceFailure.Reboot</strong>: The instance was restarted due to an instance error.</li>
     * <li><strong>InstanceExpiration.Stop</strong>: The subscription instance was stopped due to expiration.</li>
     * <li><strong>InstanceExpiration.Delete</strong>: The subscription instance was released due to expiration.</li>
     * <li><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</li>
     * <li><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance was released due to an overdue payment.</li>
     * </ul>
     * <blockquote>
     * <p> The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SystemMaintenance.Reboot</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ImpactLevel")
    public String impactLevel;

    /**
     * <p>The lifecycle states of system events.</p>
     */
    @NameInMap("InstanceEventCycleStatus")
    public java.util.List<String> instanceEventCycleStatus;

    /**
     * <p>The type of system event N.</p>
     */
    @NameInMap("InstanceEventType")
    public java.util.List<String> instanceEventType;

    /**
     * <p>The instance ID. If you do not specify an instance ID, system events of all instances in the specified region are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-yuf59nplc45t2tzn****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of resource N.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>An array that consists of the tags that are supported by system events.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeRCInstanceHistoryEventsRequestTag> tag;

    public static DescribeRCInstanceHistoryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceHistoryEventsRequest self = new DescribeRCInstanceHistoryEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceHistoryEventsRequest setEventPublishTime(DescribeRCInstanceHistoryEventsRequestEventPublishTime eventPublishTime) {
        this.eventPublishTime = eventPublishTime;
        return this;
    }
    public DescribeRCInstanceHistoryEventsRequestEventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    public DescribeRCInstanceHistoryEventsRequest setNotBefore(DescribeRCInstanceHistoryEventsRequestNotBefore notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public DescribeRCInstanceHistoryEventsRequestNotBefore getNotBefore() {
        return this.notBefore;
    }

    public DescribeRCInstanceHistoryEventsRequest setEventCycleStatus(String eventCycleStatus) {
        this.eventCycleStatus = eventCycleStatus;
        return this;
    }
    public String getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    public DescribeRCInstanceHistoryEventsRequest setEventId(java.util.List<String> eventId) {
        this.eventId = eventId;
        return this;
    }
    public java.util.List<String> getEventId() {
        return this.eventId;
    }

    public DescribeRCInstanceHistoryEventsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public DescribeRCInstanceHistoryEventsRequest setImpactLevel(String impactLevel) {
        this.impactLevel = impactLevel;
        return this;
    }
    public String getImpactLevel() {
        return this.impactLevel;
    }

    public DescribeRCInstanceHistoryEventsRequest setInstanceEventCycleStatus(java.util.List<String> instanceEventCycleStatus) {
        this.instanceEventCycleStatus = instanceEventCycleStatus;
        return this;
    }
    public java.util.List<String> getInstanceEventCycleStatus() {
        return this.instanceEventCycleStatus;
    }

    public DescribeRCInstanceHistoryEventsRequest setInstanceEventType(java.util.List<String> instanceEventType) {
        this.instanceEventType = instanceEventType;
        return this;
    }
    public java.util.List<String> getInstanceEventType() {
        return this.instanceEventType;
    }

    public DescribeRCInstanceHistoryEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCInstanceHistoryEventsRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public DescribeRCInstanceHistoryEventsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInstanceHistoryEventsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInstanceHistoryEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCInstanceHistoryEventsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRCInstanceHistoryEventsRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeRCInstanceHistoryEventsRequest setTag(java.util.List<DescribeRCInstanceHistoryEventsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeRCInstanceHistoryEventsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeRCInstanceHistoryEventsRequestEventPublishTime extends TeaModel {
        /**
         * <p>The end of the time range in which to query published system events. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01T06:32:31Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The beginning of the time range in which to query published system events. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-30T06:32:31Z</p>
         */
        @NameInMap("Start")
        public String start;

        public static DescribeRCInstanceHistoryEventsRequestEventPublishTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsRequestEventPublishTime self = new DescribeRCInstanceHistoryEventsRequestEventPublishTime();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsRequestEventPublishTime setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeRCInstanceHistoryEventsRequestEventPublishTime setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeRCInstanceHistoryEventsRequestNotBefore extends TeaModel {
        /**
         * <p>The end time of the scheduled execution period for the system event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-01T06:32:31Z</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>The start time of the scheduled execution period for the system event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-30T06:32:31Z</p>
         */
        @NameInMap("Start")
        public String start;

        public static DescribeRCInstanceHistoryEventsRequestNotBefore build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsRequestNotBefore self = new DescribeRCInstanceHistoryEventsRequestNotBefore();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsRequestNotBefore setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public DescribeRCInstanceHistoryEventsRequestNotBefore setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeRCInstanceHistoryEventsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that is added to the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the port list.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRCInstanceHistoryEventsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceHistoryEventsRequestTag self = new DescribeRCInstanceHistoryEventsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceHistoryEventsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRCInstanceHistoryEventsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
