// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UpdateDtoJsonStr")
    public String updateDtoJsonStr;

    public static UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest self = new UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidRequest setUpdateDtoJsonStr(String updateDtoJsonStr) {
        this.updateDtoJsonStr = updateDtoJsonStr;
        return this;
    }
    public String getUpdateDtoJsonStr() {
        return this.updateDtoJsonStr;
    }

}
