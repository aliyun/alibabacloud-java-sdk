// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeUserLangResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeUserLangResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserLangResponseBody self = new ChangeUserLangResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeUserLangResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
