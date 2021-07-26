// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class DeleteExperimentFolderResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExperimentFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentFolderResponseBody self = new DeleteExperimentFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
