// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons_inner20180205.models;

import com.aliyun.tea.*;

public class TagResourcesSystemTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesSystemTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesSystemTagsResponseBody self = new TagResourcesSystemTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesSystemTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
