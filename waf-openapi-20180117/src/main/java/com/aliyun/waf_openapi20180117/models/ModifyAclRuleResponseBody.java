// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyAclRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyAclRuleResponseBodyResult result;

    public static ModifyAclRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAclRuleResponseBody self = new ModifyAclRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAclRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAclRuleResponseBody setResult(ModifyAclRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyAclRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyAclRuleResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static ModifyAclRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyAclRuleResponseBodyResult self = new ModifyAclRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyAclRuleResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ModifyAclRuleResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
