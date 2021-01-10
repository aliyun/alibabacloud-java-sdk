// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest self = new CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelLinkeantcodeAntcodeAciprojectsidpipelinesjobcanceljobidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
