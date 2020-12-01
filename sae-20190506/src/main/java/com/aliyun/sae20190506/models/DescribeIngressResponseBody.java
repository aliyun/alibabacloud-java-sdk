// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Data")
    @Validation(required = true)
    public DescribeIngressResponseBodyData data;

    public static DescribeIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressResponseBody self = new DescribeIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIngressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIngressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIngressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeIngressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeIngressResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeIngressResponseBody setData(DescribeIngressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeIngressResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeIngressResponseBodyDataRules extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("ContainerPort")
        @Validation(required = true)
        public Integer containerPort;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        public static DescribeIngressResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyDataRules self = new DescribeIngressResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyDataRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeIngressResponseBodyDataRules setContainerPort(Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Integer getContainerPort() {
            return this.containerPort;
        }

        public DescribeIngressResponseBodyDataRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeIngressResponseBodyDataRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeIngressResponseBodyDataRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class DescribeIngressResponseBodyDataDefaultRule extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("ContainerPort")
        @Validation(required = true)
        public Integer containerPort;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        public static DescribeIngressResponseBodyDataDefaultRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyDataDefaultRule self = new DescribeIngressResponseBodyDataDefaultRule();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyDataDefaultRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeIngressResponseBodyDataDefaultRule setContainerPort(Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Integer getContainerPort() {
            return this.containerPort;
        }

        public DescribeIngressResponseBodyDataDefaultRule setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class DescribeIngressResponseBodyData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NamespaceId")
        @Validation(required = true)
        public String namespaceId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SlbId")
        @Validation(required = true)
        public String slbId;

        @NameInMap("ListenerPort")
        @Validation(required = true)
        public Integer listenerPort;

        @NameInMap("CertId")
        @Validation(required = true)
        public String certId;

        @NameInMap("SlbType")
        @Validation(required = true)
        public String slbType;

        @NameInMap("Rules")
        @Validation(required = true)
        public java.util.List<DescribeIngressResponseBodyDataRules> rules;

        @NameInMap("DefaultRule")
        @Validation(required = true)
        public DescribeIngressResponseBodyDataDefaultRule defaultRule;

        public static DescribeIngressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyData self = new DescribeIngressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeIngressResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIngressResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeIngressResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIngressResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public DescribeIngressResponseBodyData setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeIngressResponseBodyData setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeIngressResponseBodyData setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

        public DescribeIngressResponseBodyData setRules(java.util.List<DescribeIngressResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeIngressResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public DescribeIngressResponseBodyData setDefaultRule(DescribeIngressResponseBodyDataDefaultRule defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }
        public DescribeIngressResponseBodyDataDefaultRule getDefaultRule() {
            return this.defaultRule;
        }

    }

}
