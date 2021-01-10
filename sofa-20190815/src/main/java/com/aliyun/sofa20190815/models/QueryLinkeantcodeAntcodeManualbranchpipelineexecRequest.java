// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ManualPipelineRequestJsonStr")
    public String manualPipelineRequestJsonStr;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest self = new QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest setManualPipelineRequestJsonStr(String manualPipelineRequestJsonStr) {
        this.manualPipelineRequestJsonStr = manualPipelineRequestJsonStr;
        return this;
    }
    public String getManualPipelineRequestJsonStr() {
        return this.manualPipelineRequestJsonStr;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
