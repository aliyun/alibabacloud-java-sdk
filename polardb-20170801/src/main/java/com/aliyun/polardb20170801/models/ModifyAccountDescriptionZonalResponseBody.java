// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountDescriptionZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionZonalResponseBody self = new ModifyAccountDescriptionZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
