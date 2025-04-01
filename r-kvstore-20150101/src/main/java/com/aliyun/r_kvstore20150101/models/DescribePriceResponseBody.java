// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <p>The information about the order.</p>
     */
    @NameInMap("Order")
    public DescribePriceResponseBodyOrder order;

    /**
     * <p>The parameters of the order. This parameter is returned when OrderParamOut is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("OrderParams")
    public String orderParams;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3A40BE4E-1890-4972-889C-FEFA37663635</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details about promotion rules.</p>
     */
    @NameInMap("Rules")
    public DescribePriceResponseBodyRules rules;

    /**
     * <p>The rules that match the coupon.</p>
     */
    @NameInMap("SubOrders")
    public DescribePriceResponseBodySubOrders subOrders;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setOrder(DescribePriceResponseBodyOrder order) {
        this.order = order;
        return this;
    }
    public DescribePriceResponseBodyOrder getOrder() {
        return this.order;
    }

    public DescribePriceResponseBody setOrderParams(String orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public String getOrderParams() {
        return this.orderParams;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setRules(DescribePriceResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribePriceResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribePriceResponseBody setSubOrders(DescribePriceResponseBodySubOrders subOrders) {
        this.subOrders = subOrders;
        return this;
    }
    public DescribePriceResponseBodySubOrders getSubOrders() {
        return this.subOrders;
    }

    public static class DescribePriceResponseBodyOrderCouponsCoupon extends TeaModel {
        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("CouponNo")
        public String couponNo;

        /**
         * <p>The description of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>coupondemo</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the coupon was selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSelected")
        public String isSelected;

        /**
         * <p>The coupon name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribePriceResponseBodyOrderCouponsCoupon build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderCouponsCoupon self = new DescribePriceResponseBodyOrderCouponsCoupon();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setIsSelected(String isSelected) {
            this.isSelected = isSelected;
            return this;
        }
        public String getIsSelected() {
            return this.isSelected;
        }

        public DescribePriceResponseBodyOrderCouponsCoupon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribePriceResponseBodyOrderCoupons extends TeaModel {
        @NameInMap("Coupon")
        public java.util.List<DescribePriceResponseBodyOrderCouponsCoupon> coupon;

        public static DescribePriceResponseBodyOrderCoupons build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderCoupons self = new DescribePriceResponseBodyOrderCoupons();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderCoupons setCoupon(java.util.List<DescribePriceResponseBodyOrderCouponsCoupon> coupon) {
            this.coupon = coupon;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyOrderCouponsCoupon> getCoupon() {
            return this.coupon;
        }

    }

    public static class DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds extends TeaModel {
        @NameInMap("OptionId")
        public java.util.List<Long> optionId;

        public static DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds self = new DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds setOptionId(java.util.List<Long> optionId) {
            this.optionId = optionId;
            return this;
        }
        public java.util.List<Long> getOptionId() {
            return this.optionId;
        }

    }

    public static class DescribePriceResponseBodyOrderDepreciateInfoContractActivity extends TeaModel {
        /**
         * <p>The activity ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ActivityId")
        public Long activityId;

        /**
         * <p>The activity name.</p>
         * 
         * <strong>example:</strong>
         * <p>合同优惠_整单_xxx折</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The price after the promotion.</p>
         */
        @NameInMap("FinalFee")
        public Double finalFee;

        /**
         * <p>The total discount amount.</p>
         */
        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotion IDs.</p>
         */
        @NameInMap("OptionIds")
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds optionIds;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ProdFee")
        public Double prodFee;

        public static DescribePriceResponseBodyOrderDepreciateInfoContractActivity build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderDepreciateInfoContractActivity self = new DescribePriceResponseBodyOrderDepreciateInfoContractActivity();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setFinalFee(Double finalFee) {
            this.finalFee = finalFee;
            return this;
        }
        public Double getFinalFee() {
            return this.finalFee;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setOptionIds(DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds optionIds) {
            this.optionIds = optionIds;
            return this;
        }
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivityOptionIds getOptionIds() {
            return this.optionIds;
        }

        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity setProdFee(Double prodFee) {
            this.prodFee = prodFee;
            return this;
        }
        public Double getProdFee() {
            return this.prodFee;
        }

    }

    public static class DescribePriceResponseBodyOrderDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30%</p>
         */
        @NameInMap("CheapRate")
        public Long cheapRate;

        /**
         * <p>The new total price displayed on the official website.</p>
         * 
         * <strong>example:</strong>
         * <p>9*</p>
         */
        @NameInMap("CheapStandAmount")
        public Long cheapStandAmount;

        /**
         * <p>The activity information.</p>
         */
        @NameInMap("ContractActivity")
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity contractActivity;

        /**
         * <p>The price difference displayed in the total order amount.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("Differential")
        public Long differential;

        /**
         * <p>The name of the price difference.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXXX</p>
         */
        @NameInMap("DifferentialName")
        public String differentialName;

        /**
         * <p>Indicates whether the contract promotion is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>Indicates whether the price reduction rate is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The list price.</p>
         * 
         * <strong>example:</strong>
         * <p>1*</p>
         */
        @NameInMap("ListPrice")
        public Long listPrice;

        /**
         * <p>The monthly price.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("MonthPrice")
        public Long monthPrice;

        /**
         * <p>The original total price displayed on the official website.</p>
         * 
         * <strong>example:</strong>
         * <p>12*</p>
         */
        @NameInMap("OriginalStandAmount")
        public Long originalStandAmount;

        public static DescribePriceResponseBodyOrderDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderDepreciateInfo self = new DescribePriceResponseBodyOrderDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setCheapRate(Long cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Long getCheapRate() {
            return this.cheapRate;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setCheapStandAmount(Long cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Long getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setContractActivity(DescribePriceResponseBodyOrderDepreciateInfoContractActivity contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public DescribePriceResponseBodyOrderDepreciateInfoContractActivity getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setDifferential(Long differential) {
            this.differential = differential;
            return this;
        }
        public Long getDifferential() {
            return this.differential;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setDifferentialName(String differentialName) {
            this.differentialName = differentialName;
            return this;
        }
        public String getDifferentialName() {
            return this.differentialName;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setListPrice(Long listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public Long getListPrice() {
            return this.listPrice;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setMonthPrice(Long monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public Long getMonthPrice() {
            return this.monthPrice;
        }

        public DescribePriceResponseBodyOrderDepreciateInfo setOriginalStandAmount(Long originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Long getOriginalStandAmount() {
            return this.originalStandAmount;
        }

    }

    public static class DescribePriceResponseBodyOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribePriceResponseBodyOrderRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrderRuleIds self = new DescribePriceResponseBodyOrderRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrderRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodyOrder extends TeaModel {
        /**
         * <p>The order code.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Details about coupons.</p>
         */
        @NameInMap("Coupons")
        public DescribePriceResponseBodyOrderCoupons coupons;

        /**
         * <p>The currency used for payment. A value of CNY is used when the order was generated on the China site (aliyun.com), and a value of USD is used when the order was generated on the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The activity information.</p>
         */
        @NameInMap("DepreciateInfo")
        public DescribePriceResponseBodyOrderDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.21</p>
         */
        @NameInMap("DiscountAmount")
        public String discountAmount;

        /**
         * <p>The service fees of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("HandlingFeeAmount")
        public String handlingFeeAmount;

        /**
         * <p>Indicates whether the contract promotion is hit.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>The order information.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The original price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.21</p>
         */
        @NameInMap("OriginalAmount")
        public String originalAmount;

        /**
         * <p>The rule IDs.</p>
         */
        @NameInMap("RuleIds")
        public DescribePriceResponseBodyOrderRuleIds ruleIds;

        /**
         * <p>Indicates whether the discount information is displayed.</p>
         */
        @NameInMap("ShowDiscountInfo")
        public Boolean showDiscountInfo;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("StandDiscountPrice")
        public Long standDiscountPrice;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StandPrice")
        public Long standPrice;

        /**
         * <p>The transaction price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static DescribePriceResponseBodyOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyOrder self = new DescribePriceResponseBodyOrder();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyOrder setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePriceResponseBodyOrder setCoupons(DescribePriceResponseBodyOrderCoupons coupons) {
            this.coupons = coupons;
            return this;
        }
        public DescribePriceResponseBodyOrderCoupons getCoupons() {
            return this.coupons;
        }

        public DescribePriceResponseBodyOrder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyOrder setDepreciateInfo(DescribePriceResponseBodyOrderDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public DescribePriceResponseBodyOrderDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public DescribePriceResponseBodyOrder setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribePriceResponseBodyOrder setHandlingFeeAmount(String handlingFeeAmount) {
            this.handlingFeeAmount = handlingFeeAmount;
            return this;
        }
        public String getHandlingFeeAmount() {
            return this.handlingFeeAmount;
        }

        public DescribePriceResponseBodyOrder setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodyOrder setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePriceResponseBodyOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePriceResponseBodyOrder setRuleIds(DescribePriceResponseBodyOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodyOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodyOrder setShowDiscountInfo(Boolean showDiscountInfo) {
            this.showDiscountInfo = showDiscountInfo;
            return this;
        }
        public Boolean getShowDiscountInfo() {
            return this.showDiscountInfo;
        }

        public DescribePriceResponseBodyOrder setStandDiscountPrice(Long standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Long getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public DescribePriceResponseBodyOrder setStandPrice(Long standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Long getStandPrice() {
            return this.standPrice;
        }

        public DescribePriceResponseBodyOrder setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribePriceResponseBodyRulesRule extends TeaModel {
        /**
         * <p>The name of the promotion rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        /**
         * <p>The title of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePriceResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRulesRule self = new DescribePriceResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRulesRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodyRulesRule setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public DescribePriceResponseBodyRulesRule setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribePriceResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribePriceResponseBodyRulesRule> rule;

        public static DescribePriceResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyRules self = new DescribePriceResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyRules setRule(java.util.List<DescribePriceResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds extends TeaModel {
        @NameInMap("OptionId")
        public java.util.List<Long> optionId;

        public static DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds self = new DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds setOptionId(java.util.List<Long> optionId) {
            this.optionId = optionId;
            return this;
        }
        public java.util.List<Long> getOptionId() {
            return this.optionId;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity extends TeaModel {
        /**
         * <p>The activity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1412025702634847</p>
         */
        @NameInMap("ActivityId")
        public Long activityId;

        /**
         * <p>The activity name.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The discounted price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("FinalFee")
        public Double finalFee;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotion ID.</p>
         */
        @NameInMap("OptionIds")
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds optionIds;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ProdFee")
        public Double prodFee;

        public static DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity self = new DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setFinalFee(Double finalFee) {
            this.finalFee = finalFee;
            return this;
        }
        public Double getFinalFee() {
            return this.finalFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setOptionIds(DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds optionIds) {
            this.optionIds = optionIds;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivityOptionIds getOptionIds() {
            return this.optionIds;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity setProdFee(Double prodFee) {
            this.prodFee = prodFee;
            return this;
        }
        public Double getProdFee() {
            return this.prodFee;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction rate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CheapRate")
        public Long cheapRate;

        /**
         * <p>The new total price displayed on the official website.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CheapStandAmount")
        public Long cheapStandAmount;

        /**
         * <p>The contract promotion.</p>
         */
        @NameInMap("ContractActivity")
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity contractActivity;

        /**
         * <p>The promotional offer (displayed in the total order amount).</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Differential")
        public Long differential;

        /**
         * <p>The name of the promotional offer.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("DifferentialName")
        public String differentialName;

        /**
         * <p>Indicates whether eligibility for the contracted discount is met.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>The list price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ListPrice")
        public Long listPrice;

        /**
         * <p>The monthly price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("MonthPrice")
        public Long monthPrice;

        /**
         * <p>The original total price displayed on the official website.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("OriginalStandAmount")
        public Long originalStandAmount;

        /**
         * <p>The start time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-18T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo self = new DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setCheapRate(Long cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Long getCheapRate() {
            return this.cheapRate;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setCheapStandAmount(Long cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Long getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setContractActivity(DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfoContractActivity getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setDifferential(Long differential) {
            this.differential = differential;
            return this;
        }
        public Long getDifferential() {
            return this.differential;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setDifferentialName(String differentialName) {
            this.differentialName = differentialName;
            return this;
        }
        public String getDifferentialName() {
            return this.differentialName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setListPrice(Long listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public Long getListPrice() {
            return this.listPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setMonthPrice(Long monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public Long getMonthPrice() {
            return this.monthPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setOriginalStandAmount(Long originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Long getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo extends TeaModel {
        /**
         * <p>The price reduction rate.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CheapRate")
        public Double cheapRate;

        /**
         * <p>The new total price displayed on the official website.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CheapStandAmount")
        public Double cheapStandAmount;

        /**
         * <p>The promotional offer (displayed in the total order amount).</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Differential")
        public Double differential;

        /**
         * <p>The name of the promotional offer.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("DifferentialName")
        public String differentialName;

        /**
         * <p>Indicates whether eligibility for the contracted discount is met.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>Indicates whether the price reduction rate is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShow")
        public Boolean isShow;

        /**
         * <p>The list price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ListPrice")
        public Double listPrice;

        /**
         * <p>The monthly price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("MonthPrice")
        public Double monthPrice;

        /**
         * <p>The original total price displayed on the official website.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("OriginalStandAmount")
        public Double originalStandAmount;

        /**
         * <p>The start time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-23T14:00:01Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setCheapRate(Double cheapRate) {
            this.cheapRate = cheapRate;
            return this;
        }
        public Double getCheapRate() {
            return this.cheapRate;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setCheapStandAmount(Double cheapStandAmount) {
            this.cheapStandAmount = cheapStandAmount;
            return this;
        }
        public Double getCheapStandAmount() {
            return this.cheapStandAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setDifferential(Double differential) {
            this.differential = differential;
            return this;
        }
        public Double getDifferential() {
            return this.differential;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setDifferentialName(String differentialName) {
            this.differentialName = differentialName;
            return this;
        }
        public String getDifferentialName() {
            return this.differentialName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setIsShow(Boolean isShow) {
            this.isShow = isShow;
            return this;
        }
        public Boolean getIsShow() {
            return this.isShow;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setListPrice(Double listPrice) {
            this.listPrice = listPrice;
            return this;
        }
        public Double getListPrice() {
            return this.listPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setMonthPrice(Double monthPrice) {
            this.monthPrice = monthPrice;
            return this;
        }
        public Double getMonthPrice() {
            return this.monthPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setOriginalStandAmount(Double originalStandAmount) {
            this.originalStandAmount = originalStandAmount;
            return this;
        }
        public Double getOriginalStandAmount() {
            return this.originalStandAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr extends TeaModel {
        /**
         * <p>The attribute code.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The attribute name.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The attribute type.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Type")
        public Long type;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs extends TeaModel {
        @NameInMap("moduleAttr")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr> moduleAttr;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs setModuleAttr(java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr> moduleAttr) {
            this.moduleAttr = moduleAttr;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrsModuleAttr> getModuleAttr() {
            return this.moduleAttr;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance extends TeaModel {
        /**
         * <p>Indicates whether eligibility for the contracted discount is met.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ContractActivity")
        public Boolean contractActivity;

        /**
         * <p>The price reduction information.</p>
         */
        @NameInMap("DepreciateInfo")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo depreciateInfo;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("DiscountFee")
        public Double discountFee;

        /**
         * <p>The module attributes.</p>
         */
        @NameInMap("ModuleAttrs")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs moduleAttrs;

        /**
         * <p>The module code.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The module ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ModuleId")
        public String moduleId;

        /**
         * <p>The module name.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>Indicates whether the order is paid.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedOrderPay")
        public Boolean needOrderPay;

        /**
         * <p>The actual amount paid.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("PayFee")
        public Double payFee;

        /**
         * <p>Indicates whether the item is billed.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PricingModule")
        public Boolean pricingModule;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("StandPrice")
        public Double standPrice;

        /**
         * <p>The original price of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("TotalProductFee")
        public Double totalProductFee;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setContractActivity(Boolean contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public Boolean getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setDepreciateInfo(DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setDiscountFee(Double discountFee) {
            this.discountFee = discountFee;
            return this;
        }
        public Double getDiscountFee() {
            return this.discountFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleAttrs(DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs moduleAttrs) {
            this.moduleAttrs = moduleAttrs;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstanceModuleAttrs getModuleAttrs() {
            return this.moduleAttrs;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setNeedOrderPay(Boolean needOrderPay) {
            this.needOrderPay = needOrderPay;
            return this;
        }
        public Boolean getNeedOrderPay() {
            return this.needOrderPay;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setPayFee(Double payFee) {
            this.payFee = payFee;
            return this;
        }
        public Double getPayFee() {
            return this.payFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setPricingModule(Boolean pricingModule) {
            this.pricingModule = pricingModule;
            return this;
        }
        public Boolean getPricingModule() {
            return this.pricingModule;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setStandPrice(Double standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Double getStandPrice() {
            return this.standPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance setTotalProductFee(Double totalProductFee) {
            this.totalProductFee = totalProductFee;
            return this;
        }
        public Double getTotalProductFee() {
            return this.totalProductFee;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderModuleInstance extends TeaModel {
        @NameInMap("ModuleInstance")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance> moduleInstance;

        public static DescribePriceResponseBodySubOrdersSubOrderModuleInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderModuleInstance self = new DescribePriceResponseBodySubOrdersSubOrderModuleInstance();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderModuleInstance setModuleInstance(java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance> moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderModuleInstanceModuleInstance> getModuleInstance() {
            return this.moduleInstance;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion extends TeaModel {
        /**
         * <p>The additional activity information.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ActivityExtInfo")
        public java.util.Map<String, ?> activityExtInfo;

        /**
         * <p>The amount that can be deducted by using the coupon.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CanPromFee")
        public String canPromFee;

        /**
         * <p>The coupon code. Default value: <code>youhuiquan_promotion_option_id_for_blank</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("CouponNo")
        public String couponNo;

        /**
         * <p>The description of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The coupon name.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The promotion code.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotion name.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_for_blank</p>
         */
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        /**
         * <p>Indicates whether</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        /**
         * <p>Indicates whether the discount is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Show")
        public Boolean show;

        public static DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion self = new DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setActivityExtInfo(java.util.Map<String, ?> activityExtInfo) {
            this.activityExtInfo = activityExtInfo;
            return this;
        }
        public java.util.Map<String, ?> getActivityExtInfo() {
            return this.activityExtInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setCanPromFee(String canPromFee) {
            this.canPromFee = canPromFee;
            return this;
        }
        public String getCanPromFee() {
            return this.canPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setCouponNo(String couponNo) {
            this.couponNo = couponNo;
            return this;
        }
        public String getCouponNo() {
            return this.couponNo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions extends TeaModel {
        @NameInMap("OptionalPromotion")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion> optionalPromotion;

        public static DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions self = new DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions setOptionalPromotion(java.util.List<DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion> optionalPromotion) {
            this.optionalPromotion = optionalPromotion;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderOptionalPromotionsOptionalPromotion> getOptionalPromotion() {
            return this.optionalPromotion;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail extends TeaModel {
        /**
         * <p>The additional activity information.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ActivityExtInfo")
        public java.util.Map<String, ?> activityExtInfo;

        /**
         * <p>The derived promotion type.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("DerivedPromType")
        public String derivedPromType;

        /**
         * <p>The transaction price.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("FinalPromFee")
        public Double finalPromFee;

        /**
         * <p>The code of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("OptionCode")
        public String optionCode;

        /**
         * <p>The promotion type.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PromType")
        public String promType;

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PromotionCode")
        public String promotionCode;

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PromotionId")
        public Long promotionId;

        /**
         * <p>The name of the promotional activity.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PromotionName")
        public String promotionName;

        public static DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail self = new DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setActivityExtInfo(java.util.Map<String, ?> activityExtInfo) {
            this.activityExtInfo = activityExtInfo;
            return this;
        }
        public java.util.Map<String, ?> getActivityExtInfo() {
            return this.activityExtInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setDerivedPromType(String derivedPromType) {
            this.derivedPromType = derivedPromType;
            return this;
        }
        public String getDerivedPromType() {
            return this.derivedPromType;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setFinalPromFee(Double finalPromFee) {
            this.finalPromFee = finalPromFee;
            return this;
        }
        public Double getFinalPromFee() {
            return this.finalPromFee;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setOptionCode(String optionCode) {
            this.optionCode = optionCode;
            return this;
        }
        public String getOptionCode() {
            return this.optionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setPromType(String promType) {
            this.promType = promType;
            return this;
        }
        public String getPromType() {
            return this.promType;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Long getPromotionId() {
            return this.promotionId;
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderPromDetailList extends TeaModel {
        @NameInMap("PromDetail")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail> promDetail;

        public static DescribePriceResponseBodySubOrdersSubOrderPromDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderPromDetailList self = new DescribePriceResponseBodySubOrdersSubOrderPromDetailList();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderPromDetailList setPromDetail(java.util.List<DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail> promDetail) {
            this.promDetail = promDetail;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrderPromDetailListPromDetail> getPromDetail() {
            return this.promDetail;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrderRuleIds extends TeaModel {
        @NameInMap("RuleId")
        public java.util.List<String> ruleId;

        public static DescribePriceResponseBodySubOrdersSubOrderRuleIds build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrderRuleIds self = new DescribePriceResponseBodySubOrdersSubOrderRuleIds();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrderRuleIds setRuleId(java.util.List<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public java.util.List<String> getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribePriceResponseBodySubOrdersSubOrder extends TeaModel {
        /**
         * <p>Indicates whether eligibility for the contracted discount is met.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ContractActivity")
        public Boolean contractActivity;

        /**
         * <p>The price reduction information.</p>
         */
        @NameInMap("DepreciateInfo")
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo depreciateInfo;

        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.21</p>
         */
        @NameInMap("DiscountAmount")
        public String discountAmount;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1xxxxxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether eligibility for the contracted discount is met.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("IsContractActivity")
        public Boolean isContractActivity;

        /**
         * <p>The configuration details for each instance of an order line item.</p>
         */
        @NameInMap("ModuleInstance")
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstance moduleInstance;

        /**
         * <p>The optional promotions.</p>
         */
        @NameInMap("OptionalPromotions")
        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions optionalPromotions;

        /**
         * <p>The original price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.21</p>
         */
        @NameInMap("OriginalAmount")
        public String originalAmount;

        /**
         * <p>The promotion details.</p>
         */
        @NameInMap("PromDetailList")
        public DescribePriceResponseBodySubOrdersSubOrderPromDetailList promDetailList;

        /**
         * <p>The rule IDs.</p>
         */
        @NameInMap("RuleIds")
        public DescribePriceResponseBodySubOrdersSubOrderRuleIds ruleIds;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("StandDiscountPrice")
        public Long standDiscountPrice;

        /**
         * <p>The discount.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("StandPrice")
        public Long standPrice;

        /**
         * <p>The final price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TradeAmount")
        public String tradeAmount;

        public static DescribePriceResponseBodySubOrdersSubOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrdersSubOrder self = new DescribePriceResponseBodySubOrdersSubOrder();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrdersSubOrder setContractActivity(Boolean contractActivity) {
            this.contractActivity = contractActivity;
            return this;
        }
        public Boolean getContractActivity() {
            return this.contractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setDepreciateInfo(DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo depreciateInfo) {
            this.depreciateInfo = depreciateInfo;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderDepreciateInfo getDepreciateInfo() {
            return this.depreciateInfo;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setDiscountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public String getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setIsContractActivity(Boolean isContractActivity) {
            this.isContractActivity = isContractActivity;
            return this;
        }
        public Boolean getIsContractActivity() {
            return this.isContractActivity;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setModuleInstance(DescribePriceResponseBodySubOrdersSubOrderModuleInstance moduleInstance) {
            this.moduleInstance = moduleInstance;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderModuleInstance getModuleInstance() {
            return this.moduleInstance;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setOptionalPromotions(DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions optionalPromotions) {
            this.optionalPromotions = optionalPromotions;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderOptionalPromotions getOptionalPromotions() {
            return this.optionalPromotions;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setOriginalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public String getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setPromDetailList(DescribePriceResponseBodySubOrdersSubOrderPromDetailList promDetailList) {
            this.promDetailList = promDetailList;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderPromDetailList getPromDetailList() {
            return this.promDetailList;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setRuleIds(DescribePriceResponseBodySubOrdersSubOrderRuleIds ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public DescribePriceResponseBodySubOrdersSubOrderRuleIds getRuleIds() {
            return this.ruleIds;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setStandDiscountPrice(Long standDiscountPrice) {
            this.standDiscountPrice = standDiscountPrice;
            return this;
        }
        public Long getStandDiscountPrice() {
            return this.standDiscountPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setStandPrice(Long standPrice) {
            this.standPrice = standPrice;
            return this;
        }
        public Long getStandPrice() {
            return this.standPrice;
        }

        public DescribePriceResponseBodySubOrdersSubOrder setTradeAmount(String tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public String getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribePriceResponseBodySubOrders extends TeaModel {
        @NameInMap("SubOrder")
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrder> subOrder;

        public static DescribePriceResponseBodySubOrders build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodySubOrders self = new DescribePriceResponseBodySubOrders();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodySubOrders setSubOrder(java.util.List<DescribePriceResponseBodySubOrdersSubOrder> subOrder) {
            this.subOrder = subOrder;
            return this;
        }
        public java.util.List<DescribePriceResponseBodySubOrdersSubOrder> getSubOrder() {
            return this.subOrder;
        }

    }

}
