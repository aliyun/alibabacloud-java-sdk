// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AuditTTSVoiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://voicenavigator-cn-shanghai.oss-cn-shanghai.aliyuncs.com/exported_files/2020-02-20/ttsConfig-1582188148528-abd8e407de0a49b381bb591bd91fc073.wav?Expires=1582188208&OSSAccessKeyId=LTAIppQY5rofntVJ&Signature=FaBassElzqGEB0H2TvTKPJsOJHs%3D">http://voicenavigator-cn-shanghai.oss-cn-shanghai.aliyuncs.com/exported_files/2020-02-20/ttsConfig-1582188148528-abd8e407de0a49b381bb591bd91fc073.wav?Expires=1582188208&amp;OSSAccessKeyId=LTAIppQY5rofntVJ&amp;Signature=FaBassElzqGEB0H2TvTKPJsOJHs%3D</a></p>
     */
    @NameInMap("AuditionUrl")
    public String auditionUrl;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
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
