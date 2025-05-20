// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReadMessageListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReadMessageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageListResponseBody self = new ReadMessageListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMessageListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadMessageListResponseBody setData(ReadMessageListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadMessageListResponseBodyData getData() {
        return this.data;
    }

    public ReadMessageListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadMessageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadMessageListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadMessageListResponseBodyDataRows extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Class")
        public String _class;

        @NameInMap("ClassId")
        public Long classId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Deleted")
        public Integer deleted;

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("GmtUpdate")
        public Long gmtUpdate;

        @NameInMap("MassId")
        public Long massId;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("MsgId")
        public Long msgId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Title")
        public String title;

        public static ReadMessageListResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageListResponseBodyDataRows self = new ReadMessageListResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public ReadMessageListResponseBodyDataRows setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ReadMessageListResponseBodyDataRows set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public ReadMessageListResponseBodyDataRows setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public ReadMessageListResponseBodyDataRows setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ReadMessageListResponseBodyDataRows setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public ReadMessageListResponseBodyDataRows setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public ReadMessageListResponseBodyDataRows setGmtUpdate(Long gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        public ReadMessageListResponseBodyDataRows setMassId(Long massId) {
            this.massId = massId;
            return this;
        }
        public Long getMassId() {
            return this.massId;
        }

        public ReadMessageListResponseBodyDataRows setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ReadMessageListResponseBodyDataRows setMsgId(Long msgId) {
            this.msgId = msgId;
            return this;
        }
        public Long getMsgId() {
            return this.msgId;
        }

        public ReadMessageListResponseBodyDataRows setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ReadMessageListResponseBodyDataRows setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ReadMessageListResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("MaxResults")
        public Long maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Rows")
        public java.util.List<ReadMessageListResponseBodyDataRows> rows;

        public static ReadMessageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageListResponseBodyData self = new ReadMessageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadMessageListResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ReadMessageListResponseBodyData setMaxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Long getMaxResults() {
            return this.maxResults;
        }

        public ReadMessageListResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ReadMessageListResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ReadMessageListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ReadMessageListResponseBodyData setRows(java.util.List<ReadMessageListResponseBodyDataRows> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<ReadMessageListResponseBodyDataRows> getRows() {
            return this.rows;
        }

    }

}
