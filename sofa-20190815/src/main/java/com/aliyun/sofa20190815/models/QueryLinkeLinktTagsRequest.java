// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktTagsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktTagsRequest self = new QueryLinkeLinktTagsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktTagsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
