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

    public DescribeRenewalPriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenewalPriceResponse setRules(DescribeRenewalPriceResponseRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeRenewalPriceResponseRules getRules() {
        return this.rules;
    }

    public DescribeRenewalPriceResponse setPriceInfo(DescribeRenewalPriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeRenewalPriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
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

        public DescribeRenewalPriceResponseRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeRenewalPriceResponseRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenewalPriceResponseRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeRenewalPriceResponseRules setRule(java.util.List<DescribeRenewalPriceResponseRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseRulesRule> getRule() {
            return this.rule;
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

        public DescribeRenewalPriceResponsePriceInfoCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribeRenewalPriceResponsePriceInfoCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenewalPriceResponsePriceInfoCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponsePriceInfoCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
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

        public DescribeRenewalPriceResponsePriceInfoCoupons setCoupon(java.util.List<DescribeRenewalPriceResponsePriceInfoCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponsePriceInfoCouponsCoupon> getCoupon() {
            return this.coupon;
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

        public DescribeRenewalPriceResponsePriceInfoActivityInfo setCheckErrMsg(String checkErrMsg) {
            this.checkErrMsg = checkErrMsg;
            return this;
        }
        public String getCheckErrMsg() {
            return this.checkErrMsg;
        }

        public DescribeRenewalPriceResponsePriceInfoActivityInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeRenewalPriceResponsePriceInfoActivityInfo setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfoRuleIds extends TeaModel {
        // RuleId
        @NameInMap("RuleId")
        @Validation(required = true)
        public java.util.List<String> ruleId;

        public static DescribeRenewalPriceResponsePriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponsePriceInfoRuleIds self = new DescribeRenewalPriceResponsePriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponsePriceInfoRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponsePriceInfo extends TeaModel {
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

        public DescribeRenewalPriceResponsePriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRenewalPriceResponsePriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponsePriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeRenewalPriceResponsePriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponsePriceInfo setCoupons(DescribeRenewalPriceResponsePriceInfoCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoCoupons getCoupons() {
            return this.coupons;
        }

        public DescribeRenewalPriceResponsePriceInfo setActivityInfo(DescribeRenewalPriceResponsePriceInfoActivityInfo activityInfo) {
            this.activityInfo = activityInfo;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoActivityInfo getActivityInfo() {
            return this.activityInfo;
        }

        public DescribeRenewalPriceResponsePriceInfo setRuleIds(DescribeRenewalPriceResponsePriceInfoRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribeRenewalPriceResponsePriceInfoRuleIds getRuleIds() {
            return this.ruleIds;
        }

    }

}
