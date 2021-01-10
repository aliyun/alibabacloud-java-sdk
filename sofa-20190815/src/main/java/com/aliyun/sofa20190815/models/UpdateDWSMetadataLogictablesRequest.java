// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDWSMetadataLogictablesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OmcLogicTablePostModelJsonStr")
    public String omcLogicTablePostModelJsonStr;

    public static UpdateDWSMetadataLogictablesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDWSMetadataLogictablesRequest self = new UpdateDWSMetadataLogictablesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDWSMetadataLogictablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDWSMetadataLogictablesRequest setOmcLogicTablePostModelJsonStr(String omcLogicTablePostModelJsonStr) {
        this.omcLogicTablePostModelJsonStr = omcLogicTablePostModelJsonStr;
        return this;
    }
    public String getOmcLogicTablePostModelJsonStr() {
        return this.omcLogicTablePostModelJsonStr;
    }

}
