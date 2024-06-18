// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeQuickSaleConfigResponseBody extends TeaModel {
    /**
     * <p>The product code. Valid values:</p>
     * <ul>
     * <li>rds: The instance is a subscription instance.</li>
     * <li>bards: The instance is a pay-as-you-go instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("Commodity")
    public String commodity;

    /**
     * <p>The configuration details of the product.</p>
     */
    @NameInMap("Items")
    public java.util.Map<String, ?> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DFFE9EC-3369-5937-A4E2-507C0C86A4C6</p>
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
