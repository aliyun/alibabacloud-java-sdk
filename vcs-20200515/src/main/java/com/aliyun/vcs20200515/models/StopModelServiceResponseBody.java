// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public StopModelServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StopModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopModelServiceResponseBody self = new StopModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopModelServiceResponseBody setData(StopModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopModelServiceResponseBodyData getData() {
        return this.data;
    }

    public StopModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StopModelServiceResponseBodyData extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        public Integer modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        public static StopModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopModelServiceResponseBodyData self = new StopModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public StopModelServiceResponseBodyData setModelServiceInstanceName(Integer modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public Integer getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

        public StopModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

    }

}
