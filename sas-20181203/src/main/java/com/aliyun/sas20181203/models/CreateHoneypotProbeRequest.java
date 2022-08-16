// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeRequest extends TeaModel {
    @NameInMap("Arp")
    public Boolean arp;

    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("ControlNodeId")
    public String controlNodeId;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("HoneypotBindList")
    public java.util.List<CreateHoneypotProbeRequestHoneypotBindList> honeypotBindList;

    @NameInMap("Ping")
    public Boolean ping;

    @NameInMap("ProbeType")
    public String probeType;

    @NameInMap("ProbeVersion")
    public String probeVersion;

    @NameInMap("ProxyIp")
    public String proxyIp;

    @NameInMap("Uuid")
    public String uuid;

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
        @NameInMap("BindPort")
        public Boolean bindPort;

        @NameInMap("EndPort")
        public Integer endPort;

        @NameInMap("Fixed")
        public Boolean fixed;

        @NameInMap("StartPort")
        public Integer startPort;

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
        @NameInMap("BindPortList")
        public java.util.List<CreateHoneypotProbeRequestHoneypotBindListBindPortList> bindPortList;

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
