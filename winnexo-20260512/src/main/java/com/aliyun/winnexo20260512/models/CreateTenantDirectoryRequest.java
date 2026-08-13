// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTenantDirectoryRequest extends TeaModel {
    /**
     * <p>目录描述</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>文件名</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>父目录内部主键；不传表示创建企业知识库根目录</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>文件 OSS URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/oss/file.pdf">https://example.com/oss/file.pdf</a></p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreateTenantDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDirectoryRequest self = new CreateTenantDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTenantDirectoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateTenantDirectoryRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateTenantDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
