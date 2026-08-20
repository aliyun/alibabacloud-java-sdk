// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveOutputFileToResourceRequest extends TeaModel {
    /**
     * <p>The ID of the target personal folder. If not specified, the user\&quot;s default folder is automatically resolved.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>itemIds</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("itemIds")
    public java.util.List<String> itemIds;

    /**
     * <p>The save mode. Valid values:</p>
     * <ul>
     * <li>link: Links the resource to the output in a 1:1 idempotent manner. Edits to the output are synchronized to the resource.</li>
     * <li>copy: Creates a snapshot copy with no limit on the number of copies.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>link</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass it explicitly with --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SaveOutputFileToResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOutputFileToResourceRequest self = new SaveOutputFileToResourceRequest();
        return TeaModel.build(map, self);
    }

    public SaveOutputFileToResourceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SaveOutputFileToResourceRequest setItemIds(java.util.List<String> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<String> getItemIds() {
        return this.itemIds;
    }

    public SaveOutputFileToResourceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SaveOutputFileToResourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
