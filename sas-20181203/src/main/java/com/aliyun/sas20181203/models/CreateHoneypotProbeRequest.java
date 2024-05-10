// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable Address Resolution Protocol (ARP) spoofing. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Arp")
    public Boolean arp;

    /**
     * <p>The ID of the business group.</p>
     */
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    /**
     * <p>The ID of the management node.</p>
     * <br>
     * <p>> You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to query the IDs of management nodes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ControlNodeId")
    public String controlNodeId;

    /**
     * <p>The name of the probe.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The configuration of the probe.</p>
     */
    @NameInMap("HoneypotBindList")
    public java.util.List<CreateHoneypotProbeRequestHoneypotBindList> honeypotBindList;

    /**
     * <p>Specifies whether to enable ping scan. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("Ping")
    public Boolean ping;

    /**
     * <p>The type of the probe. Valid values:</p>
     * <br>
     * <p>*   **host_probe**: host probe</p>
     * <p>*   **vpc_black_hole_probe**: virtual private cloud (VPC) probe</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProbeType")
    public String probeType;

    /**
     * <p>The version of the probe.</p>
     */
    @NameInMap("ProbeVersion")
    public String probeVersion;

    /**
     * <p>The IP address of the proxy.</p>
     */
    @NameInMap("ProxyIp")
    public String proxyIp;

    /**
     * <p>The UUID of the instance.</p>
     * <br>
     * <p>> If **ProbeType** is set to **host_probe**, this parameter is required.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The ID of the VPC.</p>
     * <br>
     * <p>> If **ProbeType** is set to **vpc_black_hole_probe**, this parameter is required. You can call the [DescribeVpcHoneyPotList](~~DescribeVpcHoneyPotList~~) operation to query the IDs of VPCs.</p>
     */
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
        /**
         * <p>Specifies whether to bind a port. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("BindPort")
        public Boolean bindPort;

        /**
         * <p>The end of the port range.</p>
         */
        @NameInMap("EndPort")
        public Integer endPort;

        /**
         * <p>Specifies whether the port is a fixed port. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("Fixed")
        public Boolean fixed;

        /**
         * <p>The start of the port range.</p>
         */
        @NameInMap("StartPort")
        public Integer startPort;

        /**
         * <p>The destination port.</p>
         * <br>
         * <p>> If **HoneypotId** is specified, this parameter is required.</p>
         */
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
        /**
         * <p>The listener ports.</p>
         */
        @NameInMap("BindPortList")
        public java.util.List<CreateHoneypotProbeRequestHoneypotBindListBindPortList> bindPortList;

        /**
         * <p>The ID of the honeypot.</p>
         * <br>
         * <p>> You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.</p>
         */
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
