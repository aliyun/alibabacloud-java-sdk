// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class AssociatePrincipalWithPortfolioRequest extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the RAM entity.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a RAM user, see [GetUser](~~28681~~).</p>
     * <br>
     * <p>For more information about how to obtain the ID of a RAM role, see [GetRole](~~28711~~).</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the RAM entity. Valid values:</p>
     * <br>
     * <p>*   RamUser: a RAM user</p>
     * <p>*   RamRole: a RAM role</p>
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

    public AssociatePrincipalWithPortfolioRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
