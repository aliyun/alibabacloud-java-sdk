// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or a POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The request is invalid.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of services.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppServicesResponseBodyData> data;

    /**
     * <p>The error code. This parameter is returned only if the request fails. For more information, see the <strong>Error codes</strong> section.</p>
     * <ul>
     * <li><p>Successful requests do not return the <strong>ErrorCode</strong> field.</p>
     * </li>
     * <li><p>Failed requests return the <strong>ErrorCode</strong> field. For more information, see the <strong>error code</strong> list in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The response message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error message is returned.</p>
     * </li>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID. You can use this ID to query the details of a call.</p>
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
         * <p>The app ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of instances of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public String instanceCount;

        /**
         * <p>The ID of the namespace that contains the app.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>Test namespace</p>
         */
        @NameInMap("NamespaceName")
        public String namespaceName;

        /**
         * <p>The type of the service registry. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: SAE Nacos</p>
         * </li>
         * <li><p><strong>1</strong>: self-managed registry</p>
         * </li>
         * <li><p><strong>2</strong>: MSE Nacos</p>
         * </li>
         * <li><p><strong>9</strong>: SAE K8s Service</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The service group.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("ServiceGroup")
        public String serviceGroup;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>frontend</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>A map of ports and protocols.</p>
         */
        @NameInMap("ServicePortAndProtocol")
        public java.util.Map<String, String> servicePortAndProtocol;

        /**
         * <p>A list of ports.</p>
         */
        @NameInMap("ServicePorts")
        public java.util.List<Integer> servicePorts;

        /**
         * <p>The protocol used by the service.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li><p><strong>dubbo</strong></p>
         * </li>
         * <li><p><strong>springCloud</strong></p>
         * </li>
         * <li><p><strong>hsf</strong></p>
         * </li>
         * <li><p><strong>k8sService</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The version of the service.</p>
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
