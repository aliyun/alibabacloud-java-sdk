// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectusedstatusesRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectusedstatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectusedstatusesRequest self = new QueryLinkeLinktProjectusedstatusesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectusedstatusesRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
