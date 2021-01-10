// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest extends TeaModel {
    @NameInMap("ExecId")
    public String execId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest self = new ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeRerunfailedbypipelineRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
