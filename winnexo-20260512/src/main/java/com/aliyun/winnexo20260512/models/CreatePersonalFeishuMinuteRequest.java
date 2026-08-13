// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalFeishuMinuteRequest extends TeaModel {
    /**
     * <p>凭证 ID（关联 rbj_credential 表，必填）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCredentialId</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>资源描述（可选）</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>目标个人目录 ID；不传时自动绑定到当前数字员工默认根目录，传入时必须是当前用户在当前数字员工下的已有个人目录</p>
     * 
     * <strong>example:</strong>
     * <p>exampleDirectoryId</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>飞书妙记 token（妙记唯一标识符，必填）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("minuteToken")
    public String minuteToken;

    /**
     * <p>资源显示名称</p>
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
     * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static CreatePersonalFeishuMinuteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalFeishuMinuteRequest self = new CreatePersonalFeishuMinuteRequest();
        return TeaModel.build(map, self);
    }

    public CreatePersonalFeishuMinuteRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CreatePersonalFeishuMinuteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePersonalFeishuMinuteRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreatePersonalFeishuMinuteRequest setMinuteToken(String minuteToken) {
        this.minuteToken = minuteToken;
        return this;
    }
    public String getMinuteToken() {
        return this.minuteToken;
    }

    public CreatePersonalFeishuMinuteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePersonalFeishuMinuteRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public CreatePersonalFeishuMinuteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
