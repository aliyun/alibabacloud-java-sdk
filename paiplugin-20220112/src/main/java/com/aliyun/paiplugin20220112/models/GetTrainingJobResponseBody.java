// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public GetTrainingJobResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static GetTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobResponseBody self = new GetTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobResponseBody setData(GetTrainingJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTrainingJobResponseBodyData getData() {
        return this.data;
    }

    public GetTrainingJobResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetTrainingJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTrainingJobResponseBodyData extends TeaModel {
        // 关联算法Id。
        @NameInMap("Algorithm")
        public String algorithm;

        // 创建时间 (UTC+8)。
        @NameInMap("CreatedTime")
        public String createdTime;

        // 训练任务日志。
        @NameInMap("History")
        public String history;

        // 训练任务Id。
        @NameInMap("Id")
        public String id;

        // 训练任务名称。
        @NameInMap("Name")
        public String name;

        // 备注。
        @NameInMap("Remark")
        public String remark;

        // 训练任务状态。
        @NameInMap("Status")
        public Integer status;

        // 更新时间 (UTC+8)。
        @NameInMap("UpdatedTime")
        public String updatedTime;

        // 用户配置。
        @NameInMap("UserConfig")
        public String userConfig;

        public static GetTrainingJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyData self = new GetTrainingJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyData setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetTrainingJobResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetTrainingJobResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public GetTrainingJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTrainingJobResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetTrainingJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetTrainingJobResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public GetTrainingJobResponseBodyData setUserConfig(String userConfig) {
            this.userConfig = userConfig;
            return this;
        }
        public String getUserConfig() {
            return this.userConfig;
        }

    }

}
