// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSimpleprojectmembersRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktSimpleprojectmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSimpleprojectmembersRequest self = new QueryLinkeLinktSimpleprojectmembersRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSimpleprojectmembersRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
