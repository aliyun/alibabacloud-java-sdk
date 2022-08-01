// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCheckPointRequest extends TeaModel {
    @NameInMap("shard")
    public Integer shard;

    public static GetCheckPointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckPointRequest self = new GetCheckPointRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckPointRequest setShard(Integer shard) {
        this.shard = shard;
        return this;
    }
    public Integer getShard() {
        return this.shard;
    }

}
