// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeantcodeAntcodeRedochecksuitesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("SuiteId")
    public String suiteId;

    public static GetLinkeantcodeAntcodeRedochecksuitesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeantcodeAntcodeRedochecksuitesRequest self = new GetLinkeantcodeAntcodeRedochecksuitesRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeantcodeAntcodeRedochecksuitesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public GetLinkeantcodeAntcodeRedochecksuitesRequest setSuiteId(String suiteId) {
        this.suiteId = suiteId;
        return this;
    }
    public String getSuiteId() {
        return this.suiteId;
    }

}
