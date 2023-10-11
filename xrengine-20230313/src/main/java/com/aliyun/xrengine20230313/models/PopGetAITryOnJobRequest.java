// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopGetAITryOnJobRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("WithMaterial")
    public Boolean withMaterial;

    @NameInMap("WithResult")
    public Boolean withResult;

    public static PopGetAITryOnJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PopGetAITryOnJobRequest self = new PopGetAITryOnJobRequest();
        return TeaModel.build(map, self);
    }

    public PopGetAITryOnJobRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopGetAITryOnJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PopGetAITryOnJobRequest setWithMaterial(Boolean withMaterial) {
        this.withMaterial = withMaterial;
        return this;
    }
    public Boolean getWithMaterial() {
        return this.withMaterial;
    }

    public PopGetAITryOnJobRequest setWithResult(Boolean withResult) {
        this.withResult = withResult;
        return this;
    }
    public Boolean getWithResult() {
        return this.withResult;
    }

}
