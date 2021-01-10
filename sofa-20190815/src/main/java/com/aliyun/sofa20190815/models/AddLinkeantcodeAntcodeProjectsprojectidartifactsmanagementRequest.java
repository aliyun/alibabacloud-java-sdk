// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest extends TeaModel {
    @NameInMap("CreateDtoJsonStr")
    public String createDtoJsonStr;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest self = new AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest setCreateDtoJsonStr(String createDtoJsonStr) {
        this.createDtoJsonStr = createDtoJsonStr;
        return this;
    }
    public String getCreateDtoJsonStr() {
        return this.createDtoJsonStr;
    }

    public AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddLinkeantcodeAntcodeProjectsprojectidartifactsmanagementRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
