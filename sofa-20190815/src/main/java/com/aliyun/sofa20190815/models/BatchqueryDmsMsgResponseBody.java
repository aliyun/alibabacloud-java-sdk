// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryDmsMsgResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public BatchqueryDmsMsgResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static BatchqueryDmsMsgResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryDmsMsgResponseBody self = new BatchqueryDmsMsgResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchqueryDmsMsgResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchqueryDmsMsgResponseBody setData(BatchqueryDmsMsgResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchqueryDmsMsgResponseBodyData getData() {
        return this.data;
    }

    public BatchqueryDmsMsgResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchqueryDmsMsgResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class BatchqueryDmsMsgResponseBodyDataContent extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SubscriberGroupUndelivery")
        public String subscriberGroupUndelivery;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        public static BatchqueryDmsMsgResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryDmsMsgResponseBodyDataContent self = new BatchqueryDmsMsgResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public BatchqueryDmsMsgResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchqueryDmsMsgResponseBodyDataContent setSubscriberGroupUndelivery(String subscriberGroupUndelivery) {
            this.subscriberGroupUndelivery = subscriberGroupUndelivery;
            return this;
        }
        public String getSubscriberGroupUndelivery() {
            return this.subscriberGroupUndelivery;
        }

        public BatchqueryDmsMsgResponseBodyDataContent setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public BatchqueryDmsMsgResponseBodyDataContent setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public BatchqueryDmsMsgResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

    }

    public static class BatchqueryDmsMsgResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<BatchqueryDmsMsgResponseBodyDataContent> content;

        public static BatchqueryDmsMsgResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchqueryDmsMsgResponseBodyData self = new BatchqueryDmsMsgResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchqueryDmsMsgResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public BatchqueryDmsMsgResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public BatchqueryDmsMsgResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public BatchqueryDmsMsgResponseBodyData setContent(java.util.List<BatchqueryDmsMsgResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<BatchqueryDmsMsgResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
