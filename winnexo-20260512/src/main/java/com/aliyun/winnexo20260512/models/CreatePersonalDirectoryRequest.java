// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalDirectoryRequest extends TeaModel {
    /**
     * <p>目录描述（可选）</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>目录名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>数字员工名称（已废弃：不再作为个人资源隔离条件，仅保留用于来源追溯）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>父目录 ID；不传时新目录挂在用户的默认根目录下，传入时必须是当前用户的已有个人目录</p>
     * 
     * <strong>example:</strong>
     * <p>exampleParentDirectoryId</p>
     */
    @NameInMap("parentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDirectoryRequest self = new CreatePersonalDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDirectoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalDirectoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalDirectoryRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalDirectoryRequest setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public CreatePersonalDirectoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
