// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    // 返回数据。
    @NameInMap("Data")
    public CreateGroupResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setData(CreateGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateGroupResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGroupResponseBodyData extends TeaModel {
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

        public static CreateGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseBodyData self = new CreateGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public CreateGroupResponseBodyData setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateGroupResponseBodyData setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public CreateGroupResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateGroupResponseBodyData setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
        }

        public CreateGroupResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateGroupResponseBodyData setInferenceJobId(String inferenceJobId) {
            this.inferenceJobId = inferenceJobId;
            return this;
        }
        public String getInferenceJobId() {
            return this.inferenceJobId;
        }

        public CreateGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateGroupResponseBodyData setPhoneNumber(Boolean phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Boolean getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateGroupResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateGroupResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateGroupResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public CreateGroupResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateGroupResponseBodyData setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public CreateGroupResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateGroupResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public CreateGroupResponseBodyData setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
