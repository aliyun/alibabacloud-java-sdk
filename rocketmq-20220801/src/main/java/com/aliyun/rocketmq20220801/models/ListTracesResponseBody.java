// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTracesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public ListTracesResponseBodyData data;

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
     * <p>InstanceId</p>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EDFF77E1-1ED1-5389-B6A8-651D9433BBE5</p>
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

    public static ListTracesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTracesResponseBody self = new ListTracesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTracesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTracesResponseBody setData(ListTracesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTracesResponseBodyData getData() {
        return this.data;
    }

    public ListTracesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListTracesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListTracesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTracesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTracesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTracesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTracesResponseBodyDataList extends TeaModel {
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
         * <p>Message id.</p>
         * 
         * <strong>example:</strong>
         * <p>7F00000100207A4F0F294A938F7807AE</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>Message keys.</p>
         */
        @NameInMap("messageKeys")
        public java.util.List<String> messageKeys;

        /**
         * <p>Message tag.</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("messageTag")
        public String messageTag;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The name of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        @NameInMap("topicName")
        public String topicName;

        public static ListTracesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTracesResponseBodyDataList self = new ListTracesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTracesResponseBodyDataList setBornTime(String bornTime) {
            this.bornTime = bornTime;
            return this;
        }
        public String getBornTime() {
            return this.bornTime;
        }

        public ListTracesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTracesResponseBodyDataList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListTracesResponseBodyDataList setMessageKeys(java.util.List<String> messageKeys) {
            this.messageKeys = messageKeys;
            return this;
        }
        public java.util.List<String> getMessageKeys() {
            return this.messageKeys;
        }

        public ListTracesResponseBodyDataList setMessageTag(String messageTag) {
            this.messageTag = messageTag;
            return this;
        }
        public String getMessageTag() {
            return this.messageTag;
        }

        public ListTracesResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTracesResponseBodyDataList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

    }

    public static class ListTracesResponseBodyData extends TeaModel {
        /**
         * <p>Trace list.</p>
         */
        @NameInMap("list")
        public java.util.List<ListTracesResponseBodyDataList> list;

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListTracesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTracesResponseBodyData self = new ListTracesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTracesResponseBodyData setList(java.util.List<ListTracesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTracesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTracesResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListTracesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTracesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
