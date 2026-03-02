// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Lock extends TeaModel {
    /**
     * <p>The ID of the lock holder.</p>
     * 
     * <strong>example:</strong>
     * <p>18389966****</p>
     */
    @NameInMap("holderId")
    public String holderId;

    /**
     * <p>The username of the lock holder.</p>
     * 
     * <strong>example:</strong>
     * <p>userA</p>
     */
    @NameInMap("holderName")
    public String holderName;

    /**
     * <p>The lock ID.</p>
     * 
     * <strong>example:</strong>
     * <p>stt-fu1658tbk6mnkk2****</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>a14bd5d90a****</p>
     */
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
