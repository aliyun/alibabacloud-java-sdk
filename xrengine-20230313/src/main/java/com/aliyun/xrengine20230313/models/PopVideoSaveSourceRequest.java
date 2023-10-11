// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopVideoSaveSourceRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("SourceType")
    public String sourceType;

    public static PopVideoSaveSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        PopVideoSaveSourceRequest self = new PopVideoSaveSourceRequest();
        return TeaModel.build(map, self);
    }

    public PopVideoSaveSourceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopVideoSaveSourceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PopVideoSaveSourceRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
