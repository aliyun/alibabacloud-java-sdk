// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class QueryMemberBasicInfoRequest extends TeaModel {
    @NameInMap("body")
    public QueryMemberBasicInfoRequestBody body;

    public static QueryMemberBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMemberBasicInfoRequest self = new QueryMemberBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMemberBasicInfoRequest setBody(QueryMemberBasicInfoRequestBody body) {
        this.body = body;
        return this;
    }
    public QueryMemberBasicInfoRequestBody getBody() {
        return this.body;
    }

    public static class QueryMemberBasicInfoRequestBody extends TeaModel {
        @NameInMap("ChannelCode")
        public String channelCode;

        @NameInMap("ChannelOpenId")
        public String channelOpenId;

        /**
         * <strong>example:</strong>
         * <p>18888889999</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>750cff00c3e0996d220ac2861dafdfadsf</p>
         */
        @NameInMap("OpenMerchantId")
        public String openMerchantId;

        /**
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
        @NameInMap("Type")
        public String type;

        public static QueryMemberBasicInfoRequestBody build(java.util.Map<String, ?> map) throws Exception {
            QueryMemberBasicInfoRequestBody self = new QueryMemberBasicInfoRequestBody();
            return TeaModel.build(map, self);
        }

        public QueryMemberBasicInfoRequestBody setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public QueryMemberBasicInfoRequestBody setChannelOpenId(String channelOpenId) {
            this.channelOpenId = channelOpenId;
            return this;
        }
        public String getChannelOpenId() {
            return this.channelOpenId;
        }

        public QueryMemberBasicInfoRequestBody setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryMemberBasicInfoRequestBody setOpenMerchantId(String openMerchantId) {
            this.openMerchantId = openMerchantId;
            return this;
        }
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        public QueryMemberBasicInfoRequestBody setOuterMemberId(String outerMemberId) {
            this.outerMemberId = outerMemberId;
            return this;
        }
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        public QueryMemberBasicInfoRequestBody setPlatFormType(String platFormType) {
            this.platFormType = platFormType;
            return this;
        }
        public String getPlatFormType() {
            return this.platFormType;
        }

        public QueryMemberBasicInfoRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
