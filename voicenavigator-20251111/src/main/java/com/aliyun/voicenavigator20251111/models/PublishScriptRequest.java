// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class PublishScriptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>19ac2375-53e3-477f-abe9-6cd334227981</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b090</p>
     */
    @NameInMap("ScriptId")
    public String scriptId;

    /**
     * <strong>example:</strong>
     * <p>64241e64-190c-45d1-af66-06f51c07b091</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static PublishScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishScriptRequest self = new PublishScriptRequest();
        return TeaModel.build(map, self);
    }

    public PublishScriptRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PublishScriptRequest setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public PublishScriptRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
