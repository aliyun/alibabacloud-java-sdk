// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    @NameInMap("body")
    public PublicUpdateTemplateInput body;

    /**
     * <strong>example:</strong>
     * <p>team-a1b2c3d4e5f6</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setBody(PublicUpdateTemplateInput body) {
        this.body = body;
        return this;
    }
    public PublicUpdateTemplateInput getBody() {
        return this.body;
    }

    public UpdateTemplateRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
