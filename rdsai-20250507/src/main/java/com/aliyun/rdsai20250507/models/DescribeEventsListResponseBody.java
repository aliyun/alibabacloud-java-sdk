// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeEventsListResponseBody extends TeaModel {
    /**
     * <p>The total number of events.</p>
     * 
     * <strong>example:</strong>
     * <p>OtherException:3,MysqlIOException:1</p>
     */
    @NameInMap("EventCodeCounts")
    public String eventCodeCounts;

    /**
     * <p>The information about the events.</p>
     */
    @NameInMap("Events")
    public java.util.List<DescribeEventsListResponseBodyEvents> events;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalPages")
    public Long totalPages;

    public static DescribeEventsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventsListResponseBody self = new DescribeEventsListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventsListResponseBody setEventCodeCounts(String eventCodeCounts) {
        this.eventCodeCounts = eventCodeCounts;
        return this;
    }
    public String getEventCodeCounts() {
        return this.eventCodeCounts;
    }

    public DescribeEventsListResponseBody setEvents(java.util.List<DescribeEventsListResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeEventsListResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeEventsListResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeEventsListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventsListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEventsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventsListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeEventsListResponseBody setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeEventsListResponseBodyEvents extends TeaModel {
        /**
         * <p>The event code.</p>
         * 
         * <strong>example:</strong>
         * <p>ExceptionEvent</p>
         */
        @NameInMap("EventCode")
        public String eventCode;

        /**
         * <p>The state of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("EventStatus")
        public String eventStatus;

        /**
         * <p>The event.</p>
         */
        @NameInMap("EventTimeList")
        public java.util.List<String> eventTimeList;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zecnb327gp36e7lh</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The recovery time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-23T02:11:07Z</p>
         */
        @NameInMap("RecoveryTime")
        public String recoveryTime;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeEventsListResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventsListResponseBodyEvents self = new DescribeEventsListResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeEventsListResponseBodyEvents setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeEventsListResponseBodyEvents setEventStatus(String eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public String getEventStatus() {
            return this.eventStatus;
        }

        public DescribeEventsListResponseBodyEvents setEventTimeList(java.util.List<String> eventTimeList) {
            this.eventTimeList = eventTimeList;
            return this;
        }
        public java.util.List<String> getEventTimeList() {
            return this.eventTimeList;
        }

        public DescribeEventsListResponseBodyEvents setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeEventsListResponseBodyEvents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeEventsListResponseBodyEvents setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public DescribeEventsListResponseBodyEvents setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
