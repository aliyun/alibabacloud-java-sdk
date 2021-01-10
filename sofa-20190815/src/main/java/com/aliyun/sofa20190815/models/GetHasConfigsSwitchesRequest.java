// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasConfigsSwitchesRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static GetHasConfigsSwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasConfigsSwitchesRequest self = new GetHasConfigsSwitchesRequest();
        return TeaModel.build(map, self);
    }

    public GetHasConfigsSwitchesRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
