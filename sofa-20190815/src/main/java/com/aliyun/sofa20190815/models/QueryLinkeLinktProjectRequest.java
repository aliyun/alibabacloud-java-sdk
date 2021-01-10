// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectRequest self = new QueryLinkeLinktProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
