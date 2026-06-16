// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetMem0AccountPasswordRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzravgpt8q****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The API key.</p>
     * 
     * <strong>example:</strong>
     * <p>aafdf2e7d0988ef623***</p>
     */
    @NameInMap("Mem0ApiKey")
    public String mem0ApiKey;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetMem0AccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetMem0AccountPasswordRequest self = new ResetMem0AccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetMem0AccountPasswordRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ResetMem0AccountPasswordRequest setMem0ApiKey(String mem0ApiKey) {
        this.mem0ApiKey = mem0ApiKey;
        return this;
    }
    public String getMem0ApiKey() {
        return this.mem0ApiKey;
    }

    public ResetMem0AccountPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
