// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CopyNetworkAclEntriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CopyNetworkAclEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyNetworkAclEntriesResponseBody self = new CopyNetworkAclEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyNetworkAclEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
