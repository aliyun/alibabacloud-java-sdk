// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    /**
     * <p>The type of the application. You can set the value to <strong>XTRACE</strong> or leave this parameter unspecified.</p>
     * 
     * <strong>example:</strong>
     * <p>XTRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

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
     * <p>The unique ID of the trace.</p>
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
