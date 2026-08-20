// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillRunRequest extends TeaModel {
    /**
     * <p>Specifies whether to include execution logs. Default value: false. Enable this parameter only for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeLogs")
    public Boolean includeLogs;

    /**
     * <p>The evaluation run ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRunId</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The tenant ID to which the task belongs.</p>
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
