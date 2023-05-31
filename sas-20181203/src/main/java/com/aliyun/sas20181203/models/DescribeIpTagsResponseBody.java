// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIpTagsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tags that are added to the IP address.</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static DescribeIpTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTagsResponseBody self = new DescribeIpTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpTagsResponseBody setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
