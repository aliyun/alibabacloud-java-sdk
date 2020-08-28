// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribePriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Rules")
    @Validation(required = true)
    public DescribePriceResponseRules rules;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribePriceResponsePriceInfo priceInfo;

    public static DescribePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponse self = new DescribePriceResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribePriceResponseRulesRule extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribePriceResponseRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseRulesRule self = new DescribePriceResponseRulesRule();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponseRules extends TeaModel {
        @NameInMap("Rule")
        @Validation(required = true)
        public java.util.List<DescribePriceResponseRulesRule> rule;

        public static DescribePriceResponseRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseRules self = new DescribePriceResponseRules();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoCouponsCoupon extends TeaModel {
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

        public static DescribePriceResponsePriceInfoCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoCouponsCoupon self = new DescribePriceResponsePriceInfoCouponsCoupon();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoCoupons extends TeaModel {
        @NameInMap("Coupon")
        @Validation(required = true)
        public java.util.List<DescribePriceResponsePriceInfoCouponsCoupon> coupon;

        public static DescribePriceResponsePriceInfoCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoCoupons self = new DescribePriceResponsePriceInfoCoupons();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoActivityInfo extends TeaModel {
        @NameInMap("CheckErrMsg")
        @Validation(required = true)
        public String checkErrMsg;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("Success")
        @Validation(required = true)
        public String success;

        public static DescribePriceResponsePriceInfoActivityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoActivityInfo self = new DescribePriceResponsePriceInfoActivityInfo();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfoRuleIds extends TeaModel {
        @NameInMap("RuleId")
        @Validation(required = true)
        public java.util.List<String> ruleId;

        public static DescribePriceResponsePriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRuleIds self = new DescribePriceResponsePriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribePriceResponsePriceInfo extends TeaModel {
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
        public DescribePriceResponsePriceInfoCoupons coupons;

        @NameInMap("ActivityInfo")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoActivityInfo activityInfo;

        @NameInMap("RuleIds")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoRuleIds ruleIds;

        public static DescribePriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfo self = new DescribePriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

    }

}
