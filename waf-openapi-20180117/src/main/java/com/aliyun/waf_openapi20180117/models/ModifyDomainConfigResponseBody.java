// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyDomainConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyDomainConfigResponseBodyResult result;

    public static ModifyDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainConfigResponseBody self = new ModifyDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDomainConfigResponseBody setResult(ModifyDomainConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyDomainConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyDomainConfigResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static ModifyDomainConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainConfigResponseBodyResult self = new ModifyDomainConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyDomainConfigResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ModifyDomainConfigResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
