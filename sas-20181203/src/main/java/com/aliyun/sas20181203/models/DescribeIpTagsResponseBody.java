// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIpTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
