// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterArgsOptionsResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values: Success and Sysom.ServerError.</p>
     * 
     * <strong>example:</strong>
     * <p>Success  Fail</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result of the parameter retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;instance1&quot;, &quot;instance2&quot;]</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The error message returned when the code is not Success.</p>
     * 
     * <strong>example:</strong>
     * <p>some error msg while fail，“” if success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>return real request id</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static GetGpuClusterArgsOptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterArgsOptionsResponseBody self = new GetGpuClusterArgsOptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterArgsOptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGpuClusterArgsOptionsResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetGpuClusterArgsOptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGpuClusterArgsOptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGpuClusterArgsOptionsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
