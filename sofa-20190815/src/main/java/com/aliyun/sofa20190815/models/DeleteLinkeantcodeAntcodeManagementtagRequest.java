// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeManagementtagRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("TagId")
    public String tagId;

    public static DeleteLinkeantcodeAntcodeManagementtagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeManagementtagRequest self = new DeleteLinkeantcodeAntcodeManagementtagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeManagementtagRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteLinkeantcodeAntcodeManagementtagRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeantcodeAntcodeManagementtagRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public DeleteLinkeantcodeAntcodeManagementtagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
