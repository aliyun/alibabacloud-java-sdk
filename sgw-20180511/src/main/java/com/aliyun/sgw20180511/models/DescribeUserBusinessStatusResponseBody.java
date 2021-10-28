// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("IsIndebted")
    public Boolean isIndebted;

    @NameInMap("IsIndebtedOverdue")
    public Boolean isIndebtedOverdue;

    @NameInMap("IsRiskControl")
    public Boolean isRiskControl;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeUserBusinessStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessStatusResponseBody self = new DescribeUserBusinessStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUserBusinessStatusResponseBody setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public DescribeUserBusinessStatusResponseBody setIsIndebted(Boolean isIndebted) {
        this.isIndebted = isIndebted;
        return this;
    }
    public Boolean getIsIndebted() {
        return this.isIndebted;
    }

    public DescribeUserBusinessStatusResponseBody setIsIndebtedOverdue(Boolean isIndebtedOverdue) {
        this.isIndebtedOverdue = isIndebtedOverdue;
        return this;
    }
    public Boolean getIsIndebtedOverdue() {
        return this.isIndebtedOverdue;
    }

    public DescribeUserBusinessStatusResponseBody setIsRiskControl(Boolean isRiskControl) {
        this.isRiskControl = isRiskControl;
        return this;
    }
    public Boolean getIsRiskControl() {
        return this.isRiskControl;
    }

    public DescribeUserBusinessStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUserBusinessStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBusinessStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
