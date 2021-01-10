// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest extends TeaModel {
    @NameInMap("CreateDTOJsonStr")
    public String createDTOJsonStr;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest self = new CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest setCreateDTOJsonStr(String createDTOJsonStr) {
        this.createDTOJsonStr = createDTOJsonStr;
        return this;
    }
    public String getCreateDTOJsonStr() {
        return this.createDTOJsonStr;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateLinkeantcodeAntcodeProjectsprojectidchecksuitesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
