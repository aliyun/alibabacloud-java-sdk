// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodVerifyContentResponseBody extends TeaModel {
    /**
     * <p>The verification content.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb661*****3a59c31cd91f</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34AB41F1-04A5-4688-634BDBE6****</p>
     */
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
