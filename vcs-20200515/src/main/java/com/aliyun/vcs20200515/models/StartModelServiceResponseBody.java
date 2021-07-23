// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartModelServiceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public StartModelServiceResponseBodyData data;

    public static StartModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartModelServiceResponseBody self = new StartModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartModelServiceResponseBody setData(StartModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartModelServiceResponseBodyData getData() {
        return this.data;
    }

    public static class StartModelServiceResponseBodyData extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("ModelServiceInstanceName")
        public Integer modelServiceInstanceName;

        public static StartModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartModelServiceResponseBodyData self = new StartModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public StartModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public StartModelServiceResponseBodyData setModelServiceInstanceName(Integer modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public Integer getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

    }

}
