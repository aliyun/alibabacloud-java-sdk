// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebWAFConfig extends TeaModel {
    @NameInMap("EnableWAF")
    public Boolean enableWAF;

    public static WebWAFConfig build(java.util.Map<String, ?> map) throws Exception {
        WebWAFConfig self = new WebWAFConfig();
        return TeaModel.build(map, self);
    }

    public WebWAFConfig setEnableWAF(Boolean enableWAF) {
        this.enableWAF = enableWAF;
        return this;
    }
    public Boolean getEnableWAF() {
        return this.enableWAF;
    }

}
