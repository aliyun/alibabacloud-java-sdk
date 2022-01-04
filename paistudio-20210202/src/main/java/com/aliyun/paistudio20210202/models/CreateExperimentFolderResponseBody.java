// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentFolderResponseBody extends TeaModel {
    @NameInMap("FolderId")
    public String folderId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExperimentFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentFolderResponseBody self = new CreateExperimentFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentFolderResponseBody setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public CreateExperimentFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
