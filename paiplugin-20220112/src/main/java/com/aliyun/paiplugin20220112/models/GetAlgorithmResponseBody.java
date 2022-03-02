// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetAlgorithmResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public GetAlgorithmResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static GetAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmResponseBody self = new GetAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmResponseBody setData(GetAlgorithmResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlgorithmResponseBodyData getData() {
        return this.data;
    }

    public GetAlgorithmResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetAlgorithmResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlgorithmResponseBodyData extends TeaModel {
        // 算法说明。
        @NameInMap("Description")
        public String description;

        // 算法Id。
        @NameInMap("Id")
        public String id;

        // 预测所需参数名与对应的参数说明。
        @NameInMap("InferUserConfigMap")
        public String inferUserConfigMap;

        // 算法名称。
        @NameInMap("Name")
        public String name;

        // 训练所需参数名与对应的参数说明。
        @NameInMap("TrainUserConfigMap")
        public String trainUserConfigMap;

        public static GetAlgorithmResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlgorithmResponseBodyData self = new GetAlgorithmResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlgorithmResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAlgorithmResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAlgorithmResponseBodyData setInferUserConfigMap(String inferUserConfigMap) {
            this.inferUserConfigMap = inferUserConfigMap;
            return this;
        }
        public String getInferUserConfigMap() {
            return this.inferUserConfigMap;
        }

        public GetAlgorithmResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlgorithmResponseBodyData setTrainUserConfigMap(String trainUserConfigMap) {
            this.trainUserConfigMap = trainUserConfigMap;
            return this;
        }
        public String getTrainUserConfigMap() {
            return this.trainUserConfigMap;
        }

    }

}
