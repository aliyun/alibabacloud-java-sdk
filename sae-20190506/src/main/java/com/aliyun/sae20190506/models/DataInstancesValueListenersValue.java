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
     * <p>The listener port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The state of the NLB listener. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The listener is being created.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: The listener is being configured.</p>
     * </li>
     * <li><p><strong>Bounded</strong>: The listener is running as expected.</p>
     * </li>
     * <li><p><strong>Unbinding</strong>: The listener is being deleted.</p>
     * </li>
     * <li><p><strong>Failed</strong>: The listener is unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Bounded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The target port.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("TargetPort")
    public Integer targetPort;

    /**
     * <p>The server certificate ID.</p>
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
