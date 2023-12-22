// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateInstanceResourceRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Uri")
    public String uri;

    public static UpdateInstanceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResourceRequest self = new UpdateInstanceResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResourceRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public UpdateInstanceResourceRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
