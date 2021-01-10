// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktSubprojectsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktSubprojectsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktSubprojectsRequest self = new QueryLinkeLinktSubprojectsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktSubprojectsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
