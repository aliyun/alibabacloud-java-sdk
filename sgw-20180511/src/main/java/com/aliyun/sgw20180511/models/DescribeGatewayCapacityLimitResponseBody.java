// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCapacityLimitResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("FileNumber")
    public Long fileNumber;

    @NameInMap("FileSystemSizeInTB")
    public Long fileSystemSizeInTB;

    @NameInMap("IsMetadataSeparate")
    public Boolean isMetadataSeparate;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayCapacityLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCapacityLimitResponseBody self = new DescribeGatewayCapacityLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCapacityLimitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayCapacityLimitResponseBody setFileNumber(Long fileNumber) {
        this.fileNumber = fileNumber;
        return this;
    }
    public Long getFileNumber() {
        return this.fileNumber;
    }

    public DescribeGatewayCapacityLimitResponseBody setFileSystemSizeInTB(Long fileSystemSizeInTB) {
        this.fileSystemSizeInTB = fileSystemSizeInTB;
        return this;
    }
    public Long getFileSystemSizeInTB() {
        return this.fileSystemSizeInTB;
    }

    public DescribeGatewayCapacityLimitResponseBody setIsMetadataSeparate(Boolean isMetadataSeparate) {
        this.isMetadataSeparate = isMetadataSeparate;
        return this;
    }
    public Boolean getIsMetadataSeparate() {
        return this.isMetadataSeparate;
    }

    public DescribeGatewayCapacityLimitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayCapacityLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayCapacityLimitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
