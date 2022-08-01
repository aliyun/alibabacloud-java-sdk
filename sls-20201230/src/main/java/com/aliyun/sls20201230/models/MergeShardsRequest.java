// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MergeShardsRequest extends TeaModel {
    @NameInMap("action")
    public String action;

    public static MergeShardsRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeShardsRequest self = new MergeShardsRequest();
        return TeaModel.build(map, self);
    }

    public MergeShardsRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
