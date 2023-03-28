// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RetryVpcPrefixListAssociationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetryVpcPrefixListAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryVpcPrefixListAssociationResponseBody self = new RetryVpcPrefixListAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryVpcPrefixListAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
