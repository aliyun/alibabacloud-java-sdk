// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectDataSetRequest extends TeaModel {
    @NameInMap("body")
    public Long body;

    public static SelectDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectDataSetRequest self = new SelectDataSetRequest();
        return TeaModel.build(map, self);
    }

    public SelectDataSetRequest setBody(Long body) {
        this.body = body;
        return this;
    }
    public Long getBody() {
        return this.body;
    }

}
