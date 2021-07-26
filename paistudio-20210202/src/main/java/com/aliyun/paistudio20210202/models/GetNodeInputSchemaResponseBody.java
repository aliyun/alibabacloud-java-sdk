// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetNodeInputSchemaResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ColNames")
    public java.util.List<String> colNames;

    @NameInMap("ColTypes")
    public java.util.List<String> colTypes;

    public static GetNodeInputSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeInputSchemaResponseBody self = new GetNodeInputSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeInputSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeInputSchemaResponseBody setColNames(java.util.List<String> colNames) {
        this.colNames = colNames;
        return this;
    }
    public java.util.List<String> getColNames() {
        return this.colNames;
    }

    public GetNodeInputSchemaResponseBody setColTypes(java.util.List<String> colTypes) {
        this.colTypes = colTypes;
        return this;
    }
    public java.util.List<String> getColTypes() {
        return this.colTypes;
    }

}
