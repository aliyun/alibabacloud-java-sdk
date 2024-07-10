// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebApplicationInput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sae-app</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("WebNetworkConfig")
    public WebNetworkConfig webNetworkConfig;

    public static UpdateWebApplicationInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebApplicationInput self = new UpdateWebApplicationInput();
        return TeaModel.build(map, self);
    }

    public UpdateWebApplicationInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWebApplicationInput setWebNetworkConfig(WebNetworkConfig webNetworkConfig) {
        this.webNetworkConfig = webNetworkConfig;
        return this;
    }
    public WebNetworkConfig getWebNetworkConfig() {
        return this.webNetworkConfig;
    }

}
