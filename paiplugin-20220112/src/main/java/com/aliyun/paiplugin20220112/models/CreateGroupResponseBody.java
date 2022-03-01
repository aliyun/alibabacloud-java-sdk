// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public CreateGroupResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
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
        // 算法
        @NameInMap("Algorithm")
        public String algorithm;

        // 人群数量
        @NameInMap("Amount")
        public Integer amount;

        // 手机号列名
        @NameInMap("Column")
        public String column;

        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // ODPS过滤语句
        @NameInMap("Filter")
        public String filter;

        // 人群Id
        @NameInMap("Id")
        public String id;

        // 预测任务Id
        @NameInMap("InferenceJobId")
        public String inferenceJobId;

        // 人群名称
        @NameInMap("Name")
        public String name;

        // ODPS项目名
        @NameInMap("Project")
        public String project;

        // 备注
        @NameInMap("Remark")
        public String remark;

        // 人群来源
        // - 0: Text，每行一个手机号
        // - 1: 无header的csv文件，每行一个手机号
        // - 2: 带header的csv文件，需指定手机号列名
        // - 3: Odps，需指定手机号列名
        // - 4: Algorithm，由算法预测生成
        @NameInMap("Source")
        public Integer source;

        // 人群状态
        @NameInMap("Status")
        public Integer status;

        // ODPS表名
        @NameInMap("Table")
        public String table;

        // 文本
        @NameInMap("Text")
        public String text;

        // 更新时间 (UTC+8)
        @NameInMap("UpdatedTime")
        public String updatedTime;

        // 文件地址
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
