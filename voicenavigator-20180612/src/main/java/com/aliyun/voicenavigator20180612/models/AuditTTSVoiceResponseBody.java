// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AuditTTSVoiceResponseBody extends TeaModel {
    @NameInMap("AuditionUrl")
    public String auditionUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static AuditTTSVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuditTTSVoiceResponseBody self = new AuditTTSVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AuditTTSVoiceResponseBody setAuditionUrl(String auditionUrl) {
        this.auditionUrl = auditionUrl;
        return this;
    }
    public String getAuditionUrl() {
        return this.auditionUrl;
    }

    public AuditTTSVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
