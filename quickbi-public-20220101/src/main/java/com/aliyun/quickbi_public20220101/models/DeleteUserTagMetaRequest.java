// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserTagMetaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pop_001</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static DeleteUserTagMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserTagMetaRequest self = new DeleteUserTagMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserTagMetaRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
