// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DynamicMount extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("MountPoints")
    public java.util.List<DynamicMountPoint> mountPoints;

    public static DynamicMount build(java.util.Map<String, ?> map) throws Exception {
        DynamicMount self = new DynamicMount();
        return TeaModel.build(map, self);
    }

    public DynamicMount setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public DynamicMount setMountPoints(java.util.List<DynamicMountPoint> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<DynamicMountPoint> getMountPoints() {
        return this.mountPoints;
    }

}
