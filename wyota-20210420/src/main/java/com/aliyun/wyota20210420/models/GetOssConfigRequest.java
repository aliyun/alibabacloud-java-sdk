// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOssConfigRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    public static GetOssConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssConfigRequest self = new GetOssConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetOssConfigRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
