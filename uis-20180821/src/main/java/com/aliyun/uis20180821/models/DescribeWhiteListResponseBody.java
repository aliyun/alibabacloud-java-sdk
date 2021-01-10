// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Whitelist")
    public String whitelist;

    public static DescribeWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListResponseBody self = new DescribeWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteListResponseBody setWhitelist(String whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public String getWhitelist() {
        return this.whitelist;
    }

}
