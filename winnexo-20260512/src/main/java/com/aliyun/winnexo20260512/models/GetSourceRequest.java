// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSourceRequest extends TeaModel {
    /**
     * <p>是否返回大体积明细字段（settings / notes / structuredTables / unstructuredDocs）。默认 False，仅返回元信息。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("includeDetails")
    public Boolean includeDetails;

    /**
     * <p>数据源 ID（租户内唯一）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSourceId</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
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
