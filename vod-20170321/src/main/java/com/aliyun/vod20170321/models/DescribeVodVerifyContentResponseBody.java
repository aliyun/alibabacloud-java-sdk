// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodVerifyContentResponseBody extends TeaModel {
    // The verification content.
    @NameInMap("Content")
    public String content;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodVerifyContentResponseBody self = new DescribeVodVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeVodVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
