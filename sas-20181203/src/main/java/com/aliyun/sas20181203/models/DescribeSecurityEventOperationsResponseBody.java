// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B7A2000F-497E-5DA0-B14D-615CD410DD7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operations that are performed to handle the alert.</p>
     */
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

    public static class DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields extends TeaModel {
        /**
         * <p>The description of the field that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the value of the field can be changed.</p>
         * <ul>
         * <li><strong>CUSTOM</strong>: The value of the field can be changed.</li>
         * <li><strong>SYSTEM</strong>: The value of the field cannot be changed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("FillType")
        public String fillType;

        /**
         * <p>The maximum length of the field that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("MaxLength")
        public Integer maxLength;

        /**
         * <p>The minimum length of the field that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("MinLength")
        public Integer minLength;

        /**
         * <p>The name of the field that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>pid</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the parameter is required. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Required")
        public Boolean required;

        /**
         * <p>The display name of the field that can be used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>pid</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The display name of the field that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>1791</p>
         */
        @NameInMap("ShowValue")
        public String showValue;

        /**
         * <p>The value of the field that is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>1791</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields self = new DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setFillType(String fillType) {
            this.fillType = fillType;
            return this;
        }
        public String getFillType() {
            return this.fillType;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setShowValue(String showValue) {
            this.showValue = showValue;
            return this;
        }
        public String getShowValue() {
            return this.showValue;
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField extends TeaModel {
        /**
         * <p>The alias of the field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>file path</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtModified</p>
         */
        @NameInMap("FiledName")
        public String filedName;

        /**
         * <p>The operation that is used in the whitelist rule. Valid values:</p>
         * <ul>
         * <li><strong>contains</strong>: contains</li>
         * <li><strong>notContains</strong>: does not contain</li>
         * <li><strong>regex</strong>: regular expression</li>
         * <li><strong>strEqual</strong>: equals</li>
         * <li><strong>strNotEqual</strong>: does not equal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("MarkMisType")
        public String markMisType;

        /**
         * <p>The value of the field that is used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-25 10:11:04</p>
         */
        @NameInMap("MarkMisValue")
        public String markMisValue;

        /**
         * <p>An array consisting of the operations that are supported by the method to add the alert event to the whitelist.</p>
         */
        @NameInMap("SupportedMisType")
        public java.util.List<String> supportedMisType;

        /**
         * <p>The UUID of the server on which the alert event is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>3d6b4a75-c28f-447b-9142-38f6252c****</p>
         */
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
        /**
         * <p>The alias of the field that can be used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>file path</p>
         */
        @NameInMap("FiledAliasName")
        public String filedAliasName;

        /**
         * <p>The field that can be used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtModified</p>
         */
        @NameInMap("FiledName")
        public String filedName;

        /**
         * <p>The value of the field that can be used in the whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("MarkMisValue")
        public String markMisValue;

        /**
         * <p>An array consisting of the operations that are supported by the method to add the alert event to the whitelist.</p>
         */
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
        /**
         * <p>The objects on which the operations are performed. This parameter is required when you add the alert to the whitelist by configuring precise defense rules.</p>
         */
        @NameInMap("MappingMarkFields")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields> mappingMarkFields;

        /**
         * <p>The configurations that are used when the value of the OperationCode parameter is <strong>advance_mark_mis_info</strong>.</p>
         */
        @NameInMap("MarkField")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkField> markField;

        /**
         * <p>The configuration items that can be used when the value of the OperationCode parameter is advance_mark_mis_info.</p>
         */
        @NameInMap("MarkFieldsSource")
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMarkFieldsSource> markFieldsSource;

        /**
         * <p>The operation that is performed to handle the alert. Valid values:</p>
         * <ul>
         * <li><strong>block_ip</strong>: blocks the source IP address.</li>
         * <li><strong>advance_mark_mis_info</strong>: adds the alert to the whitelist.</li>
         * <li><strong>ignore</strong>: ignores the alert.</li>
         * <li><strong>manual_handled</strong>: marks the alert as manually handled.</li>
         * <li><strong>kill_process</strong>: terminates the malicious process.</li>
         * <li><strong>cleanup</strong>: performs in-depth virus detection and removal.</li>
         * <li><strong>kill_and_quara</strong>: terminates the malicious process and quarantines the source file.</li>
         * <li><strong>disable_malicious_defense</strong>: disables the malicious behavior defense feature.</li>
         * <li><strong>client_problem_check</strong>: performs troubleshooting.</li>
         * <li><strong>quara</strong>: quarantines the source file of the malicious process.</li>
         * <li><strong>defense_mark_mis_info</strong>: enables the precise defense feature but disables the notification feature.</li>
         * <li><strong>rm_defense_mark_mis_info</strong>: enables the notification feature.</li>
         * <li><strong>rm_mark_mis_info</strong>: removes the alert from the whitelist.</li>
         * <li><strong>cancle_manual</strong>: cancels marking the alert as manually handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>advance_mark_mis_info</p>
         */
        @NameInMap("OperationCode")
        public String operationCode;

        /**
         * <p>The configuration of the operation that is performed to handle the alert.</p>
         * <blockquote>
         * <p> If the value of the <strong>OperationCode</strong> parameter is <strong>kill_and_quara</strong> or <strong>block_ip</strong>, the OperationParams parameter is required. If the value of the <strong>OperationCode</strong> parameter is a different value, the OperationParams parameter can be left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expireTime&quot;:1641566807783}</p>
         */
        @NameInMap("OperationParams")
        public String operationParams;

        /**
         * <p>Indicates whether you can handle the alert in the current edition of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UserCanOperate")
        public Boolean userCanOperate;

        public static DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse self = new DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponse setMappingMarkFields(java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields> mappingMarkFields) {
            this.mappingMarkFields = mappingMarkFields;
            return this;
        }
        public java.util.List<DescribeSecurityEventOperationsResponseBodySecurityEventOperationsResponseMappingMarkFields> getMappingMarkFields() {
            return this.mappingMarkFields;
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
