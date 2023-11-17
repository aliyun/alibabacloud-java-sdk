// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RenamePlaybookNodeResponseBody extends TeaModel {
    @NameInMap("RenameResult")
    public String renameResult;

    @NameInMap("RequestId")
    public String requestId;

    public static RenamePlaybookNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenamePlaybookNodeResponseBody self = new RenamePlaybookNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RenamePlaybookNodeResponseBody setRenameResult(String renameResult) {
        this.renameResult = renameResult;
        return this;
    }
    public String getRenameResult() {
        return this.renameResult;
    }

    public RenamePlaybookNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
