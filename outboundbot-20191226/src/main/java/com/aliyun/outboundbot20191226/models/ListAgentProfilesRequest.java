// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAgentProfilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("AppIp")
    public String appIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>d004cfd2-6a81-491c-83c6-cbe186620c95</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ListAgentProfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentProfilesRequest self = new ListAgentProfilesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentProfilesRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public ListAgentProfilesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentProfilesRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
