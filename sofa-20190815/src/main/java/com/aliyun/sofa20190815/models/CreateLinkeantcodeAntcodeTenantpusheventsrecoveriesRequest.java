// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest extends TeaModel {
    @NameInMap("AntcodeTarget")
    public String antcodeTarget;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("StartTime")
    public String startTime;

    public static CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest self = new CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setAntcodeTarget(String antcodeTarget) {
        this.antcodeTarget = antcodeTarget;
        return this;
    }
    public String getAntcodeTarget() {
        return this.antcodeTarget;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeTenantpusheventsrecoveriesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
