// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessagePageQueryByGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MsgFoundDo")
    public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo msgFoundDo;

    public static OnsDLQMessagePageQueryByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessagePageQueryByGroupIdResponseBody self = new OnsDLQMessagePageQueryByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessagePageQueryByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsDLQMessagePageQueryByGroupIdResponseBody setMsgFoundDo(OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo msgFoundDo) {
        this.msgFoundDo = msgFoundDo;
        return this;
    }
    public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo getMsgFoundDo() {
        return this.msgFoundDo;
    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList extends TeaModel {
        @NameInMap("StoreSize")
        public Integer storeSize;

        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("StoreHost")
        public String storeHost;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("PropertyList")
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList> propertyList;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setPropertyList(java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("MsgFoundList")
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList> msgFoundList;

        @NameInMap("MaxPageCount")
        public Long maxPageCount;

        @NameInMap("TaskId")
        public String taskId;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo setMsgFoundList(java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList> msgFoundList) {
            this.msgFoundList = msgFoundList;
            return this;
        }
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList> getMsgFoundList() {
            return this.msgFoundList;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo setMaxPageCount(Long maxPageCount) {
            this.maxPageCount = maxPageCount;
            return this;
        }
        public Long getMaxPageCount() {
            return this.maxPageCount;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
