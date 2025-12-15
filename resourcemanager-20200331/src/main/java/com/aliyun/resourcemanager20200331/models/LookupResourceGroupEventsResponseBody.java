// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class LookupResourceGroupEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    public java.util.List<LookupResourceGroupEventsResponseBodyEvents> events;

    /**
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F7701451-340B-5CB3-AEA7-7D831F7F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LookupResourceGroupEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupResourceGroupEventsResponseBody self = new LookupResourceGroupEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupResourceGroupEventsResponseBody setEvents(java.util.List<LookupResourceGroupEventsResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<LookupResourceGroupEventsResponseBodyEvents> getEvents() {
        return this.events;
    }

    public LookupResourceGroupEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public LookupResourceGroupEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestGroupA</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <strong>example:</strong>
         * <p>rg-aekz25pfurj****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo self = new LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo();
            return TeaModel.build(map, self);
        }

        public LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        public LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestGroupB</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmwfrxcre****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo self = new LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo();
            return TeaModel.build(map, self);
        }

        public LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        public LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class LookupResourceGroupEventsResponseBodyEvents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Add</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <strong>example:</strong>
         * <p>2025-12-04T18:35:17Z</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ProjectA</p>
         */
        @NameInMap("ResourceGroupDisplayName")
        public String resourceGroupDisplayName;

        /**
         * <strong>example:</strong>
         * <p>rg-acfm2sohr74****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>i-wz9fpfe64****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        @NameInMap("SourceResourceGroupInfo")
        public LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo sourceResourceGroupInfo;

        @NameInMap("TargetResourceGroupInfo")
        public LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo targetResourceGroupInfo;

        public static LookupResourceGroupEventsResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            LookupResourceGroupEventsResponseBodyEvents self = new LookupResourceGroupEventsResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public LookupResourceGroupEventsResponseBodyEvents setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public LookupResourceGroupEventsResponseBodyEvents setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public LookupResourceGroupEventsResponseBodyEvents setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public LookupResourceGroupEventsResponseBodyEvents setResourceGroupDisplayName(String resourceGroupDisplayName) {
            this.resourceGroupDisplayName = resourceGroupDisplayName;
            return this;
        }
        public String getResourceGroupDisplayName() {
            return this.resourceGroupDisplayName;
        }

        public LookupResourceGroupEventsResponseBodyEvents setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public LookupResourceGroupEventsResponseBodyEvents setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public LookupResourceGroupEventsResponseBodyEvents setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public LookupResourceGroupEventsResponseBodyEvents setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public LookupResourceGroupEventsResponseBodyEvents setSourceResourceGroupInfo(LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo sourceResourceGroupInfo) {
            this.sourceResourceGroupInfo = sourceResourceGroupInfo;
            return this;
        }
        public LookupResourceGroupEventsResponseBodyEventsSourceResourceGroupInfo getSourceResourceGroupInfo() {
            return this.sourceResourceGroupInfo;
        }

        public LookupResourceGroupEventsResponseBodyEvents setTargetResourceGroupInfo(LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo targetResourceGroupInfo) {
            this.targetResourceGroupInfo = targetResourceGroupInfo;
            return this;
        }
        public LookupResourceGroupEventsResponseBodyEventsTargetResourceGroupInfo getTargetResourceGroupInfo() {
            return this.targetResourceGroupInfo;
        }

    }

}
