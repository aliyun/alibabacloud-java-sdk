// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CheckAccountDeleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAccountDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountDeleteResponseBody self = new CheckAccountDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAccountDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
