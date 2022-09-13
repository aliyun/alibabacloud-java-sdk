// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerGroupsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListConsumerGroupsResponseBodyData data;

    @NameInMap("dynamicCode")
    public String dynamicCode;

    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("remark")
        public String remark;

        @NameInMap("status")
        public String status;

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
        @NameInMap("list")
        public java.util.List<ListConsumerGroupsResponseBodyDataList> list;

        @NameInMap("pageNumber")
        public Long pageNumber;

        @NameInMap("pageSize")
        public Long pageSize;

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
