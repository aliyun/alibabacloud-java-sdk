// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForSelectDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceLinkedRoleForSelectDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForSelectDBResponseBody self = new CreateServiceLinkedRoleForSelectDBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForSelectDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
