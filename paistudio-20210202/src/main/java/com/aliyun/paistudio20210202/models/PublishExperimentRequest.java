// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PublishExperimentRequest extends TeaModel {
    // 公共目录Id
    @NameInMap("FolderId")
    public String folderId;

    public static PublishExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishExperimentRequest self = new PublishExperimentRequest();
        return TeaModel.build(map, self);
    }

    public PublishExperimentRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

}
