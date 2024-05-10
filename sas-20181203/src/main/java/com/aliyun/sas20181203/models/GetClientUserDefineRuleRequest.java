// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetClientUserDefineRuleRequest extends TeaModel {
    /**
     * <p>The ID of the custom defense rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetClientUserDefineRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientUserDefineRuleRequest self = new GetClientUserDefineRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetClientUserDefineRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
