// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSMetadataLogictablesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OmcLogicTablePostModelJsonStr")
    public String omcLogicTablePostModelJsonStr;

    public static CreateDWSMetadataLogictablesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSMetadataLogictablesRequest self = new CreateDWSMetadataLogictablesRequest();
        return TeaModel.build(map, self);
    }

    public CreateDWSMetadataLogictablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDWSMetadataLogictablesRequest setOmcLogicTablePostModelJsonStr(String omcLogicTablePostModelJsonStr) {
        this.omcLogicTablePostModelJsonStr = omcLogicTablePostModelJsonStr;
        return this;
    }
    public String getOmcLogicTablePostModelJsonStr() {
        return this.omcLogicTablePostModelJsonStr;
    }

}
