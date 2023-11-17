// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentListResponseBody extends TeaModel {
    @NameInMap("Components")
    public String components;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentListResponseBody self = new DescribeComponentListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentListResponseBody setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

    public DescribeComponentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
