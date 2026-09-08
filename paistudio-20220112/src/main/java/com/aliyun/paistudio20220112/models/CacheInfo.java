// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CacheInfo extends TeaModel {
    /**
     * <p>The mount point address of the datasource for service registration in the cache service, such as an OSS Bucket path or a CPFS path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://your-bucket.oss-cn-wulanchabu-internal.aliyuncs.com/</p>
     */
    @NameInMap("MountPoint")
    public String mountPoint;

    /**
     * <p>The port number that the cache service provides for external access to the datasource. The client must access cached data through this port.</p>
     * 
     * <strong>example:</strong>
     * <p>10080</p>
     */
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
