// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociatePrincipalWithPortfolioRequest extends TeaModel {
    @NameInMap("PortfolioId")
    public String portfolioId;

    @NameInMap("PrincipalId")
    public String principalId;

    @NameInMap("PrincipalType")
    public String principalType;

    public static AssociatePrincipalWithPortfolioRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociatePrincipalWithPortfolioRequest self = new AssociatePrincipalWithPortfolioRequest();
        return TeaModel.build(map, self);
    }

    public AssociatePrincipalWithPortfolioRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public AssociatePrincipalWithPortfolioRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public AssociatePrincipalWithPortfolioRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
