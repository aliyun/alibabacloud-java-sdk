// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProtectedId")
    public String protectedId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest self = new GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest setProtectedId(String protectedId) {
        this.protectedId = protectedId;
        return this;
    }
    public String getProtectedId() {
        return this.protectedId;
    }

    public GetLinkeantcodeAntcodeGetsingleprotectedbranchorwildcardprotectedbranchRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
