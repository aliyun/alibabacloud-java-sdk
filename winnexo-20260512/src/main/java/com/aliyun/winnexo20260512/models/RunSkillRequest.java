// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RunSkillRequest extends TeaModel {
    @NameInMap("arguments")
    public java.util.Map<String, ?> arguments;

    /**
     * <p>幂等 token，调用方自行生成；当前版本仅记录到 metadata，未做去重</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>抽象模型名（模型档位），不传默认 standard</p>
     * 
     * <strong>example:</strong>
     * <p>quick</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>数字员工名称；用于按绑定关系计算 CodeAgent allowedSkills 白名单</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>技能编码（全局唯一），优先级高于 skillName</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>技能名称，未传 skillCode 时使用；租户范围内必须唯一</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static RunSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSkillRequest self = new RunSkillRequest();
        return TeaModel.build(map, self);
    }

    public RunSkillRequest setArguments(java.util.Map<String, ?> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.Map<String, ?> getArguments() {
        return this.arguments;
    }

    public RunSkillRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunSkillRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RunSkillRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public RunSkillRequest setSkillCode(String skillCode) {
        this.skillCode = skillCode;
        return this;
    }
    public String getSkillCode() {
        return this.skillCode;
    }

    public RunSkillRequest setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public RunSkillRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
