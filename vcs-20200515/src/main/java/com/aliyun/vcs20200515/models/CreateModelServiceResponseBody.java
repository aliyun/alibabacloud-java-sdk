// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateModelServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceResponseBody self = new CreateModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateModelServiceResponseBody setData(CreateModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateModelServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateModelServiceResponseBodyDataModelApiList extends TeaModel {
        @NameInMap("AlgorithmApiCode")
        public String algorithmApiCode;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiPath")
        public String apiPath;

        @NameInMap("CreateTime")
        public String createTime;

        public static CreateModelServiceResponseBodyDataModelApiList build(java.util.Map<String, ?> map) throws Exception {
            CreateModelServiceResponseBodyDataModelApiList self = new CreateModelServiceResponseBodyDataModelApiList();
            return TeaModel.build(map, self);
        }

        public CreateModelServiceResponseBodyDataModelApiList setAlgorithmApiCode(String algorithmApiCode) {
            this.algorithmApiCode = algorithmApiCode;
            return this;
        }
        public String getAlgorithmApiCode() {
            return this.algorithmApiCode;
        }

        public CreateModelServiceResponseBodyDataModelApiList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public CreateModelServiceResponseBodyDataModelApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public CreateModelServiceResponseBodyDataModelApiList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public CreateModelServiceResponseBodyDataModelApiList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class CreateModelServiceResponseBodyData extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("ModelApiList")
        public java.util.List<CreateModelServiceResponseBodyDataModelApiList> modelApiList;

        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("QpsRequired")
        public Integer qpsRequired;

        public static CreateModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateModelServiceResponseBodyData self = new CreateModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateModelServiceResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public CreateModelServiceResponseBodyData setModelApiList(java.util.List<CreateModelServiceResponseBodyDataModelApiList> modelApiList) {
            this.modelApiList = modelApiList;
            return this;
        }
        public java.util.List<CreateModelServiceResponseBodyDataModelApiList> getModelApiList() {
            return this.modelApiList;
        }

        public CreateModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public CreateModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public CreateModelServiceResponseBodyData setQpsRequired(Integer qpsRequired) {
            this.qpsRequired = qpsRequired;
            return this;
        }
        public Integer getQpsRequired() {
            return this.qpsRequired;
        }

    }

}
