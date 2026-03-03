// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class NeuronAppClientInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>module_58mkf3jj::page_gbnxyuh5</p>
     */
    @NameInMap("appEntry")
    public String appEntry;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("appId")
    public Long appId;

    @NameInMap("mobiInfo")
    public MobiInfo mobiInfo;

    @NameInMap("pluginList")
    public java.util.List<AppPluginInfo> pluginList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("sidebar")
    public String sidebar;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0.0</p>
     */
    @NameInMap("version")
    public String version;

    public static NeuronAppClientInfo build(java.util.Map<String, ?> map) throws Exception {
        NeuronAppClientInfo self = new NeuronAppClientInfo();
        return TeaModel.build(map, self);
    }

    public NeuronAppClientInfo setAppEntry(String appEntry) {
        this.appEntry = appEntry;
        return this;
    }
    public String getAppEntry() {
        return this.appEntry;
    }

    public NeuronAppClientInfo setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public NeuronAppClientInfo setMobiInfo(MobiInfo mobiInfo) {
        this.mobiInfo = mobiInfo;
        return this;
    }
    public MobiInfo getMobiInfo() {
        return this.mobiInfo;
    }

    public NeuronAppClientInfo setPluginList(java.util.List<AppPluginInfo> pluginList) {
        this.pluginList = pluginList;
        return this;
    }
    public java.util.List<AppPluginInfo> getPluginList() {
        return this.pluginList;
    }

    public NeuronAppClientInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public NeuronAppClientInfo setSidebar(String sidebar) {
        this.sidebar = sidebar;
        return this;
    }
    public String getSidebar() {
        return this.sidebar;
    }

    public NeuronAppClientInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
