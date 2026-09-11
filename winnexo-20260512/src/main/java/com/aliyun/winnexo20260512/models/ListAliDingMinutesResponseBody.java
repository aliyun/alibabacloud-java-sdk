// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAliDingMinutesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Indicates whether more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <p>The location clusters.</p>
     */
    @NameInMap("items")
    public java.util.List<ListAliDingMinutesResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>opaque-next-cursor</p>
     */
    @NameInMap("nextCursor")
    public String nextCursor;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-id</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAliDingMinutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliDingMinutesResponseBody self = new ListAliDingMinutesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliDingMinutesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAliDingMinutesResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public ListAliDingMinutesResponseBody setItems(java.util.List<ListAliDingMinutesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListAliDingMinutesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListAliDingMinutesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAliDingMinutesResponseBody setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public String getNextCursor() {
        return this.nextCursor;
    }

    public ListAliDingMinutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAliDingMinutesResponseBodyItems extends TeaModel {
        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <p>The execution duration of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        @NameInMap("durationMs")
        public Long durationMs;

        /**
         * <p>The end timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T10:00:00+08:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The DingTalk meeting minutes ID.</p>
         * 
         * <strong>example:</strong>
         * <p>76327569643231383535353939365f3436383537393431335f32</p>
         */
        @NameInMap("minutesId")
        public String minutesId;

        /**
         * <p>The start timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-08T09:00:00+08:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The task status. Running is returned upon submission.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The title of the scheduled meeting.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly Project Meeting</p>
         */
        @NameInMap("title")
        public String title;

        public static ListAliDingMinutesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListAliDingMinutesResponseBodyItems self = new ListAliDingMinutesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListAliDingMinutesResponseBodyItems setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListAliDingMinutesResponseBodyItems setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public ListAliDingMinutesResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListAliDingMinutesResponseBodyItems setMinutesId(String minutesId) {
            this.minutesId = minutesId;
            return this;
        }
        public String getMinutesId() {
            return this.minutesId;
        }

        public ListAliDingMinutesResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListAliDingMinutesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAliDingMinutesResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
