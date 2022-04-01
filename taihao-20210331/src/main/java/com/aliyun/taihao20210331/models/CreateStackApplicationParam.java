// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateStackApplicationParam extends TeaModel {
    // 应用名称
    @NameInMap("name")
    public String name;

    // 应用版本
    @NameInMap("version")
    public String version;

    public static CreateStackApplicationParam build(java.util.Map<String, ?> map) throws Exception {
        CreateStackApplicationParam self = new CreateStackApplicationParam();
        return TeaModel.build(map, self);
    }

    public CreateStackApplicationParam setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateStackApplicationParam setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
