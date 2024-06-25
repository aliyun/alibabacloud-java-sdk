// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CloneSqlInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("targetFolderId")
    public Long targetFolderId;

    public static CloneSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneSqlInstanceRequest self = new CloneSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CloneSqlInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloneSqlInstanceRequest setTargetFolderId(Long targetFolderId) {
        this.targetFolderId = targetFolderId;
        return this;
    }
    public Long getTargetFolderId() {
        return this.targetFolderId;
    }

}
