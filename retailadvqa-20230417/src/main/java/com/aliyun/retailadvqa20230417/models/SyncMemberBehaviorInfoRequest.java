// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncMemberBehaviorInfoRequest extends TeaModel {
    @NameInMap("body")
    public SyncMemberBehaviorInfoRequestBody body;

    public static SyncMemberBehaviorInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMemberBehaviorInfoRequest self = new SyncMemberBehaviorInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncMemberBehaviorInfoRequest setBody(SyncMemberBehaviorInfoRequestBody body) {
        this.body = body;
        return this;
    }
    public SyncMemberBehaviorInfoRequestBody getBody() {
        return this.body;
    }

    public static class SyncMemberBehaviorInfoRequestBody extends TeaModel {
        @NameInMap("ActionDuration")
        public String actionDuration;

        @NameInMap("ActionEndDate")
        public String actionEndDate;

        @NameInMap("ActionResult")
        public Boolean actionResult;

        @NameInMap("ActionStartDate")
        public String actionStartDate;

        @NameInMap("ActionSubType")
        public String actionSubType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        @NameInMap("Extra")
        public String extra;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OuterMemberId")
        public String outerMemberId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PlatFormType")
        public String platFormType;

        public static SyncMemberBehaviorInfoRequestBody build(java.util.Map<String, ?> map) throws Exception {
            SyncMemberBehaviorInfoRequestBody self = new SyncMemberBehaviorInfoRequestBody();
            return TeaModel.build(map, self);
        }

        public SyncMemberBehaviorInfoRequestBody setActionDuration(String actionDuration) {
            this.actionDuration = actionDuration;
            return this;
        }
        public String getActionDuration() {
            return this.actionDuration;
        }

        public SyncMemberBehaviorInfoRequestBody setActionEndDate(String actionEndDate) {
            this.actionEndDate = actionEndDate;
            return this;
        }
        public String getActionEndDate() {
            return this.actionEndDate;
        }

        public SyncMemberBehaviorInfoRequestBody setActionResult(Boolean actionResult) {
            this.actionResult = actionResult;
            return this;
        }
        public Boolean getActionResult() {
            return this.actionResult;
        }

        public SyncMemberBehaviorInfoRequestBody setActionStartDate(String actionStartDate) {
            this.actionStartDate = actionStartDate;
            return this;
        }
        public String getActionStartDate() {
            return this.actionStartDate;
        }

        public SyncMemberBehaviorInfoRequestBody setActionSubType(String actionSubType) {
            this.actionSubType = actionSubType;
            return this;
        }
        public String getActionSubType() {
            return this.actionSubType;
        }

        public SyncMemberBehaviorInfoRequestBody setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public SyncMemberBehaviorInfoRequestBody setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public SyncMemberBehaviorInfoRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public SyncMemberBehaviorInfoRequestBody setOuterMemberId(String outerMemberId) {
            this.outerMemberId = outerMemberId;
            return this;
        }
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        public SyncMemberBehaviorInfoRequestBody setPlatFormType(String platFormType) {
            this.platFormType = platFormType;
            return this;
        }
        public String getPlatFormType() {
            return this.platFormType;
        }

    }

}
