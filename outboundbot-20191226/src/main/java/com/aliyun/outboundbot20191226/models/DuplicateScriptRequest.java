// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DuplicateScriptRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6114e7e8-4140-48d9-b46d-65ea29f13fe8</p>
     */
    @NameInMap("SourceScriptId")
    public String sourceScriptId;

    public static DuplicateScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        DuplicateScriptRequest self = new DuplicateScriptRequest();
        return TeaModel.build(map, self);
    }

    public DuplicateScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DuplicateScriptRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DuplicateScriptRequest setSourceScriptId(String sourceScriptId) {
        this.sourceScriptId = sourceScriptId;
        return this;
    }
    public String getSourceScriptId() {
        return this.sourceScriptId;
    }

}
