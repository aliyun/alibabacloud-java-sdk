// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeManagementtagsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("Tag")
    public String tag;

    public static AddLinkeantcodeAntcodeManagementtagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeManagementtagsRequest self = new AddLinkeantcodeAntcodeManagementtagsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeManagementtagsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeantcodeAntcodeManagementtagsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddLinkeantcodeAntcodeManagementtagsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeManagementtagsRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
