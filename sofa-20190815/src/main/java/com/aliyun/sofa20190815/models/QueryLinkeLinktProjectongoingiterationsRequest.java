// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectongoingiterationsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectongoingiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectongoingiterationsRequest self = new QueryLinkeLinktProjectongoingiterationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectongoingiterationsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
