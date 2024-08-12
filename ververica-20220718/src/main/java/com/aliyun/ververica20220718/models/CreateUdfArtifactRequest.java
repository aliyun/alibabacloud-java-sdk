// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateUdfArtifactRequest extends TeaModel {
    /**
     * <p>The resource file of the UDF.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UdfArtifact body;

    public static CreateUdfArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfArtifactRequest self = new CreateUdfArtifactRequest();
        return TeaModel.build(map, self);
    }

    public CreateUdfArtifactRequest setBody(UdfArtifact body) {
        this.body = body;
        return this;
    }
    public UdfArtifact getBody() {
        return this.body;
    }

}
