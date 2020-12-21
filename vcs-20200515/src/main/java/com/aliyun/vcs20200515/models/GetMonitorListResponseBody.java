// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetMonitorListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMonitorListResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetMonitorListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorListResponseBody self = new GetMonitorListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonitorListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonitorListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonitorListResponseBody setData(GetMonitorListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMonitorListResponseBodyData getData() {
        return this.data;
    }

    public GetMonitorListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetMonitorListResponseBodyDataRecords extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("RuleExpression")
        public String ruleExpression;

        @NameInMap("ImageMatch")
        public String imageMatch;

        @NameInMap("MonitorType")
        public String monitorType;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("NotifierType")
        public String notifierType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("NotifierExtra")
        public String notifierExtra;

        @NameInMap("Attributes")
        public String attributes;

        @NameInMap("DeviceList")
        public String deviceList;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("ModifiedDate")
        public String modifiedDate;

        @NameInMap("AlgorithmVendor")
        public String algorithmVendor;

        public static GetMonitorListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorListResponseBodyDataRecords self = new GetMonitorListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetMonitorListResponseBodyDataRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMonitorListResponseBodyDataRecords setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public GetMonitorListResponseBodyDataRecords setImageMatch(String imageMatch) {
            this.imageMatch = imageMatch;
            return this;
        }
        public String getImageMatch() {
            return this.imageMatch;
        }

        public GetMonitorListResponseBodyDataRecords setMonitorType(String monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public String getMonitorType() {
            return this.monitorType;
        }

        public GetMonitorListResponseBodyDataRecords setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetMonitorListResponseBodyDataRecords setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetMonitorListResponseBodyDataRecords setNotifierType(String notifierType) {
            this.notifierType = notifierType;
            return this;
        }
        public String getNotifierType() {
            return this.notifierType;
        }

        public GetMonitorListResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMonitorListResponseBodyDataRecords setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetMonitorListResponseBodyDataRecords setNotifierExtra(String notifierExtra) {
            this.notifierExtra = notifierExtra;
            return this;
        }
        public String getNotifierExtra() {
            return this.notifierExtra;
        }

        public GetMonitorListResponseBodyDataRecords setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetMonitorListResponseBodyDataRecords setDeviceList(String deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public String getDeviceList() {
            return this.deviceList;
        }

        public GetMonitorListResponseBodyDataRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMonitorListResponseBodyDataRecords setModifiedDate(String modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }
        public String getModifiedDate() {
            return this.modifiedDate;
        }

        public GetMonitorListResponseBodyDataRecords setAlgorithmVendor(String algorithmVendor) {
            this.algorithmVendor = algorithmVendor;
            return this;
        }
        public String getAlgorithmVendor() {
            return this.algorithmVendor;
        }

    }

    public static class GetMonitorListResponseBodyData extends TeaModel {
        @NameInMap("Records")
        public java.util.List<GetMonitorListResponseBodyDataRecords> records;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetMonitorListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorListResponseBodyData self = new GetMonitorListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMonitorListResponseBodyData setRecords(java.util.List<GetMonitorListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetMonitorListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetMonitorListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetMonitorListResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public GetMonitorListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMonitorListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
