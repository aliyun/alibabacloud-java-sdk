// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>The type of the advanced configuration. Valid values: -ONLINE: online configuration</p>
     * </li>
     * <li><p>-ONLINE_CAVA: online Cava configuration</p>
     * </li>
     * <li><p>-ONLINE_PLUGIN: online plug-in configuration</p>
     * </li>
     * <li><p>-ONLINE_QUERY: query configuration</p>
     * </li>
     * <li><p>-OFFLINE_DICT: offline dictionary configuration</p>
     * </li>
     * <li><p>-OFFLINE_TABLE: offline table configuration</p>
     * </li>
     * <li><p>-OFFLINE_COMMON: offline configuration</p>
     * </li>
     * <li><p>-OFFLINE_PLUGIN: offline plug-in configuration</p>
     * </li>
     * <li><p>-OFFLINE_INDEX: index configuration</p>
     * </li>
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
