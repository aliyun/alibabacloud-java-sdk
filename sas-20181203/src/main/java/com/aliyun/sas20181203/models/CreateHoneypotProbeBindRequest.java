// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeBindRequest extends TeaModel {
    /**
     * <p>The list of port bindings.</p>
     */
    @NameInMap("BindPortList")
    public java.util.List<CreateHoneypotProbeBindRequestBindPortList> bindPortList;

    /**
     * <p>The honeypot ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListHoneypot~~">ListHoneypot</a> operation to obtain this value.
     * This parameter is required. If this parameter is not specified, the API returns InternalError (400).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dba7d44775be8e0e5888ee3b1a62554a93d2512247cabc38ddeac17a3b3f****</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The probe ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to obtain this parameter.
     * This parameter is required. If this parameter is not specified, the API returns InvalidParam (400).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>36bad711-d1ac-4419-ac68-c1aa280f****</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    /**
     * <p>The list of listener IP addresses.</p>
     */
    @NameInMap("ServiceIpList")
    public java.util.List<String> serviceIpList;

    public static CreateHoneypotProbeBindRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHoneypotProbeBindRequest self = new CreateHoneypotProbeBindRequest();
        return TeaModel.build(map, self);
    }

    public CreateHoneypotProbeBindRequest setBindPortList(java.util.List<CreateHoneypotProbeBindRequestBindPortList> bindPortList) {
        this.bindPortList = bindPortList;
        return this;
    }
    public java.util.List<CreateHoneypotProbeBindRequestBindPortList> getBindPortList() {
        return this.bindPortList;
    }

    public CreateHoneypotProbeBindRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public CreateHoneypotProbeBindRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateHoneypotProbeBindRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

    public CreateHoneypotProbeBindRequest setServiceIpList(java.util.List<String> serviceIpList) {
        this.serviceIpList = serviceIpList;
        return this;
    }
    public java.util.List<String> getServiceIpList() {
        return this.serviceIpList;
    }

    public static class CreateHoneypotProbeBindRequestBindPortList extends TeaModel {
        /**
         * <p>Specifies whether to bind the port. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The port is bound.</li>
         * <li><strong>false</strong>: The port is not bound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BindPort")
        public Boolean bindPort;

        /**
         * <p>The end port of the probe listener.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("EndPort")
        public Integer endPort;

        /**
         * <p>Specifies whether the port is fixed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The port is fixed.</li>
         * <li><strong>false</strong>: The port is not fixed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Fixed")
        public Boolean fixed;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: TCP protocol.</li>
         * <li><strong>udp</strong>: UDP protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The start port of the probe listener.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("StartPort")
        public Integer startPort;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        public static CreateHoneypotProbeBindRequestBindPortList build(java.util.Map<String, ?> map) throws Exception {
            CreateHoneypotProbeBindRequestBindPortList self = new CreateHoneypotProbeBindRequestBindPortList();
            return TeaModel.build(map, self);
        }

        public CreateHoneypotProbeBindRequestBindPortList setBindPort(Boolean bindPort) {
            this.bindPort = bindPort;
            return this;
        }
        public Boolean getBindPort() {
            return this.bindPort;
        }

        public CreateHoneypotProbeBindRequestBindPortList setEndPort(Integer endPort) {
            this.endPort = endPort;
            return this;
        }
        public Integer getEndPort() {
            return this.endPort;
        }

        public CreateHoneypotProbeBindRequestBindPortList setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public CreateHoneypotProbeBindRequestBindPortList setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public CreateHoneypotProbeBindRequestBindPortList setStartPort(Integer startPort) {
            this.startPort = startPort;
            return this;
        }
        public Integer getStartPort() {
            return this.startPort;
        }

        public CreateHoneypotProbeBindRequestBindPortList setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

}
