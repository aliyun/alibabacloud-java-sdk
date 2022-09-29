// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourcePopResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PermissionAllowResource result;

    public static ListPermissionResourcePopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourcePopResponseBody self = new ListPermissionResourcePopResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourcePopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPermissionResourcePopResponseBody setResult(PermissionAllowResource result) {
        this.result = result;
        return this;
    }
    public PermissionAllowResource getResult() {
        return this.result;
    }

}
