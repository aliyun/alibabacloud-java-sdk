// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociatePrincipalFromPortfolioRequest extends TeaModel {
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
     * <p>The type of the Resource Access Management (RAM) entity. Valid values:</p>
     * <br>
     * <p>*   RamUser: a RAM user</p>
     * <p>*   RamRole: a RAM role</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

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

}
