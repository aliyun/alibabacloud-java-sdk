// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiagnoseSmartAccessGatewayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>193AE392-76C2-4D3E-9420-889A51B43CC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DiagnoseSmartAccessGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseSmartAccessGatewayResponseBody self = new DiagnoseSmartAccessGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DiagnoseSmartAccessGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
