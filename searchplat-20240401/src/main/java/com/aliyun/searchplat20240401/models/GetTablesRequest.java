// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetTablesRequest extends TeaModel {
    /**
     * <p>The data source parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;instanceId&quot;: &quot;instance_id&quot;,
     *     &quot;dbName&quot;: &quot;db_name&quot;,
     *     &quot;dbUser&quot;: &quot;db_user&quot;,
     *     &quot;dbPassword&quot;: &quot;passwoed&quot;
     * }</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTablesRequest self = new GetTablesRequest();
        return TeaModel.build(map, self);
    }

    public GetTablesRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
