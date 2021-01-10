// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSSecretImagepullRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteAKSSecretImagepullRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSSecretImagepullRequest self = new DeleteAKSSecretImagepullRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAKSSecretImagepullRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteAKSSecretImagepullRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteAKSSecretImagepullRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
