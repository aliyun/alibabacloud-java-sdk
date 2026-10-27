// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePxfsRequest extends TeaModel {
    /**
     * <p>The node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx.pxfs.x4.xlarge</p>
     */
    @NameInMap("ClassCode")
    public String classCode;

    /**
     * <p>The PolarDB-X instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxxxxxxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NodeCount")
    public Long nodeCount;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IP whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24,10.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The storage capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("StorageSize")
    public Long storageSize;

    public static CreatePxfsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePxfsRequest self = new CreatePxfsRequest();
        return TeaModel.build(map, self);
    }

    public CreatePxfsRequest setClassCode(String classCode) {
        this.classCode = classCode;
        return this;
    }
    public String getClassCode() {
        return this.classCode;
    }

    public CreatePxfsRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreatePxfsRequest setNodeCount(Long nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Long getNodeCount() {
        return this.nodeCount;
    }

    public CreatePxfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePxfsRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreatePxfsRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

}
