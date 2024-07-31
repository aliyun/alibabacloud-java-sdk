// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class AllocatePublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The public endpoint that is assigned to the Simple Database Service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>db-38263fa955774501a2ae1bdaed6f****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("PublicConnection")
    public String publicConnection;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocatePublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicConnectionResponseBody self = new AllocatePublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocatePublicConnectionResponseBody setPublicConnection(String publicConnection) {
        this.publicConnection = publicConnection;
        return this;
    }
    public String getPublicConnection() {
        return this.publicConnection;
    }

    public AllocatePublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
