// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SubFolder extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a579aec9-1d5e-3382-9d65-9887ff6cfaff</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>95c0787c-408f-4e1f-88ba-ef0a84a2c2ee</p>
     */
    @NameInMap("parentId")
    public String parentId;

    public static SubFolder build(java.util.Map<String, ?> map) throws Exception {
        SubFolder self = new SubFolder();
        return TeaModel.build(map, self);
    }

    public SubFolder setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubFolder setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubFolder setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

}
