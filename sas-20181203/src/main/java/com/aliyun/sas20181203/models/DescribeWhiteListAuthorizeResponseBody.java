// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWhiteListAuthorizeResponseBody extends TeaModel {
    /**
     * <p>The available quota.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AvailableAuthorizeNum")
    public Integer availableAuthorizeNum;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWhiteListAuthorizeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteListAuthorizeResponseBody self = new DescribeWhiteListAuthorizeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteListAuthorizeResponseBody setAvailableAuthorizeNum(Integer availableAuthorizeNum) {
        this.availableAuthorizeNum = availableAuthorizeNum;
        return this;
    }
    public Integer getAvailableAuthorizeNum() {
        return this.availableAuthorizeNum;
    }

    public DescribeWhiteListAuthorizeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
