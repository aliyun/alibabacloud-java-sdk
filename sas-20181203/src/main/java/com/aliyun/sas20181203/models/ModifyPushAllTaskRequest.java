// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskRequest extends TeaModel {
    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The check items. Separate multiple check items with commas (,). Valid values:
    // 
    // *   **OVAL_ENTITY**: Common Vulnerabilities and Exposures (CVE) vulnerabilities
    // *   **CMS**: Web-CMS vulnerabilities
    // *   **SYSVUL**: Windows system vulnerabilities
    // *   **SCA**: application vulnerabilities
    // *   **HEALTH_CHECK**: baselines
    // *   **WEBSHELL**: webshells
    // *   **PROC_SNAPSHOT**: processes
    // *   **PORT_SNAPSHOT**: ports
    // *   **ACCOUNT_SNAPSHOT**: accounts
    // *   **SOFTWARE_SNAPSHOT**: software assets
    // *   **SCA_SNAPSHOT**: middleware
    @NameInMap("Tasks")
    public String tasks;

    // The UUIDs of servers on which you want to perform security check tasks. Separate multiple UUIDs with commas (,).
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
