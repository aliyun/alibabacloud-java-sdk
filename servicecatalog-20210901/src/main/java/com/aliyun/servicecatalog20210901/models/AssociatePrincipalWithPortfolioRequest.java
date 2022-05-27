// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociatePrincipalWithPortfolioRequest extends TeaModel {
    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // RAM实体ID
    @NameInMap("PrincipalId")
    public String principalId;

    // RAM实体类型
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
