// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToPersonalResourceShrinkRequest extends TeaModel {
    /**
     * <p>The enterprise knowledge base directory ID.</p>
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
    public String itemIdsShrink;

    /**
     * <p>The save mode. Valid values:</p>
     * <ul>
     * <li>link: creates a link (1:1 idempotent, editing the output synchronizes the resource).</li>
     * <li>copy: creates a copy (unlimited times, snapshot).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>copy</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static SaveGroupOutputFileToPersonalResourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToPersonalResourceShrinkRequest self = new SaveGroupOutputFileToPersonalResourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToPersonalResourceShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public SaveGroupOutputFileToPersonalResourceShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SaveGroupOutputFileToPersonalResourceShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public SaveGroupOutputFileToPersonalResourceShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SaveGroupOutputFileToPersonalResourceShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
