// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsBindingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public ListDmsBindingResponseBodyData data;

    public static ListDmsBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDmsBindingResponseBody self = new ListDmsBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDmsBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDmsBindingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDmsBindingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListDmsBindingResponseBody setData(ListDmsBindingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDmsBindingResponseBodyData getData() {
        return this.data;
    }

    public static class ListDmsBindingResponseBodyDataContent extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Eventcode")
        public String eventcode;

        @NameInMap("ExchangeType")
        public String exchangeType;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Persistence")
        public Boolean persistence;

        @NameInMap("Topic")
        public String topic;

        public static ListDmsBindingResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDmsBindingResponseBodyDataContent self = new ListDmsBindingResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDmsBindingResponseBodyDataContent setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDmsBindingResponseBodyDataContent setEventcode(String eventcode) {
            this.eventcode = eventcode;
            return this;
        }
        public String getEventcode() {
            return this.eventcode;
        }

        public ListDmsBindingResponseBodyDataContent setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public ListDmsBindingResponseBodyDataContent setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListDmsBindingResponseBodyDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDmsBindingResponseBodyDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDmsBindingResponseBodyDataContent setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListDmsBindingResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDmsBindingResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDmsBindingResponseBodyDataContent setPersistence(Boolean persistence) {
            this.persistence = persistence;
            return this;
        }
        public Boolean getPersistence() {
            return this.persistence;
        }

        public ListDmsBindingResponseBodyDataContent setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListDmsBindingResponseBodyData extends TeaModel {
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Content")
        public java.util.List<ListDmsBindingResponseBodyDataContent> content;

        public static ListDmsBindingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDmsBindingResponseBodyData self = new ListDmsBindingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDmsBindingResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListDmsBindingResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDmsBindingResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListDmsBindingResponseBodyData setContent(java.util.List<ListDmsBindingResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDmsBindingResponseBodyDataContent> getContent() {
            return this.content;
        }

    }

}
