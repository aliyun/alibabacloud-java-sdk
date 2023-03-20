// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeletePortfolioResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePortfolioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePortfolioResponseBody self = new DeletePortfolioResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePortfolioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
