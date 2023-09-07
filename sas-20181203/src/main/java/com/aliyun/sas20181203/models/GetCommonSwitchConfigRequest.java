// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCommonSwitchConfigRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    public static GetCommonSwitchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCommonSwitchConfigRequest self = new GetCommonSwitchConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetCommonSwitchConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
