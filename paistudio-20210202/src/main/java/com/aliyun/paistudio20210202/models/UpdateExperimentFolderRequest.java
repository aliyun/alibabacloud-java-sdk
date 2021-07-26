// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentFolderRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

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
