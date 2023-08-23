// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AdvanceSecurityEventOperationsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation performed on the alert event.</p>
     */
    @NameInMap("SecurityEventOperationsResponse")
    public java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse> securityEventOperationsResponse;

    public static AdvanceSecurityEventOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdvanceSecurityEventOperationsResponseBody self = new AdvanceSecurityEventOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public AdvanceSecurityEventOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AdvanceSecurityEventOperationsResponseBody setSecurityEventOperationsResponse(java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse> securityEventOperationsResponse) {
        this.securityEventOperationsResponse = securityEventOperationsResponse;
        return this;
    }
    public java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse> getSecurityEventOperationsResponse() {
        return this.securityEventOperationsResponse;
    }

    public static class AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField extends TeaModel {
        /**
         * <p>The alias of the field that is used in the whitelist rule.</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The field that is used in the whitelist rule.</p>
         */
        @NameInMap("FiledName")
        public String filedName;

        /**
         * <p>The operation that is used in the whitelist rule. Valid values:</p>
         * <br>
         * <p>*   **contains**: contains</p>
         * <p>*   **notContains**: does not contain</p>
         * <p>*   **regex**: regular expression</p>
         * <p>*   **strEqual**: equals</p>
         * <p>*   **strNotEqual**: does not equal</p>
         */
        @NameInMap("MarkMisType")
        public String markMisType;

        /**
         * <p>The value of the field that is used in the whitelist rule.</p>
         */
        @NameInMap("MarkMisValue")
        public String markMisValue;

        /**
         * <p>The operation that is used and can be modified in the whitelist rule. Valid values:</p>
         * <br>
         * <p>*   **contains**: contains</p>
         * <p>*   **notContains**: does not contain</p>
         * <p>*   **regex**: regular expression</p>
         * <p>*   **strEqual**: equals</p>
         * <p>*   **strNotEqual**: does not equal</p>
         */
        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        public static AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField build(java.util.Map<String, ?> map) throws Exception {
            AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField self = new AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField();
            return TeaModel.build(map, self);
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setFiledAliasName(String filedAliasName) {
            this.filedAliasName = filedAliasName;
            return this;
        }
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setFiledName(String filedName) {
            this.filedName = filedName;
            return this;
        }
        public String getFiledName() {
            return this.filedName;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setMarkMisType(String markMisType) {
            this.markMisType = markMisType;
            return this;
        }
        public String getMarkMisType() {
            return this.markMisType;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setMarkMisValue(String markMisValue) {
            this.markMisValue = markMisValue;
            return this;
        }
        public String getMarkMisValue() {
            return this.markMisValue;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField setSupportedMisType(java.util.List<String> supportedMisType) {
            this.supportedMisType = supportedMisType;
            return this;
        }
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

    }

    public static class AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource extends TeaModel {
        /**
         * <p>The alias of the field that can be used in the whitelist rule.</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The field that can be used in the whitelist rule.</p>
         */
        @NameInMap("FiledName")
        public String filedName;

        /**
         * <p>The value of the field that can be used in the whitelist rule.</p>
         */
        @NameInMap("MarkMisValue")
        public String markMisValue;

        /**
         * <p>The operation that is supported in the whitelist rule. Valid values:</p>
         * <br>
         * <p>*   **contains**: contains</p>
         * <p>*   **notContains**: does not contain</p>
         * <p>*   **regex**: regular expression</p>
         * <p>*   **strEqual**: equals</p>
         * <p>*   **strNotEqual**: does not equal</p>
         */
        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        public static AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource build(java.util.Map<String, ?> map) throws Exception {
            AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource self = new AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource();
            return TeaModel.build(map, self);
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setFiledAliasName(String filedAliasName) {
            this.filedAliasName = filedAliasName;
            return this;
        }
        public String getFiledAliasName() {
            return this.filedAliasName;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setFiledName(String filedName) {
            this.filedName = filedName;
            return this;
        }
        public String getFiledName() {
            return this.filedName;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setMarkMisValue(String markMisValue) {
            this.markMisValue = markMisValue;
            return this;
        }
        public String getMarkMisValue() {
            return this.markMisValue;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource setSupportedMisType(java.util.List<String> supportedMisType) {
            this.supportedMisType = supportedMisType;
            return this;
        }
        public java.util.List<String> getSupportedMisType() {
            return this.supportedMisType;
        }

    }

    public static class AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse extends TeaModel {
        /**
         * <p>The object on which the operation is performed. This parameter is required when you set the OperationCode parameter to **advance_mark_mis_info**.</p>
         */
        @NameInMap("MarkField")
        public java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> markField;

        /**
         * <p>The metadata configuration returned by the advanced whitelist rule.</p>
         */
        @NameInMap("MarkFieldsSource")
        public java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> markFieldsSource;

        /**
         * <p>The operation performed to handle the alert. Valid values:</p>
         * <br>
         * <p>*   **block_ip**: blocks the alert.</p>
         * <p>*   **advance_mark_mis_info**: adds the alert to the whitelist.</p>
         * <p>*   **ignore**: ignores the alert.</p>
         * <p>*   **manual_handled**: marks the alert as manually handled.</p>
         * <p>*   **kill_process**: terminates the malicious process.</p>
         * <p>*   **cleanup**: performs in-depth virus detection and removal.</p>
         * <p>*   **kill_and_quara**: performs virus detection and removal.</p>
         * <p>*   **disable_malicious_defense**: turns off malicious defense behavior.</p>
         * <p>*   **client_problem_check**: performs troubleshooting.</p>
         * <p>*   **quara**: performs quarantine operations.</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The configuration of the operation performed to handle the alert event.</p>
         */
        @NameInMap("OperationParams")
        public String operationParams;

        /**
         * <p>Indicates whether the operation can be performed.</p>
         * <br>
         * <p>*   **true**: The operation can be performed.</p>
         * <p>*   **false**: The operation cannot be performed.</p>
         */
        @NameInMap("UserCanOperate")
        public Boolean userCanOperate;

        public static AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
            AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse self = new AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse();
            return TeaModel.build(map, self);
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse setMarkField(java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> markField) {
            this.markField = markField;
            return this;
        }
        public java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> getMarkField() {
            return this.markField;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse setMarkFieldsSource(java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> markFieldsSource) {
            this.markFieldsSource = markFieldsSource;
            return this;
        }
        public java.util.List<AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> getMarkFieldsSource() {
            return this.markFieldsSource;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse setOperationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }
        public String getOperationCode() {
            return this.operationCode;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse setOperationParams(String operationParams) {
            this.operationParams = operationParams;
            return this;
        }
        public String getOperationParams() {
            return this.operationParams;
        }

        public AdvanceSecurityEventOperationsResponseBodySecurityEventOperationsResponse setUserCanOperate(Boolean userCanOperate) {
            this.userCanOperate = userCanOperate;
            return this;
        }
        public Boolean getUserCanOperate() {
            return this.userCanOperate;
        }

    }

}
