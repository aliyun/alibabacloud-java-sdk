// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeBindRequest extends TeaModel {
    /**
     * <p>The ports that are bound to the probe.</p>
     */
    @NameInMap("BindPortList")
    public java.util.List<CreateHoneypotProbeBindRequestBindPortList> bindPortList;

    /**
     * <p>The honeypot ID.</p>
     * <br>
     * <p>>  You can call the [ListHoneypot](~~ListHoneypot~~) operation to query the IDs of honeypots.</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The probe ID.</p>
     * <br>
     * <p>>  You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.</p>
     */
    @NameInMap("ProbeId")
    public String probeId;

    /**
     * <p>The IP addresses that are monitored.</p>
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
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("BindPort")
        public Boolean bindPort;

        /**
         * <p>The end port on which the probe monitors.</p>
         */
        @NameInMap("EndPort")
        public Integer endPort;

        /**
         * <p>Specifies whether the port is a fixed port. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Fixed")
        public Boolean fixed;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         */
        @NameInMap("Proto")
        public String proto;

        /**
         * <p>The start port on which the probe monitors.</p>
         */
        @NameInMap("StartPort")
        public Integer startPort;

        /**
         * <p>The destination port.</p>
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
