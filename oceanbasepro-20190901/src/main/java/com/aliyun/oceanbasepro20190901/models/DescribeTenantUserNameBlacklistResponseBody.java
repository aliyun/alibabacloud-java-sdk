// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUserNameBlacklistResponseBody extends TeaModel {
    @NameInMap("BlackList")
    public java.util.List<String> blackList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTenantUserNameBlacklistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUserNameBlacklistResponseBody self = new DescribeTenantUserNameBlacklistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUserNameBlacklistResponseBody setBlackList(java.util.List<String> blackList) {
        this.blackList = blackList;
        return this;
    }
    public java.util.List<String> getBlackList() {
        return this.blackList;
    }

    public DescribeTenantUserNameBlacklistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
