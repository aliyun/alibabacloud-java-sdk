// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToGroupResourceRequest extends TeaModel {
    /**
     * <p>The ID of the target personal directory. If not specified, the user\&quot;s default directory is automatically resolved.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>The project group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleGroupId</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>itemIds</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;item-1&quot;,&quot;item-2&quot;]</p>
     */
    @NameInMap("itemIds")
    public java.util.List<String> itemIds;

    /**
     * <p>The save mode. Valid values:</p>
     * <ul>
     * <li>link: creates a link (1:1 idempotent, editing the output synchronizes the resource).</li>
     * <li>copy: creates a copy (unlimited times, snapshot).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>link</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this value explicitly by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SaveGroupOutputFileToGroupResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToGroupResourceRequest self = new SaveGroupOutputFileToGroupResourceRequest();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToGroupResourceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SaveGroupOutputFileToGroupResourceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SaveGroupOutputFileToGroupResourceRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    public SaveGroupOutputFileToGroupResourceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SaveGroupOutputFileToGroupResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
