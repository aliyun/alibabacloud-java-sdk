// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupResponse self = new DeleteBackupResponse();
        return TeaModel.build(map, self);
    }

}
