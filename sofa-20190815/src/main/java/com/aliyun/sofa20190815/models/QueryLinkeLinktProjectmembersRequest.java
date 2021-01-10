// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmembersRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmembersRequest self = new QueryLinkeLinktProjectmembersRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmembersRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
