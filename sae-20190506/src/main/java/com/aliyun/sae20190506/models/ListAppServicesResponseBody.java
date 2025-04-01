// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the microservice.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppServicesResponseBodyData> data;

    /**
     * <p>The status code. Valid values:</p>
     * <ul>
     * <li>If the request was successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request failed, <strong>ErrorCode</strong> is returned. For more information, see <strong>Error codes</strong> in this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. Valid values:</p>
     * <ul>
     * <li>If the request was successful, <strong>success</strong> is returned.</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListAppServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesResponseBody self = new ListAppServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppServicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppServicesResponseBody setData(java.util.List<ListAppServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListAppServicesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppServicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppServicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppServicesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListAppServicesResponseBodyData extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of instances of the microservice.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public String instanceCount;

        /**
         * <p>The ID of the namespace to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The registry type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>：SAE Nacos</li>
         * <li><strong>1</strong>: SAE built-in Nacos</li>
         * <li><strong>2</strong>: MSE Nacos</li>
         * <li><strong>9</strong>: SAE Kubernets service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The IDs of the security groups.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The group to which the microservice belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("ServiceGroup")
        public String serviceGroup;

        /**
         * <p>The name of the microservice.</p>
         * 
         * <strong>example:</strong>
         * <p>frontend</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The ports and protocols.</p>
         */
        @NameInMap("ServicePortAndProtocol")
        public java.util.Map<String, String> servicePortAndProtocol;

        /**
         * <p>The list of ports.</p>
         */
        @NameInMap("ServicePorts")
        public java.util.List<Integer> servicePorts;

        /**
         * <p>The protocol used by the microservice.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The type of the microservice. Valid values:</p>
         * <ul>
         * <li><strong>dubbo</strong></li>
         * <li><strong>springCloud</strong></li>
         * <li><strong>hsf</strong></li>
         * <li><strong>k8sService</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The version of the microservice.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("ServiceVersion")
        public String serviceVersion;

        public static ListAppServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppServicesResponseBodyData self = new ListAppServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppServicesResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppServicesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppServicesResponseBodyData setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

        public ListAppServicesResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListAppServicesResponseBodyData setNamespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public ListAppServicesResponseBodyData setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public ListAppServicesResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListAppServicesResponseBodyData setServiceGroup(String serviceGroup) {
            this.serviceGroup = serviceGroup;
            return this;
        }
        public String getServiceGroup() {
            return this.serviceGroup;
        }

        public ListAppServicesResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAppServicesResponseBodyData setServicePortAndProtocol(java.util.Map<String, String> servicePortAndProtocol) {
            this.servicePortAndProtocol = servicePortAndProtocol;
            return this;
        }
        public java.util.Map<String, String> getServicePortAndProtocol() {
            return this.servicePortAndProtocol;
        }

        public ListAppServicesResponseBodyData setServicePorts(java.util.List<Integer> servicePorts) {
            this.servicePorts = servicePorts;
            return this;
        }
        public java.util.List<Integer> getServicePorts() {
            return this.servicePorts;
        }

        public ListAppServicesResponseBodyData setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public ListAppServicesResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public ListAppServicesResponseBodyData setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

    }

}
