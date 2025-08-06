// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssignProductAccountIdResponseBody extends TeaModel {
    @NameInMap("ProductAccountId")
    public Long productAccountId;

    @NameInMap("RequestId")
    public String requestId;

    public static AssignProductAccountIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignProductAccountIdResponseBody self = new AssignProductAccountIdResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignProductAccountIdResponseBody setProductAccountId(Long productAccountId) {
        this.productAccountId = productAccountId;
        return this;
    }
    public Long getProductAccountId() {
        return this.productAccountId;
    }

    public AssignProductAccountIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
