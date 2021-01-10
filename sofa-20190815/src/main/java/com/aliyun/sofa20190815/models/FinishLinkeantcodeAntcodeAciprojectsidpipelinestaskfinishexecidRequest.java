// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest extends TeaModel {
    @NameInMap("ExecId")
    public String execId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest self = new FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest();
        return TeaModel.build(map, self);
    }

    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public FinishLinkeantcodeAntcodeAciprojectsidpipelinestaskfinishexecidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
