// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListTrademarkSbjKeyRequest extends TeaModel {
    @NameInMap("PrincipalKey")
    public String principalKey;

    @NameInMap("PrincipalName")
    public String principalName;

    public static ListTrademarkSbjKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkSbjKeyRequest self = new ListTrademarkSbjKeyRequest();
        return TeaModel.build(map, self);
    }

    public ListTrademarkSbjKeyRequest setPrincipalKey(String principalKey) {
        this.principalKey = principalKey;
        return this;
    }
    public String getPrincipalKey() {
        return this.principalKey;
    }

    public ListTrademarkSbjKeyRequest setPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }
    public String getPrincipalName() {
        return this.principalName;
    }

}
