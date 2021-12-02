// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    @NameInMap("ClusterIP")
    public String clusterIP;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListServicesResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setClusterIP(String clusterIP) {
        this.clusterIP = clusterIP;
        return this;
    }
    public String getClusterIP() {
        return this.clusterIP;
    }

    public ListServicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListServicesResponseBody setData(java.util.List<ListServicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListServicesResponseBodyData> getData() {
        return this.data;
    }

    public ListServicesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListServicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListServicesResponseBodyDataPortMappings extends TeaModel {
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

        public static ListServicesResponseBodyDataPortMappings build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyDataPortMappings self = new ListServicesResponseBodyDataPortMappings();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyDataPortMappings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesResponseBodyDataPortMappings setNodePort(Integer nodePort) {
            this.nodePort = nodePort;
            return this;
        }
        public Integer getNodePort() {
            return this.nodePort;
        }

        public ListServicesResponseBodyDataPortMappings setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListServicesResponseBodyDataPortMappings setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListServicesResponseBodyDataPortMappings setTargetPort(String targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public String getTargetPort() {
            return this.targetPort;
        }

    }

    public static class ListServicesResponseBodyData extends TeaModel {
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
        public java.util.List<ListServicesResponseBodyDataPortMappings> portMappings;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("ServiceType")
        public String serviceType;

        public static ListServicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyData self = new ListServicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public ListServicesResponseBodyData setClusterIP(String clusterIP) {
            this.clusterIP = clusterIP;
            return this;
        }
        public String getClusterIP() {
            return this.clusterIP;
        }

        public ListServicesResponseBodyData setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public ListServicesResponseBodyData setHeadless(Boolean headless) {
            this.headless = headless;
            return this;
        }
        public Boolean getHeadless() {
            return this.headless;
        }

        public ListServicesResponseBodyData setK8sServiceId(String k8sServiceId) {
            this.k8sServiceId = k8sServiceId;
            return this;
        }
        public String getK8sServiceId() {
            return this.k8sServiceId;
        }

        public ListServicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServicesResponseBodyData setPortMappings(java.util.List<ListServicesResponseBodyDataPortMappings> portMappings) {
            this.portMappings = portMappings;
            return this;
        }
        public java.util.List<ListServicesResponseBodyDataPortMappings> getPortMappings() {
            return this.portMappings;
        }

        public ListServicesResponseBodyData setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public ListServicesResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

    }

}
