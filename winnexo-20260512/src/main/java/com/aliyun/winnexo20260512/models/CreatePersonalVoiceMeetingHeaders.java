// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalVoiceMeetingHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>Id of the request</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0B6F0F99-EB17-51D5-AAC8-AD78A26E18DD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePersonalVoiceMeetingHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalVoiceMeetingHeaders self = new CreatePersonalVoiceMeetingHeaders();
        return TeaModel.build(map, self);
    }

    public CreatePersonalVoiceMeetingHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreatePersonalVoiceMeetingHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
