// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanDetailResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <p>body</p>
     */
    @NameInMap("data")
    public GetUrgentDemandPlanDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>msg</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>1e2b798516402440016572132e1459</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static GetUrgentDemandPlanDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanDetailResponseBody self = new GetUrgentDemandPlanDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetUrgentDemandPlanDetailResponseBody setData(GetUrgentDemandPlanDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUrgentDemandPlanDetailResponseBodyData getData() {
        return this.data;
    }

    public GetUrgentDemandPlanDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUrgentDemandPlanDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUrgentDemandPlanDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetUrgentDemandPlanDetailResponseBodyData extends TeaModel {
        @NameInMap("accountDept")
        public String accountDept;

        /**
         * <strong>example:</strong>
         * <p>1065737167271819</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>larus_prd</p>
         */
        @NameInMap("accountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxx">https://xxxxx</a></p>
         */
        @NameInMap("approvalUrl")
        public String approvalUrl;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("bpmSubstate")
        public java.util.Map<String, ?> bpmSubstate;

        @NameInMap("commodityTypeCodeList")
        public java.util.List<String> commodityTypeCodeList;

        /**
         * <strong>example:</strong>
         * <p>262940</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>URGENT</p>
         */
        @NameInMap("detailType")
        public String detailType;

        /**
         * <strong>example:</strong>
         * <p>2021-12-17 16:53:21</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-12-17 16:53:21</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>262940</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("modifierName")
        public String modifierName;

        /**
         * <strong>example:</strong>
         * <p>11223</p>
         */
        @NameInMap("planId")
        public Long planId;

        @NameInMap("planName")
        public String planName;

        /**
         * <strong>example:</strong>
         * <p>220</p>
         */
        @NameInMap("status")
        public Long status;

        @NameInMap("yunzhiProductName")
        public String yunzhiProductName;

        public static GetUrgentDemandPlanDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandPlanDetailResponseBodyData self = new GetUrgentDemandPlanDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandPlanDetailResponseBodyData setAccountDept(String accountDept) {
            this.accountDept = accountDept;
            return this;
        }
        public String getAccountDept() {
            return this.accountDept;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setApprovalUrl(String approvalUrl) {
            this.approvalUrl = approvalUrl;
            return this;
        }
        public String getApprovalUrl() {
            return this.approvalUrl;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setBpmSubstate(java.util.Map<String, ?> bpmSubstate) {
            this.bpmSubstate = bpmSubstate;
            return this;
        }
        public java.util.Map<String, ?> getBpmSubstate() {
            return this.bpmSubstate;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setCommodityTypeCodeList(java.util.List<String> commodityTypeCodeList) {
            this.commodityTypeCodeList = commodityTypeCodeList;
            return this;
        }
        public java.util.List<String> getCommodityTypeCodeList() {
            return this.commodityTypeCodeList;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setDetailType(String detailType) {
            this.detailType = detailType;
            return this;
        }
        public String getDetailType() {
            return this.detailType;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetUrgentDemandPlanDetailResponseBodyData setYunzhiProductName(String yunzhiProductName) {
            this.yunzhiProductName = yunzhiProductName;
            return this;
        }
        public String getYunzhiProductName() {
            return this.yunzhiProductName;
        }

    }

}
