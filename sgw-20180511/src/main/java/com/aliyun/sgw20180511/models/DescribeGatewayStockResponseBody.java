// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayStockResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stocks")
    public DescribeGatewayStockResponseBodyStocks stocks;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayStockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayStockResponseBody self = new DescribeGatewayStockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayStockResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayStockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayStockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayStockResponseBody setStocks(DescribeGatewayStockResponseBodyStocks stocks) {
        this.stocks = stocks;
        return this;
    }
    public DescribeGatewayStockResponseBodyStocks getStocks() {
        return this.stocks;
    }

    public DescribeGatewayStockResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayStockResponseBodyStocksStock extends TeaModel {
        @NameInMap("StockInfo")
        public String stockInfo;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeGatewayStockResponseBodyStocksStock build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayStockResponseBodyStocksStock self = new DescribeGatewayStockResponseBodyStocksStock();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayStockResponseBodyStocksStock setStockInfo(String stockInfo) {
            this.stockInfo = stockInfo;
            return this;
        }
        public String getStockInfo() {
            return this.stockInfo;
        }

        public DescribeGatewayStockResponseBodyStocksStock setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeGatewayStockResponseBodyStocks extends TeaModel {
        @NameInMap("Stock")
        public java.util.List<DescribeGatewayStockResponseBodyStocksStock> stock;

        public static DescribeGatewayStockResponseBodyStocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayStockResponseBodyStocks self = new DescribeGatewayStockResponseBodyStocks();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayStockResponseBodyStocks setStock(java.util.List<DescribeGatewayStockResponseBodyStocksStock> stock) {
            this.stock = stock;
            return this;
        }
        public java.util.List<DescribeGatewayStockResponseBodyStocksStock> getStock() {
            return this.stock;
        }

    }

}
