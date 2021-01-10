// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest self = new CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest();
        return TeaModel.build(map, self);
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CallbackLinkeantcodeAntcodeAciprojectsidpipelinesjobrerunjobidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
