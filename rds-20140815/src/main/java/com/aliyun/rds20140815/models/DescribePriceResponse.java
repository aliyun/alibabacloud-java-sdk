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

    public DescribePriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponse setRules(DescribePriceResponseRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribePriceResponseRules getRules() {
        return this.rules;
    }

    public DescribePriceResponse setPriceInfo(DescribePriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
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

        public DescribePriceResponseRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribePriceResponseRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribePriceResponseRules setRule(java.util.List<DescribePriceResponseRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseRulesRule> getRule() {
            return this.rule;
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

        public DescribePriceResponsePriceInfoCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribePriceResponsePriceInfoCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponsePriceInfoCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponsePriceInfoCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
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

        public DescribePriceResponsePriceInfoCoupons setCoupon(java.util.List<DescribePriceResponsePriceInfoCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribePriceResponsePriceInfoCouponsCoupon> getCoupon() {
            return this.coupon;
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

        public DescribePriceResponsePriceInfoActivityInfo setCheckErrMsg(String checkErrMsg) {
            this.checkErrMsg = checkErrMsg;
            return this;
        }
        public String getCheckErrMsg() {
            return this.checkErrMsg;
        }

        public DescribePriceResponsePriceInfoActivityInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribePriceResponsePriceInfoActivityInfo setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class DescribePriceResponsePriceInfoRuleIds extends TeaModel {
        // RuleId
        @NameInMap("RuleId")
        @Validation(required = true)
        public java.util.List<String> ruleId;

        public static DescribePriceResponsePriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoRuleIds self = new DescribePriceResponsePriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponsePriceInfo extends TeaModel {
        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

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

        public DescribePriceResponsePriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponsePriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponsePriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponsePriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponsePriceInfo setCoupons(DescribePriceResponsePriceInfoCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribePriceResponsePriceInfoCoupons getCoupons() {
            return this.coupons;
        }

        public DescribePriceResponsePriceInfo setActivityInfo(DescribePriceResponsePriceInfoActivityInfo activityInfo) {
            this.activityInfo = activityInfo;
            return this;
        }
        public DescribePriceResponsePriceInfoActivityInfo getActivityInfo() {
            return this.activityInfo;
        }

        public DescribePriceResponsePriceInfo setRuleIds(DescribePriceResponsePriceInfoRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponsePriceInfoRuleIds getRuleIds() {
            return this.ruleIds;
        }

    }

}
