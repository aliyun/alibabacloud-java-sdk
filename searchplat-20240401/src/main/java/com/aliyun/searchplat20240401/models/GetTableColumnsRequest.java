// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetTableColumnsRequest extends TeaModel {
    /**
     * <p>The configuration parameters for accessing the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds:
     * {
     *     &quot;instanceId&quot;: &quot;instance_id&quot;,
     *     &quot;dbName&quot;: &quot;db_name&quot;,
     *     &quot;dbUser&quot;: &quot;db_user&quot;,
     *     &quot;dbPassword&quot;: &quot;passwoed&quot;
     * }
     * odps:
     * {
     *     &quot;accessKeySecret&quot;: &quot;sk&quot;,
     *     &quot;accessKey&quot;: &quot;ak&quot;,
     *     &quot;projectName&quot;: &quot;test_name&quot;
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

    public static GetTableColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnsRequest self = new GetTableColumnsRequest();
        return TeaModel.build(map, self);
    }

    public GetTableColumnsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetTableColumnsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
