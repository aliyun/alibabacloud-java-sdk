// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseSyncRunLogsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListContextDatabaseSyncRunLogsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>id-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListContextDatabaseSyncRunLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseSyncRunLogsResponseBody self = new ListContextDatabaseSyncRunLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseSyncRunLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListContextDatabaseSyncRunLogsResponseBody setData(ListContextDatabaseSyncRunLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContextDatabaseSyncRunLogsResponseBodyData getData() {
        return this.data;
    }

    public ListContextDatabaseSyncRunLogsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListContextDatabaseSyncRunLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContextDatabaseSyncRunLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContextDatabaseSyncRunLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContextDatabaseSyncRunLogsResponseBodyDataLogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00+08:00</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>同步完成，已上传 12 个文档</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>info</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>操作成功</p>
         */
        @NameInMap("Message")
        public String message;

        public static ListContextDatabaseSyncRunLogsResponseBodyDataLogs build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunLogsResponseBodyDataLogs self = new ListContextDatabaseSyncRunLogsResponseBodyDataLogs();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunLogsResponseBodyDataLogs setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyDataLogs setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyDataLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyDataLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyDataLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListContextDatabaseSyncRunLogsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{&quot;Id&quot;:1000000000000000, &quot;Level&quot;:&quot;info&quot;, &quot;Message&quot;:&quot;操作成功&quot;, &quot;Detail&quot;:&quot;同步完成，已上传 12 个文档&quot;}]</p>
         */
        @NameInMap("Logs")
        public java.util.List<ListContextDatabaseSyncRunLogsResponseBodyDataLogs> logs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListContextDatabaseSyncRunLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContextDatabaseSyncRunLogsResponseBodyData self = new ListContextDatabaseSyncRunLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContextDatabaseSyncRunLogsResponseBodyData setLogs(java.util.List<ListContextDatabaseSyncRunLogsResponseBodyDataLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<ListContextDatabaseSyncRunLogsResponseBodyDataLogs> getLogs() {
            return this.logs;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContextDatabaseSyncRunLogsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
