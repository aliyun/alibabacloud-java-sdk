// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class JuiceFSVolumeConfig extends TeaModel {
    @NameInMap("args")
    public java.util.List<String> args;

    /**
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8080">http://127.0.0.1:8080</a></p>
     */
    @NameInMap("baseURL")
    public String baseURL;

    /**
     * <strong>example:</strong>
     * <p>/sandbox/workspace</p>
     */
    @NameInMap("remoteDir")
    public String remoteDir;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("token")
    public String token;

    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("volumeName")
    public String volumeName;

    public static JuiceFSVolumeConfig build(java.util.Map<String, ?> map) throws Exception {
        JuiceFSVolumeConfig self = new JuiceFSVolumeConfig();
        return TeaModel.build(map, self);
    }

    public JuiceFSVolumeConfig setArgs(java.util.List<String> args) {
        this.args = args;
        return this;
    }
    public java.util.List<String> getArgs() {
        return this.args;
    }

    public JuiceFSVolumeConfig setBaseURL(String baseURL) {
        this.baseURL = baseURL;
        return this;
    }
    public String getBaseURL() {
        return this.baseURL;
    }

    public JuiceFSVolumeConfig setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir;
        return this;
    }
    public String getRemoteDir() {
        return this.remoteDir;
    }

    public JuiceFSVolumeConfig setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public JuiceFSVolumeConfig setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
