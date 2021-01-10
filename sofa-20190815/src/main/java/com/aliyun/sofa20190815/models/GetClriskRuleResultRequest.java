// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskRuleResultRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    public static GetClriskRuleResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskRuleResultRequest self = new GetClriskRuleResultRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskRuleResultRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
