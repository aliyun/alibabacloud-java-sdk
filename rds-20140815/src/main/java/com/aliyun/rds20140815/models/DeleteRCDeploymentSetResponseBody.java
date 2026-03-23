// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDeploymentSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRCDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCDeploymentSetResponseBody self = new DeleteRCDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
