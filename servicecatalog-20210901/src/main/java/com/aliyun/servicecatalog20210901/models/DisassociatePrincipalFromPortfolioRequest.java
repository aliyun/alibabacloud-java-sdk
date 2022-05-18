// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociatePrincipalFromPortfolioRequest extends TeaModel {
    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    // RAM实体ID
    @NameInMap("PrincipalId")
    public String principalId;

    // RAM实体类型
    @NameInMap("PrincipalType")
    public String principalType;

    @NameInMap("RegionId")
    public String regionId;

    public static DisassociatePrincipalFromPortfolioRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociatePrincipalFromPortfolioRequest self = new DisassociatePrincipalFromPortfolioRequest();
        return TeaModel.build(map, self);
    }

    public DisassociatePrincipalFromPortfolioRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public DisassociatePrincipalFromPortfolioRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public DisassociatePrincipalFromPortfolioRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

    public DisassociatePrincipalFromPortfolioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
