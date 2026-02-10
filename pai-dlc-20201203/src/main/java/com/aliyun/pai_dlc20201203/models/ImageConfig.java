// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ImageConfig extends TeaModel {
    /**
     * <p>The authentication information of the image repository.</p>
     */
    @NameInMap("Auth")
    public String auth;

    /**
     * <p>The address of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>docker****registry.com</p>
     */
    @NameInMap("DockerRegistry")
    public String dockerRegistry;

    /**
     * <p>The password that is used to log on to the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The username that is used to log on to the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("Username")
    public String username;

    public static ImageConfig build(java.util.Map<String, ?> map) throws Exception {
        ImageConfig self = new ImageConfig();
        return TeaModel.build(map, self);
    }

    public ImageConfig setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

    public ImageConfig setDockerRegistry(String dockerRegistry) {
        this.dockerRegistry = dockerRegistry;
        return this;
    }
    public String getDockerRegistry() {
        return this.dockerRegistry;
    }

    public ImageConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ImageConfig setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
