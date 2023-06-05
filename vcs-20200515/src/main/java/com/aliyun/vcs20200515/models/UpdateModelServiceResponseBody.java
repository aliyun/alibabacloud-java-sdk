// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateModelServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceResponseBody self = new UpdateModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateModelServiceResponseBody setData(UpdateModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateModelServiceResponseBodyData getData() {
        return this.data;
    }

    public UpdateModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateModelServiceResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        public String modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("QpsRequired")
        public Integer qpsRequired;

        public static UpdateModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelServiceResponseBodyData self = new UpdateModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateModelServiceResponseBodyData setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public UpdateModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public UpdateModelServiceResponseBodyData setModelServiceInstanceName(String modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public String getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

        public UpdateModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public UpdateModelServiceResponseBodyData setQpsRequired(Integer qpsRequired) {
            this.qpsRequired = qpsRequired;
            return this;
        }
        public Integer getQpsRequired() {
            return this.qpsRequired;
        }

    }

}
