// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDeploymentSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8B993DA9-5272-5414-94E3-4CA8BA0146C2</p>
     */
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
