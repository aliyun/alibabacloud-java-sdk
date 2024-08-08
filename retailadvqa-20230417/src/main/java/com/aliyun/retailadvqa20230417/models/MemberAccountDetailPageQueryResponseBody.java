// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberAccountDetailPageQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<MemberAccountDetailPageQueryResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Lydaas.QuickMember.SystemError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1DEFC4F1-AF11-5A3C-93B9-2880768DA218</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static MemberAccountDetailPageQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MemberAccountDetailPageQueryResponseBody self = new MemberAccountDetailPageQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MemberAccountDetailPageQueryResponseBody setData(java.util.List<MemberAccountDetailPageQueryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MemberAccountDetailPageQueryResponseBodyData> getData() {
        return this.data;
    }

    public MemberAccountDetailPageQueryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MemberAccountDetailPageQueryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MemberAccountDetailPageQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MemberAccountDetailPageQueryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public MemberAccountDetailPageQueryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class MemberAccountDetailPageQueryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AccountBalance")
        public String accountBalance;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AccountType")
        public Integer accountType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ActivityType")
        public String activityType;

        @NameInMap("ChannelCode")
        public String channelCode;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DetailValue")
        public String detailValue;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>...</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>750cff00c3e0996d220ac2861dafdfadsf</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <strong>example:</strong>
         * <p>MEMBER_fc498a12edd84dafd</p>
         */
        @NameInMap("OuterMemberId")
        public String outerMemberId;

        /**
         * <strong>example:</strong>
         * <p>...</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static MemberAccountDetailPageQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MemberAccountDetailPageQueryResponseBodyData self = new MemberAccountDetailPageQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MemberAccountDetailPageQueryResponseBodyData setAccountBalance(String accountBalance) {
            this.accountBalance = accountBalance;
            return this;
        }
        public String getAccountBalance() {
            return this.accountBalance;
        }

        public MemberAccountDetailPageQueryResponseBodyData setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public MemberAccountDetailPageQueryResponseBodyData setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public MemberAccountDetailPageQueryResponseBodyData setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public MemberAccountDetailPageQueryResponseBodyData setDetailValue(String detailValue) {
            this.detailValue = detailValue;
            return this;
        }
        public String getDetailValue() {
            return this.detailValue;
        }

        public MemberAccountDetailPageQueryResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public MemberAccountDetailPageQueryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public MemberAccountDetailPageQueryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public MemberAccountDetailPageQueryResponseBodyData setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public MemberAccountDetailPageQueryResponseBodyData setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public MemberAccountDetailPageQueryResponseBodyData setOuterMemberId(String outerMemberId) {
            this.outerMemberId = outerMemberId;
            return this;
        }
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        public MemberAccountDetailPageQueryResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
