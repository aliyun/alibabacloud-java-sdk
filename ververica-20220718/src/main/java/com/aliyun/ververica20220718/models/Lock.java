// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Lock extends TeaModel {
    @NameInMap("holderId")
    public String holderId;

    @NameInMap("holderName")
    public String holderName;

    @NameInMap("id")
    public String id;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("workspace")
    public String workspace;

    public static Lock build(java.util.Map<String, ?> map) throws Exception {
        Lock self = new Lock();
        return TeaModel.build(map, self);
    }

    public Lock setHolderId(String holderId) {
        this.holderId = holderId;
        return this;
    }
    public String getHolderId() {
        return this.holderId;
    }

    public Lock setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }
    public String getHolderName() {
        return this.holderName;
    }

    public Lock setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Lock setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Lock setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
