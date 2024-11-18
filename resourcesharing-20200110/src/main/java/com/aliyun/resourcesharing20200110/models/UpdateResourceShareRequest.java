// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class UpdateResourceShareRequest extends TeaModel {
    /**
     * <p>Specifies whether resources in the resource share can be shared with accounts outside the resource directory. Valid values:</p>
     * <ul>
     * <li>false: Resources in the resource share can be shared only with accounts in the resource directory.</li>
     * <li>true: Resources in the resource share can be shared with both accounts in the resource directory and accounts outside the resource directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowExternalTargets")
    public Boolean allowExternalTargets;

    /**
     * <p>The ID of the resource share.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rs-qSkW1HBY****</p>
     */
    @NameInMap("ResourceShareId")
    public String resourceShareId;

    /**
     * <p>The new name of the resource share.</p>
     * <p>The name must be 1 to 50 characters in length.</p>
     * <p>The name can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new</p>
     */
    @NameInMap("ResourceShareName")
    public String resourceShareName;

    public static UpdateResourceShareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceShareRequest self = new UpdateResourceShareRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceShareRequest setAllowExternalTargets(Boolean allowExternalTargets) {
        this.allowExternalTargets = allowExternalTargets;
        return this;
    }
    public Boolean getAllowExternalTargets() {
        return this.allowExternalTargets;
    }

    public UpdateResourceShareRequest setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }
    public String getResourceShareId() {
        return this.resourceShareId;
    }

    public UpdateResourceShareRequest setResourceShareName(String resourceShareName) {
        this.resourceShareName = resourceShareName;
        return this;
    }
    public String getResourceShareName() {
        return this.resourceShareName;
    }

}
