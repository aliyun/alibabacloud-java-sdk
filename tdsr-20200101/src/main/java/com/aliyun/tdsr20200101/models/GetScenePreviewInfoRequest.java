// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A.e.RQJRPYGIJJQP****</p>
     */
    @NameInMap("ModelToken")
    public String modelToken;

    public static GetScenePreviewInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewInfoRequest self = new GetScenePreviewInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewInfoRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScenePreviewInfoRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetScenePreviewInfoRequest setModelToken(String modelToken) {
        this.modelToken = modelToken;
        return this;
    }
    public String getModelToken() {
        return this.modelToken;
    }

}
