// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteInstallCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstallCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstallCodeResponseBody self = new DeleteInstallCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstallCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
