// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetTemplatePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetTemplatePermissionResponseBody self = new SetTemplatePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetTemplatePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
