// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateCertAndKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateCertAndKeyResponseBodyResult result;

    public static CreateCertAndKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCertAndKeyResponseBody self = new CreateCertAndKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCertAndKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCertAndKeyResponseBody setResult(CreateCertAndKeyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCertAndKeyResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateCertAndKeyResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static CreateCertAndKeyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCertAndKeyResponseBodyResult self = new CreateCertAndKeyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCertAndKeyResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateCertAndKeyResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
