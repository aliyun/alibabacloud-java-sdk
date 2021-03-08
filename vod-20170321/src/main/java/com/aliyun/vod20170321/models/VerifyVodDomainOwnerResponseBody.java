// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class VerifyVodDomainOwnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static VerifyVodDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyVodDomainOwnerResponseBody self = new VerifyVodDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyVodDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyVodDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
