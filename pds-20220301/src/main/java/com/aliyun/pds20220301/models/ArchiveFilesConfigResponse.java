// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ArchiveFilesConfigResponse extends TeaModel {
    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("version")
    public String version;

    public static ArchiveFilesConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ArchiveFilesConfigResponse self = new ArchiveFilesConfigResponse();
        return TeaModel.build(map, self);
    }

    public ArchiveFilesConfigResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ArchiveFilesConfigResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
