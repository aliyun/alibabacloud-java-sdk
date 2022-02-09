// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CheckUserInServiceWhiteListResponseBody extends TeaModel {
    @NameInMap("IsInWhitelist")
    public java.util.List<Boolean> isInWhitelist;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckUserInServiceWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInServiceWhiteListResponseBody self = new CheckUserInServiceWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUserInServiceWhiteListResponseBody setIsInWhitelist(java.util.List<Boolean> isInWhitelist) {
        this.isInWhitelist = isInWhitelist;
        return this;
    }
    public java.util.List<Boolean> getIsInWhitelist() {
        return this.isInWhitelist;
    }

    public CheckUserInServiceWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
