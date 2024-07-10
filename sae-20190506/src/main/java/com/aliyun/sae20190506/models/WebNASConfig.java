// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebNASConfig extends TeaModel {
    @NameInMap("MountPoints")
    public java.util.List<WebNASMountPoint> mountPoints;

    public static WebNASConfig build(java.util.Map<String, ?> map) throws Exception {
        WebNASConfig self = new WebNASConfig();
        return TeaModel.build(map, self);
    }

    public WebNASConfig setMountPoints(java.util.List<WebNASMountPoint> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<WebNASMountPoint> getMountPoints() {
        return this.mountPoints;
    }

}
