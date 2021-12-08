// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class InnerCallServiceRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static InnerCallServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InnerCallServiceRequest self = new InnerCallServiceRequest();
        return TeaModel.build(map, self);
    }

    public InnerCallServiceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
