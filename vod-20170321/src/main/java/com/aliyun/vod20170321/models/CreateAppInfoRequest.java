// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAppInfoRequest extends TeaModel {
    /**
     * <p>The application name. The name must be unique.</p>
     * <ul>
     * <li>The name can be up to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), hyphens (-), and at signs (@).</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application description.</p>
     * <ul>
     * <li>The description can be up to 512 characters in length.</li>
     * <li>UTF-8 encoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>myfirstapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzko7fsuj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInfoRequest self = new CreateAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppInfoRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
