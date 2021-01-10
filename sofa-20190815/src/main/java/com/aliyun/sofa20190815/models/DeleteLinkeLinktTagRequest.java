// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktTagRequest extends TeaModel {
    @NameInMap("TagId")
    public String tagId;

    public static DeleteLinkeLinktTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktTagRequest self = new DeleteLinkeLinktTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
