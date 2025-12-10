// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentFolderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExperimentFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentFolderResponseBody self = new UpdateExperimentFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
