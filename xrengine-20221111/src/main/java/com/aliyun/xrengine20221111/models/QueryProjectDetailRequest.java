// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class QueryProjectDetailRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectDetailRequest self = new QueryProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectDetailRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public QueryProjectDetailRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public QueryProjectDetailRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
