// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryTicketInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryTicketInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTicketInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketInfoResponseBody self = new QueryTicketInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTicketInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTicketInfoResponseBody setResult(QueryTicketInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryTicketInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryTicketInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTicketInfoResponseBodyResult extends TeaModel {
        @NameInMap("AccessTicket")
        public String accessTicket;

        @NameInMap("CmptId")
        public String cmptId;

        @NameInMap("GlobalParam")
        public String globalParam;

        @NameInMap("InvalidTime")
        public String invalidTime;

        @NameInMap("MaxTicketNum")
        public Integer maxTicketNum;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("RegisterTime")
        public String registerTime;

        @NameInMap("UsedTicketNum")
        public Integer usedTicketNum;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WatermarkParam")
        public String watermarkParam;

        @NameInMap("WorksId")
        public String worksId;

        public static QueryTicketInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTicketInfoResponseBodyResult self = new QueryTicketInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryTicketInfoResponseBodyResult setAccessTicket(String accessTicket) {
            this.accessTicket = accessTicket;
            return this;
        }
        public String getAccessTicket() {
            return this.accessTicket;
        }

        public QueryTicketInfoResponseBodyResult setCmptId(String cmptId) {
            this.cmptId = cmptId;
            return this;
        }
        public String getCmptId() {
            return this.cmptId;
        }

        public QueryTicketInfoResponseBodyResult setGlobalParam(String globalParam) {
            this.globalParam = globalParam;
            return this;
        }
        public String getGlobalParam() {
            return this.globalParam;
        }

        public QueryTicketInfoResponseBodyResult setInvalidTime(String invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }
        public String getInvalidTime() {
            return this.invalidTime;
        }

        public QueryTicketInfoResponseBodyResult setMaxTicketNum(Integer maxTicketNum) {
            this.maxTicketNum = maxTicketNum;
            return this;
        }
        public Integer getMaxTicketNum() {
            return this.maxTicketNum;
        }

        public QueryTicketInfoResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public QueryTicketInfoResponseBodyResult setRegisterTime(String registerTime) {
            this.registerTime = registerTime;
            return this;
        }
        public String getRegisterTime() {
            return this.registerTime;
        }

        public QueryTicketInfoResponseBodyResult setUsedTicketNum(Integer usedTicketNum) {
            this.usedTicketNum = usedTicketNum;
            return this;
        }
        public Integer getUsedTicketNum() {
            return this.usedTicketNum;
        }

        public QueryTicketInfoResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryTicketInfoResponseBodyResult setWatermarkParam(String watermarkParam) {
            this.watermarkParam = watermarkParam;
            return this;
        }
        public String getWatermarkParam() {
            return this.watermarkParam;
        }

        public QueryTicketInfoResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

    }

}
