// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListActiveAnnouncementsResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A failure returns a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of MCP cards.</p>
     */
    @NameInMap("items")
    public java.util.List<ListActiveAnnouncementsResponseBodyItems> items;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListActiveAnnouncementsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActiveAnnouncementsResponseBody self = new ListActiveAnnouncementsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActiveAnnouncementsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListActiveAnnouncementsResponseBody setItems(java.util.List<ListActiveAnnouncementsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListActiveAnnouncementsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListActiveAnnouncementsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListActiveAnnouncementsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListActiveAnnouncementsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListActiveAnnouncementsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActiveAnnouncementsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListActiveAnnouncementsResponseBodyItems extends TeaModel {
        /**
         * <p>The business ID of the notice.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("announcementId")
        public Long announcementId;

        /**
         * <p>The returned content.</p>
         * 
         * <strong>example:</strong>
         * <p>The system will undergo maintenance tonight</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The user ID of the project creator.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("createdBy")
        public Long createdBy;

        /**
         * <p>The display page. Valid values: ALL, FRONTEND, BACKEND.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("displayPage")
        public String displayPage;

        /**
         * <p>The display type and group label.</p>
         * 
         * <strong>example:</strong>
         * <p>LIST</p>
         */
        @NameInMap("displayType")
        public String displayType;

        /**
         * <p>The custom effective end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21T14:00:00+08:00</p>
         */
        @NameInMap("effectiveEnd")
        public String effectiveEnd;

        /**
         * <p>The effective start time in ISO 8601 format with time zone. If this parameter is not specified, the notice takes effect immediately.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T14:00:00+08:00</p>
         */
        @NameInMap("effectiveStart")
        public String effectiveStart;

        /**
         * <p>The priority of the free task.</p>
         * <ul>
         * <li><p>Uses the default priority of the project, as shown in the following figure. The default priority values are as follows:</p>
         * <ul>
         * <li><p><strong>-10</strong>: Low. This is the default value.</p>
         * </li>
         * <li><p><strong>0</strong>: Normal.</p>
         * </li>
         * <li><p><strong>1</strong>: Urgent.</p>
         * </li>
         * <li><p><strong>2</strong>: Very urgent.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p><img src="https://img.alicdn.com/imgextra/i1/O1CN01hNuSPz25juCzgxhmW_!!6000000007563-2-tps-2682-1304.png" alt=""></p>
         * <ul>
         * <li>Custom priority defined by the user, as shown in the following figure, with an additional &quot;Generally urgent&quot; level.</li>
         * </ul>
         * <p>The value of this parameter is subject to the actual response of the API call. A higher priority corresponds to a larger value.</p>
         * <p><img src="https://img.alicdn.com/imgextra/i1/O1CN01V67b3i1mkNvJiW8D1_!!6000000004992-2-tps-2128-1126.png" alt=""></p>
         * 
         * <strong>example:</strong>
         * <p>GENERAL</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <p>The publish time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T14:00:00+08:00</p>
         */
        @NameInMap("publishedAt")
        public String publishedAt;

        /**
         * <p>The task status. The value Running is returned upon submission.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISHED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The title of the scheduled meeting.</p>
         * 
         * <strong>example:</strong>
         * <p>System Maintenance Notification</p>
         */
        @NameInMap("title")
        public String title;

        public static ListActiveAnnouncementsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListActiveAnnouncementsResponseBodyItems self = new ListActiveAnnouncementsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListActiveAnnouncementsResponseBodyItems setAnnouncementId(Long announcementId) {
            this.announcementId = announcementId;
            return this;
        }
        public Long getAnnouncementId() {
            return this.announcementId;
        }

        public ListActiveAnnouncementsResponseBodyItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListActiveAnnouncementsResponseBodyItems setCreatedBy(Long createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public Long getCreatedBy() {
            return this.createdBy;
        }

        public ListActiveAnnouncementsResponseBodyItems setDisplayPage(String displayPage) {
            this.displayPage = displayPage;
            return this;
        }
        public String getDisplayPage() {
            return this.displayPage;
        }

        public ListActiveAnnouncementsResponseBodyItems setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public ListActiveAnnouncementsResponseBodyItems setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
            return this;
        }
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        public ListActiveAnnouncementsResponseBodyItems setEffectiveStart(String effectiveStart) {
            this.effectiveStart = effectiveStart;
            return this;
        }
        public String getEffectiveStart() {
            return this.effectiveStart;
        }

        public ListActiveAnnouncementsResponseBodyItems setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListActiveAnnouncementsResponseBodyItems setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }
        public String getPublishedAt() {
            return this.publishedAt;
        }

        public ListActiveAnnouncementsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListActiveAnnouncementsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
