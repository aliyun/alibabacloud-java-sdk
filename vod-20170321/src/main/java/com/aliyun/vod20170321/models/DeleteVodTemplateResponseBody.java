// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodTemplateResponseBody extends TeaModel {
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
     * <p>f5b228fe6930e*****d6bf55bd87789</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static DeleteVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodTemplateResponseBody self = new DeleteVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
