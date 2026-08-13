// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRunRequest extends TeaModel {
    /**
     * <p>是否附带执行日志（默认 false，仅在排查问题时建议开启）</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeLogs")
    public Boolean includeLogs;

    /**
     * <p>runSkill 返回的异步任务 ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRunId</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetSkillRunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRunRequest self = new GetSkillRunRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillRunRequest setIncludeLogs(Boolean includeLogs) {
        this.includeLogs = includeLogs;
        return this;
    }
    public Boolean getIncludeLogs() {
        return this.includeLogs;
    }

    public GetSkillRunRequest setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetSkillRunRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
