// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnVerifyContentResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnVerifyContentResponseBody self = new DescribeScdnVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeScdnVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
