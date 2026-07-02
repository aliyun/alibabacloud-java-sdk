// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalDistributeCacheResponseBody extends TeaModel {
    /**
     * <p>The ID of the distributed instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gr-8vbzg1y6m****t38p</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>r-8vb6ffc5****4ec4</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E681E498-5A0D-44F2-B1A7-912DC3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGlobalDistributeCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDistributeCacheResponseBody self = new CreateGlobalDistributeCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDistributeCacheResponseBody setGlobalInstanceId(String globalInstanceId) {
        this.globalInstanceId = globalInstanceId;
        return this;
    }
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    public CreateGlobalDistributeCacheResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGlobalDistributeCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
