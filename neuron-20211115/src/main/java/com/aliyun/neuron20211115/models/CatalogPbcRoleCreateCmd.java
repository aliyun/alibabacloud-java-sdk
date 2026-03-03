// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CatalogPbcRoleCreateCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("marketId")
    public Long marketId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>neuron:catalog:market</p>
     */
    @NameInMap("marketResource")
    public String marketResource;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>neuron:catalog:company</p>
     */
    @NameInMap("pbcResource")
    public String pbcResource;

    public static CatalogPbcRoleCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        CatalogPbcRoleCreateCmd self = new CatalogPbcRoleCreateCmd();
        return TeaModel.build(map, self);
    }

    public CatalogPbcRoleCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CatalogPbcRoleCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public CatalogPbcRoleCreateCmd setMarketResource(String marketResource) {
        this.marketResource = marketResource;
        return this;
    }
    public String getMarketResource() {
        return this.marketResource;
    }

    public CatalogPbcRoleCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CatalogPbcRoleCreateCmd setPbcResource(String pbcResource) {
        this.pbcResource = pbcResource;
        return this;
    }
    public String getPbcResource() {
        return this.pbcResource;
    }

}
