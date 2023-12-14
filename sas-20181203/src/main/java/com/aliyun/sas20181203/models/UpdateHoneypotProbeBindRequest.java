// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHoneypotProbeBindRequest extends TeaModel {
    /**
     * <p>The unique ID of the honeypot to which the probe is bound.</p>
     */
    @NameInMap("BindId")
    public String bindId;

    /**
     * <p>The ports that are bound to the probe.</p>
     */
    @NameInMap("BindPortList")
    public java.util.List<UpdateHoneypotProbeBindRequestBindPortList> bindPortList;

    /**
     * <p>The operation that the probe performs. Valid values:</p>
     * <br>
     * <p>*   **forward_honey**: forward traffic to a honeypot</p>
     * <p>*   **scan_port**: monitor and scan</p>
     */
    @NameInMap("BindType")
    public String bindType;

    /**
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The honeypot ID.</p>
     * <br>
     * <p>>  You can call the [ListHoneypot](~~ListHoneypot~~) operation to obtain the IDs of honeypots.</p>
     */
    @NameInMap("HoneypotId")
    public String honeypotId;

    /**
     * <p>The port ID of the probe service.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ports that are monitored.</p>
     */
    @NameInMap("Ports")
    public String ports;

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

    /**
     * <p>The status of the port.</p>
     */
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
        /**
         * <p>Specifies whether to bind a port. Valid values:</p>
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
         * <p>Specifies whether the port is fixed. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("Fixed")
        public Boolean fixed;

        /**
         * <p>The UUID of the port.</p>
         */
        @NameInMap("Id")
        public Long id;

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
