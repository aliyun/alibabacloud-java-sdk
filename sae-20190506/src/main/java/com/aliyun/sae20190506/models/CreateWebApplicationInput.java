// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebApplicationInput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sae-app</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <strong>example:</strong>
     * <p>my sae app</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RevisionConfig")
    public RevisionConfig revisionConfig;

    @NameInMap("WebNetworkConfig")
    public WebNetworkConfig webNetworkConfig;

    @NameInMap("WebScalingConfig")
    public WebScalingConfig webScalingConfig;

    @NameInMap("WebTrafficConfig")
    public WebTrafficConfig webTrafficConfig;

    public static CreateWebApplicationInput build(java.util.Map<String, ?> map) throws Exception {
        CreateWebApplicationInput self = new CreateWebApplicationInput();
        return TeaModel.build(map, self);
    }

    public CreateWebApplicationInput setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public CreateWebApplicationInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWebApplicationInput setRevisionConfig(RevisionConfig revisionConfig) {
        this.revisionConfig = revisionConfig;
        return this;
    }
    public RevisionConfig getRevisionConfig() {
        return this.revisionConfig;
    }

    public CreateWebApplicationInput setWebNetworkConfig(WebNetworkConfig webNetworkConfig) {
        this.webNetworkConfig = webNetworkConfig;
        return this;
    }
    public WebNetworkConfig getWebNetworkConfig() {
        return this.webNetworkConfig;
    }

    public CreateWebApplicationInput setWebScalingConfig(WebScalingConfig webScalingConfig) {
        this.webScalingConfig = webScalingConfig;
        return this;
    }
    public WebScalingConfig getWebScalingConfig() {
        return this.webScalingConfig;
    }

    public CreateWebApplicationInput setWebTrafficConfig(WebTrafficConfig webTrafficConfig) {
        this.webTrafficConfig = webTrafficConfig;
        return this;
    }
    public WebTrafficConfig getWebTrafficConfig() {
        return this.webTrafficConfig;
    }

}
