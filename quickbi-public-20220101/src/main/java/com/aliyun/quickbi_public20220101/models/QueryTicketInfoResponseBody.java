// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryTicketInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryTicketInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>a27a9aec-<strong><strong>-</strong></strong>-bd40-1a21ea41d7c5</p>
         */
        @NameInMap("AccessTicket")
        public String accessTicket;

        /**
         * <strong>example:</strong>
         * <p>sfdgsds-<strong><strong>-</strong></strong>-a608-mghdgd</p>
         */
        @NameInMap("CmptId")
        public String cmptId;

        @NameInMap("GlobalParam")
        public String globalParam;

        /**
         * <strong>example:</strong>
         * <p>2022-01-30 03:03:49</p>
         */
        @NameInMap("InvalidTime")
        public String invalidTime;

        /**
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("MaxTicketNum")
        public Integer maxTicketNum;

        /**
         * <strong>example:</strong>
         * <p>2fe4fbd8-<strong><strong>-</strong></strong>-b3e1-e92c7af083ea</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>2022-01-09 22:23:49</p>
         */
        @NameInMap("RegisterTime")
        public String registerTime;

        /**
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("UsedTicketNum")
        public Integer usedTicketNum;

        /**
         * <strong>example:</strong>
         * <p>974e50**********9033f46</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("WatermarkParam")
        public String watermarkParam;

        /**
         * <strong>example:</strong>
         * <p>ccd3428c-<strong><strong>-</strong></strong>-a608-26bae29dffee</p>
         */
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
