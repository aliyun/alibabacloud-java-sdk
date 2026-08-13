// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveOutputFileToResourceRequest extends TeaModel {
    /**
     * <p>目标个人目录 ID；不传则自动解析用户默认目录。</p>
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
     * <p>保存方式：link=链接（1:1 幂等，编辑产出会同步资源） / copy=复制（不限次，快照）</p>
     * 
     * <strong>example:</strong>
     * <p>link</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
