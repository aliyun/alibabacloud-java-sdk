// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberPointChangeRequest extends TeaModel {
    @NameInMap("body")
    public MemberPointChangeRequestBody body;

    public static MemberPointChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberPointChangeRequest self = new MemberPointChangeRequest();
        return TeaModel.build(map, self);
    }

    public MemberPointChangeRequest setBody(MemberPointChangeRequestBody body) {
        this.body = body;
        return this;
    }
    public MemberPointChangeRequestBody getBody() {
        return this.body;
    }

    public static class MemberPointChangeRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("ChannelCode")
        public String channelCode;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Extra")
        public String extra;

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
         * <p>1</p>
         */
        @NameInMap("OperateType")
        public String operateType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WMS_36606164948078_23218019</p>
         */
        @NameInMap("OuterMemberId")
        public String outerMemberId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("PlatFormType")
        public String platFormType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantity")
        public String quantity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4LJDNJH9JUX48L41</p>
         */
        @NameInMap("SerialNo")
        public String serialNo;

        public static MemberPointChangeRequestBody build(java.util.Map<String, ?> map) throws Exception {
            MemberPointChangeRequestBody self = new MemberPointChangeRequestBody();
            return TeaModel.build(map, self);
        }

        public MemberPointChangeRequestBody setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public MemberPointChangeRequestBody setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public MemberPointChangeRequestBody setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public MemberPointChangeRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public MemberPointChangeRequestBody setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public MemberPointChangeRequestBody setOuterMemberId(String outerMemberId) {
            this.outerMemberId = outerMemberId;
            return this;
        }
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        public MemberPointChangeRequestBody setPlatFormType(String platFormType) {
            this.platFormType = platFormType;
            return this;
        }
        public String getPlatFormType() {
            return this.platFormType;
        }

        public MemberPointChangeRequestBody setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public MemberPointChangeRequestBody setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

    }

}
