// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKeyLastUsed")
    @Validation(required = true)
    public GetAccessKeyLastUsedResponseAccessKeyLastUsed accessKeyLastUsed;

    public static GetAccessKeyLastUsedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResponse self = new GetAccessKeyLastUsedResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAccessKeyLastUsedResponseAccessKeyLastUsed extends TeaModel {
        @NameInMap("LastUsedDate")
        @Validation(required = true)
        public String lastUsedDate;

        public static GetAccessKeyLastUsedResponseAccessKeyLastUsed build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedResponseAccessKeyLastUsed self = new GetAccessKeyLastUsedResponseAccessKeyLastUsed();
            return TeaModel.build(map, self);
        }

    }

}
