// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociateProductFromPortfolioResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateProductFromPortfolioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateProductFromPortfolioResponseBody self = new DisassociateProductFromPortfolioResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateProductFromPortfolioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
