// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class EngineVersionMetadata extends TeaModel {
    /**
     * <p>The engine version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vvr-6.0.0-flink-1.15</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <p>The features supported by the engine version.</p>
     */
    @NameInMap("features")
    public EngineVersionSupportedFeatures features;

    /**
     * <p>The status of the engine version.</p>
     * <ul>
     * <li>STABLE</li>
     * <li>BETA</li>
     * <li>DEPRECATED</li>
     * <li>EXPIRED</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STABLE</p>
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
