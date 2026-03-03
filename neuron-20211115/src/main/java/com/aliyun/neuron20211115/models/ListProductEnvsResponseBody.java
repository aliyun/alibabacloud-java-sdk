// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListProductEnvsResponseBody extends TeaModel {
    @NameInMap("envList")
    public java.util.List<String> envList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProductEnvsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvsResponseBody self = new ListProductEnvsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductEnvsResponseBody setEnvList(java.util.List<String> envList) {
        this.envList = envList;
        return this;
    }
    public java.util.List<String> getEnvList() {
        return this.envList;
    }

    public ListProductEnvsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
