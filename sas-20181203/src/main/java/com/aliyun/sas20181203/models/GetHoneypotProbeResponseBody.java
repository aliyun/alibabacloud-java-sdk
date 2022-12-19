// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotProbeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHoneypotProbeResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetHoneypotProbeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotProbeResponseBody self = new GetHoneypotProbeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHoneypotProbeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHoneypotProbeResponseBody setData(GetHoneypotProbeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHoneypotProbeResponseBodyData getData() {
        return this.data;
    }

    public GetHoneypotProbeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetHoneypotProbeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHoneypotProbeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHoneypotProbeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHoneypotProbeResponseBodyDataControlNode extends TeaModel {
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        public static GetHoneypotProbeResponseBodyDataControlNode build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotProbeResponseBodyDataControlNode self = new GetHoneypotProbeResponseBodyDataControlNode();
            return TeaModel.build(map, self);
        }

        public GetHoneypotProbeResponseBodyDataControlNode setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public GetHoneypotProbeResponseBodyDataControlNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetHoneypotProbeResponseBodyDataControlNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Ports")
        public String ports;

        @NameInMap("ProbeId")
        public String probeId;

        @NameInMap("ServiceIpList")
        public java.util.List<String> serviceIpList;

        @NameInMap("Status")
        public Integer status;

        public static GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort self = new GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort();
            return TeaModel.build(map, self);
        }

        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort setProbeId(String probeId) {
            this.probeId = probeId;
            return this;
        }
        public String getProbeId() {
            return this.probeId;
        }

        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort setServiceIpList(java.util.List<String> serviceIpList) {
            this.serviceIpList = serviceIpList;
            return this;
        }
        public java.util.List<String> getServiceIpList() {
            return this.serviceIpList;
        }

        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList extends TeaModel {
        @NameInMap("BindPort")
        public Boolean bindPort;

        @NameInMap("EndPort")
        public Integer endPort;

        @NameInMap("Err")
        public String err;

        @NameInMap("Fixed")
        public Boolean fixed;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("StartPort")
        public Integer startPort;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TargetPort")
        public Integer targetPort;

        public static GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList self = new GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList();
            return TeaModel.build(map, self);
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setBindPort(Boolean bindPort) {
            this.bindPort = bindPort;
            return this;
        }
        public Boolean getBindPort() {
            return this.bindPort;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setEndPort(Integer endPort) {
            this.endPort = endPort;
            return this;
        }
        public Integer getEndPort() {
            return this.endPort;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setErr(String err) {
            this.err = err;
            return this;
        }
        public String getErr() {
            return this.err;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setStartPort(Integer startPort) {
            this.startPort = startPort;
            return this;
        }
        public Integer getStartPort() {
            return this.startPort;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class GetHoneypotProbeResponseBodyDataHoneypotProbeBindList extends TeaModel {
        @NameInMap("BindId")
        public String bindId;

        @NameInMap("BindPortList")
        public java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList> bindPortList;

        @NameInMap("HoneypotId")
        public String honeypotId;

        @NameInMap("ServiceIpList")
        public java.util.List<String> serviceIpList;

        @NameInMap("Status")
        public Integer status;

        public static GetHoneypotProbeResponseBodyDataHoneypotProbeBindList build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotProbeResponseBodyDataHoneypotProbeBindList self = new GetHoneypotProbeResponseBodyDataHoneypotProbeBindList();
            return TeaModel.build(map, self);
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindList setBindId(String bindId) {
            this.bindId = bindId;
            return this;
        }
        public String getBindId() {
            return this.bindId;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindList setBindPortList(java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList> bindPortList) {
            this.bindPortList = bindPortList;
            return this;
        }
        public java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList> getBindPortList() {
            return this.bindPortList;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindList setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindList setServiceIpList(java.util.List<String> serviceIpList) {
            this.serviceIpList = serviceIpList;
            return this;
        }
        public java.util.List<String> getServiceIpList() {
            return this.serviceIpList;
        }

        public GetHoneypotProbeResponseBodyDataHoneypotProbeBindList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetHoneypotProbeResponseBodyData extends TeaModel {
        @NameInMap("Arp")
        public Boolean arp;

        @NameInMap("CanListenIpList")
        public java.util.List<String> canListenIpList;

        @NameInMap("CidrList")
        public java.util.List<String> cidrList;

        @NameInMap("ControlNode")
        public GetHoneypotProbeResponseBodyDataControlNode controlNode;

        @NameInMap("CpuLoad")
        public Double cpuLoad;

        @NameInMap("DeployTime")
        public Long deployTime;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("HoneyPotProbeScanPort")
        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort honeyPotProbeScanPort;

        @NameInMap("HoneypotProbeBindList")
        public java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindList> honeypotProbeBindList;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("ListenIpList")
        public java.util.List<String> listenIpList;

        @NameInMap("MemoryLoad")
        public Double memoryLoad;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("Ping")
        public Boolean ping;

        @NameInMap("ProbeId")
        public String probeId;

        @NameInMap("ProbeType")
        public String probeType;

        @NameInMap("ProbeVersion")
        public String probeVersion;

        @NameInMap("ProxyIp")
        public String proxyIp;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetHoneypotProbeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHoneypotProbeResponseBodyData self = new GetHoneypotProbeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHoneypotProbeResponseBodyData setArp(Boolean arp) {
            this.arp = arp;
            return this;
        }
        public Boolean getArp() {
            return this.arp;
        }

        public GetHoneypotProbeResponseBodyData setCanListenIpList(java.util.List<String> canListenIpList) {
            this.canListenIpList = canListenIpList;
            return this;
        }
        public java.util.List<String> getCanListenIpList() {
            return this.canListenIpList;
        }

        public GetHoneypotProbeResponseBodyData setCidrList(java.util.List<String> cidrList) {
            this.cidrList = cidrList;
            return this;
        }
        public java.util.List<String> getCidrList() {
            return this.cidrList;
        }

        public GetHoneypotProbeResponseBodyData setControlNode(GetHoneypotProbeResponseBodyDataControlNode controlNode) {
            this.controlNode = controlNode;
            return this;
        }
        public GetHoneypotProbeResponseBodyDataControlNode getControlNode() {
            return this.controlNode;
        }

        public GetHoneypotProbeResponseBodyData setCpuLoad(Double cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }
        public Double getCpuLoad() {
            return this.cpuLoad;
        }

        public GetHoneypotProbeResponseBodyData setDeployTime(Long deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public Long getDeployTime() {
            return this.deployTime;
        }

        public GetHoneypotProbeResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetHoneypotProbeResponseBodyData setHoneyPotProbeScanPort(GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort honeyPotProbeScanPort) {
            this.honeyPotProbeScanPort = honeyPotProbeScanPort;
            return this;
        }
        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort getHoneyPotProbeScanPort() {
            return this.honeyPotProbeScanPort;
        }

        public GetHoneypotProbeResponseBodyData setHoneypotProbeBindList(java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindList> honeypotProbeBindList) {
            this.honeypotProbeBindList = honeypotProbeBindList;
            return this;
        }
        public java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindList> getHoneypotProbeBindList() {
            return this.honeypotProbeBindList;
        }

        public GetHoneypotProbeResponseBodyData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public GetHoneypotProbeResponseBodyData setListenIpList(java.util.List<String> listenIpList) {
            this.listenIpList = listenIpList;
            return this;
        }
        public java.util.List<String> getListenIpList() {
            return this.listenIpList;
        }

        public GetHoneypotProbeResponseBodyData setMemoryLoad(Double memoryLoad) {
            this.memoryLoad = memoryLoad;
            return this;
        }
        public Double getMemoryLoad() {
            return this.memoryLoad;
        }

        public GetHoneypotProbeResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetHoneypotProbeResponseBodyData setPing(Boolean ping) {
            this.ping = ping;
            return this;
        }
        public Boolean getPing() {
            return this.ping;
        }

        public GetHoneypotProbeResponseBodyData setProbeId(String probeId) {
            this.probeId = probeId;
            return this;
        }
        public String getProbeId() {
            return this.probeId;
        }

        public GetHoneypotProbeResponseBodyData setProbeType(String probeType) {
            this.probeType = probeType;
            return this;
        }
        public String getProbeType() {
            return this.probeType;
        }

        public GetHoneypotProbeResponseBodyData setProbeVersion(String probeVersion) {
            this.probeVersion = probeVersion;
            return this;
        }
        public String getProbeVersion() {
            return this.probeVersion;
        }

        public GetHoneypotProbeResponseBodyData setProxyIp(String proxyIp) {
            this.proxyIp = proxyIp;
            return this;
        }
        public String getProxyIp() {
            return this.proxyIp;
        }

        public GetHoneypotProbeResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetHoneypotProbeResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetHoneypotProbeResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
