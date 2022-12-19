// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array consisting of the operations that you can perform to handle the alert event.
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
        // The alias of the field that is used in the whitelist rule.
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        // The field that is used in the whitelist rule.
        @NameInMap("FiledName")
        public String filedName;

        // The operation that is used in the whitelist rule. Valid values:
        // 
        // *   **contains**: contains
        // *   **notContains**: does not contain
        // *   **regex**: regular expression
        // *   **strEqual**: equals
        // *   **strNotEqual**: does not equal
        @NameInMap("MarkMisType")
        public String markMisType;

        // The value of the field that is used in the whitelist rule.
        @NameInMap("MarkMisValue")
        public String markMisValue;

        // An array consisting of the operations that are supported by the method to add the alert event to the whitelist.
        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        // The UUID of the server on which the alert event is detected.
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
        // The alias of the field that can be used in the whitelist rule.
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        // The field that can be used in the whitelist rule.
        @NameInMap("FiledName")
        public String filedName;

        // The value of the field that can be used in the whitelist rule.
        @NameInMap("MarkMisValue")
        public String markMisValue;

        // An array consisting of the operations that are supported by the method to add the alert event to the whitelist.
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
        // An array consisting of the configuration information that is used when the value of the OperationCode parameter is **advance\_mark\_mis_info**.
        @NameInMap("MarkField")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> markField;

        // An array consisting of the configuration items that can be used when the value of the OperationCode parameter is advance_mark_mis_info.
        @NameInMap("MarkFieldsSource")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> markFieldsSource;

        // The operation that you can perform to handle the alert. Valid values:
        // 
        // *   **block_ip**: blocks the source IP address.
        // *   **advance\_mark\_mis_info**: adds the alert to the whitelist.
        // *   **ignore**: ignores the alert.
        // *   **manual_handled**: marks the alert as manually handled.
        // *   **kill_process**: terminates the malicious process.
        // *   **cleanup**: performs in-depth virus detection and removal.
        // *   **kill\_and_quara**: terminates the malicious process and quarantines the source file.
        // *   **disable\_malicious_defense**: stops the container on which the alerting files or processes exist.
        // *   **client\_problem_check**: performs troubleshooting.
        // *   **quara**: quarantines the source file of the malicious process.
        @NameInMap("OperationCode")
        public String operationCode;

        // The configuration of the operation that you can perform to handle the alert event.
        // 
        // >  If the value of the OperationCode parameter is `kill_and_quara` or `block_ip`, the OperationParams parameter is required. If the value of the OperationCode parameter is a different value, the OperationParams parameter can be left empty.
        @NameInMap("OperationParams")
        public String operationParams;

        // Indicates whether you can handle the alert event in the current edition of Security Center. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
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
