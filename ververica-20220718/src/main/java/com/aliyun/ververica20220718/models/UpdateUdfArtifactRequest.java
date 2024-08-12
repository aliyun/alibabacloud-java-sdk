// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateUdfArtifactRequest extends TeaModel {
    /**
     * <p>The details of the JAR file of the UDF.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UdfArtifact body;

    public static UpdateUdfArtifactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfArtifactRequest self = new UpdateUdfArtifactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUdfArtifactRequest setBody(UdfArtifact body) {
        this.body = body;
        return this;
    }
    public UdfArtifact getBody() {
        return this.body;
    }

}
