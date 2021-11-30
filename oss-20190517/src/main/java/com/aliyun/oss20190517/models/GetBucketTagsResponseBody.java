// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketTagsResponseBody extends TeaModel {
    @NameInMap("TagSet")
    public java.util.List<Tag> tagSet;

    public static GetBucketTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTagsResponseBody self = new GetBucketTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketTagsResponseBody setTagSet(java.util.List<Tag> tagSet) {
        this.tagSet = tagSet;
        return this;
    }
    public java.util.List<Tag> getTagSet() {
        return this.tagSet;
    }

}
