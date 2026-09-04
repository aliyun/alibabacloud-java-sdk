// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to return large detail fields (settings / notes / structuredTables / unstructuredDocs). Default value: False. When set to False, only metadata is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeDetails")
    public Boolean includeDetails;

    /**
     * <p>The primary ID of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>The tenant ID to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static GetSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSourceRequest self = new GetSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetSourceRequest setIncludeDetails(Boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }
    public Boolean getIncludeDetails() {
        return this.includeDetails;
    }

    public GetSourceRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public GetSourceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
