// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcVersionRequest extends TeaModel {
    @NameInMap("body")
    public PbcVersionCmd body;

    public static UpdatePbcVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcVersionRequest self = new UpdatePbcVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePbcVersionRequest setBody(PbcVersionCmd body) {
        this.body = body;
        return this;
    }
    public PbcVersionCmd getBody() {
        return this.body;
    }

}
