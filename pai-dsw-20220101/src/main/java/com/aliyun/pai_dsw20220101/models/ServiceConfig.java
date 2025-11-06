// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ServiceConfig extends TeaModel {
    @NameInMap("CodeServerAuth")
    public String codeServerAuth;

    @NameInMap("CodeServerPassword")
    public String codeServerPassword;

    @NameInMap("JupyterServerAuth")
    public String jupyterServerAuth;

    @NameInMap("JupyterServerPassword")
    public String jupyterServerPassword;

    public static ServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        ServiceConfig self = new ServiceConfig();
        return TeaModel.build(map, self);
    }

    public ServiceConfig setCodeServerAuth(String codeServerAuth) {
        this.codeServerAuth = codeServerAuth;
        return this;
    }
    public String getCodeServerAuth() {
        return this.codeServerAuth;
    }

    public ServiceConfig setCodeServerPassword(String codeServerPassword) {
        this.codeServerPassword = codeServerPassword;
        return this;
    }
    public String getCodeServerPassword() {
        return this.codeServerPassword;
    }

    public ServiceConfig setJupyterServerAuth(String jupyterServerAuth) {
        this.jupyterServerAuth = jupyterServerAuth;
        return this;
    }
    public String getJupyterServerAuth() {
        return this.jupyterServerAuth;
    }

    public ServiceConfig setJupyterServerPassword(String jupyterServerPassword) {
        this.jupyterServerPassword = jupyterServerPassword;
        return this;
    }
    public String getJupyterServerPassword() {
        return this.jupyterServerPassword;
    }

}
