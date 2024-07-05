// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the snapshot template. You can call the <a href="https://help.aliyun.com/document_detail/72213.html">SubmitSnapshotJob</a> operation to submit snapshot jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>f5b228fe6930e*****0d6bf55bd87789</p>
     */
    @NameInMap("VodTemplateId")
    public String vodTemplateId;

    public static AddVodTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateResponseBody self = new AddVodTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVodTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddVodTemplateResponseBody setVodTemplateId(String vodTemplateId) {
        this.vodTemplateId = vodTemplateId;
        return this;
    }
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

}
