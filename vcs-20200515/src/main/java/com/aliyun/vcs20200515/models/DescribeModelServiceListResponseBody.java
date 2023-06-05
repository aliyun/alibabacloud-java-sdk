// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeModelServiceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeModelServiceListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModelServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceListResponseBody self = new DescribeModelServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeModelServiceListResponseBody setData(DescribeModelServiceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeModelServiceListResponseBodyData getData() {
        return this.data;
    }

    public DescribeModelServiceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeModelServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModelServiceListResponseBodyDataModelList extends TeaModel {
        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModelServiceInstanceId")
        public String modelServiceInstanceId;

        @NameInMap("ModelServiceName")
        public String modelServiceName;

        @NameInMap("ModelServiceStatus")
        public String modelServiceStatus;

        @NameInMap("QpsRequired")
        public Integer qpsRequired;

        public static DescribeModelServiceListResponseBodyDataModelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServiceListResponseBodyDataModelList self = new DescribeModelServiceListResponseBodyDataModelList();
            return TeaModel.build(map, self);
        }

        public DescribeModelServiceListResponseBodyDataModelList setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public DescribeModelServiceListResponseBodyDataModelList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public DescribeModelServiceListResponseBodyDataModelList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeModelServiceListResponseBodyDataModelList setModelServiceInstanceId(String modelServiceInstanceId) {
            this.modelServiceInstanceId = modelServiceInstanceId;
            return this;
        }
        public String getModelServiceInstanceId() {
            return this.modelServiceInstanceId;
        }

        public DescribeModelServiceListResponseBodyDataModelList setModelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }
        public String getModelServiceName() {
            return this.modelServiceName;
        }

        public DescribeModelServiceListResponseBodyDataModelList setModelServiceStatus(String modelServiceStatus) {
            this.modelServiceStatus = modelServiceStatus;
            return this;
        }
        public String getModelServiceStatus() {
            return this.modelServiceStatus;
        }

        public DescribeModelServiceListResponseBodyDataModelList setQpsRequired(Integer qpsRequired) {
            this.qpsRequired = qpsRequired;
            return this;
        }
        public Integer getQpsRequired() {
            return this.qpsRequired;
        }

    }

    public static class DescribeModelServiceListResponseBodyData extends TeaModel {
        @NameInMap("ModelList")
        public java.util.List<DescribeModelServiceListResponseBodyDataModelList> modelList;

        @NameInMap("Total")
        public String total;

        public static DescribeModelServiceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeModelServiceListResponseBodyData self = new DescribeModelServiceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeModelServiceListResponseBodyData setModelList(java.util.List<DescribeModelServiceListResponseBodyDataModelList> modelList) {
            this.modelList = modelList;
            return this;
        }
        public java.util.List<DescribeModelServiceListResponseBodyDataModelList> getModelList() {
            return this.modelList;
        }

        public DescribeModelServiceListResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
