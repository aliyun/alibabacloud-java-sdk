// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class GetTableFieldsRequest extends TeaModel {
    /**
     * <p>The data source parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;accessKeySecret&quot;: &quot;sk&quot;,
     * &quot;accessKey&quot;: &quot;ak&quot;,
     * &quot;projectName&quot;: &quot;test_name&quot;,
     * &quot;tableName&quot;: &quot;test_table&quot;,
     * &quot;partition&quot;: &quot;20240904&quot;
     * }</p>
     */
    @NameInMap("params")
    public String params;

    /**
     * <p>Specifies whether to return the original field types of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("rawType")
    public Boolean rawType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GetTableFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableFieldsRequest self = new GetTableFieldsRequest();
        return TeaModel.build(map, self);
    }

    public GetTableFieldsRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public GetTableFieldsRequest setRawType(Boolean rawType) {
        this.rawType = rawType;
        return this;
    }
    public Boolean getRawType() {
        return this.rawType;
    }

    public GetTableFieldsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
