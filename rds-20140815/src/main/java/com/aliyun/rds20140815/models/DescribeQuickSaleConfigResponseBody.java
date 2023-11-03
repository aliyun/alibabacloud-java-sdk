// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeQuickSaleConfigResponseBody extends TeaModel {
    /**
     * <p>Product code.</p>
     */
    @NameInMap("Commodity")
    public String commodity;

    /**
     * <p>Return data.</p>
     */
    @NameInMap("Items")
    public java.util.Map<String, ?> items;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQuickSaleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuickSaleConfigResponseBody self = new DescribeQuickSaleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQuickSaleConfigResponseBody setCommodity(String commodity) {
        this.commodity = commodity;
        return this;
    }
    public String getCommodity() {
        return this.commodity;
    }

    public DescribeQuickSaleConfigResponseBody setItems(java.util.Map<String, ?> items) {
        this.items = items;
        return this;
    }
    public java.util.Map<String, ?> getItems() {
        return this.items;
    }

    public DescribeQuickSaleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
