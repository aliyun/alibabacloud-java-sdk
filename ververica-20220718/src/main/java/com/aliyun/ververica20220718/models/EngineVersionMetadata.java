// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class EngineVersionMetadata extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    @NameInMap("features")
    public EngineVersionSupportedFeatures features;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public String status;

    public static EngineVersionMetadata build(java.util.Map<String, ?> map) throws Exception {
        EngineVersionMetadata self = new EngineVersionMetadata();
        return TeaModel.build(map, self);
    }

    public EngineVersionMetadata setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public EngineVersionMetadata setFeatures(EngineVersionSupportedFeatures features) {
        this.features = features;
        return this;
    }
    public EngineVersionSupportedFeatures getFeatures() {
        return this.features;
    }

    public EngineVersionMetadata setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
