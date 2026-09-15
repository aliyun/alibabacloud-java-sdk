// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable ARP spoof detection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Arp")
    public Boolean arp;

    /**
     * <p>The business group.</p>
     * 
     * <strong>example:</strong>
     * <p>2022011817324588686</p>
     */
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    /**
     * <p>The management node ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListHoneypotNode~~">ListHoneypotNode</a> operation to obtain this value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
     */
    @NameInMap("ControlNodeId")
    public String controlNodeId;

    /**
     * <p>The probe name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testHoneyPotProbe</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The collection of service configurations.</p>
     */
    @NameInMap("HoneypotBindList")
    public java.util.List<CreateHoneypotProbeRequestHoneypotBindList> honeypotBindList;

    /**
     * <p>Specifies whether to enable ping scan detection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ping")
    public Boolean ping;

    /**
     * <p>The probe type. Valid values:</p>
     * <ul>
     * <li><p><strong>host_probe</strong>: host probe</p>
     * </li>
     * <li><p><strong>vpc_black_hole_probe</strong>: VPC blackhole probe</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>host_probe</p>
     */
    @NameInMap("ProbeType")
    public String probeType;

    /**
     * <p>The probe version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0</p>
     */
    @NameInMap("ProbeVersion")
    public String probeVersion;

    /**
     * <p>The proxy IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ProxyIp")
    public String proxyIp;

    /**
     * <p>The instance UUID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ProbeType</strong> is set to <strong>host_probe</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>e4af3620-6895-4e2f-a641-a9d8fb53****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ProbeType</strong> is set to <strong>vpc_black_hole_probe</strong>. You can call the <a href="~~DescribeVpcHoneyPotList~~">DescribeVpcHoneyPotList</a> operation to obtain this value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-zm0asrkpv1q8gnk7mn4dn</p>
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
         * <p>Specifies whether to bind the port. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindPort")
        public Boolean bindPort;

        /**
         * <p>The end port.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("EndPort")
        public Integer endPort;

        /**
         * <p>Specifies whether the port is fixed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Fixed")
        public Boolean fixed;

        /**
         * <p>The start port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("StartPort")
        public Integer startPort;

        /**
         * <p>The destination port.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>HoneypotId</strong> is not empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <p>The list of listening ports.</p>
         */
        @NameInMap("BindPortList")
        public java.util.List<CreateHoneypotProbeRequestHoneypotBindListBindPortList> bindPortList;

        /**
         * <p>The honeypot ID.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to obtain this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1a5eda2d40f92ac87d6b63e1a5ad4b76fe0d4110c4a3e2fa85438a29ae55****</p>
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
