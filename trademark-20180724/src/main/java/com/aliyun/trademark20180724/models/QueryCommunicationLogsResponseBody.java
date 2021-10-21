// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryCommunicationLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryCommunicationLogsResponseBodyData data;

    public static QueryCommunicationLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommunicationLogsResponseBody self = new QueryCommunicationLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommunicationLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommunicationLogsResponseBody setData(QueryCommunicationLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCommunicationLogsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCommunicationLogsResponseBodyDataTaskList extends TeaModel {
        @NameInMap("Note")
        public String note;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("PartnerCode")
        public String partnerCode;

        @NameInMap("CreateTime")
        public Long createTime;

        public static QueryCommunicationLogsResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            QueryCommunicationLogsResponseBodyDataTaskList self = new QueryCommunicationLogsResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public QueryCommunicationLogsResponseBodyDataTaskList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public QueryCommunicationLogsResponseBodyDataTaskList setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryCommunicationLogsResponseBodyDataTaskList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryCommunicationLogsResponseBodyDataTaskList setPartnerCode(String partnerCode) {
            this.partnerCode = partnerCode;
            return this;
        }
        public String getPartnerCode() {
            return this.partnerCode;
        }

        public QueryCommunicationLogsResponseBodyDataTaskList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryCommunicationLogsResponseBodyData extends TeaModel {
        @NameInMap("TaskList")
        public java.util.List<QueryCommunicationLogsResponseBodyDataTaskList> taskList;

        public static QueryCommunicationLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCommunicationLogsResponseBodyData self = new QueryCommunicationLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCommunicationLogsResponseBodyData setTaskList(java.util.List<QueryCommunicationLogsResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<QueryCommunicationLogsResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}
