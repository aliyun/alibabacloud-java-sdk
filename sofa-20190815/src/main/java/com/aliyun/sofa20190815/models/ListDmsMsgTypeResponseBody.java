// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsMsgTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListDmsMsgTypeResponseBodyData data;

    public static ListDmsMsgTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDmsMsgTypeResponseBody self = new ListDmsMsgTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDmsMsgTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDmsMsgTypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDmsMsgTypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDmsMsgTypeResponseBody setData(ListDmsMsgTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDmsMsgTypeResponseBodyData getData() {
        return this.data;
    }

    public static class ListDmsMsgTypeResponseBodyDataContent extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Topic")
        public String topic;

        public static ListDmsMsgTypeResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDmsMsgTypeResponseBodyDataContent self = new ListDmsMsgTypeResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDmsMsgTypeResponseBodyDataContent setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListDmsMsgTypeResponseBodyDataContent setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public ListDmsMsgTypeResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDmsMsgTypeResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDmsMsgTypeResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDmsMsgTypeResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDmsMsgTypeResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListDmsMsgTypeResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListDmsMsgTypeResponseBodyDataContent> content;

        public static ListDmsMsgTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDmsMsgTypeResponseBodyData self = new ListDmsMsgTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDmsMsgTypeResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListDmsMsgTypeResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDmsMsgTypeResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListDmsMsgTypeResponseBodyData setContent(java.util.List<ListDmsMsgTypeResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDmsMsgTypeResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
