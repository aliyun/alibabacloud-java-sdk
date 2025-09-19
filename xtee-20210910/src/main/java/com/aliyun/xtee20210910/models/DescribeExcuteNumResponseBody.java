// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExcuteNumResponseBody extends TeaModel {
    /**
     * <p>Service category names.</p>
     */
    @NameInMap("Categories")
    public java.util.List<String> categories;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExcuteNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcuteNumResponseBody self = new DescribeExcuteNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExcuteNumResponseBody setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public DescribeExcuteNumResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public DescribeExcuteNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
