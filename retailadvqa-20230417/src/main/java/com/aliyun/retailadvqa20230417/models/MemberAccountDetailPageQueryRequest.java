// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberAccountDetailPageQueryRequest extends TeaModel {
    @NameInMap("body")
    public MemberAccountDetailPageQueryRequestBody body;

    public static MemberAccountDetailPageQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberAccountDetailPageQueryRequest self = new MemberAccountDetailPageQueryRequest();
        return TeaModel.build(map, self);
    }

    public MemberAccountDetailPageQueryRequest setBody(MemberAccountDetailPageQueryRequestBody body) {
        this.body = body;
        return this;
    }
    public MemberAccountDetailPageQueryRequestBody getBody() {
        return this.body;
    }

    public static class MemberAccountDetailPageQueryRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AccountType")
        public Integer accountType;

        /**
         * <strong>example:</strong>
         * <p>2011-09-02 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>750cff00c3e0996d220ac2861dafdfadsf</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WMS_36606164948078_23218019</p>
         */
        @NameInMap("OuterMemberId")
        public String outerMemberId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PlatFormType")
        public String platFormType;

        /**
         * <strong>example:</strong>
         * <p>2011-09-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static MemberAccountDetailPageQueryRequestBody build(java.util.Map<String, ?> map) throws Exception {
            MemberAccountDetailPageQueryRequestBody self = new MemberAccountDetailPageQueryRequestBody();
            return TeaModel.build(map, self);
        }

        public MemberAccountDetailPageQueryRequestBody setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public MemberAccountDetailPageQueryRequestBody setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public MemberAccountDetailPageQueryRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public MemberAccountDetailPageQueryRequestBody setOuterMemberId(String outerMemberId) {
            this.outerMemberId = outerMemberId;
            return this;
        }
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        public MemberAccountDetailPageQueryRequestBody setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public MemberAccountDetailPageQueryRequestBody setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public MemberAccountDetailPageQueryRequestBody setPlatFormType(String platFormType) {
            this.platFormType = platFormType;
            return this;
        }
        public String getPlatFormType() {
            return this.platFormType;
        }

        public MemberAccountDetailPageQueryRequestBody setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
