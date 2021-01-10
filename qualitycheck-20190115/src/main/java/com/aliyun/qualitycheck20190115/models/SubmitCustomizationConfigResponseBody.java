// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitCustomizationConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SubmitCustomizationConfigResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitCustomizationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomizationConfigResponseBody self = new SubmitCustomizationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCustomizationConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCustomizationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCustomizationConfigResponseBody setData(SubmitCustomizationConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCustomizationConfigResponseBodyData getData() {
        return this.data;
    }

    public SubmitCustomizationConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitCustomizationConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitCustomizationConfigResponseBodyData extends TeaModel {
        @NameInMap("ModelStatus")
        public Integer modelStatus;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelId")
        public Long modelId;

        @NameInMap("ModeCustomizationId")
        public String modeCustomizationId;

        public static SubmitCustomizationConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomizationConfigResponseBodyData self = new SubmitCustomizationConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCustomizationConfigResponseBodyData setModelStatus(Integer modelStatus) {
            this.modelStatus = modelStatus;
            return this;
        }
        public Integer getModelStatus() {
            return this.modelStatus;
        }

        public SubmitCustomizationConfigResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public SubmitCustomizationConfigResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public SubmitCustomizationConfigResponseBodyData setModeCustomizationId(String modeCustomizationId) {
            this.modeCustomizationId = modeCustomizationId;
            return this;
        }
        public String getModeCustomizationId() {
            return this.modeCustomizationId;
        }

    }

}
