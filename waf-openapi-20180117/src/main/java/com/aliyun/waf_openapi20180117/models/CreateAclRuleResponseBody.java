// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class CreateAclRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAclRuleResponseBodyResult result;

    public static CreateAclRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAclRuleResponseBody self = new CreateAclRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAclRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAclRuleResponseBody setResult(CreateAclRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAclRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAclRuleResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static CreateAclRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAclRuleResponseBodyResult self = new CreateAclRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAclRuleResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateAclRuleResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
