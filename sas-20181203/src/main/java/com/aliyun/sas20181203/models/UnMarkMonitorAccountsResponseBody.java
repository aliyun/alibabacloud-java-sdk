// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnMarkMonitorAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnMarkMonitorAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnMarkMonitorAccountsResponseBody self = new UnMarkMonitorAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public UnMarkMonitorAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
