// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest extends TeaModel {
    @NameInMap("BodyJsonStr")
    public String bodyJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest self = new CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest setBodyJsonStr(String bodyJsonStr) {
        this.bodyJsonStr = bodyJsonStr;
        return this;
    }
    public String getBodyJsonStr() {
        return this.bodyJsonStr;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeProjectsidrepositoryfilesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
