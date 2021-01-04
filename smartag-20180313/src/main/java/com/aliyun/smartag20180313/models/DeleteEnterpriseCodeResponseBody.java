// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnterpriseCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseCodeResponseBody self = new DeleteEnterpriseCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
