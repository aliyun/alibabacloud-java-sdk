// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest extends TeaModel {
    @NameInMap("ExecId")
    public String execId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest self = new QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeRerunfailedpipelinebyexecRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
