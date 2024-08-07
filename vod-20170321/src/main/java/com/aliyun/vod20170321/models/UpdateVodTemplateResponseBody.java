// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVodTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the snapshot template.</p>
     * 
     * <strong>example:</strong>
     * <p>8c75a02e339b*****0b0d2c48171a22</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static UpdateVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVodTemplateResponseBody self = new UpdateVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
