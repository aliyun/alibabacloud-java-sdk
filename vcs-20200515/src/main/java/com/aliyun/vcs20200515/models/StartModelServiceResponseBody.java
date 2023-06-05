// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StartModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StartModelServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StartModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartModelServiceResponseBody self = new StartModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartModelServiceResponseBody setData(StartModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartModelServiceResponseBodyData getData() {
        return this.data;
    }

    public StartModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartModelServiceResponseBodyData extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        public Integer modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

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

        public StartModelServiceResponseBodyData setModelServiceInstanceName(Integer modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public Integer getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

        public StartModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

    }

}
