// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeletePatchBaselineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85197066-0209-5775-BBED-99DF9DA44E48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePatchBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePatchBaselineResponseBody self = new DeletePatchBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePatchBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
