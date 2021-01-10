// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMilestoneRequest extends TeaModel {
    @NameInMap("MilestoneId")
    public String milestoneId;

    public static QueryLinkeLinktMilestoneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMilestoneRequest self = new QueryLinkeLinktMilestoneRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMilestoneRequest setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }
    public String getMilestoneId() {
        return this.milestoneId;
    }

}
