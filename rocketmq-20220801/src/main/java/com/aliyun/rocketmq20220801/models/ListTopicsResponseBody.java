// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result data that is returned.</p>
     */
    @NameInMap("data")
    public ListTopicsResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTopicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsResponseBody self = new ListTopicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopicsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTopicsResponseBody setData(ListTopicsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTopicsResponseBodyData getData() {
        return this.data;
    }

    public ListTopicsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListTopicsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListTopicsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTopicsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopicsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopicsResponseBodyDataList extends TeaModel {
        /**
         * <p>The time when the topic was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The message type of the topic.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   TRANSACTION</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    transactional message</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   FIFO</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    ordered message</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DELAY</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    scheduled or delayed message</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NORMAL</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    normal message</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("messageType")
        public String messageType;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The remarks on the topic.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The state of the topic.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RUNNING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    : The topic is</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   CREATING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    : The topic is</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    being created</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The name of the topic.</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <p>The time when the topic was last updated.</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListTopicsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseBodyDataList self = new ListTopicsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTopicsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTopicsResponseBodyDataList setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ListTopicsResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListTopicsResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListTopicsResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTopicsResponseBodyDataList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTopicsResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListTopicsResponseBodyData extends TeaModel {
        /**
         * <p>The paginated data.</p>
         */
        @NameInMap("list")
        public java.util.List<ListTopicsResponseBodyDataList> list;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListTopicsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopicsResponseBodyData self = new ListTopicsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopicsResponseBodyData setList(java.util.List<ListTopicsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTopicsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTopicsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListTopicsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTopicsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
