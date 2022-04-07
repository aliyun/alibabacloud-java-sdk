// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class IndexDocument extends TeaModel {
    // description
    @NameInMap("Suffix")
    public String suffix;

    // description
    @NameInMap("SupportSubDir")
    public Boolean supportSubDir;

    // description
    @NameInMap("Type")
    public String type;

    public static IndexDocument build(java.util.Map<String, ?> map) throws Exception {
        IndexDocument self = new IndexDocument();
        return TeaModel.build(map, self);
    }

    public IndexDocument setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

    public IndexDocument setSupportSubDir(Boolean supportSubDir) {
        this.supportSubDir = supportSubDir;
        return this;
    }
    public Boolean getSupportSubDir() {
        return this.supportSubDir;
    }

    public IndexDocument setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
