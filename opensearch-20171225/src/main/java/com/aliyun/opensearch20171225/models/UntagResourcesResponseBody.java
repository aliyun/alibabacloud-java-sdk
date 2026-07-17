// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UntagResourcesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1-B-2-V</p>
     */
    @NameInMap("tequestId")
    public String tequestId;

    public static UntagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesResponseBody self = new UntagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagResourcesResponseBody setTequestId(String tequestId) {
        this.tequestId = tequestId;
        return this;
    }
    public String getTequestId() {
        return this.tequestId;
    }

}
