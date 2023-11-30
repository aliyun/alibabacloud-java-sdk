// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ArchiveFilesConfig extends TeaModel {
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("version")
    public String version;

    public static ArchiveFilesConfig build(java.util.Map<String, ?> map) throws Exception {
        ArchiveFilesConfig self = new ArchiveFilesConfig();
        return TeaModel.build(map, self);
    }

    public ArchiveFilesConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ArchiveFilesConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
