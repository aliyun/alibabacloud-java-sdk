// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebNASMountPoint extends TeaModel {
    /**
     * <p>The local mount directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/consumer/log</p>
     */
    @NameInMap("MountDir")
    public String mountDir;

    /**
     * <p>The mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>/home</p>
     */
    @NameInMap("NasAddr")
    public String nasAddr;

    /**
     * <p>The mount directory.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("NasPath")
    public String nasPath;

    public static WebNASMountPoint build(java.util.Map<String, ?> map) throws Exception {
        WebNASMountPoint self = new WebNASMountPoint();
        return TeaModel.build(map, self);
    }

    public WebNASMountPoint setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public WebNASMountPoint setNasAddr(String nasAddr) {
        this.nasAddr = nasAddr;
        return this;
    }
    public String getNasAddr() {
        return this.nasAddr;
    }

    public WebNASMountPoint setNasPath(String nasPath) {
        this.nasPath = nasPath;
        return this;
    }
    public String getNasPath() {
        return this.nasPath;
    }

}
