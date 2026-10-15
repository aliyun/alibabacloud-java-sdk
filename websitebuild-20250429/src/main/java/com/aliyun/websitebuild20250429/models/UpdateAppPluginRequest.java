// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppPluginRequest extends TeaModel {
    /**
     * <p>The category.</p>
     * 
     * <strong>example:</strong>
     * <p>DataManagement</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The configuration form in React JSON Schema format.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("ConfigItems")
    public String configItems;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Other extension information in JSON format for future parameter expansion.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The hook definitions.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Hooks")
    public String hooks;

    /**
     * <p>The plug-in description.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01ANcLnQ1bCX7tZPVMJ_!!6000000003429-2-tps-100-100.png">https://img.alicdn.com/imgextra/i4/O1CN01ANcLnQ1bCX7tZPVMJ_!!6000000003429-2-tps-100-100.png</a></p>
     */
    @NameInMap("Icon")
    public String icon;

    /**
     * <p>The gateway plug-in ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1bae9ceaceea432d91c7069fab0dfc02</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The plug-in name.</p>
     * 
     * <strong>example:</strong>
     * <p>alisecguard</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    /**
     * <p>The plug-in version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("PluginVersion")
    public String pluginVersion;

    /**
     * <p>The skill header information for model selection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SkillHeader")
    public String skillHeader;

    /**
     * <p>The labels.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The visibility.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static UpdateAppPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppPluginRequest self = new UpdateAppPluginRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppPluginRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateAppPluginRequest setConfigItems(String configItems) {
        this.configItems = configItems;
        return this;
    }
    public String getConfigItems() {
        return this.configItems;
    }

    public UpdateAppPluginRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAppPluginRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public UpdateAppPluginRequest setHooks(String hooks) {
        this.hooks = hooks;
        return this;
    }
    public String getHooks() {
        return this.hooks;
    }

    public UpdateAppPluginRequest setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public UpdateAppPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpdateAppPluginRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public UpdateAppPluginRequest setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    public UpdateAppPluginRequest setSkillHeader(String skillHeader) {
        this.skillHeader = skillHeader;
        return this;
    }
    public String getSkillHeader() {
        return this.skillHeader;
    }

    public UpdateAppPluginRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public UpdateAppPluginRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
