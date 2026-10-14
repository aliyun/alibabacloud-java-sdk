// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetListGpuClusterResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values: Success and Sysom.ACKClusterNotFound.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of clusters returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cluster1&quot;, &quot;cluster2&quot;]</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The error message returned when the code is not Success.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of clusters returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static GetListGpuClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListGpuClusterResponseBody self = new GetListGpuClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListGpuClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetListGpuClusterResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetListGpuClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetListGpuClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListGpuClusterResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
