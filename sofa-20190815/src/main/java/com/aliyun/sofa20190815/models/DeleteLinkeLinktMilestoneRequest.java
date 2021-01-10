// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktMilestoneRequest extends TeaModel {
    @NameInMap("MilestoneId")
    public String milestoneId;

    public static DeleteLinkeLinktMilestoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktMilestoneRequest self = new DeleteLinkeLinktMilestoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktMilestoneRequest setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }
    public String getMilestoneId() {
        return this.milestoneId;
    }

}
