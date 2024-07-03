// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSecurityGroupRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6BFF4136-10B9-130B-BF8E-D3504BCE4F43</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceSecurityGroupRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSecurityGroupRuleResponseBody self = new DescribeDBInstanceSecurityGroupRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSecurityGroupRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDBInstanceSecurityGroupRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDBInstanceSecurityGroupRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDBInstanceSecurityGroupRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
