// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetDefaultPrincipalNameResponseBody extends TeaModel {
    @NameInMap("PrincipalName")
    public Integer principalName;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDefaultPrincipalNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultPrincipalNameResponseBody self = new GetDefaultPrincipalNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultPrincipalNameResponseBody setPrincipalName(Integer principalName) {
        this.principalName = principalName;
        return this;
    }
    public Integer getPrincipalName() {
        return this.principalName;
    }

    public GetDefaultPrincipalNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
