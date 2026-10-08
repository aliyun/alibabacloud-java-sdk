// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ShareRCDeploymentSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ShareRCDeploymentSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShareRCDeploymentSetResponseBody self = new ShareRCDeploymentSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ShareRCDeploymentSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
