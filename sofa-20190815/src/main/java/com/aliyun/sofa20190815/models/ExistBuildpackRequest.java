// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExistBuildpackRequest extends TeaModel {
    @NameInMap("BuildpackId")
    public String buildpackId;

    @NameInMap("FullVersion")
    public String fullVersion;

    @NameInMap("TechstackId")
    public Long techstackId;

    public static ExistBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        ExistBuildpackRequest self = new ExistBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public ExistBuildpackRequest setBuildpackId(String buildpackId) {
        this.buildpackId = buildpackId;
        return this;
    }
    public String getBuildpackId() {
        return this.buildpackId;
    }

    public ExistBuildpackRequest setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public ExistBuildpackRequest setTechstackId(Long techstackId) {
        this.techstackId = techstackId;
        return this;
    }
    public Long getTechstackId() {
        return this.techstackId;
    }

}
