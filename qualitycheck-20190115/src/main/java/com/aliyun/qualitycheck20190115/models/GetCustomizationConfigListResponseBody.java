// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetCustomizationConfigListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomizationConfigListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomizationConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizationConfigListResponseBody self = new GetCustomizationConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomizationConfigListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomizationConfigListResponseBody setData(GetCustomizationConfigListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomizationConfigListResponseBodyData getData() {
        return this.data;
    }

    public GetCustomizationConfigListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomizationConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomizationConfigListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModeCustomizationId")
        public String modeCustomizationId;

        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelStatus")
        public Integer modelStatus;

        @NameInMap("TaskType")
        public Integer taskType;

        public static GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo self = new GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo();
            return TeaModel.build(map, self);
        }

        public GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo setModeCustomizationId(String modeCustomizationId) {
            this.modeCustomizationId = modeCustomizationId;
            return this;
        }
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

        public GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo setModelStatus(Integer modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public Integer getModelStatus() {
            return this.modelStatus;
        }

        public GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

    public static class GetCustomizationConfigListResponseBodyData extends TeaModel {
        @NameInMap("ModelCustomizationDataSetPo")
        public java.util.List<GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo> modelCustomizationDataSetPo;

        public static GetCustomizationConfigListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizationConfigListResponseBodyData self = new GetCustomizationConfigListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomizationConfigListResponseBodyData setModelCustomizationDataSetPo(java.util.List<GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo> modelCustomizationDataSetPo) {
            this.modelCustomizationDataSetPo = modelCustomizationDataSetPo;
            return this;
        }
        public java.util.List<GetCustomizationConfigListResponseBodyDataModelCustomizationDataSetPo> getModelCustomizationDataSetPo() {
            return this.modelCustomizationDataSetPo;
        }

    }

}
