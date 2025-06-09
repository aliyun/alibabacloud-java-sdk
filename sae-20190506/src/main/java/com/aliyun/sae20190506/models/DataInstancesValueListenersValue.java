// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DataInstancesValueListenersValue extends TeaModel {
    /**
     * <p>The listener protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>TCPSSL</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The listener port of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The status of the NLB listener.</p>
     * <ul>
     * <li><strong>Creating</strong>: The listener is being created.</li>
     * <li><strong>Configuring</strong>: The listener is being configured.</li>
     * <li><strong>Bounded</strong>: The listener runs as expected.</li>
     * <li><strong>Unbinding</strong>: The listener is being deleted.</li>
     * <li><strong>Failed</strong>: The listener is unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bounded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The open ports of the NLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("TargetPort")
    public Integer targetPort;

    /**
     * <p>The server certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>123157******</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    public static DataInstancesValueListenersValue build(java.util.Map<String, ?> map) throws Exception {
        DataInstancesValueListenersValue self = new DataInstancesValueListenersValue();
        return TeaModel.build(map, self);
    }

    public DataInstancesValueListenersValue setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DataInstancesValueListenersValue setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DataInstancesValueListenersValue setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DataInstancesValueListenersValue setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

    public DataInstancesValueListenersValue setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

}
