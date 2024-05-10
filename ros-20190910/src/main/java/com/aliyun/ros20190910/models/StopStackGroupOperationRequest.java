// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationRequest extends TeaModel {
    /**
     * <p>The ID of the operation.</p>
     * <br>
     * <p>You can call the [ListStackGroupOperations](https://help.aliyun.com/document_detail/151342.html) operation to obtain the operation ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StopStackGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStackGroupOperationRequest self = new StopStackGroupOperationRequest();
        return TeaModel.build(map, self);
    }

    public StopStackGroupOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public StopStackGroupOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
