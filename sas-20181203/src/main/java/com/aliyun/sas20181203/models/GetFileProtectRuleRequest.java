// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileProtectRuleRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    public static GetFileProtectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileProtectRuleRequest self = new GetFileProtectRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetFileProtectRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
