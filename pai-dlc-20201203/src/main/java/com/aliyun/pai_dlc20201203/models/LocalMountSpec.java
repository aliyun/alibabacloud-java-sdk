// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class LocalMountSpec extends TeaModel {
    @NameInMap("LocalPath")
    public String localPath;

    @NameInMap("MountMode")
    public String mountMode;

    @NameInMap("MountPath")
    public String mountPath;

    public static LocalMountSpec build(java.util.Map<String, ?> map) throws Exception {
        LocalMountSpec self = new LocalMountSpec();
        return TeaModel.build(map, self);
    }

    public LocalMountSpec setLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }
    public String getLocalPath() {
        return this.localPath;
    }

    public LocalMountSpec setMountMode(String mountMode) {
        this.mountMode = mountMode;
        return this;
    }
    public String getMountMode() {
        return this.mountMode;
    }

    public LocalMountSpec setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

}
