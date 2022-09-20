// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class RemoveDataSetRequest extends TeaModel {
    @NameInMap("body")
    public Long body;

    public static RemoveDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataSetRequest self = new RemoveDataSetRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDataSetRequest setBody(Long body) {
        this.body = body;
        return this;
    }
    public Long getBody() {
        return this.body;
    }

}
