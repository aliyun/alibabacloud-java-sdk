// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListGroupsResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponseBody self = new ListGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponseBody setData(ListGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListGroupsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGroupsResponseBodyDataGroups extends TeaModel {
        @NameInMap("Algorithm")
        public String algorithm;

        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("Column")
        public String column;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Filter")
        public String filter;

        @NameInMap("Id")
        public String id;

        @NameInMap("InferenceJobId")
        public String inferenceJobId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public Boolean phoneNumber;

        @NameInMap("Project")
        public String project;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Table")
        public String table;

        @NameInMap("Text")
        public String text;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        @NameInMap("Uri")
        public String uri;

        public static ListGroupsResponseBodyDataGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyDataGroups self = new ListGroupsResponseBodyDataGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyDataGroups setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListGroupsResponseBodyDataGroups setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListGroupsResponseBodyDataGroups setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public ListGroupsResponseBodyDataGroups setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListGroupsResponseBodyDataGroups setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public ListGroupsResponseBodyDataGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListGroupsResponseBodyDataGroups setInferenceJobId(String inferenceJobId) {
            this.inferenceJobId = inferenceJobId;
            return this;
        }
        public String getInferenceJobId() {
            return this.inferenceJobId;
        }

        public ListGroupsResponseBodyDataGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupsResponseBodyDataGroups setPhoneNumber(Boolean phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Boolean getPhoneNumber() {
            return this.phoneNumber;
        }

        public ListGroupsResponseBodyDataGroups setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListGroupsResponseBodyDataGroups setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListGroupsResponseBodyDataGroups setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public ListGroupsResponseBodyDataGroups setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGroupsResponseBodyDataGroups setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public ListGroupsResponseBodyDataGroups setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListGroupsResponseBodyDataGroups setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListGroupsResponseBodyDataGroups setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class ListGroupsResponseBodyData extends TeaModel {
        @NameInMap("Groups")
        public java.util.List<ListGroupsResponseBodyDataGroups> groups;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyData self = new ListGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyData setGroups(java.util.List<ListGroupsResponseBodyDataGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<ListGroupsResponseBodyDataGroups> getGroups() {
            return this.groups;
        }

        public ListGroupsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGroupsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGroupsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
