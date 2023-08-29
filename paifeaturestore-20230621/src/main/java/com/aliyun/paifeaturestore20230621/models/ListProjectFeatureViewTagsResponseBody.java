// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectFeatureViewTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static ListProjectFeatureViewTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFeatureViewTagsResponseBody self = new ListProjectFeatureViewTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectFeatureViewTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectFeatureViewTagsResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
