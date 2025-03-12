// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteRenderingInstanceSettingsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRenderingInstanceSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRenderingInstanceSettingsResponseBody self = new DeleteRenderingInstanceSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRenderingInstanceSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
