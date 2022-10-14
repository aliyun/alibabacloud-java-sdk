// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class EngineVersionMetadataIndex extends TeaModel {
    @NameInMap("defaultEngineVersion")
    public String defaultEngineVersion;

    @NameInMap("engineVersionMetadata")
    public java.util.List<EngineVersionMetadata> engineVersionMetadata;

    public static EngineVersionMetadataIndex build(java.util.Map<String, ?> map) throws Exception {
        EngineVersionMetadataIndex self = new EngineVersionMetadataIndex();
        return TeaModel.build(map, self);
    }

    public EngineVersionMetadataIndex setDefaultEngineVersion(String defaultEngineVersion) {
        this.defaultEngineVersion = defaultEngineVersion;
        return this;
    }
    public String getDefaultEngineVersion() {
        return this.defaultEngineVersion;
    }

    public EngineVersionMetadataIndex setEngineVersionMetadata(java.util.List<EngineVersionMetadata> engineVersionMetadata) {
        this.engineVersionMetadata = engineVersionMetadata;
        return this;
    }
    public java.util.List<EngineVersionMetadata> getEngineVersionMetadata() {
        return this.engineVersionMetadata;
    }

}
