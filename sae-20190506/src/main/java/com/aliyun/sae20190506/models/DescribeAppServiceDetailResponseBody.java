// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeAppServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAppServiceDetailResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("MethodController")
        public String methodController;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameDetail")
        public String nameDetail;

        @NameInMap("ParameterDefinitions")
        public java.util.List<DescribeAppServiceDetailResponseBodyDataMethodsParameterDefinitions> parameterDefinitions;

        @NameInMap("ParameterDetails")
        public java.util.List<String> parameterDetails;

        @NameInMap("ParameterTypes")
        public java.util.List<String> parameterTypes;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        @NameInMap("RequestMethods")
        public java.util.List<String> requestMethods;

        @NameInMap("ReturnDetails")
        public String returnDetails;

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
        @NameInMap("DubboApplicationName")
        public String dubboApplicationName;

        @NameInMap("EdasAppName")
        public String edasAppName;

        @NameInMap("Group")
        public String group;

        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        @NameInMap("Methods")
        public java.util.List<DescribeAppServiceDetailResponseBodyDataMethods> methods;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SpringApplicationName")
        public String springApplicationName;

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
