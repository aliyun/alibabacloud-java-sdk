// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectMaterialsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>746FFA07-8BBB-46*****B1-3E94E3B2915E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectMaterialsResponseBody self = new DeleteEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
