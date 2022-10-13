// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetAsrConfigRequest extends TeaModel {
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    @NameInMap("EntryId")
    public String entryId;

    public static GetAsrConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsrConfigRequest self = new GetAsrConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAsrConfigRequest setConfigLevel(Integer configLevel) {
        this.configLevel = configLevel;
        return this;
    }
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    public GetAsrConfigRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

}
