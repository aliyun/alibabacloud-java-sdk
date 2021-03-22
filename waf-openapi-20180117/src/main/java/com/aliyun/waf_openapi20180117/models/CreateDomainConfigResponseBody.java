// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateDomainConfigResponseBodyResult result;

    public static CreateDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainConfigResponseBody self = new CreateDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDomainConfigResponseBody setResult(CreateDomainConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateDomainConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateDomainConfigResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static CreateDomainConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainConfigResponseBodyResult self = new CreateDomainConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateDomainConfigResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateDomainConfigResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
