// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    // 返回数据。
    @NameInMap("Data")
    public ListGroupsResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
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
        // 关联算法，人群来源为算法。
        @NameInMap("Algorithm")
        public String algorithm;

        // 人群数量。
        @NameInMap("Amount")
        public Integer amount;

        // 手机号列名，人群来源为CSV文件，MaxCompute，并且包含手机号时需指定。
        @NameInMap("Column")
        public String column;

        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 过滤条件，人群来源为MaxCompute时可指定。
        @NameInMap("Filter")
        public String filter;

        // 人群Id。
        @NameInMap("Id")
        public String id;

        // 预测任务Id，人群来源为算法。
        @NameInMap("InferenceJobId")
        public String inferenceJobId;

        // 人群名称。
        @NameInMap("Name")
        public String name;

        // 是否包含手机号，包含手机号的人群可用于触达计划。
        @NameInMap("PhoneNumber")
        public Boolean phoneNumber;

        // MaxCompute(ODPS)项目名，人群来源为MaxCompute时需指定。
        @NameInMap("Project")
        public String project;

        // 人群备注。
        @NameInMap("Remark")
        public String remark;

        // 人群来源。
        // - 0: 文本，每行一个手机号，最多100个。
        // - 1: 文本文件，每行一个手机号，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
        // - 2: CSV文件，需指定手机号列名，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
        // - 3: MaxCompute(ODPS)表，需指定手机号列名。
        // - 4: 算法。
        @NameInMap("Source")
        public Integer source;

        // 人群状态。
        // - 0: 检查中。
        // - 1: 已通过。
        // - 2: 未通过。
        @NameInMap("Status")
        public Integer status;

        // MaxCompute(ODPS)表名，人群来源为MaxCompute时需指定。
        @NameInMap("Table")
        public String table;

        // 文本，人群来源为文本时需指定。
        @NameInMap("Text")
        public String text;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        // 文件地址，人群来源为文本文件，CSV文件，MaxCompute时需指定。
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
        // 人群列表。
        @NameInMap("Groups")
        public java.util.List<ListGroupsResponseBodyDataGroups> groups;

        // 分页数，从1开始，默认为1。
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // 分页大小，默认为10。
        @NameInMap("PageSize")
        public Integer pageSize;

        // 总人群数量。
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
