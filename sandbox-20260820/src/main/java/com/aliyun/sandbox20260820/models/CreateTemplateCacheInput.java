// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheInput extends TeaModel {
    @NameInMap("teamID")
    public String teamID;

    @NameInMap("templateID")
    public String templateID;

    public static CreateTemplateCacheInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateCacheInput self = new CreateTemplateCacheInput();
        return TeaModel.build(map, self);
    }

    public CreateTemplateCacheInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public CreateTemplateCacheInput setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
