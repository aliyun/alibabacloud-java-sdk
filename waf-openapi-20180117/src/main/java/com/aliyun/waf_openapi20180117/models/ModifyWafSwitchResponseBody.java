// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class ModifyWafSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyWafSwitchResponseBodyResult result;

    public static ModifyWafSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWafSwitchResponseBody self = new ModifyWafSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWafSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyWafSwitchResponseBody setResult(ModifyWafSwitchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyWafSwitchResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyWafSwitchResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("WafTaskId")
        public String wafTaskId;

        public static ModifyWafSwitchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyWafSwitchResponseBodyResult self = new ModifyWafSwitchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyWafSwitchResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ModifyWafSwitchResponseBodyResult setWafTaskId(String wafTaskId) {
            this.wafTaskId = wafTaskId;
            return this;
        }
        public String getWafTaskId() {
            return this.wafTaskId;
        }

    }

}
