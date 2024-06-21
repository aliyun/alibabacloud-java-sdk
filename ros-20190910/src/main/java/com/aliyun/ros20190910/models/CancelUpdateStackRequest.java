// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackRequest extends TeaModel {
    /**
     * <p>The method to cancel the update operation. Valid values:</p>
     * <ul>
     * <li>Quick: cancels the update of a stack as soon as possible.</li>
     * <li>Safe: cancels the update of a stack as safely as possible.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Safe</p>
     */
    @NameInMap("CancelType")
    public String cancelType;

    /**
     * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static CancelUpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackRequest self = new CancelUpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackRequest setCancelType(String cancelType) {
        this.cancelType = cancelType;
        return this;
    }
    public String getCancelType() {
        return this.cancelType;
    }

    public CancelUpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelUpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
