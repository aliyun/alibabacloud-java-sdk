// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeAccountConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSupportClientSideEncryption")
    public Boolean isSupportClientSideEncryption;

    @NameInMap("IsSupportElasticGatewayBeta")
    public Boolean isSupportElasticGatewayBeta;

    @NameInMap("IsSupportGatewayLogging")
    public Boolean isSupportGatewayLogging;

    @NameInMap("IsSupportServerSideEncryption")
    public Boolean isSupportServerSideEncryption;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAccountConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountConfigResponseBody self = new DescribeAccountConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAccountConfigResponseBody setIsSupportClientSideEncryption(Boolean isSupportClientSideEncryption) {
        this.isSupportClientSideEncryption = isSupportClientSideEncryption;
        return this;
    }
    public Boolean getIsSupportClientSideEncryption() {
        return this.isSupportClientSideEncryption;
    }

    public DescribeAccountConfigResponseBody setIsSupportElasticGatewayBeta(Boolean isSupportElasticGatewayBeta) {
        this.isSupportElasticGatewayBeta = isSupportElasticGatewayBeta;
        return this;
    }
    public Boolean getIsSupportElasticGatewayBeta() {
        return this.isSupportElasticGatewayBeta;
    }

    public DescribeAccountConfigResponseBody setIsSupportGatewayLogging(Boolean isSupportGatewayLogging) {
        this.isSupportGatewayLogging = isSupportGatewayLogging;
        return this;
    }
    public Boolean getIsSupportGatewayLogging() {
        return this.isSupportGatewayLogging;
    }

    public DescribeAccountConfigResponseBody setIsSupportServerSideEncryption(Boolean isSupportServerSideEncryption) {
        this.isSupportServerSideEncryption = isSupportServerSideEncryption;
        return this;
    }
    public Boolean getIsSupportServerSideEncryption() {
        return this.isSupportServerSideEncryption;
    }

    public DescribeAccountConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAccountConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
