// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetEditingProjectMaterialsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>746FFA07-8BBB-46*****B1-3E94E3B2915E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetEditingProjectMaterialsResponseBody self = new SetEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
