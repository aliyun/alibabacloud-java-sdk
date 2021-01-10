// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodePipelineRequest extends TeaModel {
    @NameInMap("ExecId")
    public String execId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CancelLinkeantcodeAntcodePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodePipelineRequest self = new CancelLinkeantcodeAntcodePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodePipelineRequest setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public CancelLinkeantcodeAntcodePipelineRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelLinkeantcodeAntcodePipelineRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
