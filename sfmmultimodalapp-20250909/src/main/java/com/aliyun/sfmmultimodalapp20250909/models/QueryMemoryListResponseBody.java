// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryMemoryListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryMemoryListResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMemoryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMemoryListResponseBody self = new QueryMemoryListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMemoryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMemoryListResponseBody setData(QueryMemoryListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMemoryListResponseBodyData getData() {
        return this.data;
    }

    public QueryMemoryListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryMemoryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMemoryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMemoryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMemoryListResponseBodyDataMemoryNodes extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Event")
        public String event;

        @NameInMap("MemoryNodeId")
        public String memoryNodeId;

        @NameInMap("MetaData")
        public java.util.Map<String, ?> metaData;

        @NameInMap("MetaDataJson")
        public String metaDataJson;

        @NameInMap("OldContent")
        public String oldContent;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static QueryMemoryListResponseBodyDataMemoryNodes build(java.util.Map<String, ?> map) throws Exception {
            QueryMemoryListResponseBodyDataMemoryNodes self = new QueryMemoryListResponseBodyDataMemoryNodes();
            return TeaModel.build(map, self);
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setMemoryNodeId(String memoryNodeId) {
            this.memoryNodeId = memoryNodeId;
            return this;
        }
        public String getMemoryNodeId() {
            return this.memoryNodeId;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setMetaData(java.util.Map<String, ?> metaData) {
            this.metaData = metaData;
            return this;
        }
        public java.util.Map<String, ?> getMetaData() {
            return this.metaData;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setMetaDataJson(String metaDataJson) {
            this.metaDataJson = metaDataJson;
            return this;
        }
        public String getMetaDataJson() {
            return this.metaDataJson;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setOldContent(String oldContent) {
            this.oldContent = oldContent;
            return this;
        }
        public String getOldContent() {
            return this.oldContent;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryMemoryListResponseBodyDataMemoryNodes setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryMemoryListResponseBodyData extends TeaModel {
        @NameInMap("MemoryNodes")
        public java.util.List<QueryMemoryListResponseBodyDataMemoryNodes> memoryNodes;

        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Total")
        public String total;

        public static QueryMemoryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMemoryListResponseBodyData self = new QueryMemoryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMemoryListResponseBodyData setMemoryNodes(java.util.List<QueryMemoryListResponseBodyDataMemoryNodes> memoryNodes) {
            this.memoryNodes = memoryNodes;
            return this;
        }
        public java.util.List<QueryMemoryListResponseBodyDataMemoryNodes> getMemoryNodes() {
            return this.memoryNodes;
        }

        public QueryMemoryListResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public QueryMemoryListResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryMemoryListResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
