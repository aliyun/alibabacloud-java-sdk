// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class NASMountConfig extends TeaModel {
    @NameInMap("enableTLS")
    public Boolean enableTLS;

    @NameInMap("mountDir")
    public String mountDir;

    @NameInMap("serverAddr")
    public String serverAddr;

    public static NASMountConfig build(java.util.Map<String, ?> map) throws Exception {
        NASMountConfig self = new NASMountConfig();
        return TeaModel.build(map, self);
    }

    public NASMountConfig setEnableTLS(Boolean enableTLS) {
        this.enableTLS = enableTLS;
        return this;
    }
    public Boolean getEnableTLS() {
        return this.enableTLS;
    }

    public NASMountConfig setMountDir(String mountDir) {
        this.mountDir = mountDir;
        return this;
    }
    public String getMountDir() {
        return this.mountDir;
    }

    public NASMountConfig setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
        return this;
    }
    public String getServerAddr() {
        return this.serverAddr;
    }

}
