// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSSecretImagepullRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegistryUrl")
    public String registryUrl;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Workspace")
    public String workspace;

    public static CreateAKSSecretImagepullRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSSecretImagepullRequest self = new CreateAKSSecretImagepullRequest();
        return TeaModel.build(map, self);
    }

    public CreateAKSSecretImagepullRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAKSSecretImagepullRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAKSSecretImagepullRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateAKSSecretImagepullRequest setRegistryUrl(String registryUrl) {
        this.registryUrl = registryUrl;
        return this;
    }
    public String getRegistryUrl() {
        return this.registryUrl;
    }

    public CreateAKSSecretImagepullRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateAKSSecretImagepullRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
