// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceLifecycleConfig extends TeaModel {
    @NameInMap("preFreeze")
    public LifecycleHook preFreeze;

    @NameInMap("preStop")
    public LifecycleHook preStop;

    public static InstanceLifecycleConfig build(java.util.Map<String, ?> map) throws Exception {
        InstanceLifecycleConfig self = new InstanceLifecycleConfig();
        return TeaModel.build(map, self);
    }

    public InstanceLifecycleConfig setPreFreeze(LifecycleHook preFreeze) {
        this.preFreeze = preFreeze;
        return this;
    }
    public LifecycleHook getPreFreeze() {
        return this.preFreeze;
    }

    public InstanceLifecycleConfig setPreStop(LifecycleHook preStop) {
        this.preStop = preStop;
        return this;
    }
    public LifecycleHook getPreStop() {
        return this.preStop;
    }

}
