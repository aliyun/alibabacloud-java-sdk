// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class UpdatePipelineRequest extends TeaModel {
    @NameInMap("Manifest")
    public String manifest;

    public static UpdatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineRequest self = new UpdatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineRequest setManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    public String getManifest() {
        return this.manifest;
    }

}
