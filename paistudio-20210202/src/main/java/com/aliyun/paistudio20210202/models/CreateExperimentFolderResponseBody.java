// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentFolderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>folder-xxfdjhfxduxd</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
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
