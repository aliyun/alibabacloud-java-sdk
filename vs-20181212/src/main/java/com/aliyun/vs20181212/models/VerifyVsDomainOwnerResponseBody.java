// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class VerifyVsDomainOwnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413a59c32c****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyVsDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyVsDomainOwnerResponseBody self = new VerifyVsDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyVsDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public VerifyVsDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
