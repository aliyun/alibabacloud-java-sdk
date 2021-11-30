// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CommonPrefix extends TeaModel {
    // The prefix that the names of returned objects contain
    @NameInMap("Prefix")
    public String prefix;

    public static CommonPrefix build(java.util.Map<String, ?> map) throws Exception {
        CommonPrefix self = new CommonPrefix();
        return TeaModel.build(map, self);
    }

    public CommonPrefix setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
