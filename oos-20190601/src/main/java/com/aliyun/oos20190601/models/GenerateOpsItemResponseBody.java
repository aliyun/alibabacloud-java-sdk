// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateOpsItemResponseBody extends TeaModel {
    /**
     * <p>The O\&amp;M item list.</p>
     */
    @NameInMap("OpsItemIds")
    public java.util.List<String> opsItemIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DA4F08D4-DA54-5407-84B9-108C71D75B17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateOpsItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateOpsItemResponseBody self = new GenerateOpsItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateOpsItemResponseBody setOpsItemIds(java.util.List<String> opsItemIds) {
        this.opsItemIds = opsItemIds;
        return this;
    }
    public java.util.List<String> getOpsItemIds() {
        return this.opsItemIds;
    }

    public GenerateOpsItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
