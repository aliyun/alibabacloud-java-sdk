// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DiagnoseSmartAccessGatewayResponseBody extends TeaModel {
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
