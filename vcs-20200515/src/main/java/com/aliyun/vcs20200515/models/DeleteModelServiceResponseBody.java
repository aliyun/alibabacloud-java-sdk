// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteModelServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public DeleteModelServiceResponseBodyData data;

    public static DeleteModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceResponseBody self = new DeleteModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteModelServiceResponseBody setData(DeleteModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteModelServiceResponseBodyData getData() {
        return this.data;
    }

    public static class DeleteModelServiceResponseBodyData extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("ModelServiceInstanceName")
        public Integer modelServiceInstanceName;

        public static DeleteModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteModelServiceResponseBodyData self = new DeleteModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public DeleteModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public DeleteModelServiceResponseBodyData setModelServiceInstanceName(Integer modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public Integer getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

    }

}
