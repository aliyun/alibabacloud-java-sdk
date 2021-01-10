// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectcreatedtagsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectcreatedtagsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectcreatedtagsRequest self = new QueryLinkeLinktProjectcreatedtagsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectcreatedtagsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
