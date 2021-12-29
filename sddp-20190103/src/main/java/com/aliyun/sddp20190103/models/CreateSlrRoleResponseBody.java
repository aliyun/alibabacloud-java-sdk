// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateSlrRoleResponseBody extends TeaModel {
    @NameInMap("HasPermission")
    public Boolean hasPermission;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSlrRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleResponseBody self = new CreateSlrRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleResponseBody setHasPermission(Boolean hasPermission) {
        this.hasPermission = hasPermission;
        return this;
    }
    public Boolean getHasPermission() {
        return this.hasPermission;
    }

    public CreateSlrRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
