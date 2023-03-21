// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityEventOperationsResponse")
    public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse> securityEventOperationsResponse;

    public static DescribeSecurityEventOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsResponseBody self = new DescribeSecurityEventOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityEventOperationsResponseBody setSecurityEventOperationsResponse(java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse> securityEventOperationsResponse) {
        this.securityEventOperationsResponse = securityEventOperationsResponse;
        return this;
    }
    public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse> getSecurityEventOperationsResponse() {
        return this.securityEventOperationsResponse;
    }

    public static class DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField extends TeaModel {
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        @NameInMap("FiledName")
        public String filedName;

        @NameInMap("MarkMisType")
        public String markMisType;

        @NameInMap("MarkMisValue")
        public String markMisValue;

        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField self = new DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setFiledAliasName(String filedAliasName) {
            this.filedAliasName = filedAliasName;
            return this;
        }
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setFiledName(String filedName) {
            this.filedName = filedName;
            return this;
        }
        public String getFiledName() {
            return this.filedName;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setMarkMisType(String markMisType) {
            this.markMisType = markMisType;
            return this;
        }
        public String getMarkMisType() {
            return this.markMisType;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setMarkMisValue(String markMisValue) {
            this.markMisValue = markMisValue;
            return this;
        }
        public String getMarkMisValue() {
            return this.markMisValue;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setSupportedMisType(java.util.List<String> supportedMisType) {
            this.supportedMisType = supportedMisType;
            return this;
        }
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource extends TeaModel {
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        @NameInMap("FiledName")
        public String filedName;

        @NameInMap("MarkMisValue")
        public String markMisValue;

        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        public static DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource self = new DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setFiledAliasName(String filedAliasName) {
            this.filedAliasName = filedAliasName;
            return this;
        }
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setFiledName(String filedName) {
            this.filedName = filedName;
            return this;
        }
        public String getFiledName() {
            return this.filedName;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setMarkMisValue(String markMisValue) {
            this.markMisValue = markMisValue;
            return this;
        }
        public String getMarkMisValue() {
            return this.markMisValue;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setSupportedMisType(java.util.List<String> supportedMisType) {
            this.supportedMisType = supportedMisType;
            return this;
        }
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

    }

    public static class DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse extends TeaModel {
        @NameInMap("MarkField")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> markField;

        @NameInMap("MarkFieldsSource")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> markFieldsSource;

        @NameInMap("OperationCode")
        public String operationCode;

        @NameInMap("OperationParams")
        public String operationParams;

        @NameInMap("UserCanOperate")
        public Boolean userCanOperate;

        public static DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse self = new DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse setMarkField(java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> markField) {
            this.markField = markField;
            return this;
        }
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> getMarkField() {
            return this.markField;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse setMarkFieldsSource(java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> markFieldsSource) {
            this.markFieldsSource = markFieldsSource;
            return this;
        }
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> getMarkFieldsSource() {
            return this.markFieldsSource;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse setOperationParams(String operationParams) {
            this.operationParams = operationParams;
            return this;
        }
        public String getOperationParams() {
            return this.operationParams;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse setUserCanOperate(Boolean userCanOperate) {
            this.userCanOperate = userCanOperate;
            return this;
        }
        public Boolean getUserCanOperate() {
            return this.userCanOperate;
        }

    }

}
