// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class EditPluginConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("PluginConfig")
    public String pluginConfig;

    /**
     * <strong>example:</strong>
     * <p>通义万相通过文字描述生成图片</p>
     */
    @NameInMap("PluginDesc")
    public String pluginDesc;

    /**
     * <strong>example:</strong>
     * <p>aliplayer-react</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <strong>example:</strong>
     * <p>alisecguard</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    public static EditPluginConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        EditPluginConfigRequest self = new EditPluginConfigRequest();
        return TeaModel.build(map, self);
    }

    public EditPluginConfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public EditPluginConfigRequest setPluginConfig(String pluginConfig) {
        this.pluginConfig = pluginConfig;
        return this;
    }
    public String getPluginConfig() {
        return this.pluginConfig;
    }

    public EditPluginConfigRequest setPluginDesc(String pluginDesc) {
        this.pluginDesc = pluginDesc;
        return this;
    }
    public String getPluginDesc() {
        return this.pluginDesc;
    }

    public EditPluginConfigRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public EditPluginConfigRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

}
