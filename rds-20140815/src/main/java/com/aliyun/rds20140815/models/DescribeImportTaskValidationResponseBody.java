// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeImportTaskValidationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;ValidateAction&quot;: &quot;Detail&quot;}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3E36DB6E-AE3B-53B6-A703-85F883FD1B2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeImportTaskValidationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportTaskValidationResponseBody self = new DescribeImportTaskValidationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImportTaskValidationResponseBody setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public DescribeImportTaskValidationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImportTaskValidationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImportTaskValidationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
