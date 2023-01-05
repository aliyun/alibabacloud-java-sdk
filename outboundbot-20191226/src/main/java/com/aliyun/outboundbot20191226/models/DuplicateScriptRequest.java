// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DuplicateScriptRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

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
