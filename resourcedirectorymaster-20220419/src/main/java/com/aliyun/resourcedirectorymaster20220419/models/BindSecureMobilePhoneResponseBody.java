// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class BindSecureMobilePhoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindSecureMobilePhoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindSecureMobilePhoneResponseBody self = new BindSecureMobilePhoneResponseBody();
        return TeaModel.build(map, self);
    }

    public BindSecureMobilePhoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
