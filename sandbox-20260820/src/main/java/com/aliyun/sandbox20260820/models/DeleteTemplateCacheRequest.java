// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class DeleteTemplateCacheRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
     */
    @NameInMap("teamID")
    public String teamID;

    public static DeleteTemplateCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateCacheRequest self = new DeleteTemplateCacheRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateCacheRequest setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

}
