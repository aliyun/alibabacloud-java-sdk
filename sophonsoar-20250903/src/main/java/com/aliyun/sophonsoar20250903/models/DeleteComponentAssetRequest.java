// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetRequest extends TeaModel {
    /**
     * <p>Asset UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
     */
    @NameInMap("ComponentAssetUuid")
    public String componentAssetUuid;

    /**
     * <p>Set the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Resource directory member account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13760*****718726</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteComponentAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentAssetRequest self = new DeleteComponentAssetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComponentAssetRequest setComponentAssetUuid(String componentAssetUuid) {
        this.componentAssetUuid = componentAssetUuid;
        return this;
    }
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    public DeleteComponentAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteComponentAssetRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
