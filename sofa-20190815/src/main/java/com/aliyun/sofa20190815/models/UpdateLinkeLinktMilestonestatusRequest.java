// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktMilestonestatusRequest extends TeaModel {
    @NameInMap("MilestoneId")
    public String milestoneId;

    @NameInMap("Status")
    public String status;

    public static UpdateLinkeLinktMilestonestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktMilestonestatusRequest self = new UpdateLinkeLinktMilestonestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktMilestonestatusRequest setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }
    public String getMilestoneId() {
        return this.milestoneId;
    }

    public UpdateLinkeLinktMilestonestatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
