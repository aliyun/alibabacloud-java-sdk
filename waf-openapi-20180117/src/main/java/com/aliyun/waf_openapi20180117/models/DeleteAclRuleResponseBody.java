// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DeleteAclRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteAclRuleResponseBodyResult result;

    public static DeleteAclRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclRuleResponseBody self = new DeleteAclRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAclRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAclRuleResponseBody setResult(DeleteAclRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteAclRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteAclRuleResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static DeleteAclRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAclRuleResponseBodyResult self = new DeleteAclRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteAclRuleResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DeleteAclRuleResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
