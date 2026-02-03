// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociatePrincipalWithPortfolioRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <strong>example:</strong>
     * <p>24477111603637****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <strong>example:</strong>
     * <p>user/userName</p>
     */
    @NameInMap("PrincipalPattern")
    public String principalPattern;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RamUser</p>
     */
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

    public AssociatePrincipalWithPortfolioRequest setPrincipalPattern(String principalPattern) {
        this.principalPattern = principalPattern;
        return this;
    }
    public String getPrincipalPattern() {
        return this.principalPattern;
    }

    public AssociatePrincipalWithPortfolioRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
