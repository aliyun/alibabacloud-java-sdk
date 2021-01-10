// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSMetadataLogictablesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OmcLogicTablePostModelJsonStr")
    public String omcLogicTablePostModelJsonStr;

    public static DeleteDWSMetadataLogictablesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSMetadataLogictablesRequest self = new DeleteDWSMetadataLogictablesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDWSMetadataLogictablesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDWSMetadataLogictablesRequest setOmcLogicTablePostModelJsonStr(String omcLogicTablePostModelJsonStr) {
        this.omcLogicTablePostModelJsonStr = omcLogicTablePostModelJsonStr;
        return this;
    }
    public String getOmcLogicTablePostModelJsonStr() {
        return this.omcLogicTablePostModelJsonStr;
    }

}
