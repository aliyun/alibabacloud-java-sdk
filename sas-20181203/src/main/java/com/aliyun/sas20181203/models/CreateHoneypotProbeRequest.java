// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeRequest extends TeaModel {
    // Specifies whether to enable Address Resolution Protocol (ARP) spoofing. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    @NameInMap("Arp")
    public Boolean arp;

    // The ID of the business group.
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    // The ID of the management node.
    // 
    // >  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.
    @NameInMap("ControlNodeId")
    public String controlNodeId;

    // The name of the probe.
    @NameInMap("DisplayName")
    public String displayName;

    // The honeypot configurations.
    @NameInMap("HoneypotBindList")
    public java.util.List<CreateHoneypotProbeRequestHoneypotBindList> honeypotBindList;

    // Specifies whether to enable ping scan. Valid values:
    // 
    // *   **false**: yes
    // *   **false**: no
    @NameInMap("Ping")
    public Boolean ping;

    // The type of the probe. Valid values:
    // 
    // *   **host_probe**: host probe
    // *   **vpc_black_hole_probe**: virtual private cloud (VPC) probe
    @NameInMap("ProbeType")
    public String probeType;

    // The version of the probe.
    @NameInMap("ProbeVersion")
    public String probeVersion;

    // The IP address of the proxy.
    @NameInMap("ProxyIp")
    public String proxyIp;

    // The UUID of the instance.
    // 
    // >  If **ProbeType** is set to **host_probe**, this parameter is required.
    @NameInMap("Uuid")
    public String uuid;

    // The ID of the VPC.
    // 
    // >  If **ProbeType** is set to **vpc_black_hole_probe**, this parameter is required. You can call the DescribeVpcHoneyPotList operation to query the IDs of VPCs.
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateHoneypotProbeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotProbeRequest self = new CreateHoneypotProbeRequest();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotProbeRequest setArp(Boolean arp) {
        this.arp = arp;
        return this;
    }
    public Boolean getArp() {
        return this.arp;
    }

    public CreateHoneypotProbeRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public CreateHoneypotProbeRequest setControlNodeId(String controlNodeId) {
        this.controlNodeId = controlNodeId;
        return this;
    }
    public String getControlNodeId() {
        return this.controlNodeId;
    }

    public CreateHoneypotProbeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateHoneypotProbeRequest setHoneypotBindList(java.util.List<CreateHoneypotProbeRequestHoneypotBindList> honeypotBindList) {
        this.honeypotBindList = honeypotBindList;
        return this;
    }
    public java.util.List<CreateHoneypotProbeRequestHoneypotBindList> getHoneypotBindList() {
        return this.honeypotBindList;
    }

    public CreateHoneypotProbeRequest setPing(Boolean ping) {
        this.ping = ping;
        return this;
    }
    public Boolean getPing() {
        return this.ping;
    }

    public CreateHoneypotProbeRequest setProbeType(String probeType) {
        this.probeType = probeType;
        return this;
    }
    public String getProbeType() {
        return this.probeType;
    }

    public CreateHoneypotProbeRequest setProbeVersion(String probeVersion) {
        this.probeVersion = probeVersion;
        return this;
    }
    public String getProbeVersion() {
        return this.probeVersion;
    }

    public CreateHoneypotProbeRequest setProxyIp(String proxyIp) {
        this.proxyIp = proxyIp;
        return this;
    }
    public String getProxyIp() {
        return this.proxyIp;
    }

    public CreateHoneypotProbeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateHoneypotProbeRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateHoneypotProbeRequestHoneypotBindListBindPortList extends TeaModel {
        // Specifies whether to bind a port. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("BindPort")
        public Boolean bindPort;

        // The end of the port range.
        @NameInMap("EndPort")
        public Integer endPort;

        // Specifies whether the port is fixed. Valid values:
        // 
        // *   **0**: no
        // *   **1**: yes
        @NameInMap("Fixed")
        public Boolean fixed;

        // The start of the port range.
        @NameInMap("StartPort")
        public Integer startPort;

        // The destination port.
        // 
        // >  If **HoneypotId** is specified, this parameter is required.
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static CreateHoneypotProbeRequestHoneypotBindListBindPortList build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotProbeRequestHoneypotBindListBindPortList self = new CreateHoneypotProbeRequestHoneypotBindListBindPortList();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotProbeRequestHoneypotBindListBindPortList setBindPort(Boolean bindPort) {
            this.bindPort = bindPort;
            return this;
        }
        public Boolean getBindPort() {
            return this.bindPort;
        }

        public CreateHoneypotProbeRequestHoneypotBindListBindPortList setEndPort(Integer endPort) {
            this.endPort = endPort;
            return this;
        }
        public Integer getEndPort() {
            return this.endPort;
        }

        public CreateHoneypotProbeRequestHoneypotBindListBindPortList setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public CreateHoneypotProbeRequestHoneypotBindListBindPortList setStartPort(Integer startPort) {
            this.startPort = startPort;
            return this;
        }
        public Integer getStartPort() {
            return this.startPort;
        }

        public CreateHoneypotProbeRequestHoneypotBindListBindPortList setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

    public static class CreateHoneypotProbeRequestHoneypotBindList extends TeaModel {
        // The listener ports.
        @NameInMap("BindPortList")
        public java.util.List<CreateHoneypotProbeRequestHoneypotBindListBindPortList> bindPortList;

        // The ID of the honeypot.
        // 
        // >  You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.
        @NameInMap("HoneypotId")
        public String honeypotId;

        public static CreateHoneypotProbeRequestHoneypotBindList build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotProbeRequestHoneypotBindList self = new CreateHoneypotProbeRequestHoneypotBindList();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotProbeRequestHoneypotBindList setBindPortList(java.util.List<CreateHoneypotProbeRequestHoneypotBindListBindPortList> bindPortList) {
            this.bindPortList = bindPortList;
            return this;
        }
        public java.util.List<CreateHoneypotProbeRequestHoneypotBindListBindPortList> getBindPortList() {
            return this.bindPortList;
        }

        public CreateHoneypotProbeRequestHoneypotBindList setHoneypotId(String honeypotId) {
            this.honeypotId = honeypotId;
            return this;
        }
        public String getHoneypotId() {
            return this.honeypotId;
        }

    }

}
