// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribePayAsYouGoPriceResponseBody extends TeaModel {
    @NameInMap("CacheCloudEfficiencySizePrice")
    public Float cacheCloudEfficiencySizePrice;

    @NameInMap("CacheCloudSSDSizePrice")
    public Float cacheCloudSSDSizePrice;

    @NameInMap("CacheESSDPl1SizePrice")
    public Float cacheESSDPl1SizePrice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("GatewayClassPrice")
    public Float gatewayClassPrice;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePayAsYouGoPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePayAsYouGoPriceResponseBody self = new DescribePayAsYouGoPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePayAsYouGoPriceResponseBody setCacheCloudEfficiencySizePrice(Float cacheCloudEfficiencySizePrice) {
        this.cacheCloudEfficiencySizePrice = cacheCloudEfficiencySizePrice;
        return this;
    }
    public Float getCacheCloudEfficiencySizePrice() {
        return this.cacheCloudEfficiencySizePrice;
    }

    public DescribePayAsYouGoPriceResponseBody setCacheCloudSSDSizePrice(Float cacheCloudSSDSizePrice) {
        this.cacheCloudSSDSizePrice = cacheCloudSSDSizePrice;
        return this;
    }
    public Float getCacheCloudSSDSizePrice() {
        return this.cacheCloudSSDSizePrice;
    }

    public DescribePayAsYouGoPriceResponseBody setCacheESSDPl1SizePrice(Float cacheESSDPl1SizePrice) {
        this.cacheESSDPl1SizePrice = cacheESSDPl1SizePrice;
        return this;
    }
    public Float getCacheESSDPl1SizePrice() {
        return this.cacheESSDPl1SizePrice;
    }

    public DescribePayAsYouGoPriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePayAsYouGoPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribePayAsYouGoPriceResponseBody setGatewayClassPrice(Float gatewayClassPrice) {
        this.gatewayClassPrice = gatewayClassPrice;
        return this;
    }
    public Float getGatewayClassPrice() {
        return this.gatewayClassPrice;
    }

    public DescribePayAsYouGoPriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePayAsYouGoPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePayAsYouGoPriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
