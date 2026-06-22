// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectClientRuleRequest extends TeaModel {
    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetFileProtectClientRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectClientRuleRequest self = new GetFileProtectClientRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetFileProtectClientRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
