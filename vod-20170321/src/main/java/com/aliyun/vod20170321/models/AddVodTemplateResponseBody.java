// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the snapshot template. You can call the [SubmitSnapshotJob](~~72213~~) operation to take snapshots.</p>
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
