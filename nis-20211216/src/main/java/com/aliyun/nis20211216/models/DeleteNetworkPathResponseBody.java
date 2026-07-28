// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNetworkPathResponseBody extends TeaModel {
    /**
     * <p>Result of operation.</p>
     * <ul>
     * <li><p><strong>true</strong>: Delete Success.</p>
     * </li>
     * <li><p><strong>false</strong>: Delete Fail.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4331873-C534-590F-A905-F66C53B88A47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteNetworkPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPathResponseBody self = new DeleteNetworkPathResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPathResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteNetworkPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
