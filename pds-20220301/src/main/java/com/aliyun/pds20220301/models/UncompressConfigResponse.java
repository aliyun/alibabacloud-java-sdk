// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UncompressConfigResponse extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("version")
    public String version;

    public static UncompressConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UncompressConfigResponse self = new UncompressConfigResponse();
        return TeaModel.build(map, self);
    }

    public UncompressConfigResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UncompressConfigResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
