// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutLogStoreConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PutLogStoreConfigRequestBody body;

    public static PutLogStoreConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLogStoreConfigRequest self = new PutLogStoreConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutLogStoreConfigRequest setBody(PutLogStoreConfigRequestBody body) {
        this.body = body;
        return this;
    }
    public PutLogStoreConfigRequestBody getBody() {
        return this.body;
    }

    public static class PutLogStoreConfigRequestBody extends TeaModel {
        @NameInMap("clientIpHeaders")
        public java.util.List<String> clientIpHeaders;

        public static PutLogStoreConfigRequestBody build(java.util.Map<String, ?> map) throws Exception {
            PutLogStoreConfigRequestBody self = new PutLogStoreConfigRequestBody();
            return TeaModel.build(map, self);
        }

        public PutLogStoreConfigRequestBody setClientIpHeaders(java.util.List<String> clientIpHeaders) {
            this.clientIpHeaders = clientIpHeaders;
            return this;
        }
        public java.util.List<String> getClientIpHeaders() {
            return this.clientIpHeaders;
        }

    }

}
