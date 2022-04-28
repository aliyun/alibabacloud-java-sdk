// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class VerifyScdnDomainOwnerResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyScdnDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyScdnDomainOwnerResponseBody self = new VerifyScdnDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyScdnDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public VerifyScdnDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
