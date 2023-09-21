// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotProbeBindRequest extends TeaModel {
    @NameInMap("BindId")
    public String bindId;

    @NameInMap("BindPortList")
    public java.util.List<UpdateHoneypotProbeBindRequestBindPortList> bindPortList;

    @NameInMap("BindType")
    public String bindType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("HoneypotId")
    public String honeypotId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Ports")
    public String ports;

    @NameInMap("ProbeId")
    public String probeId;

    @NameInMap("ServiceIpList")
    public java.util.List<String> serviceIpList;

    @NameInMap("SetStatus")
    public Integer setStatus;

    public static UpdateHoneypotProbeBindRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHoneypotProbeBindRequest self = new UpdateHoneypotProbeBindRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHoneypotProbeBindRequest setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public UpdateHoneypotProbeBindRequest setBindPortList(java.util.List<UpdateHoneypotProbeBindRequestBindPortList> bindPortList) {
        this.bindPortList = bindPortList;
        return this;
    }
    public java.util.List<UpdateHoneypotProbeBindRequestBindPortList> getBindPortList() {
        return this.bindPortList;
    }

    public UpdateHoneypotProbeBindRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public UpdateHoneypotProbeBindRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public UpdateHoneypotProbeBindRequest setHoneypotId(String honeypotId) {
        this.honeypotId = honeypotId;
        return this;
    }
    public String getHoneypotId() {
        return this.honeypotId;
    }

    public UpdateHoneypotProbeBindRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateHoneypotProbeBindRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateHoneypotProbeBindRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UpdateHoneypotProbeBindRequest setPorts(String ports) {
        this.ports = ports;
        return this;
    }
    public String getPorts() {
        return this.ports;
    }

    public UpdateHoneypotProbeBindRequest setProbeId(String probeId) {
        this.probeId = probeId;
        return this;
    }
    public String getProbeId() {
        return this.probeId;
    }

    public UpdateHoneypotProbeBindRequest setServiceIpList(java.util.List<String> serviceIpList) {
        this.serviceIpList = serviceIpList;
        return this;
    }
    public java.util.List<String> getServiceIpList() {
        return this.serviceIpList;
    }

    public UpdateHoneypotProbeBindRequest setSetStatus(Integer setStatus) {
        this.setStatus = setStatus;
        return this;
    }
    public Integer getSetStatus() {
        return this.setStatus;
    }

    public static class UpdateHoneypotProbeBindRequestBindPortList extends TeaModel {
        @NameInMap("BindPort")
        public Boolean bindPort;

        @NameInMap("EndPort")
        public Integer endPort;

        @NameInMap("Fixed")
        public Boolean fixed;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Proto")
        public String proto;

        @NameInMap("StartPort")
        public Integer startPort;

        @NameInMap("TargetPort")
        public Integer targetPort;

        public static UpdateHoneypotProbeBindRequestBindPortList build(java.util.Map<String, ?> map) throws Exception {
            UpdateHoneypotProbeBindRequestBindPortList self = new UpdateHoneypotProbeBindRequestBindPortList();
            return TeaModel.build(map, self);
        }

        public UpdateHoneypotProbeBindRequestBindPortList setBindPort(Boolean bindPort) {
            this.bindPort = bindPort;
            return this;
        }
        public Boolean getBindPort() {
            return this.bindPort;
        }

        public UpdateHoneypotProbeBindRequestBindPortList setEndPort(Integer endPort) {
            this.endPort = endPort;
            return this;
        }
        public Integer getEndPort() {
            return this.endPort;
        }

        public UpdateHoneypotProbeBindRequestBindPortList setFixed(Boolean fixed) {
            this.fixed = fixed;
            return this;
        }
        public Boolean getFixed() {
            return this.fixed;
        }

        public UpdateHoneypotProbeBindRequestBindPortList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateHoneypotProbeBindRequestBindPortList setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public UpdateHoneypotProbeBindRequestBindPortList setStartPort(Integer startPort) {
            this.startPort = startPort;
            return this;
        }
        public Integer getStartPort() {
            return this.startPort;
        }

        public UpdateHoneypotProbeBindRequestBindPortList setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

    }

}
