// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class MovePolarFsObjectsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MovePolarFsObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MovePolarFsObjectsResponseBody self = new MovePolarFsObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public MovePolarFsObjectsResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public MovePolarFsObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
