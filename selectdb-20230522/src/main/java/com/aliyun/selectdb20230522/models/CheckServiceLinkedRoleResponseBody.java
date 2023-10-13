// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("HasServiceLinkedRole")
    public Boolean hasServiceLinkedRole;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponseBody self = new CheckServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponseBody setHasServiceLinkedRole(Boolean hasServiceLinkedRole) {
        this.hasServiceLinkedRole = hasServiceLinkedRole;
        return this;
    }
    public Boolean getHasServiceLinkedRole() {
        return this.hasServiceLinkedRole;
    }

    public CheckServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
