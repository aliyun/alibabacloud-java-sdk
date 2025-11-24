// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CCMVersionsValue extends TeaModel {
    /**
     * <p>The status of the query. Valid values:</p>
     * <ul>
     * <li><code>time_out</code>: The query times out.</li>
     * <li><code>failed</code>: The query fails.</li>
     * <li><code>Empty string</code>: The query is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>time_out</p>
     */
    @NameInMap("QueryState")
    public String queryState;

    /**
     * <p>The CCM version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2.0.1</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>Indicates whether Classic Load Balancer (CLB) graceful shutdown is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SLBGracefulDrainSupported")
    public Boolean SLBGracefulDrainSupported;

    /**
     * <p>The ID of the cluster instance on the data plane.</p>
     * 
     * <strong>example:</strong>
     * <p>cfbb81b9b51a44b299349xxxxxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The additional information that is returned when the query fails. This parameter is empty if the query is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>timeout error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("SLBGracefulDrainSupport")
    @Deprecated
    public Boolean SLBGracefulDrainSupport;

    public static CCMVersionsValue build(java.util.Map<String, ?> map) throws Exception {
        CCMVersionsValue self = new CCMVersionsValue();
        return TeaModel.build(map, self);
    }

    public CCMVersionsValue setQueryState(String queryState) {
        this.queryState = queryState;
        return this;
    }
    public String getQueryState() {
        return this.queryState;
    }

    public CCMVersionsValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CCMVersionsValue setSLBGracefulDrainSupported(Boolean SLBGracefulDrainSupported) {
        this.SLBGracefulDrainSupported = SLBGracefulDrainSupported;
        return this;
    }
    public Boolean getSLBGracefulDrainSupported() {
        return this.SLBGracefulDrainSupported;
    }

    public CCMVersionsValue setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CCMVersionsValue setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    @Deprecated
    public CCMVersionsValue setSLBGracefulDrainSupport(Boolean SLBGracefulDrainSupport) {
        this.SLBGracefulDrainSupport = SLBGracefulDrainSupport;
        return this;
    }
    public Boolean getSLBGracefulDrainSupport() {
        return this.SLBGracefulDrainSupport;
    }

}
