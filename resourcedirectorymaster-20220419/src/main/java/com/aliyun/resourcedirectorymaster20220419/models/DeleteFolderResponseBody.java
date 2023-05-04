// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteFolderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFolderResponseBody self = new DeleteFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
