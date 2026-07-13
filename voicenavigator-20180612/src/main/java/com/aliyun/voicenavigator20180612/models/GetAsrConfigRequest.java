// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetAsrConfigRequest extends TeaModel {
    /**
     * <p>The policy level. Valid values:</p>
     * <ul>
     * <li>0: system</li>
     * <li>1: tenant</li>
     * <li>2: instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigLevel")
    public Integer configLevel;

    /**
     * <p>The entity ID corresponding to config_level.</p>
     * 
     * <strong>example:</strong>
     * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
     */
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
