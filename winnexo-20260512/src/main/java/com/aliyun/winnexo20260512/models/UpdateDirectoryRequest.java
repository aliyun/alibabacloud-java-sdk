// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateDirectoryRequest extends TeaModel {
    /**
     * <p>新目录描述；缺省表示不更新</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>目录唯一标识（业务 ID，非主键 ID）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>新目录名称；缺省表示不更新</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>新父目录主键 ID；缺省表示不更新父目录</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("parentId")
    public Long parentId;

    /**
     * <p>新目录路径；传入时会级联更新当前目录及全部子目录的 path</p>
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

    public static UpdateDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDirectoryRequest self = new UpdateDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDirectoryRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public UpdateDirectoryRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
