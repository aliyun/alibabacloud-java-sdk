// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeAppServiceDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>- **2xx**: indicates that the call was successful.</p>
     * <p>- **3xx**: indicates that the call was redirected.</p>
     * <p>- **4xx**: indicates that the call failed.</p>
     * <p>- **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeAppServiceDetailResponseBodyData data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <br>
     * <p>- If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>- If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the meta data was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The metadata was obtained.</p>
     * <p>*   **false**: The metadata failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. The ID is used to query the details of a request.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeAppServiceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceDetailResponseBody self = new DescribeAppServiceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppServiceDetailResponseBody setData(DescribeAppServiceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAppServiceDetailResponseBodyData getData() {
        return this.data;
    }

    public DescribeAppServiceDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeAppServiceDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppServiceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppServiceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAppServiceDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions extends TeaModel {
        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions self = new DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions();
            return TeaModel.build(map, self);
        }

        public DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeAppServiceDetailResponseBodyDataMethods extends TeaModel {
        /**
         * <p>The class to which the method belongs.</p>
         */
        @NameInMap("MethodController")
        public String methodController;

        /**
         * <p>The name of the method.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The details of the method.</p>
         */
        @NameInMap("NameDetail")
        public String nameDetail;

        /**
         * <p>The definition of the parameter.</p>
         */
        @NameInMap("ParameterDefinitions")
        public java.util.List<DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions> parameterDefinitions;

        /**
         * <p>The details of the parameters.</p>
         */
        @NameInMap("ParameterDetails")
        public java.util.List<String> parameterDetails;

        /**
         * <p>The types of the parameters.</p>
         */
        @NameInMap("ParameterTypes")
        public java.util.List<String> parameterTypes;

        /**
         * <p>The request paths. Format:</p>
         * <br>
         * <p>`/path`</p>
         */
        @NameInMap("Paths")
        public java.util.List<String> paths;

        /**
         * <p>The request methods. Valid values:</p>
         * <br>
         * <p>*   **GET**</p>
         * <p>*   **ALL**</p>
         */
        @NameInMap("RequestMethods")
        public java.util.List<String> requestMethods;

        /**
         * <p>The details of the response.</p>
         */
        @NameInMap("ReturnDetails")
        public String returnDetails;

        /**
         * <p>The data format of the response.</p>
         */
        @NameInMap("ReturnType")
        public String returnType;

        public static DescribeAppServiceDetailResponseBodyDataMethods build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppServiceDetailResponseBodyDataMethods self = new DescribeAppServiceDetailResponseBodyDataMethods();
            return TeaModel.build(map, self);
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setMethodController(String methodController) {
            this.methodController = methodController;
            return this;
        }
        public String getMethodController() {
            return this.methodController;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setNameDetail(String nameDetail) {
            this.nameDetail = nameDetail;
            return this;
        }
        public String getNameDetail() {
            return this.nameDetail;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setParameterDefinitions(java.util.List<DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions> parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public java.util.List<DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setParameterDetails(java.util.List<String> parameterDetails) {
            this.parameterDetails = parameterDetails;
            return this;
        }
        public java.util.List<String> getParameterDetails() {
            return this.parameterDetails;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setParameterTypes(java.util.List<String> parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public java.util.List<String> getParameterTypes() {
            return this.parameterTypes;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setRequestMethods(java.util.List<String> requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public java.util.List<String> getRequestMethods() {
            return this.requestMethods;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setReturnDetails(String returnDetails) {
            this.returnDetails = returnDetails;
            return this;
        }
        public String getReturnDetails() {
            return this.returnDetails;
        }

        public DescribeAppServiceDetailResponseBodyDataMethods setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

    }

    public static class DescribeAppServiceDetailResponseBodyData extends TeaModel {
        /**
         * <p>The name of the Dubbo application.</p>
         */
        @NameInMap("DubboApplicationName")
        public String dubboApplicationName;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("EdasAppName")
        public String edasAppName;

        /**
         * <p>The group to which the service belongs. You can create a custom group.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The metadata. Example: `{side: "provider", port: "18081", preserved: {register: {source: "SPRING_CLOUD"}},…}`.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The methods.</p>
         */
        @NameInMap("Methods")
        public java.util.List<DescribeAppServiceDetailResponseBodyDataMethods> methods;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServicePorts")
        public java.util.List<Long> servicePorts;

        @NameInMap("ServiceProtocol")
        public String serviceProtocol;

        @NameInMap("ServiceTags")
        public java.util.List<String> serviceTags;

        /**
         * <p>The type of the service. Valid values:</p>
         * <br>
         * <p>*   **dubbo**</p>
         * <p>*   **springCloud**</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The name of the Spring Cloud application.</p>
         */
        @NameInMap("SpringApplicationName")
        public String springApplicationName;

        /**
         * <p>The version of the service. You can create a custom version.</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAppServiceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppServiceDetailResponseBodyData self = new DescribeAppServiceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAppServiceDetailResponseBodyData setDubboApplicationName(String dubboApplicationName) {
            this.dubboApplicationName = dubboApplicationName;
            return this;
        }
        public String getDubboApplicationName() {
            return this.dubboApplicationName;
        }

        public DescribeAppServiceDetailResponseBodyData setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public DescribeAppServiceDetailResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeAppServiceDetailResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public DescribeAppServiceDetailResponseBodyData setMethods(java.util.List<DescribeAppServiceDetailResponseBodyDataMethods> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<DescribeAppServiceDetailResponseBodyDataMethods> getMethods() {
            return this.methods;
        }

        public DescribeAppServiceDetailResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DescribeAppServiceDetailResponseBodyData setServicePorts(java.util.List<Long> servicePorts) {
            this.servicePorts = servicePorts;
            return this;
        }
        public java.util.List<Long> getServicePorts() {
            return this.servicePorts;
        }

        public DescribeAppServiceDetailResponseBodyData setServiceProtocol(String serviceProtocol) {
            this.serviceProtocol = serviceProtocol;
            return this;
        }
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public DescribeAppServiceDetailResponseBodyData setServiceTags(java.util.List<String> serviceTags) {
            this.serviceTags = serviceTags;
            return this;
        }
        public java.util.List<String> getServiceTags() {
            return this.serviceTags;
        }

        public DescribeAppServiceDetailResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeAppServiceDetailResponseBodyData setSpringApplicationName(String springApplicationName) {
            this.springApplicationName = springApplicationName;
            return this;
        }
        public String getSpringApplicationName() {
            return this.springApplicationName;
        }

        public DescribeAppServiceDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
