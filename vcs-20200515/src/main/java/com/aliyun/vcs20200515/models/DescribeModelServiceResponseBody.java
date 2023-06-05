// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeModelServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceResponseBody self = new DescribeModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeModelServiceResponseBody setData(DescribeModelServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeModelServiceResponseBodyData getData() {
        return this.data;
    }

    public DescribeModelServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModelServiceResponseBodyDataModelApiList extends TeaModel {
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

        public static DescribeModelServiceResponseBodyDataModelApiList build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServiceResponseBodyDataModelApiList self = new DescribeModelServiceResponseBodyDataModelApiList();
            return TeaModel.build(map, self);
        }

        public DescribeModelServiceResponseBodyDataModelApiList setAlgorithmApiCode(String algorithmApiCode) {
            this.algorithmApiCode = algorithmApiCode;
            return this;
        }
        public String getAlgorithmApiCode() {
            return this.algorithmApiCode;
        }

        public DescribeModelServiceResponseBodyDataModelApiList setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeModelServiceResponseBodyDataModelApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeModelServiceResponseBodyDataModelApiList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public DescribeModelServiceResponseBodyDataModelApiList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeModelServiceResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModelApiList")
        public java.util.List<DescribeModelServiceResponseBodyDataModelApiList> modelApiList;

        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceInstanceName")
        public String modelServiceInstanceName;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        /**
         * <p>Qps。</p>
         */
        @NameInMap("Qps")
        public Long qps;

        public static DescribeModelServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServiceResponseBodyData self = new DescribeModelServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeModelServiceResponseBodyData setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public DescribeModelServiceResponseBodyData setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public DescribeModelServiceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeModelServiceResponseBodyData setModelApiList(java.util.List<DescribeModelServiceResponseBodyDataModelApiList> modelApiList) {
            this.modelApiList = modelApiList;
            return this;
        }
        public java.util.List<DescribeModelServiceResponseBodyDataModelApiList> getModelApiList() {
            return this.modelApiList;
        }

        public DescribeModelServiceResponseBodyData setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public DescribeModelServiceResponseBodyData setModelServiceInstanceName(String modelServiceInstanceName) {
            this.modelServiceInstanceName = modelServiceInstanceName;
            return this;
        }
        public String getModelServiceInstanceName() {
            return this.modelServiceInstanceName;
        }

        public DescribeModelServiceResponseBodyData setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public DescribeModelServiceResponseBodyData setQps(Long qps) {
            this.qps = qps;
            return this;
        }
        public Long getQps() {
            return this.qps;
        }

    }

}
