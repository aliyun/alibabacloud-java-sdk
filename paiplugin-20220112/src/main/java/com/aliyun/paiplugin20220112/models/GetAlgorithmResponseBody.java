// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetAlgorithmResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAlgorithmResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("InferUserConfigMap")
        public String inferUserConfigMap;

        @NameInMap("Name")
        public String name;

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
