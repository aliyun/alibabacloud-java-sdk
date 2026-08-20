// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class MoveResourceGroupRequest extends TeaModel {
    /**
     * <p>A client token that ensures the idempotence of the request. Generate a unique value on your client. The token must contain only ASCII characters and be no more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the destination resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz2qj7awz****</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The unique ID of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d4****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static MoveResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupRequest self = new MoveResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public MoveResourceGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MoveResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public MoveResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
