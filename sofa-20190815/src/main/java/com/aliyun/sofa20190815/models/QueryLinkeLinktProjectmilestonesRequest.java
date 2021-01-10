// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktProjectmilestonesRequest extends TeaModel {
    @NameInMap("ProjectSign")
    public String projectSign;

    public static QueryLinkeLinktProjectmilestonesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktProjectmilestonesRequest self = new QueryLinkeLinktProjectmilestonesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktProjectmilestonesRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

}
