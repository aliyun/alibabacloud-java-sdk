// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListApplicationCenterServiceInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListApplicationCenterServiceInstancesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0a981dd515966966104121683d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListApplicationCenterServiceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationCenterServiceInstancesResponseBody self = new ListApplicationCenterServiceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationCenterServiceInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApplicationCenterServiceInstancesResponseBody setData(ListApplicationCenterServiceInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListApplicationCenterServiceInstancesResponseBodyData getData() {
        return this.data;
    }

    public ListApplicationCenterServiceInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListApplicationCenterServiceInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationCenterServiceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationCenterServiceInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListApplicationCenterServiceInstancesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-10-28T02:18:51Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>tftestacc54</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>si-2063aea4b23b4781a26b</p>
         */
        @NameInMap("ServiceInstanceId")
        public String serviceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <strong>example:</strong>
         * <p>Dify HA</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances self = new ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances();
            return TeaModel.build(map, self);
        }

        public ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances setServiceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        public ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

    public static class ListApplicationCenterServiceInstancesResponseBodyData extends TeaModel {
        @NameInMap("ServiceInstances")
        public java.util.List<ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances> serviceInstances;

        public static ListApplicationCenterServiceInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationCenterServiceInstancesResponseBodyData self = new ListApplicationCenterServiceInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListApplicationCenterServiceInstancesResponseBodyData setServiceInstances(java.util.List<ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances> serviceInstances) {
            this.serviceInstances = serviceInstances;
            return this;
        }
        public java.util.List<ListApplicationCenterServiceInstancesResponseBodyDataServiceInstances> getServiceInstances() {
            return this.serviceInstances;
        }

    }

}
