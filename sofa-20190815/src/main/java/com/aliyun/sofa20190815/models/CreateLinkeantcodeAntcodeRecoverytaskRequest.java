// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeRecoverytaskRequest extends TeaModel {
    @NameInMap("AntcodeTarget")
    public String antcodeTarget;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("StartTime")
    public String startTime;

    public static CreateLinkeantcodeAntcodeRecoverytaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeRecoverytaskRequest self = new CreateLinkeantcodeAntcodeRecoverytaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeRecoverytaskRequest setAntcodeTarget(String antcodeTarget) {
        this.antcodeTarget = antcodeTarget;
        return this;
    }
    public String getAntcodeTarget() {
        return this.antcodeTarget;
    }

    public CreateLinkeantcodeAntcodeRecoverytaskRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CreateLinkeantcodeAntcodeRecoverytaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLinkeantcodeAntcodeRecoverytaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeRecoverytaskRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeRecoverytaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
