// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yicconsole20240118.models;

import com.aliyun.tea.*;

public class PrepaidCeaseRequest extends TeaModel {
    @NameInMap("body")
    public LxPopCmd body;

    public static PrepaidCeaseRequest build(java.util.Map<String, ?> map) throws Exception {
        PrepaidCeaseRequest self = new PrepaidCeaseRequest();
        return TeaModel.build(map, self);
    }

    public PrepaidCeaseRequest setBody(LxPopCmd body) {
        this.body = body;
        return this;
    }
    public LxPopCmd getBody() {
        return this.body;
    }

}
