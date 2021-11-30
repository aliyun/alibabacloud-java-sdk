// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class Tagging extends TeaModel {
    // Tag 的容器
    @NameInMap("TagSet")
    public java.util.List<Tag> tagSet;

    public static Tagging build(java.util.Map<String, ?> map) throws Exception {
        Tagging self = new Tagging();
        return TeaModel.build(map, self);
    }

    public Tagging setTagSet(java.util.List<Tag> tagSet) {
        this.tagSet = tagSet;
        return this;
    }
    public java.util.List<Tag> getTagSet() {
        return this.tagSet;
    }

}
