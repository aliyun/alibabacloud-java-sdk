// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSimpleprojectRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktSimpleprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSimpleprojectRequest self = new QueryLinkeLinktSimpleprojectRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSimpleprojectRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
