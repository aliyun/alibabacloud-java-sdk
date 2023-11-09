// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleCriteriaRequest extends TeaModel {
    @NameInMap("Value")
    public String value;

    public static GetSasContainerWebDefenseRuleCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleCriteriaRequest self = new GetSasContainerWebDefenseRuleCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
