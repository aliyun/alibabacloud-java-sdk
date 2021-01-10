// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeantcodeAntcodeCancelpipelineexecRequest extends TeaModel {
    @NameInMap("ExecId")
    public String execId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CancelLinkeantcodeAntcodeCancelpipelineexecRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeantcodeAntcodeCancelpipelineexecRequest self = new CancelLinkeantcodeAntcodeCancelpipelineexecRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeantcodeAntcodeCancelpipelineexecRequest setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public CancelLinkeantcodeAntcodeCancelpipelineexecRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelLinkeantcodeAntcodeCancelpipelineexecRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
