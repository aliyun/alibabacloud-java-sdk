// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMessagesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListMessagesResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter instanceId is mandatory for this action .</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A3531B6A-5A88-52BD-B3C4-A024C3D0AA2E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesResponseBody self = new ListMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessagesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMessagesResponseBody setData(ListMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListMessagesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMessagesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMessagesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMessagesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMessagesResponseBodyDataList extends TeaModel {
        /**
         * <p>Message body.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("body")
        public String body;

        /**
         * <p>Message body size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("bodySize")
        public Integer bodySize;

        /**
         * <p>The client on which messages are produced.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("bornHost")
        public String bornHost;

        /**
         * <p>Message born time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("bornTime")
        public String bornTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The message group. This parameter is returned only for ordered messages.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageGroup")
        public String messageGroup;

        /**
         * <p>Message Id.</p>
         * 
         * <strong>example:</strong>
         * <p>7F000001000114B4340C5ABF94500079</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>Message keys.</p>
         */
        @NameInMap("messageKeys")
        public java.util.List<String> messageKeys;

        /**
         * <p>The message tag.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageTag")
        public String messageTag;

        /**
         * <p>Message type.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The broker on which messages are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("storeHost")
        public String storeHost;

        /**
         * <p>Message store time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 12:17:08</p>
         */
        @NameInMap("storeTime")
        public String storeTime;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <p>Message user properties.</p>
         */
        @NameInMap("userProperties")
        public java.util.Map<String, String> userProperties;

        public static ListMessagesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataList self = new ListMessagesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataList setBody(String body) {
            this.body = body;
            return this;
        }
        public String getBody() {
            return this.body;
        }

        public ListMessagesResponseBodyDataList setBodySize(Integer bodySize) {
            this.bodySize = bodySize;
            return this;
        }
        public Integer getBodySize() {
            return this.bodySize;
        }

        public ListMessagesResponseBodyDataList setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public ListMessagesResponseBodyDataList setBornTime(String bornTime) {
            this.bornTime = bornTime;
            return this;
        }
        public String getBornTime() {
            return this.bornTime;
        }

        public ListMessagesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMessagesResponseBodyDataList setMessageGroup(String messageGroup) {
            this.messageGroup = messageGroup;
            return this;
        }
        public String getMessageGroup() {
            return this.messageGroup;
        }

        public ListMessagesResponseBodyDataList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListMessagesResponseBodyDataList setMessageKeys(java.util.List<String> messageKeys) {
            this.messageKeys = messageKeys;
            return this;
        }
        public java.util.List<String> getMessageKeys() {
            return this.messageKeys;
        }

        public ListMessagesResponseBodyDataList setMessageTag(String messageTag) {
            this.messageTag = messageTag;
            return this;
        }
        public String getMessageTag() {
            return this.messageTag;
        }

        public ListMessagesResponseBodyDataList setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ListMessagesResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListMessagesResponseBodyDataList setStoreHost(String storeHost) {
            this.storeHost = storeHost;
            return this;
        }
        public String getStoreHost() {
            return this.storeHost;
        }

        public ListMessagesResponseBodyDataList setStoreTime(String storeTime) {
            this.storeTime = storeTime;
            return this;
        }
        public String getStoreTime() {
            return this.storeTime;
        }

        public ListMessagesResponseBodyDataList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListMessagesResponseBodyDataList setUserProperties(java.util.Map<String, String> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public java.util.Map<String, String> getUserProperties() {
            return this.userProperties;
        }

    }

    public static class ListMessagesResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("list")
        public java.util.List<ListMessagesResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The scroll ID of the request.</p>
         * <p>The ID is automatically generated by the system. The result can be paginated only if this parameter is included in the pagination request.</p>
         * 
         * <strong>example:</strong>
         * <p>B13D0B07-F24B-4790-88D8-D47A38063D00</p>
         */
        @NameInMap("scrollId")
        public String scrollId;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyData self = new ListMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyData setList(java.util.List<ListMessagesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListMessagesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListMessagesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMessagesResponseBodyData setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public ListMessagesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
