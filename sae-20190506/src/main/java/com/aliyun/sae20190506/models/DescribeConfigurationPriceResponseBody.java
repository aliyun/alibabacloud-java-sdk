// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeConfigurationPriceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The pricing information.</p>
     */
    @NameInMap("Data")
    public DescribeConfigurationPriceResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section of this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, an error code is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADCEC067-86AD-19E2-BD43-E83F3841****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the price of the configuration was obtained.</p>
     * <ul>
     * <li><p><strong>true</strong>: The price was obtained.</p>
     * </li>
     * <li><p><strong>false</strong>: The price failed to be obtained.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a0dcc771722848598056771******</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeConfigurationPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationPriceResponseBody self = new DescribeConfigurationPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeConfigurationPriceResponseBody setData(DescribeConfigurationPriceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeConfigurationPriceResponseBodyData getData() {
        return this.data;
    }

    public DescribeConfigurationPriceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeConfigurationPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigurationPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigurationPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeConfigurationPriceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeConfigurationPriceResponseBodyDataBagUsage extends TeaModel {
        /**
         * <p>The remaining CPU quota. Unit: core-hours.</p>
         * 
         * <strong>example:</strong>
         * <p>497570.450009</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The remaining computing units (CUs) of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Cu")
        public Float cu;

        /**
         * <p>The remaining memory quota. Unit: GiB-hours.</p>
         * 
         * <strong>example:</strong>
         * <p>989802.563546</p>
         */
        @NameInMap("Mem")
        public Float mem;

        public static DescribeConfigurationPriceResponseBodyDataBagUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataBagUsage self = new DescribeConfigurationPriceResponseBodyDataBagUsage();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataBagUsage setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public DescribeConfigurationPriceResponseBodyDataBagUsage setCu(Float cu) {
            this.cu = cu;
            return this;
        }
        public Float getCu() {
            return this.cu;
        }

        public DescribeConfigurationPriceResponseBodyDataBagUsage setMem(Float mem) {
            this.mem = mem;
            return this;
        }
        public Float getMem() {
            return this.mem;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder extends TeaModel {
        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0009259</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The original price.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0046296</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        /**
         * <p>The actual transaction price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0037037</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder self = new DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder setRuleIds(java.util.List<String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules extends TeaModel {
        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20% discount on pay-as-you-go</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000010******</p>
         */
        @NameInMap("RuleDescId")
        public Float ruleDescId;

        public static DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules self = new DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules setRuleDescId(Float ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Float getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataCpuMemPrice extends TeaModel {
        /**
         * <p>The pricing information.</p>
         */
        @NameInMap("Order")
        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder order;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules> rules;

        public static DescribeConfigurationPriceResponseBodyDataCpuMemPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataCpuMemPrice self = new DescribeConfigurationPriceResponseBodyDataCpuMemPrice();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPrice setOrder(DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder order) {
            this.order = order;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataCpuMemPriceOrder getOrder() {
            return this.order;
        }

        public DescribeConfigurationPriceResponseBodyDataCpuMemPrice setRules(java.util.List<DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeConfigurationPriceResponseBodyDataCpuMemPriceRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataOrder extends TeaModel {
        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0018518</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The original price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0092592</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The promotion ID.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        /**
         * <p>The final price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0074074</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static DescribeConfigurationPriceResponseBodyDataOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataOrder self = new DescribeConfigurationPriceResponseBodyDataOrder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataOrder setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataOrder setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataOrder setRuleIds(java.util.List<String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        public DescribeConfigurationPriceResponseBodyDataOrder setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataRequestPriceOrder extends TeaModel {
        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0009259</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The original price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0046296</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        /**
         * <p>The actual transaction price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0037037</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static DescribeConfigurationPriceResponseBodyDataRequestPriceOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataRequestPriceOrder self = new DescribeConfigurationPriceResponseBodyDataRequestPriceOrder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPriceOrder setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPriceOrder setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPriceOrder setRuleIds(java.util.List<String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPriceOrder setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataRequestPriceRules extends TeaModel {
        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20% discount on pay-as-you-go</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000010******</p>
         */
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeConfigurationPriceResponseBodyDataRequestPriceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataRequestPriceRules self = new DescribeConfigurationPriceResponseBodyDataRequestPriceRules();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPriceRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPriceRules setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataRequestPrice extends TeaModel {
        /**
         * <p>The pricing information.</p>
         */
        @NameInMap("Order")
        public DescribeConfigurationPriceResponseBodyDataRequestPriceOrder order;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeConfigurationPriceResponseBodyDataRequestPriceRules> rules;

        public static DescribeConfigurationPriceResponseBodyDataRequestPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataRequestPrice self = new DescribeConfigurationPriceResponseBodyDataRequestPrice();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPrice setOrder(DescribeConfigurationPriceResponseBodyDataRequestPriceOrder order) {
            this.order = order;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataRequestPriceOrder getOrder() {
            return this.order;
        }

        public DescribeConfigurationPriceResponseBodyDataRequestPrice setRules(java.util.List<DescribeConfigurationPriceResponseBodyDataRequestPriceRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeConfigurationPriceResponseBodyDataRequestPriceRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataRules extends TeaModel {
        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20% discount on pay-as-you-go</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000010******</p>
         */
        @NameInMap("RuleDescId")
        public Long ruleDescId;

        public static DescribeConfigurationPriceResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataRules self = new DescribeConfigurationPriceResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigurationPriceResponseBodyDataRules setRuleDescId(Long ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder extends TeaModel {
        /**
         * <p>The discount amount of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0009259</p>
         */
        @NameInMap("DiscountAmount")
        public Float discountAmount;

        /**
         * <p>The original price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0046296</p>
         */
        @NameInMap("OriginalAmount")
        public Float originalAmount;

        /**
         * <p>The promotion ID.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        /**
         * <p>The actual transaction price of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0037037</p>
         */
        @NameInMap("TradeAmount")
        public Float tradeAmount;

        public static DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder self = new DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder setDiscountAmount(Float discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder setOriginalAmount(Float originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder setRuleIds(java.util.List<String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder setTradeAmount(Float tradeAmount) {
            this.tradeAmount = tradeAmount;
            return this;
        }
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataTrafficPriceRules extends TeaModel {
        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20% discount on pay-as-you-go</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000010******</p>
         */
        @NameInMap("RuleDescId")
        public Float ruleDescId;

        public static DescribeConfigurationPriceResponseBodyDataTrafficPriceRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataTrafficPriceRules self = new DescribeConfigurationPriceResponseBodyDataTrafficPriceRules();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPriceRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPriceRules setRuleDescId(Float ruleDescId) {
            this.ruleDescId = ruleDescId;
            return this;
        }
        public Float getRuleDescId() {
            return this.ruleDescId;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyDataTrafficPrice extends TeaModel {
        /**
         * <p>The pricing information.</p>
         */
        @NameInMap("Order")
        public DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder order;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeConfigurationPriceResponseBodyDataTrafficPriceRules> rules;

        public static DescribeConfigurationPriceResponseBodyDataTrafficPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyDataTrafficPrice self = new DescribeConfigurationPriceResponseBodyDataTrafficPrice();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPrice setOrder(DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder order) {
            this.order = order;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataTrafficPriceOrder getOrder() {
            return this.order;
        }

        public DescribeConfigurationPriceResponseBodyDataTrafficPrice setRules(java.util.List<DescribeConfigurationPriceResponseBodyDataTrafficPriceRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeConfigurationPriceResponseBodyDataTrafficPriceRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeConfigurationPriceResponseBodyData extends TeaModel {
        /**
         * <p>The remaining quota of the resource plan.</p>
         */
        @NameInMap("BagUsage")
        public DescribeConfigurationPriceResponseBodyDataBagUsage bagUsage;

        /**
         * <p>The price of CPU and memory.</p>
         */
        @NameInMap("CpuMemPrice")
        public DescribeConfigurationPriceResponseBodyDataCpuMemPrice cpuMemPrice;

        /**
         * <p>The pricing information.</p>
         */
        @NameInMap("Order")
        public DescribeConfigurationPriceResponseBodyDataOrder order;

        /**
         * <p>The price per request.</p>
         */
        @NameInMap("RequestPrice")
        public DescribeConfigurationPriceResponseBodyDataRequestPrice requestPrice;

        /**
         * <p>The promotion rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeConfigurationPriceResponseBodyDataRules> rules;

        /**
         * <p>The price of traffic.</p>
         */
        @NameInMap("TrafficPrice")
        public DescribeConfigurationPriceResponseBodyDataTrafficPrice trafficPrice;

        public static DescribeConfigurationPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationPriceResponseBodyData self = new DescribeConfigurationPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationPriceResponseBodyData setBagUsage(DescribeConfigurationPriceResponseBodyDataBagUsage bagUsage) {
            this.bagUsage = bagUsage;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataBagUsage getBagUsage() {
            return this.bagUsage;
        }

        public DescribeConfigurationPriceResponseBodyData setCpuMemPrice(DescribeConfigurationPriceResponseBodyDataCpuMemPrice cpuMemPrice) {
            this.cpuMemPrice = cpuMemPrice;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataCpuMemPrice getCpuMemPrice() {
            return this.cpuMemPrice;
        }

        public DescribeConfigurationPriceResponseBodyData setOrder(DescribeConfigurationPriceResponseBodyDataOrder order) {
            this.order = order;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataOrder getOrder() {
            return this.order;
        }

        public DescribeConfigurationPriceResponseBodyData setRequestPrice(DescribeConfigurationPriceResponseBodyDataRequestPrice requestPrice) {
            this.requestPrice = requestPrice;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataRequestPrice getRequestPrice() {
            return this.requestPrice;
        }

        public DescribeConfigurationPriceResponseBodyData setRules(java.util.List<DescribeConfigurationPriceResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeConfigurationPriceResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public DescribeConfigurationPriceResponseBodyData setTrafficPrice(DescribeConfigurationPriceResponseBodyDataTrafficPrice trafficPrice) {
            this.trafficPrice = trafficPrice;
            return this;
        }
        public DescribeConfigurationPriceResponseBodyDataTrafficPrice getTrafficPrice() {
            return this.trafficPrice;
        }

    }

}
