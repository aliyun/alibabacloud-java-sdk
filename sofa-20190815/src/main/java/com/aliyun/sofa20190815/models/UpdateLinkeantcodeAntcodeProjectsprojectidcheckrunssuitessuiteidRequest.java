// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("SuiteId")
    public String suiteId;

    @NameInMap("UpdateDTOJsonStr")
    public String updateDTOJsonStr;

    public static UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest self = new UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest setSuiteId(String suiteId) {
        this.suiteId = suiteId;
        return this;
    }
    public String getSuiteId() {
        return this.suiteId;
    }

    public UpdateLinkeantcodeAntcodeProjectsprojectidcheckrunssuitessuiteidRequest setUpdateDTOJsonStr(String updateDTOJsonStr) {
        this.updateDTOJsonStr = updateDTOJsonStr;
        return this;
    }
    public String getUpdateDTOJsonStr() {
        return this.updateDTOJsonStr;
    }

}
