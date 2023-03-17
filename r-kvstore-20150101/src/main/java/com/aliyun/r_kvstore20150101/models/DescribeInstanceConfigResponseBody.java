// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The parameters of the instance. For more information, see [Parameter overview and configuration guide](~~43885~~).</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigResponseBody self = new DescribeInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
