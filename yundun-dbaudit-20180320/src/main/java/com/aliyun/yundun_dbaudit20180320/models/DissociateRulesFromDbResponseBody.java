// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DissociateRulesFromDbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public DissociateRulesFromDbResponseBodyServerData serverData;

    public static DissociateRulesFromDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateRulesFromDbResponseBody self = new DissociateRulesFromDbResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateRulesFromDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DissociateRulesFromDbResponseBody setServerData(DissociateRulesFromDbResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public DissociateRulesFromDbResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class DissociateRulesFromDbResponseBodyServerData extends TeaModel {
        @NameInMap("JsonResult")
        public String jsonResult;

        public static DissociateRulesFromDbResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            DissociateRulesFromDbResponseBodyServerData self = new DissociateRulesFromDbResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public DissociateRulesFromDbResponseBodyServerData setJsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }
        public String getJsonResult() {
            return this.jsonResult;
        }

    }

}
