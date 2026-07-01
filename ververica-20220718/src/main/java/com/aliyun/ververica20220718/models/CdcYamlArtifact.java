// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CdcYamlArtifact extends TeaModel {
    /**
     * <p>Full URL paths to the additional dependencies.</p>
     */
    @NameInMap("additionalDependencies")
    public java.util.List<String> additionalDependencies;

    /**
     * <p>Code for the data ingestion job.</p>
     */
    @NameInMap("cdcYaml")
    public String cdcYaml;

    public static CdcYamlArtifact build(java.util.Map<String, ?> map) throws Exception {
        CdcYamlArtifact self = new CdcYamlArtifact();
        return TeaModel.build(map, self);
    }

    public CdcYamlArtifact setAdditionalDependencies(java.util.List<String> additionalDependencies) {
        this.additionalDependencies = additionalDependencies;
        return this;
    }
    public java.util.List<String> getAdditionalDependencies() {
        return this.additionalDependencies;
    }

    public CdcYamlArtifact setCdcYaml(String cdcYaml) {
        this.cdcYaml = cdcYaml;
        return this;
    }
    public String getCdcYaml() {
        return this.cdcYaml;
    }

}
