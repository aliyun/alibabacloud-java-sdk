// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsPathMappingResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPolarFsPathMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPolarFsPathMappingResponseBody self = new AddPolarFsPathMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPolarFsPathMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
