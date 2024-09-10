// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B94243D2-9342-4D82-87B9-DF9A038A87E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponseBody self = new CreateServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
