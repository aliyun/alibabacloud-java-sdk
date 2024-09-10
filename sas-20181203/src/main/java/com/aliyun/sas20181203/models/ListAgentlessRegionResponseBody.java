// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRegionResponseBody extends TeaModel {
    /**
     * <p>The information about the regions.</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRegionResponseBody self = new ListAgentlessRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRegionResponseBody setRegionList(java.util.List<String> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    public ListAgentlessRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
