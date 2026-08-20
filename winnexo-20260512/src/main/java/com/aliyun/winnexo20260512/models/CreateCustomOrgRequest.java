// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateCustomOrgRequest extends TeaModel {
    /**
     * <p>The corpId of the activated enterprise.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>The organization name.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("corpName")
    public String corpName;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>692318833855074</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateCustomOrgRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomOrgRequest self = new CreateCustomOrgRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomOrgRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateCustomOrgRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateCustomOrgRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
