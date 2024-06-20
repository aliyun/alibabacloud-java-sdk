// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppKeyResponseBody extends TeaModel {
    /**
     * <p>AppKey。</p>
     * 
     * <strong>example:</strong>
     * <p>ba133b2cee4ab9be424674892c33****</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <p>154EF5DE-3D08-1F2C-A482-281F78D74B7C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppKeyResponseBody self = new DescribeAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppKeyResponseBody setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
