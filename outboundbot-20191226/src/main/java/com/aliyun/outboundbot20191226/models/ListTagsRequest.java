// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListTagsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8fa1953f-4a84-46d8-b80c-8ce9cf684fb3</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8a4c6d3d-5ed6-44ca-b779-16c20f8862be</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    public static ListTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsRequest self = new ListTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTagsRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

}
