// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class GetPipelineRunRequest extends TeaModel {
    @NameInMap("ManifestType")
    public String manifestType;

    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetPipelineRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineRunRequest self = new GetPipelineRunRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineRunRequest setManifestType(String manifestType) {
        this.manifestType = manifestType;
        return this;
    }
    public String getManifestType() {
        return this.manifestType;
    }

    public GetPipelineRunRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
