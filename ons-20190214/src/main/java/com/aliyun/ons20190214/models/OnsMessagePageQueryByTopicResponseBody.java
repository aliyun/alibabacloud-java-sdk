// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePageQueryByTopicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MsgFoundDo")
    public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo msgFoundDo;

    public static OnsMessagePageQueryByTopicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePageQueryByTopicResponseBody self = new OnsMessagePageQueryByTopicResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsMessagePageQueryByTopicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsMessagePageQueryByTopicResponseBody setMsgFoundDo(OnsMessagePageQueryByTopicResponseBodyMsgFoundDo msgFoundDo) {
        this.msgFoundDo = msgFoundDo;
        return this;
    }
    public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo getMsgFoundDo() {
        return this.msgFoundDo;
    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList extends TeaModel {
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
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList> propertyList;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setPropertyList(java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList> propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundListPropertyList> getPropertyList() {
            return this.propertyList;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

    }

    public static class OnsMessagePageQueryByTopicResponseBodyMsgFoundDo extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("MsgFoundList")
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList> msgFoundList;

        @NameInMap("MaxPageCount")
        public Long maxPageCount;

        @NameInMap("TaskId")
        public String taskId;

        public static OnsMessagePageQueryByTopicResponseBodyMsgFoundDo build(java.util.Map<String, ?> map) throws Exception {
            OnsMessagePageQueryByTopicResponseBodyMsgFoundDo self = new OnsMessagePageQueryByTopicResponseBodyMsgFoundDo();
            return TeaModel.build(map, self);
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setMsgFoundList(java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList> msgFoundList) {
            this.msgFoundList = msgFoundList;
            return this;
        }
        public java.util.List<OnsMessagePageQueryByTopicResponseBodyMsgFoundDoMsgFoundList> getMsgFoundList() {
            return this.msgFoundList;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setMaxPageCount(Long maxPageCount) {
            this.maxPageCount = maxPageCount;
            return this;
        }
        public Long getMaxPageCount() {
            return this.maxPageCount;
        }

        public OnsMessagePageQueryByTopicResponseBodyMsgFoundDo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
