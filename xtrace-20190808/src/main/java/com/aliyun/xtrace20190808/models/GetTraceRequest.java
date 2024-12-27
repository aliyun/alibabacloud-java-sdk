// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    /**
     * <p>The type of the application. You can leave this parameter empty or set this parameter to <code>XTRACE</code>. We recommend that you leave this parameter empty.</p>
     * <ul>
     * <li>If you leave this parameter empty, traces reported to Managed Service for OpenTelemetry and Application Real-Time Monitoring Service (ARMS) can be queried.</li>
     * <li>If you set this parameter to <code>XTRACE</code>, only traces reported to Managed Service for OpenTelemetry can be queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>XTRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The trace ID, which is the unique identifier of the trace.</p>
     * <p>You can obtain the trace ID on the <strong>Trace Explorer</strong> page in the Managed Service for OpenTelemetry console or by calling the <a href="https://help.aliyun.com/document_detail/2399674.html~">SearchTraces</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1c6881aab84191a4</p>
     */
    @NameInMap("TraceID")
    public String traceID;

    public static GetTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceRequest self = new GetTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetTraceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetTraceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetTraceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTraceRequest setTraceID(String traceID) {
        this.traceID = traceID;
        return this;
    }
    public String getTraceID() {
        return this.traceID;
    }

}
