// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SaveRecordingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SaveRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveRecordingResponseBody self = new SaveRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
