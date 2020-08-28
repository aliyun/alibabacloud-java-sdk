// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateCorpResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    public static CreateCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCorpResponse self = new CreateCorpResponse();
        return TeaModel.build(map, self);
    }

}
