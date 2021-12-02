// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeServiceDetailResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeServiceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDetailResponseBody self = new DescribeServiceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeServiceDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeServiceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceDetailResponseBody setResult(DescribeServiceDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeServiceDetailResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeServiceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeServiceDetailResponseBodyResultPortMappings extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NodePort")
        public Integer nodePort;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TargetPort")
        public String targetPort;

        public static DescribeServiceDetailResponseBodyResultPortMappings build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceDetailResponseBodyResultPortMappings self = new DescribeServiceDetailResponseBodyResultPortMappings();
            return TeaModel.build(map, self);
        }

        public DescribeServiceDetailResponseBodyResultPortMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceDetailResponseBodyResultPortMappings setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

        public DescribeServiceDetailResponseBodyResultPortMappings setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeServiceDetailResponseBodyResultPortMappings setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeServiceDetailResponseBodyResultPortMappings setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

    public static class DescribeServiceDetailResponseBodyResult extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("ClusterIP")
        public String clusterIP;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("Headless")
        public Boolean headless;

        @NameInMap("K8sServiceId")
        public String k8sServiceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("PortMappings")
        public java.util.List<DescribeServiceDetailResponseBodyResultPortMappings> portMappings;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("ServiceType")
        public String serviceType;

        public static DescribeServiceDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceDetailResponseBodyResult self = new DescribeServiceDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeServiceDetailResponseBodyResult setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeServiceDetailResponseBodyResult setClusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }
        public String getClusterIP() {
            return this.clusterIP;
        }

        public DescribeServiceDetailResponseBodyResult setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public DescribeServiceDetailResponseBodyResult setHeadless(Boolean headless) {
            this.headless = headless;
            return this;
        }
        public Boolean getHeadless() {
            return this.headless;
        }

        public DescribeServiceDetailResponseBodyResult setK8sServiceId(String k8sServiceId) {
            this.k8sServiceId = k8sServiceId;
            return this;
        }
        public String getK8sServiceId() {
            return this.k8sServiceId;
        }

        public DescribeServiceDetailResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeServiceDetailResponseBodyResult setPortMappings(java.util.List<DescribeServiceDetailResponseBodyResultPortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }
        public java.util.List<DescribeServiceDetailResponseBodyResultPortMappings> getPortMappings() {
            return this.portMappings;
        }

        public DescribeServiceDetailResponseBodyResult setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public DescribeServiceDetailResponseBodyResult setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
