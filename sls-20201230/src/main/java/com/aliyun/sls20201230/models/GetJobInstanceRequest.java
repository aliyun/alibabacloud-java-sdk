// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetJobInstanceRequest extends TeaModel {
    /**
     * <p>The owner of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("callerOwner")
    public String callerOwner;

    public static GetJobInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceRequest self = new GetJobInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceRequest setCallerOwner(String callerOwner) {
        this.callerOwner = callerOwner;
        return this;
    }
    public String getCallerOwner() {
        return this.callerOwner;
    }

}
