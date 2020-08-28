// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapiutils20200401.models;

import com.aliyun.tea.*;

public class GetOssStsTokenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetOssStsTokenResponseData data;

    public static GetOssStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssStsTokenResponse self = new GetOssStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public static class GetOssStsTokenResponseData extends TeaModel {
        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("SecurityToken")
        @Validation(required = true)
        public String securityToken;

        @NameInMap("Script")
        @Validation(required = true)
        public String script;

        public static GetOssStsTokenResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetOssStsTokenResponseData self = new GetOssStsTokenResponseData();
            return TeaModel.build(map, self);
        }

    }

}
