// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CacheInfo extends TeaModel {
    @NameInMap("MountPoint")
    public String mountPoint;

    @NameInMap("Port")
    public String port;

    public static CacheInfo build(java.util.Map<String, ?> map) throws Exception {
        CacheInfo self = new CacheInfo();
        return TeaModel.build(map, self);
    }

    public CacheInfo setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }
    public String getMountPoint() {
        return this.mountPoint;
    }

    public CacheInfo setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
