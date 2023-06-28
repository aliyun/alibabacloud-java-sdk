// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddTagsResponseBody extends TeaModel {
    /**
     * <p># Limits</p>
     * <br>
     * <p>Before you call this API, note the following limits:</p>
     * <br>
     * <p>*   You can add up to 10 tags to each SLB instance.</p>
     * <p>*   You can add up to five pairs of tags at a time.</p>
     * <p>*   All the tags and keys added to an SLB instance must be unique.</p>
     * <p>*   If you add a tag of which the key is the same as that of an existing tag, but the value is different, the new tag overwrites the existing one.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTagsResponseBody self = new AddTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
