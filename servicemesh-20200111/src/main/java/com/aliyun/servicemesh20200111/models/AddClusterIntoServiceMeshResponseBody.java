// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD65C0AD-D3C6-48D3-8D93-38D2015C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddClusterIntoServiceMeshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddClusterIntoServiceMeshResponseBody self = new AddClusterIntoServiceMeshResponseBody();
        return TeaModel.build(map, self);
    }

    public AddClusterIntoServiceMeshResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddClusterIntoServiceMeshResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddClusterIntoServiceMeshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
