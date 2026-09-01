// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckScopeConfigRequest extends TeaModel {
    /**
     * <p>The automatic scan configuration as a JSON string. The following fields are included:</p>
     * <ul>
     * <li><strong>autoInclude</strong>: specifies whether to enable automatic scan. Valid values: <strong>true</strong>: enabled. <strong>false</strong>: disabled.</li>
     * <li><strong>autoRule</strong>: the enablement configuration.</li>
     * <li><strong>ruleOperator</strong>: the enablement configuration rule. Set the value to <strong>include</strong>.</li>
     * <li><strong>operator</strong>: the logical operator. Set the value to <strong>or</strong>.</li>
     * <li><strong>rule</strong>: the rule.</li>
     * <li><strong>condition</strong>: the rule condition. Valid values: <strong>vendor</strong>: vendor. <strong>assetType</strong>: level-1 asset type. <strong>assetSubType</strong>: level-2 asset type.<blockquote>
     * <p>For more information, refer to the <a href="~~GetCloudAssetCriteria~~">GetCloudAssetCriteria</a> operation.</p>
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
     * <li><strong>0</strong>: disable automatic scan</li>
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
     * <blockquote>
     * <p>Call the <a href="~~GetCheckScopeConfig~~">GetCheckScopeConfig</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00cfa8161da093089e6804ba6a33****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public static UpdateCheckScopeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckScopeConfigRequest self = new UpdateCheckScopeConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckScopeConfigRequest setAutoConfig(String autoConfig) {
        this.autoConfig = autoConfig;
        return this;
    }
    public String getAutoConfig() {
        return this.autoConfig;
    }

    public UpdateCheckScopeConfigRequest setAutoType(Integer autoType) {
        this.autoType = autoType;
        return this;
    }
    public Integer getAutoType() {
        return this.autoType;
    }

    public UpdateCheckScopeConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public UpdateCheckScopeConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public UpdateCheckScopeConfigRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
