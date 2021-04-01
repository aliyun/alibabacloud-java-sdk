// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class CreateAssetCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CredentialName")
    public String credentialName;

    public static CreateAssetCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetCredentialResponseBody self = new CreateAssetCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAssetCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAssetCredentialResponseBody setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

}
