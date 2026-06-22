// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSwitchRegionDetailRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The service switchover type. Valid values:</p>
     * <ul>
     * <li><strong>sg_switch</strong>: The server connection is migrated from China to Singapore.</li>
     * <li><strong>sls_meta_version_switch_stage_1</strong>: The log analysis delivery field upgrade switchover.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sg_switch</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetSwitchRegionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchRegionDetailRequest self = new GetSwitchRegionDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSwitchRegionDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetSwitchRegionDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
