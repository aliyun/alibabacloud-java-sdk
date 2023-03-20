// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociatePrincipalFromPortfolioResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociatePrincipalFromPortfolioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociatePrincipalFromPortfolioResponseBody self = new DisassociatePrincipalFromPortfolioResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociatePrincipalFromPortfolioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
