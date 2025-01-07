// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNeedAsyncQueryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the result is returned. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DFD6277-CC36-57F7-ACE6-F5952XXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNeedAsyncQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNeedAsyncQueryResponseBody self = new DescribeNeedAsyncQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNeedAsyncQueryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DescribeNeedAsyncQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
