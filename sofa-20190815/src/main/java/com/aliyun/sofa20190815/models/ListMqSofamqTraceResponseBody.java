// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListMqSofamqTraceResponseBodyData data;

    public static ListMqSofamqTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqTraceResponseBody self = new ListMqSofamqTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqTraceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqTraceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMqSofamqTraceResponseBody setData(ListMqSofamqTraceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqTraceResponseBodyData getData() {
        return this.data;
    }

    public static class ListMqSofamqTraceResponseBodyDataContent extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("QueryId")
        public String queryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Topic")
        public String topic;

        public static ListMqSofamqTraceResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqTraceResponseBodyDataContent self = new ListMqSofamqTraceResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqTraceResponseBodyDataContent setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ListMqSofamqTraceResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqTraceResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqTraceResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMqSofamqTraceResponseBodyDataContent setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public ListMqSofamqTraceResponseBodyDataContent setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public ListMqSofamqTraceResponseBodyDataContent setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public ListMqSofamqTraceResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMqSofamqTraceResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListMqSofamqTraceResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListMqSofamqTraceResponseBodyDataContent> content;

        public static ListMqSofamqTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqTraceResponseBodyData self = new ListMqSofamqTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqTraceResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqTraceResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqTraceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListMqSofamqTraceResponseBodyData setContent(java.util.List<ListMqSofamqTraceResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqTraceResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
