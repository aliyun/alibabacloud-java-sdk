// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktTagRequest extends TeaModel {
    @NameInMap("Color")
    public String color;

    @NameInMap("Content")
    public String content;

    @NameInMap("TagId")
    public String tagId;

    public static UpdateLinkeLinktTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktTagRequest self = new UpdateLinkeLinktTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktTagRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateLinkeLinktTagRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateLinkeLinktTagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
