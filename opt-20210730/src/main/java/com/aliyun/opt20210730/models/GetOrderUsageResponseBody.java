// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730.models;

import com.aliyun.tea.*;

public class GetOrderUsageResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5D6653C5-CA2B-14EC-9CF0-50AA0FF49C31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetOrderUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderUsageResponseBody self = new GetOrderUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderUsageResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public GetOrderUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOrderUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOrderUsageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
