// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeUsedInfosResponseBody extends TeaModel {
    @NameInMap("NodeUsedInfos")
    public String nodeUsedInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNodeUsedInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeUsedInfosResponseBody self = new DescribeNodeUsedInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeUsedInfosResponseBody setNodeUsedInfos(String nodeUsedInfos) {
        this.nodeUsedInfos = nodeUsedInfos;
        return this;
    }
    public String getNodeUsedInfos() {
        return this.nodeUsedInfos;
    }

    public DescribeNodeUsedInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
