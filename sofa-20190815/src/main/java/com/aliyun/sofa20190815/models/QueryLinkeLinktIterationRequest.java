// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    public static QueryLinkeLinktIterationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationRequest self = new QueryLinkeLinktIterationRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

}
