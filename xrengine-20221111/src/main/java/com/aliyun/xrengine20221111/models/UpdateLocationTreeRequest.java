// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class UpdateLocationTreeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("TreeConfig")
    public String treeConfig;

    public static UpdateLocationTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocationTreeRequest self = new UpdateLocationTreeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLocationTreeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLocationTreeRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public UpdateLocationTreeRequest setTreeConfig(String treeConfig) {
        this.treeConfig = treeConfig;
        return this;
    }
    public String getTreeConfig() {
        return this.treeConfig;
    }

}
