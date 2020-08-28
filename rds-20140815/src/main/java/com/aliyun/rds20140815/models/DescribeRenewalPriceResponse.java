// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Rules")
    @Validation(required = true)
    public DescribeRenewalPriceResponseRules rules;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribeRenewalPriceResponsePriceInfo priceInfo;

    public static DescribeRenewalPriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponse self = new DescribeRenewalPriceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeRenewalPriceResponseRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeRenewalPriceResponseRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseRulesRule self = new DescribeRenewalPriceResponseRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponseRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponseRulesRule> rule;

        public static DescribeRenewalPriceResponseRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseRules self = new DescribeRenewalPriceResponseRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoCouponsCoupon extends TeaModel {
        @NameInMap("CouponNo")
        @Validation(required = true)
        public String couponNo;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IsSelected")
        @Validation(required = true)
        public String isSelected;

        public static DescribeRenewalPriceResponsePriceInfoCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoCouponsCoupon self = new DescribeRenewalPriceResponsePriceInfoCouponsCoupon();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoCoupons extends TeaModel {
        @NameInMap("Coupon")
        @Validation(required = true)
        public java.util.List<DescribeRenewalPriceResponsePriceInfoCouponsCoupon> coupon;

        public static DescribeRenewalPriceResponsePriceInfoCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoCoupons self = new DescribeRenewalPriceResponsePriceInfoCoupons();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoActivityInfo extends TeaModel {
        @NameInMap("CheckErrMsg")
        @Validation(required = true)
        public String checkErrMsg;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("Success")
        @Validation(required = true)
        public String success;

        public static DescribeRenewalPriceResponsePriceInfoActivityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoActivityInfo self = new DescribeRenewalPriceResponsePriceInfoActivityInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoRuleIds extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public java.util.List<String> ruleId;

        public static DescribeRenewalPriceResponsePriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoRuleIds self = new DescribeRenewalPriceResponsePriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfo extends TeaModel {
        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Double originalPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Double tradePrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Double discountPrice;

        @NameInMap("Coupons")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoCoupons coupons;

        @NameInMap("ActivityInfo")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoActivityInfo activityInfo;

        @NameInMap("RuleIds")
        @Validation(required = true)
        public DescribeRenewalPriceResponsePriceInfoRuleIds ruleIds;

        public static DescribeRenewalPriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfo self = new DescribeRenewalPriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

    }

}
