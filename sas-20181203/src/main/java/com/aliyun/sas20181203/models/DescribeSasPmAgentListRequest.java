// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasPmAgentListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-cb7ae5ee-b2bc-4581-b616-62495f5d****,inet-37cf0e4f-55cc-4b84-8073-b348b4b4****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeSasPmAgentListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSasPmAgentListRequest self = new DescribeSasPmAgentListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSasPmAgentListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSasPmAgentListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
