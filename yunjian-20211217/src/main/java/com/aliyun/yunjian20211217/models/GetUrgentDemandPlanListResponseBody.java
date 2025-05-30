// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public GetUrgentDemandPlanListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>msg</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2127968716405850615204514e9332</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static GetUrgentDemandPlanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanListResponseBody self = new GetUrgentDemandPlanListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetUrgentDemandPlanListResponseBody setData(GetUrgentDemandPlanListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUrgentDemandPlanListResponseBodyData getData() {
        return this.data;
    }

    public GetUrgentDemandPlanListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUrgentDemandPlanListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUrgentDemandPlanListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetUrgentDemandPlanListResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1705524002740212</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("accountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("accountType")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("approvalUrl")
        public String approvalUrl;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2021-12-20 10:29:50</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2021-12-20 10:29:50</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("modifierName")
        public String modifierName;

        @NameInMap("planId")
        public Long planId;

        @NameInMap("planName")
        public String planName;

        @NameInMap("status")
        public Long status;

        public static GetUrgentDemandPlanListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandPlanListResponseBodyDataRecords self = new GetUrgentDemandPlanListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setApprovalUrl(String approvalUrl) {
            this.approvalUrl = approvalUrl;
            return this;
        }
        public String getApprovalUrl() {
            return this.approvalUrl;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public GetUrgentDemandPlanListResponseBodyDataRecords setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class GetUrgentDemandPlanListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("current")
        public Long current;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pages")
        public Long pages;

        @NameInMap("records")
        public java.util.List<GetUrgentDemandPlanListResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("total")
        public Long total;

        public static GetUrgentDemandPlanListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUrgentDemandPlanListResponseBodyData self = new GetUrgentDemandPlanListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUrgentDemandPlanListResponseBodyData setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public GetUrgentDemandPlanListResponseBodyData setPages(Long pages) {
            this.pages = pages;
            return this;
        }
        public Long getPages() {
            return this.pages;
        }

        public GetUrgentDemandPlanListResponseBodyData setRecords(java.util.List<GetUrgentDemandPlanListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetUrgentDemandPlanListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetUrgentDemandPlanListResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetUrgentDemandPlanListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
