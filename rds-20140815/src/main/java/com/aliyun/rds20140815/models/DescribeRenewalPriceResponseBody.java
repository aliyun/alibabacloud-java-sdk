// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRenewalPriceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public DescribeRenewalPriceResponseBodyRules rules;

    @NameInMap("PriceInfo")
    public DescribeRenewalPriceResponseBodyPriceInfo priceInfo;

    public static DescribeRenewalPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenewalPriceResponseBody self = new DescribeRenewalPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRenewalPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRenewalPriceResponseBody setRules(DescribeRenewalPriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeRenewalPriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribeRenewalPriceResponseBody setPriceInfo(DescribeRenewalPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeRenewalPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribeRenewalPriceResponseBodyRulesRule extends TeaModel {
        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        public static DescribeRenewalPriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyRulesRule self = new DescribeRenewalPriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyRulesRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeRenewalPriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenewalPriceResponseBodyRulesRule setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeRenewalPriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeRenewalPriceResponseBodyRulesRule> rule;

        public static DescribeRenewalPriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyRules self = new DescribeRenewalPriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyRules setRule(java.util.List<DescribeRenewalPriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribeRenewalPriceResponseBodyPriceInfoRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoRuleIds self = new DescribeRenewalPriceResponseBodyPriceInfoRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon extends TeaModel {
        @NameInMap("CouponNo")
        public String couponNo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsSelected")
        public String isSelected;

        public static DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon self = new DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon> coupon;

        public static DescribeRenewalPriceResponseBodyPriceInfoCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoCoupons self = new DescribeRenewalPriceResponseBodyPriceInfoCoupons();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoCoupons setCoupon(java.util.List<DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribeRenewalPriceResponseBodyPriceInfoCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfoActivityInfo extends TeaModel {
        @NameInMap("CheckErrMsg")
        public String checkErrMsg;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public String success;

        public static DescribeRenewalPriceResponseBodyPriceInfoActivityInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfoActivityInfo self = new DescribeRenewalPriceResponseBodyPriceInfoActivityInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfoActivityInfo setCheckErrMsg(String checkErrMsg) {
            this.checkErrMsg = checkErrMsg;
            return this;
        }
        public String getCheckErrMsg() {
            return this.checkErrMsg;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoActivityInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeRenewalPriceResponseBodyPriceInfoActivityInfo setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class DescribeRenewalPriceResponseBodyPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("RuleIds")
        public DescribeRenewalPriceResponseBodyPriceInfoRuleIds ruleIds;

        @NameInMap("Coupons")
        public DescribeRenewalPriceResponseBodyPriceInfoCoupons coupons;

        @NameInMap("ActivityInfo")
        public DescribeRenewalPriceResponseBodyPriceInfoActivityInfo activityInfo;

        public static DescribeRenewalPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRenewalPriceResponseBodyPriceInfo self = new DescribeRenewalPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setRuleIds(DescribeRenewalPriceResponseBodyPriceInfoRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setCoupons(DescribeRenewalPriceResponseBodyPriceInfoCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoCoupons getCoupons() {
            return this.coupons;
        }

        public DescribeRenewalPriceResponseBodyPriceInfo setActivityInfo(DescribeRenewalPriceResponseBodyPriceInfoActivityInfo activityInfo) {
            this.activityInfo = activityInfo;
            return this;
        }
        public DescribeRenewalPriceResponseBodyPriceInfoActivityInfo getActivityInfo() {
            return this.activityInfo;
        }

    }

}
