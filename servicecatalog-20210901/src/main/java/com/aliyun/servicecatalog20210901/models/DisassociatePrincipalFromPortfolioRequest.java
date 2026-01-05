// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DisassociatePrincipalFromPortfolioRequest extends TeaModel {
    /**
     * <p>The ID of the product portfolio.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The ID of the RAM entity.</p>
     * <p>For more information about how to obtain the ID of a RAM user, see <a href="https://help.aliyun.com/document_detail/28681.html">GetUser</a>.</p>
     * <p>For more information about how to obtain the ID of a RAM role, see <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24477111603637****</p>
     */
    @NameInMap("PrincipalId")
    public String principalId;

    /**
     * <p>The type of the Resource Access Management (RAM) entity. Valid values:</p>
     * <ul>
     * <li>RamUser: a RAM user</li>
     * <li>RamRole: a RAM role</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RamUser</p>
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
