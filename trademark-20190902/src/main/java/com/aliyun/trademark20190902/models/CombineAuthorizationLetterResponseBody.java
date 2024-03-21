// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CombineAuthorizationLetterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateCombineUrl")
    public String templateCombineUrl;

    public static CombineAuthorizationLetterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CombineAuthorizationLetterResponseBody self = new CombineAuthorizationLetterResponseBody();
        return TeaModel.build(map, self);
    }

    public CombineAuthorizationLetterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CombineAuthorizationLetterResponseBody setTemplateCombineUrl(String templateCombineUrl) {
        this.templateCombineUrl = templateCombineUrl;
        return this;
    }
    public String getTemplateCombineUrl() {
        return this.templateCombineUrl;
    }

}
