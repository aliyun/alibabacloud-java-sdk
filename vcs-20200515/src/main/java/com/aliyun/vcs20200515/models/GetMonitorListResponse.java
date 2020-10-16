// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMonitorListResponseData data;

    public static GetMonitorListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorListResponse self = new GetMonitorListResponse();
        return TeaModel.build(map, self);
    }

    public GetMonitorListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMonitorListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonitorListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonitorListResponse setData(GetMonitorListResponseData data) {
        this.data = data;
        return this;
    }
    public GetMonitorListResponseData getData() {
        return this.data;
    }

    public static class GetMonitorListResponseDataRecords extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("MonitorType")
        @Validation(required = true)
        public String monitorType;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("AlgorithmVendor")
        @Validation(required = true)
        public String algorithmVendor;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("ModifiedDate")
        @Validation(required = true)
        public String modifiedDate;

        @NameInMap("DeviceList")
        @Validation(required = true)
        public String deviceList;

        @NameInMap("Attributes")
        @Validation(required = true)
        public String attributes;

        @NameInMap("RuleExpression")
        @Validation(required = true)
        public String ruleExpression;

        @NameInMap("NotifierType")
        @Validation(required = true)
        public String notifierType;

        @NameInMap("NotifierExtra")
        @Validation(required = true)
        public String notifierExtra;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Expression")
        @Validation(required = true)
        public String expression;

        @NameInMap("ImageMatch")
        @Validation(required = true)
        public String imageMatch;

        public static GetMonitorListResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorListResponseDataRecords self = new GetMonitorListResponseDataRecords();
            return TeaModel.build(map, self);
        }

        public GetMonitorListResponseDataRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMonitorListResponseDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMonitorListResponseDataRecords setMonitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public String getMonitorType() {
            return this.monitorType;
        }

        public GetMonitorListResponseDataRecords setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetMonitorListResponseDataRecords setAlgorithmVendor(String algorithmVendor) {
            this.algorithmVendor = algorithmVendor;
            return this;
        }
        public String getAlgorithmVendor() {
            return this.algorithmVendor;
        }

        public GetMonitorListResponseDataRecords setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetMonitorListResponseDataRecords setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public GetMonitorListResponseDataRecords setDeviceList(String deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public String getDeviceList() {
            return this.deviceList;
        }

        public GetMonitorListResponseDataRecords setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetMonitorListResponseDataRecords setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public GetMonitorListResponseDataRecords setNotifierType(String notifierType) {
            this.notifierType = notifierType;
            return this;
        }
        public String getNotifierType() {
            return this.notifierType;
        }

        public GetMonitorListResponseDataRecords setNotifierExtra(String notifierExtra) {
            this.notifierExtra = notifierExtra;
            return this;
        }
        public String getNotifierExtra() {
            return this.notifierExtra;
        }

        public GetMonitorListResponseDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMonitorListResponseDataRecords setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetMonitorListResponseDataRecords setImageMatch(String imageMatch) {
            this.imageMatch = imageMatch;
            return this;
        }
        public String getImageMatch() {
            return this.imageMatch;
        }

    }

    public static class GetMonitorListResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<GetMonitorListResponseDataRecords> records;

        public static GetMonitorListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorListResponseData self = new GetMonitorListResponseData();
            return TeaModel.build(map, self);
        }

        public GetMonitorListResponseData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetMonitorListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMonitorListResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetMonitorListResponseData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public GetMonitorListResponseData setRecords(java.util.List<GetMonitorListResponseDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetMonitorListResponseDataRecords> getRecords() {
            return this.records;
        }

    }

}
