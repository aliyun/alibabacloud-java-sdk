// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListModelsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The details of the models.</p>
     * <br>
     * <p>For more information, see [Model](~~180898~~).</p>
     */
    @NameInMap("result")
    public java.util.List<java.util.Map<String, ?>> result;

    public static ListModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelsResponseBody self = new ListModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelsResponseBody setResult(java.util.List<java.util.Map<String, ?>> result) {
        this.result = result;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getResult() {
        return this.result;
    }

}
