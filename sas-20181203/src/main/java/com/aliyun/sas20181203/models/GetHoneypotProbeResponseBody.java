// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotProbeResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details about the probe.</p>
     */
    @NameInMap("Data")
    public GetHoneypotProbeResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance in the management node.</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The ID of the management node.</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the management node.</p>
         */
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
        /**
         * <p>The ID of the record generated when the honeypot monitors the ports.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ports that are monitored.</p>
         */
        @NameInMap("Ports")
        public String ports;

        /**
         * <p>The ID of the probe.</p>
         */
        @NameInMap("ProbeId")
        public String probeId;

        /**
         * <p>An array consisting of the IP addresses of the sever on which the probe is installed.</p>
         */
        @NameInMap("ServiceIpList")
        public java.util.List<String> serviceIpList;

        /**
         * <p>The listening status. Valid values:</p>
         * <br>
         * <p>*   **1**: abnormal</p>
         * <p>*   **3**: normal</p>
         */
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
        /**
         * <p>Indicates whether the port is bound.</p>
         */
        @NameInMap("BindPort")
        public Boolean bindPort;

        /**
         * <p>The end port on which the probe monitors.</p>
         */
        @NameInMap("EndPort")
        public Integer endPort;

        /**
         * <p>The error that indicates a binding failure.</p>
         */
        @NameInMap("Err")
        public String err;

        /**
         * <p>Indicates whether the port is a fixed port.</p>
         */
        @NameInMap("Fixed")
        public Boolean fixed;

        /**
         * <p>The ID of the record generated when the port is bound.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The details about the error.</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The start port on which the probe monitors.</p>
         */
        @NameInMap("StartPort")
        public Integer startPort;

        /**
         * <p>The binding status. Valid values:</p>
         * <br>
         * <p>*   **1**: abnormal</p>
         * <p>*   **3**: normal</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The destination port.</p>
         */
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
        /**
         * <p>The ID of the binding record.</p>
         */
        @NameInMap("BindId")
        public String bindId;

        /**
         * <p>An array consisting of the ports that are bound.</p>
         */
        @NameInMap("BindPortList")
        public java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindListBindPortList> bindPortList;

        /**
         * <p>The ID of the honeypot.</p>
         */
        @NameInMap("HoneypotId")
        public String honeypotId;

        /**
         * <p>An array consisting of the IP addresses that are monitored.</p>
         */
        @NameInMap("ServiceIpList")
        public java.util.List<String> serviceIpList;

        /**
         * <p>The status of the service. Valid values:</p>
         * <br>
         * <p>*   **1**: abnormal</p>
         * <p>*   **3**: normal</p>
         */
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
        /**
         * <p>Indicates whether address resolution protocol (ARP) is enabled for the check item.</p>
         */
        @NameInMap("Arp")
        public Boolean arp;

        /**
         * <p>An array consisting of the IP addresses that can be monitored.</p>
         */
        @NameInMap("CanListenIpList")
        public java.util.List<String> canListenIpList;

        /**
         * <p>An array consisting of the CIDR blocks that are allowed to access the VPC probe.</p>
         */
        @NameInMap("CidrList")
        public java.util.List<String> cidrList;

        /**
         * <p>The information about the management node.</p>
         */
        @NameInMap("ControlNode")
        public GetHoneypotProbeResponseBodyDataControlNode controlNode;

        /**
         * <p>The CPU utilization.</p>
         */
        @NameInMap("CpuLoad")
        public Double cpuLoad;

        /**
         * <p>The time when the probe was deployed.</p>
         */
        @NameInMap("DeployTime")
        public Long deployTime;

        /**
         * <p>The name of the probe.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ports that the honeypot monitors.</p>
         */
        @NameInMap("HoneyPotProbeScanPort")
        public GetHoneypotProbeResponseBodyDataHoneyPotProbeScanPort honeyPotProbeScanPort;

        /**
         * <p>The list of honeypots to which the probe forwards traffic.</p>
         */
        @NameInMap("HoneypotProbeBindList")
        public java.util.List<GetHoneypotProbeResponseBodyDataHoneypotProbeBindList> honeypotProbeBindList;

        /**
         * <p>The IP address of the server on which the host probe is installed.</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>An array consisting of the IP addresses that can be monitored.</p>
         */
        @NameInMap("ListenIpList")
        public java.util.List<String> listenIpList;

        /**
         * <p>The memory usage.</p>
         */
        @NameInMap("MemoryLoad")
        public Double memoryLoad;

        /**
         * <p>The operating system type of the server on which the probe is installed. Valid values:</p>
         * <br>
         * <p>*   windows</p>
         * <p>*   linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>Indicates whether ping is enabled for the check item.</p>
         */
        @NameInMap("Ping")
        public Boolean ping;

        /**
         * <p>The ID of the probe.</p>
         */
        @NameInMap("ProbeId")
        public String probeId;

        /**
         * <p>The type of the probe. Valid values:</p>
         * <br>
         * <p>*   **host_probe**: host probe</p>
         * <p>*   **vpc_black_hole_probe**: virtual private cloud (VPC) probe</p>
         */
        @NameInMap("ProbeType")
        public String probeType;

        /**
         * <p>The version of the probe.</p>
         */
        @NameInMap("ProbeVersion")
        public String probeVersion;

        /**
         * <p>The IP address of the proxy server.</p>
         */
        @NameInMap("ProxyIp")
        public String proxyIp;

        /**
         * <p>The status of the probe. Valid values:</p>
         * <br>
         * <p>*   **installed**: installed</p>
         * <p>*   **install_failed**: installation failed</p>
         * <p>*   **online**: online</p>
         * <p>*   **offline**: offline</p>
         * <p>*   **unnormal**: abnormal</p>
         * <p>*   **unprobe**: unauthorized</p>
         * <p>*   **uninstalling**: being uninstalled</p>
         * <p>*   **uninstalled**: uninstalled</p>
         * <p>*   **uninstall_failed**: uninstallation failed</p>
         * <p>*   **not_exist**: not installed</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the asset on which the host probe is installed.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the VPC in which the VPC probe is installed.</p>
         */
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
