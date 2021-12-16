// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketTagsResponseBody extends TeaModel {
    @NameInMap("TagSet")
    public TagSet tagSet;

    public static GetBucketTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketTagsResponseBody self = new GetBucketTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketTagsResponseBody setTagSet(TagSet tagSet) {
        this.tagSet = tagSet;
        return this;
    }
    public TagSet getTagSet() {
        return this.tagSet;
    }

}
