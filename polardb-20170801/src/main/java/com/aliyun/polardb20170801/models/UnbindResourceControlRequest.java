// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UnbindResourceControlRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10gr51qasnl****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the region ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource control name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rc</p>
     */
    @NameInMap("ResourceControlName")
    public String resourceControlName;

    /**
     * <p>The target instance type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The target value. This parameter applies to target tracking rules and prediction rules. The value of TargetValue can contain up to three decimal places and must be greater than 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>44abc95973e24ae9838713598f673535</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    public static UnbindResourceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindResourceControlRequest self = new UnbindResourceControlRequest();
        return TeaModel.build(map, self);
    }

    public UnbindResourceControlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UnbindResourceControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UnbindResourceControlRequest setResourceControlName(String resourceControlName) {
        this.resourceControlName = resourceControlName;
        return this;
    }
    public String getResourceControlName() {
        return this.resourceControlName;
    }

    public UnbindResourceControlRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public UnbindResourceControlRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
