// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateArtifactUploadTokenRequest extends TeaModel {
    /**
     * <p>The artifact upload directory, relative to the digital human artifact root directory. The value can only be empty or a directory under upload/. If not specified, upload/{YYYY-MM-DD}/ is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>upload/2026-05-25/</p>
     */
    @NameInMap("artifactPath")
    public String artifactPath;

    public static CreateArtifactUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateArtifactUploadTokenRequest self = new CreateArtifactUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateArtifactUploadTokenRequest setArtifactPath(String artifactPath) {
        this.artifactPath = artifactPath;
        return this;
    }
    public String getArtifactPath() {
        return this.artifactPath;
    }

}
