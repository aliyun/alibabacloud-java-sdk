// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigRequest extends TeaModel {
    /**
     * <ul>
     * <li>The type of the advanced configuration. Valid values: -ONLINE: online configuration</li>
     * <li>\-ONLINE_CAVA: online Cava configuration</li>
     * <li>\-ONLINE_PLUGIN: online plug-in configuration</li>
     * <li>\-ONLINE_QUERY: query configuration</li>
     * <li>\-OFFLINE_DICT: offline dictionary configuration</li>
     * <li>\-OFFLINE_TABLE: offline table configuration</li>
     * <li>\-OFFLINE_COMMON: offline configuration</li>
     * <li>\-OFFLINE_PLUGIN: offline plug-in configuration</li>
     * <li>\-OFFLINE_INDEX: index configuration</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("type")
    public String type;

    public static GetAdvanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigRequest self = new GetAdvanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
