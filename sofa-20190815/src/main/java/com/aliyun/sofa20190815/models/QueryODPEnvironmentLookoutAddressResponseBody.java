// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentLookoutAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public String data;

    public static QueryODPEnvironmentLookoutAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentLookoutAddressResponseBody self = new QueryODPEnvironmentLookoutAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentLookoutAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPEnvironmentLookoutAddressResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPEnvironmentLookoutAddressResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPEnvironmentLookoutAddressResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
