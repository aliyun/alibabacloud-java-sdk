// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreatePortfolioRequest extends TeaModel {
    /**
     * <p>The description of the product portfolio.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the product portfolio.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("PortfolioName")
    public String portfolioName;

    /**
     * <p>The provider of the product portfolio.</p>
     * <br>
     * <p>The value must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    public static CreatePortfolioRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePortfolioRequest self = new CreatePortfolioRequest();
        return TeaModel.build(map, self);
    }

    public CreatePortfolioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePortfolioRequest setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
        return this;
    }
    public String getPortfolioName() {
        return this.portfolioName;
    }

    public CreatePortfolioRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
