// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RefreshStackApplicationParam extends TeaModel {
    // 应用名称
    @NameInMap("name")
    public String name;

    // 应用版本
    @NameInMap("version")
    public String version;

    public static RefreshStackApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        RefreshStackApplicationParam self = new RefreshStackApplicationParam();
        return TeaModel.build(map, self);
    }

    public RefreshStackApplicationParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RefreshStackApplicationParam setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
