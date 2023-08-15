// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result data that is returned.</p>
     */
    @NameInMap("data")
    public ListConsumerGroupsResponseBodyData data;

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

    public static ListConsumerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerGroupsResponseBody self = new ListConsumerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerGroupsResponseBody setData(ListConsumerGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumerGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListConsumerGroupsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListConsumerGroupsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListConsumerGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConsumerGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConsumerGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListConsumerGroupsResponseBodyDataList extends TeaModel {
        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The time when the consumer group was created.</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The remarks on the consumer group.</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <p>The state of the consumer group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RUNNING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    : The consumer group is</p>
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
         * <p>    : The consumer group is</p>
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
         * <p>The time when the consumer group was last updated.</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListConsumerGroupsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupsResponseBodyDataList self = new ListConsumerGroupsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupsResponseBodyDataList setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListConsumerGroupsResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConsumerGroupsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConsumerGroupsResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListConsumerGroupsResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListConsumerGroupsResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListConsumerGroupsResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListConsumerGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The paginated data.</p>
         */
        @NameInMap("list")
        public java.util.List<ListConsumerGroupsResponseBodyDataList> list;

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

        public static ListConsumerGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerGroupsResponseBodyData self = new ListConsumerGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerGroupsResponseBodyData setList(java.util.List<ListConsumerGroupsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListConsumerGroupsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListConsumerGroupsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListConsumerGroupsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListConsumerGroupsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
