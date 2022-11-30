// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class IosPayload extends TeaModel {
    @NameInMap("aps")
    public Aps aps;

    @NameInMap("extra")
    public java.util.Map<String, ?> extra;

    public static IosPayload build(java.util.Map<String, ?> map) throws Exception {
        IosPayload self = new IosPayload();
        return TeaModel.build(map, self);
    }

    public IosPayload setAps(Aps aps) {
        this.aps = aps;
        return this;
    }
    public Aps getAps() {
        return this.aps;
    }

    public IosPayload setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

}
