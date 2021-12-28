// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

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
