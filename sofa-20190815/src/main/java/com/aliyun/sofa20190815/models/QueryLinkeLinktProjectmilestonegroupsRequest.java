// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmilestonegroupsRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectmilestonegroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmilestonegroupsRequest self = new QueryLinkeLinktProjectmilestonegroupsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmilestonegroupsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
