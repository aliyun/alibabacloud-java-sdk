// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class MoZiStatusCallBackRequest extends TeaModel {
    // body
    @NameInMap("body")
    public String body;

    public static MoZiStatusCallBackRequest build(java.util.Map<String, ?> map) throws Exception {
        MoZiStatusCallBackRequest self = new MoZiStatusCallBackRequest();
        return TeaModel.build(map, self);
    }

    public MoZiStatusCallBackRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
