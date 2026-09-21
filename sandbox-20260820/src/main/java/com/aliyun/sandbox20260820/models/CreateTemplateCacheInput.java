// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateCacheInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <strong>example:</strong>
     * <p>us7dxqaezw5uu7aa2cm5</p>
     */
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
