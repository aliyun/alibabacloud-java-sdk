// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsVerifyContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413a59c3*****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsVerifyContentResponseBody self = new DescribeVsVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeVsVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
