// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateModelServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public UpdateModelServiceResponseBodyData data;

    public static UpdateModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelServiceResponseBody self = new UpdateModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateModelServiceResponseBody setData(UpdateModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateModelServiceResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateModelServiceResponseBodyData extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("QpsRequired")
        public Integer qpsRequired;

        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("ModelServiceInstanceName")
        public String modelServiceInstanceName;

        public static UpdateModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateModelServiceResponseBodyData self = new UpdateModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
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

        public UpdateModelServiceResponseBodyData setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public UpdateModelServiceResponseBodyData setModelServiceInstanceName(String modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public String getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

    }

}
