// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceListResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public DescribeModelServiceListResponseBodyData data;

    public static DescribeModelServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceListResponseBody self = new DescribeModelServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelServiceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeModelServiceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeModelServiceListResponseBody setData(DescribeModelServiceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeModelServiceListResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeModelServiceListResponseBodyDataModelList extends TeaModel {
        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("ModelServiceName")
        public String modelServiceName;

        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("QpsRequired")
        public Integer qpsRequired;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AppCode")
        public String appCode;

        public static DescribeModelServiceListResponseBodyDataModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServiceListResponseBodyDataModelList self = new DescribeModelServiceListResponseBodyDataModelList();
            return TeaModel.build(map, self);
        }

        public DescribeModelServiceListResponseBodyDataModelList setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public DescribeModelServiceListResponseBodyDataModelList setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public DescribeModelServiceListResponseBodyDataModelList setModelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        public DescribeModelServiceListResponseBodyDataModelList setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public DescribeModelServiceListResponseBodyDataModelList setQpsRequired(Integer qpsRequired) {
            this.qpsRequired = qpsRequired;
            return this;
        }
        public Integer getQpsRequired() {
            return this.qpsRequired;
        }

        public DescribeModelServiceListResponseBodyDataModelList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeModelServiceListResponseBodyDataModelList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

    }

    public static class DescribeModelServiceListResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public String total;

        @NameInMap("ModelList")
        public java.util.List<DescribeModelServiceListResponseBodyDataModelList> modelList;

        public static DescribeModelServiceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServiceListResponseBodyData self = new DescribeModelServiceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeModelServiceListResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

        public DescribeModelServiceListResponseBodyData setModelList(java.util.List<DescribeModelServiceListResponseBodyDataModelList> modelList) {
            this.modelList = modelList;
            return this;
        }
        public java.util.List<DescribeModelServiceListResponseBodyDataModelList> getModelList() {
            return this.modelList;
        }

    }

}
