// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSqlRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerData")
    public CreateSqlRuleResponseBodyServerData serverData;

    public static CreateSqlRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlRuleResponseBody self = new CreateSqlRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSqlRuleResponseBody setServerData(CreateSqlRuleResponseBodyServerData serverData) {
        this.serverData = serverData;
        return this;
    }
    public CreateSqlRuleResponseBodyServerData getServerData() {
        return this.serverData;
    }

    public static class CreateSqlRuleResponseBodyServerData extends TeaModel {
        @NameInMap("JsonResult")
        public String jsonResult;

        public static CreateSqlRuleResponseBodyServerData build(java.util.Map<String, ?> map) throws Exception {
            CreateSqlRuleResponseBodyServerData self = new CreateSqlRuleResponseBodyServerData();
            return TeaModel.build(map, self);
        }

        public CreateSqlRuleResponseBodyServerData setJsonResult(String jsonResult) {
            this.jsonResult = jsonResult;
            return this;
        }
        public String getJsonResult() {
            return this.jsonResult;
        }

    }

}
