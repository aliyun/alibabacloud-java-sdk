// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectTaggingResponseBody extends TeaModel {
    @NameInMap("TagSet")
    public TagSet tagSet;

    public static GetObjectTaggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTaggingResponseBody self = new GetObjectTaggingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetObjectTaggingResponseBody setTagSet(TagSet tagSet) {
        this.tagSet = tagSet;
        return this;
    }
    public TagSet getTagSet() {
        return this.tagSet;
    }

}
