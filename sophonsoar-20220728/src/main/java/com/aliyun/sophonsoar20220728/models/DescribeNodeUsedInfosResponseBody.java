// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNodeUsedInfosResponseBody extends TeaModel {
    /**
     * <p>The node reference information. The value is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **action**: the referencing action. This field contains the following information:</p>
     * <br>
     * <p>    *   **name**: the name of the referencing node.</p>
     * <p>    *   **inputParams**: the parameter settings of the referencing node.</p>
     */
    @NameInMap("NodeUsedInfos")
    public String nodeUsedInfos;

    /**
     * <p>The request ID.</p>
     */
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
