// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectcreatedstatusesgroupbystageRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectcreatedstatusesgroupbystageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectcreatedstatusesgroupbystageRequest self = new QueryLinkeLinktProjectcreatedstatusesgroupbystageRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectcreatedstatusesgroupbystageRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
