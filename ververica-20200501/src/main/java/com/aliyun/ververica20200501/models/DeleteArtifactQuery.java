// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteArtifactQuery extends TeaModel {
    @NameInMap("filename")
    @Validation(required = true)
    public String filename;

    public static DeleteArtifactQuery build(java.util.Map<String, ?> map) throws Exception {
        DeleteArtifactQuery self = new DeleteArtifactQuery();
        return TeaModel.build(map, self);
    }

    public DeleteArtifactQuery setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

}
