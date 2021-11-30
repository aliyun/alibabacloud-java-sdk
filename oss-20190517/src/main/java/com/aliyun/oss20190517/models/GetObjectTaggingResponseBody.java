// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectTaggingResponseBody extends TeaModel {
    @NameInMap("TagSet")
    public GetObjectTaggingResponseBodyTagSet tagSet;

    public static GetObjectTaggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTaggingResponseBody self = new GetObjectTaggingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetObjectTaggingResponseBody setTagSet(GetObjectTaggingResponseBodyTagSet tagSet) {
        this.tagSet = tagSet;
        return this;
    }
    public GetObjectTaggingResponseBodyTagSet getTagSet() {
        return this.tagSet;
    }

    public static class GetObjectTaggingResponseBodyTagSet extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<Tag> tag;

        public static GetObjectTaggingResponseBodyTagSet build(java.util.Map<String, ?> map) throws Exception {
            GetObjectTaggingResponseBodyTagSet self = new GetObjectTaggingResponseBodyTagSet();
            return TeaModel.build(map, self);
        }

        public GetObjectTaggingResponseBodyTagSet setTag(java.util.List<Tag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

    }

}
