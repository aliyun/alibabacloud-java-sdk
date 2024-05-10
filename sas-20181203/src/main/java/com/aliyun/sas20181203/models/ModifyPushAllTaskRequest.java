// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The check items. Separate multiple check items with commas (,). Valid values:</p>
     * <br>
     * <p>*   **OVAL_ENTITY**: Common Vulnerabilities and Exposures (CVE) vulnerabilities</p>
     * <p>*   **CMS**: Web-CMS vulnerabilities</p>
     * <p>*   **SYSVUL**: Windows system vulnerabilities</p>
     * <p>*   **SCA**: application vulnerabilities</p>
     * <p>*   **HEALTH_CHECK**: baselines</p>
     * <p>*   **WEBSHELL**: webshells</p>
     * <p>*   **PROC_SNAPSHOT**: processes</p>
     * <p>*   **PORT_SNAPSHOT**: ports</p>
     * <p>*   **ACCOUNT_SNAPSHOT**: accounts</p>
     * <p>*   **SOFTWARE_SNAPSHOT**: software assets</p>
     * <p>*   **SCA_SNAPSHOT**: middleware</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tasks")
    public String tasks;

    /**
     * <p>The UUIDs of servers on which you want to perform security check tasks. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ModifyPushAllTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPushAllTaskRequest self = new ModifyPushAllTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPushAllTaskRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyPushAllTaskRequest setTasks(String tasks) {
        this.tasks = tasks;
        return this;
    }
    public String getTasks() {
        return this.tasks;
    }

    public ModifyPushAllTaskRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
