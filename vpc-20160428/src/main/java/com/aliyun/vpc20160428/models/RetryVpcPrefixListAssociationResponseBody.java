// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RetryVpcPrefixListAssociationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
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
