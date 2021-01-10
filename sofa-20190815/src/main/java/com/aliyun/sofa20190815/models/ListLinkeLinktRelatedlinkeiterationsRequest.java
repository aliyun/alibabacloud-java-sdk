// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktRelatedlinkeiterationsRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    public static ListLinkeLinktRelatedlinkeiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktRelatedlinkeiterationsRequest self = new ListLinkeLinktRelatedlinkeiterationsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktRelatedlinkeiterationsRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

}
