// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class VerifyVodDomainOwnerResponseBody extends TeaModel {
    /**
     * <p>The verification content.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb661*********a59c32cd91f</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyVodDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyVodDomainOwnerResponseBody self = new VerifyVodDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyVodDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public VerifyVodDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
