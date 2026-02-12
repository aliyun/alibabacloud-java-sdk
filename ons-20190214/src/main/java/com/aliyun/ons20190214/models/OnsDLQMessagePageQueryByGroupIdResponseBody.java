// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessagePageQueryByGroupIdResponseBody extends TeaModel {
    /**
     * <p>The information about dead-letter messages that are queried.</p>
     */
    @NameInMap("MsgFoundDo")
    public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo msgFoundDo;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B00CD3C8-D81E-4A41-85E2-38F19252****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsDLQMessagePageQueryByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessagePageQueryByGroupIdResponseBody self = new OnsDLQMessagePageQueryByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessagePageQueryByGroupIdResponseBody setMsgFoundDo(OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo msgFoundDo) {
        this.msgFoundDo = msgFoundDo;
        return this;
    }
    public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo getMsgFoundDo() {
        return this.msgFoundDo;
    }

    public OnsDLQMessagePageQueryByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList extends TeaModel {
        @NameInMap("MessageProperty")
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty> messageProperty;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList setMessageProperty(java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty> messageProperty) {
            this.messageProperty = messageProperty;
            return this;
        }
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyListMessageProperty> getMessageProperty() {
            return this.messageProperty;
        }

    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo extends TeaModel {
        @NameInMap("BodyCRC")
        public Integer bodyCRC;

        @NameInMap("BornHost")
        public String bornHost;

        @NameInMap("BornTimestamp")
        public Long bornTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("PropertyList")
        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList propertyList;

        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        @NameInMap("StoreHost")
        public String storeHost;

        @NameInMap("StoreSize")
        public Integer storeSize;

        @NameInMap("StoreTimestamp")
        public Long storeTimestamp;

        @NameInMap("Topic")
        public String topic;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setBodyCRC(Integer bodyCRC) {
            this.bodyCRC = bodyCRC;
            return this;
        }
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setBornTimestamp(Long bornTimestamp) {
            this.bornTimestamp = bornTimestamp;
            return this;
        }
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setPropertyList(OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList propertyList) {
            this.propertyList = propertyList;
            return this;
        }
        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDoPropertyList getPropertyList() {
            return this.propertyList;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setStoreSize(Integer storeSize) {
            this.storeSize = storeSize;
            return this;
        }
        public Integer getStoreSize() {
            return this.storeSize;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setStoreTimestamp(Long storeTimestamp) {
            this.storeTimestamp = storeTimestamp;
            return this;
        }
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList extends TeaModel {
        @NameInMap("OnsRestMessageDo")
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo> onsRestMessageDo;

        public static OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList build(java.util.Map<String, ?> map) throws Exception {
            OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList self = new OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList();
            return TeaModel.build(map, self);
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList setOnsRestMessageDo(java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo> onsRestMessageDo) {
            this.onsRestMessageDo = onsRestMessageDo;
            return this;
        }
        public java.util.List<OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundListOnsRestMessageDo> getOnsRestMessageDo() {
            return this.onsRestMessageDo;
        }

    }

    public static class OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("MaxPageCount")
        public Long maxPageCount;

        @NameInMap("MsgFoundList")
        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList msgFoundList;

        /**
         * <p>The ID of the query task. The first time you call this operation to query the dead-letter messages that are sent to a specified consumer group within a specified time range, this parameter is returned. You can use the task ID to query the details of dead-letter messages on other returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>0BC1310300002A9F000021E4D7A48346</p>
         */
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

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo setMaxPageCount(Long maxPageCount) {
            this.maxPageCount = maxPageCount;
            return this;
        }
        public Long getMaxPageCount() {
            return this.maxPageCount;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDo setMsgFoundList(OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList msgFoundList) {
            this.msgFoundList = msgFoundList;
            return this;
        }
        public OnsDLQMessagePageQueryByGroupIdResponseBodyMsgFoundDoMsgFoundList getMsgFoundList() {
            return this.msgFoundList;
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
