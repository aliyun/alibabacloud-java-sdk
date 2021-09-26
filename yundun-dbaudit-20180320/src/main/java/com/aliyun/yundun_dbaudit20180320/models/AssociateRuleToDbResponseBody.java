// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class AssociateRuleToDbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public AssociateRuleToDbResponseBodyServerData serverData;

    public static AssociateRuleToDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateRuleToDbResponseBody self = new AssociateRuleToDbResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateRuleToDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateRuleToDbResponseBody setServerData(AssociateRuleToDbResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public AssociateRuleToDbResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class AssociateRuleToDbResponseBodyServerData extends TeaModel {
        @NameInMap("JsonResult")
        public String jsonResult;

        public static AssociateRuleToDbResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            AssociateRuleToDbResponseBodyServerData self = new AssociateRuleToDbResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public AssociateRuleToDbResponseBodyServerData setJsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }
        public String getJsonResult() {
            return this.jsonResult;
        }

    }

}
