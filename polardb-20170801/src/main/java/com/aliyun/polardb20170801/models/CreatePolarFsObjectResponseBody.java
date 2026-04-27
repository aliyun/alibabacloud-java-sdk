// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarFsObjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>pfs-test****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolarFsObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarFsObjectResponseBody self = new CreatePolarFsObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarFsObjectResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreatePolarFsObjectResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public CreatePolarFsObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
