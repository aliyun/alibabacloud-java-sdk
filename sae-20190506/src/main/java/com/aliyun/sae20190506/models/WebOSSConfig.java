// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebOSSConfig extends TeaModel {
    @NameInMap("MountPoints")
    public java.util.List<WebOSSMountPoint> mountPoints;

    public static WebOSSConfig build(java.util.Map<String, ?> map) throws Exception {
        WebOSSConfig self = new WebOSSConfig();
        return TeaModel.build(map, self);
    }

    public WebOSSConfig setMountPoints(java.util.List<WebOSSMountPoint> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<WebOSSMountPoint> getMountPoints() {
        return this.mountPoints;
    }

}
