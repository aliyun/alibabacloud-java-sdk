// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class ListInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListInstancesResponseData data;

    public static ListInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponse self = new ListInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponse setData(ListInstancesResponseData data) {
        this.data = data;
        return this;
    }
    public ListInstancesResponseData getData() {
        return this.data;
    }

    public static class ListInstancesResponseDataListTags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListInstancesResponseDataListTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseDataListTags self = new ListInstancesResponseDataListTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseDataListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseDataListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseDataList extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("InstanceStatus")
        @Validation(required = true)
        public Integer instanceStatus;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ExpiredTime")
        @Validation(required = true)
        public String expiredTime;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<ListInstancesResponseDataListTags> tags;

        public static ListInstancesResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseDataList self = new ListInstancesResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseDataList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseDataList setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListInstancesResponseDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListInstancesResponseDataList setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListInstancesResponseDataList setTags(java.util.List<ListInstancesResponseDataListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseDataListTags> getTags() {
            return this.tags;
        }

    }

    public static class ListInstancesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<ListInstancesResponseDataList> list;

        public static ListInstancesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseData self = new ListInstancesResponseData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstancesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstancesResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListInstancesResponseData setList(java.util.List<ListInstancesResponseDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListInstancesResponseDataList> getList() {
            return this.list;
        }

    }

}
