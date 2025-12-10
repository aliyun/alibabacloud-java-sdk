// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentFolderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>folder1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>folder-xzf7t785nka4c2334</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    public static UpdateExperimentFolderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentFolderRequest self = new UpdateExperimentFolderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentFolderRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateExperimentFolderRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

}
