// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class EditPluginConfigRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Plugin configuration</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("PluginConfig")
    public String pluginConfig;

    /**
     * <p>Plugin description</p>
     * 
     * <strong>example:</strong>
     * <p>根据关键字查询相关的Github Repositories</p>
     */
    @NameInMap("PluginDesc")
    public String pluginDesc;

    /**
     * <p>Plugin ID</p>
     * 
     * <strong>example:</strong>
     * <p>aliplayer-react</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>Plugin name</p>
     * 
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
