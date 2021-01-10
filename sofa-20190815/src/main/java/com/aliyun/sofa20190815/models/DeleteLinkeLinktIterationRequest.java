// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktIterationRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    public static DeleteLinkeLinktIterationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktIterationRequest self = new DeleteLinkeLinktIterationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktIterationRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

}
