// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPushAllTaskRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The check items. Separate multiple check items with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>OVAL_ENTITY</strong>: Common Vulnerabilities and Exposures (CVE) vulnerabilities.</li>
     * <li><strong>CMS</strong>: Web-CMS vulnerabilities.</li>
     * <li><strong>SYSVUL</strong>: Windows system vulnerabilities.</li>
     * <li><strong>SCA</strong>: application vulnerabilities.</li>
     * <li><strong>HEALTH_CHECK</strong>: baselines.</li>
     * <li><strong>WEBSHELL</strong>: webshells.</li>
     * <li><strong>PROC_SNAPSHOT</strong>: processes.</li>
     * <li><strong>PORT_SNAPSHOT</strong>: ports.</li>
     * <li><strong>ACCOUNT_SNAPSHOT</strong>: accounts.</li>
     * <li><strong>SOFTWARE_SNAPSHOT</strong>: software assets.</li>
     * <li><strong>SCA_SNAPSHOT</strong>: middleware, databases, and web services.</li>
     * <li><strong>CROND_SNAPSHOT</strong>: scheduled tasks.</li>
     * <li><strong>AUTORUN_SNAPSHOT</strong>: startup items.</li>
     * <li><strong>LKM_SNAPSHOT</strong>: kernel modules.</li>
     * <li><strong>SCA_PROXY_SNAPSHOT</strong>: websites.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HEALTH_CHECK,OVAL_ENTITY</p>
     */
    @NameInMap("Tasks")
    public String tasks;

    /**
     * <p>The UUIDs of servers on which you want to perform security check tasks. Separate multiple UUIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-923b4538-0e88-409d-80ba-cb2e7487****,dc1691eb-656f-472f-b2aa-04f621f4****,70452f92-9fc1-45c5-ab35-e7bf8552****</p>
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
