// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppCallbackSecretKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a656b296a30xxxxxxxxxx1cd4</p>
     */
    @NameInMap("CallbackSecretKey")
    public String callbackSecretKey;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppCallbackSecretKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppCallbackSecretKeyResponseBody self = new DescribeAppCallbackSecretKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppCallbackSecretKeyResponseBody setCallbackSecretKey(String callbackSecretKey) {
        this.callbackSecretKey = callbackSecretKey;
        return this;
    }
    public String getCallbackSecretKey() {
        return this.callbackSecretKey;
    }

    public DescribeAppCallbackSecretKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
