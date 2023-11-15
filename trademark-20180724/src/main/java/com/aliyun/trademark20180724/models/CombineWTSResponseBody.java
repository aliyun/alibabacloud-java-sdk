// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CombineWTSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateCombineUrl")
    public String templateCombineUrl;

    public static CombineWTSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CombineWTSResponseBody self = new CombineWTSResponseBody();
        return TeaModel.build(map, self);
    }

    public CombineWTSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CombineWTSResponseBody setTemplateCombineUrl(String templateCombineUrl) {
        this.templateCombineUrl = templateCombineUrl;
        return this;
    }
    public String getTemplateCombineUrl() {
        return this.templateCombineUrl;
    }

}
