// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DeleteDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteDomainConfigResponseBodyResult result;

    public static DeleteDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainConfigResponseBody self = new DeleteDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDomainConfigResponseBody setResult(DeleteDomainConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteDomainConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteDomainConfigResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static DeleteDomainConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteDomainConfigResponseBodyResult self = new DeleteDomainConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteDomainConfigResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DeleteDomainConfigResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
