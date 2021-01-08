// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetJoinCodeRequest extends TeaModel {
    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    public static GetJoinCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJoinCodeRequest self = new GetJoinCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetJoinCodeRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

}
