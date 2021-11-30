// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PutObjectTaggingRequest extends TeaModel {
    @NameInMap("Tagging")
    public Tagging tagging;

    @NameInMap("versionId")
    public String versionId;

    public static PutObjectTaggingRequest build(java.util.Map<String, ?> map) throws Exception {
        PutObjectTaggingRequest self = new PutObjectTaggingRequest();
        return TeaModel.build(map, self);
    }

    public PutObjectTaggingRequest setTagging(Tagging tagging) {
        this.tagging = tagging;
        return this;
    }
    public Tagging getTagging() {
        return this.tagging;
    }

    public PutObjectTaggingRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
