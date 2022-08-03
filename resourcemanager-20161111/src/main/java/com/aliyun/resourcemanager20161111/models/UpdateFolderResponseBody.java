// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class UpdateFolderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponseBody self = new UpdateFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
