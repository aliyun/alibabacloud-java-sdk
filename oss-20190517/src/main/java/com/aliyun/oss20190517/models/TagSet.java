// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class TagSet extends TeaModel {
    // A short description of struct
    @NameInMap("Tag")
    public java.util.List<Tag> tags;

    public static TagSet build(java.util.Map<String, ?> map) throws Exception {
        TagSet self = new TagSet();
        return TeaModel.build(map, self);
    }

    public TagSet setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
