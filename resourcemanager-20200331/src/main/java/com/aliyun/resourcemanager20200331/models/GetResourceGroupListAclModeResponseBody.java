// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceGroupListAclModeResponseBody extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceGroupListAclModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupListAclModeResponseBody self = new GetResourceGroupListAclModeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupListAclModeResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public GetResourceGroupListAclModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
