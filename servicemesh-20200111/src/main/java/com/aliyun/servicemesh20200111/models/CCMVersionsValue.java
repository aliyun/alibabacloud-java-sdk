// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CCMVersionsValue extends TeaModel {
    @NameInMap("QueryState")
    public String queryState;

    @NameInMap("Version")
    public String version;

    @NameInMap("SLBGracefulDrainSupport")
    public Boolean SLBGracefulDrainSupport;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Message")
    public String message;

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

    public CCMVersionsValue setSLBGracefulDrainSupport(Boolean SLBGracefulDrainSupport) {
        this.SLBGracefulDrainSupport = SLBGracefulDrainSupport;
        return this;
    }
    public Boolean getSLBGracefulDrainSupport() {
        return this.SLBGracefulDrainSupport;
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

}
