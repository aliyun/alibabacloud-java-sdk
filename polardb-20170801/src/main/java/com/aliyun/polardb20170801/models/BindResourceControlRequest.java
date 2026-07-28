// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class BindResourceControlRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pm-xxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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
     * <p>646060ae9852280007a62545,68b696cb0a7fa600078d41af</p>
     */
    @NameInMap("TargetValue")
    public String targetValue;

    public static BindResourceControlRequest build(java.util.Map<String, ?> map) throws Exception {
        BindResourceControlRequest self = new BindResourceControlRequest();
        return TeaModel.build(map, self);
    }

    public BindResourceControlRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public BindResourceControlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindResourceControlRequest setResourceControlName(String resourceControlName) {
        this.resourceControlName = resourceControlName;
        return this;
    }
    public String getResourceControlName() {
        return this.resourceControlName;
    }

    public BindResourceControlRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public BindResourceControlRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
