// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUserkeyskeyidRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeUserkeyskeyidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUserkeyskeyidRequest self = new QueryLinkeantcodeAntcodeUserkeyskeyidRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUserkeyskeyidRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public QueryLinkeantcodeAntcodeUserkeyskeyidRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
