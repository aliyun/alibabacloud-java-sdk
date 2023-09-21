// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateHoneypotProbeBindRequest extends TeaModel {
    @NameInMap("BindPortList")
    public java.util.List<CreateHoneypotProbeBindRequestBindPortList> bindPortList;

    @NameInMap("HoneypotId")
    public String honeypotId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProbeId")
    public String probeId;

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
        @NameInMap("BindPort")
        public Boolean bindPort;

        @NameInMap("EndPort")
        public Integer endPort;

        @NameInMap("Fixed")
        public Boolean fixed;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("StartPort")
        public Integer startPort;

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
