// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class NASConfig extends TeaModel {
    @NameInMap("mountPoints")
    public java.util.List<NASMountConfig> mountPoints;

    public static NASConfig build(java.util.Map<String, ?> map) throws Exception {
        NASConfig self = new NASConfig();
        return TeaModel.build(map, self);
    }

    public NASConfig setMountPoints(java.util.List<NASMountConfig> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<NASMountConfig> getMountPoints() {
        return this.mountPoints;
    }

}
