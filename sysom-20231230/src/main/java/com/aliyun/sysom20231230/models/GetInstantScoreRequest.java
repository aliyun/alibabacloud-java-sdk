// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetInstantScoreRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2ijff4be-bf24-4070-89ca-c47c879b0g32</p>
     */
    @NameInMap("cluster")
    public String cluster;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-wz9d00ut2ska3mlyhn6j</p>
     */
    @NameInMap("instance")
    public String instance;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetInstantScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstantScoreRequest self = new GetInstantScoreRequest();
        return TeaModel.build(map, self);
    }

    public GetInstantScoreRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetInstantScoreRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetInstantScoreRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public GetInstantScoreRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
