// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckScopeConfigResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetCheckScopeConfigResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCheckScopeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckScopeConfigResponseBody self = new GetCheckScopeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckScopeConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCheckScopeConfigResponseBody setData(GetCheckScopeConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCheckScopeConfigResponseBodyData getData() {
        return this.data;
    }

    public GetCheckScopeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCheckScopeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckScopeConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCheckScopeConfigResponseBodyData extends TeaModel {
        /**
         * <p>The automatic scan configuration as a JSON string. The following fields are included:</p>
         * <ul>
         * <li><strong>autoInclude</strong>: specifies whether to enable automatic scanning. Valid values: <strong>true</strong>: enabled. <strong>false</strong>: disabled.</li>
         * <li><strong>autoRule</strong>: the enablement configuration.</li>
         * <li><strong>ruleOperator</strong>: the enablement configuration rule. The value is <strong>include</strong>.</li>
         * <li><strong>operator</strong>: the logical operator. The value is <strong>or</strong>.</li>
         * <li><strong>rule</strong>: the rule.</li>
         * <li><strong>condition</strong>: the rule condition. Valid values: <strong>vendor</strong>: vendor. <strong>assetType</strong>: level-1 asset type. <strong>assetSubType</strong>: level-2 asset type.<blockquote>
         * <p>For more information, see the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;autoInclude\&quot;:true,\&quot;autoRule\&quot;:{\&quot;ruleOperator\&quot;:\&quot;include\&quot;,\&quot;operator\&quot;:\&quot;or\&quot;,\&quot;rule\&quot;:[{\&quot;condition\&quot;:\&quot;assetSubType\&quot;,\&quot;ruleOperator\&quot;:\&quot;include\&quot;,\&quot;value\&quot;:[{\&quot;vendor\&quot;:\&quot;0\&quot;,\&quot;assetType\&quot;:\&quot;0\&quot;,\&quot;assetSubType\&quot;:\&quot;100\&quot;}]}]}}&quot;</p>
         */
        @NameInMap("AutoConfig")
        public String autoConfig;

        /**
         * <p>The automatic scan configuration type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: automatic scanning is disabled</li>
         * <li><strong>1</strong>: automatically scan newly added cloud assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoType")
        public Integer autoType;

        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>97a1fed216908e417407344e1505xxxx</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-16 18:17:16</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-09 10:19:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The scan scope configuration type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: scan by instance</li>
         * <li><strong>3</strong>: scan all</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static GetCheckScopeConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCheckScopeConfigResponseBodyData self = new GetCheckScopeConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCheckScopeConfigResponseBodyData setAutoConfig(String autoConfig) {
            this.autoConfig = autoConfig;
            return this;
        }
        public String getAutoConfig() {
            return this.autoConfig;
        }

        public GetCheckScopeConfigResponseBodyData setAutoType(Integer autoType) {
            this.autoType = autoType;
            return this;
        }
        public Integer getAutoType() {
            return this.autoType;
        }

        public GetCheckScopeConfigResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public GetCheckScopeConfigResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCheckScopeConfigResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCheckScopeConfigResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
