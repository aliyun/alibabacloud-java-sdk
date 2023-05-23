// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public CreateGroupResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
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
        /**
         * <p>关联算法，人群来源为算法。</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>人群数量。</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>手机号列名，人群来源为CSV文件，MaxCompute，并且包含手机号时需指定。</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>创建时间 (UTC+8)。</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>过滤条件，人群来源为MaxCompute时可指定。</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>人群Id。</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>预测任务Id，人群来源为算法。</p>
         */
        @NameInMap("InferenceJobId")
        public String inferenceJobId;

        /**
         * <p>人群名称。</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>是否包含手机号，包含手机号的人群可用于触达计划。</p>
         */
        @NameInMap("PhoneNumber")
        public Boolean phoneNumber;

        /**
         * <p>MaxCompute(ODPS)项目名，人群来源为MaxCompute时需指定。</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>人群备注。</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>人群来源。</p>
         * <p>- 0: 文本，每行一个手机号，最多100个。</p>
         * <p>- 1: 文本文件，每行一个手机号，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。</p>
         * <p>- 2: CSV文件，需指定手机号列名，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。</p>
         * <p>- 3: MaxCompute(ODPS)表，需指定手机号列名。</p>
         * <p>- 4: 算法。</p>
         */
        @NameInMap("Source")
        public Integer source;

        /**
         * <p>人群状态。</p>
         * <p>- 0: 检查中。</p>
         * <p>- 1: 已通过。</p>
         * <p>- 2: 未通过。</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>MaxCompute(ODPS)表名，人群来源为MaxCompute时需指定。</p>
         */
        @NameInMap("Table")
        public String table;

        /**
         * <p>文本，人群来源为文本时需指定。</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>更新时间 (UTC+8)。</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        /**
         * <p>文件地址，人群来源为文本文件，CSV文件，MaxCompute时需指定。</p>
         */
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
