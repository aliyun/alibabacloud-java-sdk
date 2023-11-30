// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    /**
     * <p>The information about the tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<ImageTag> tags;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setTags(java.util.List<ImageTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ImageTag> getTags() {
        return this.tags;
    }

}
