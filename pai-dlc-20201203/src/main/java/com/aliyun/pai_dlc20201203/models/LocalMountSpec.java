// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class LocalMountSpec extends TeaModel {
    /**
     * <p>The local path on the host. This field is invalid when MountMode is set to Block.</p>
     * 
     * <strong>example:</strong>
     * <p>/local/a</p>
     */
    @NameInMap("LocalPath")
    public String localPath;

    /**
     * <p>The mount mode. Valid values: Block and Filesystem.</p>
     * 
     * <strong>example:</strong>
     * <p>Filesystem</p>
     */
    @NameInMap("MountMode")
    public String mountMode;

    /**
     * <p>The absolute mount path in the container. The path must start with a forward slash (/). When MountMode is set to Block, the path must start with /dev/.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/data</p>
     */
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
