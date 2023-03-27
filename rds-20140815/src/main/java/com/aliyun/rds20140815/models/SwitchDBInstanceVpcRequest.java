// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchDBInstanceVpcRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The instance must run one of the following database engines:</p>
     * <br>
     * <p>    - MySQL with local SSDs, standard SSDs, or ESSDs</p>
     * <p>    - SQL Server with standard SSDs or ESSDs</p>
     * <p>    - MariaDB with standard SSDs or ESSDs</p>
     * <p>    - PostgreSQL with standard SSDs or ESSDs</p>
     * <br>
     * <p>*   The instance must be in the Running state.</p>
     * <p>*   The instance must reside in a VPC.</p>
     * <p>*   The instance cannot be a temporary instance or use an instance type that belongs to the shared instance family.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The private IP address of the instance. The private IP address must be within the CIDR block of the vSwitch that is specified by the **VSwitchId** parameter.</p>
     * <br>
     * <p>> You can call the [DescribeVSwitches](~~35748~~) operation to query the CIDR block of a specified vSwitch.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the VPC.</p>
     * <br>
     * <p>> The VPC must belong to the same region as the instance.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>> The vSwitch must belong to the same zone as the instance.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static SwitchDBInstanceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDBInstanceVpcRequest self = new SwitchDBInstanceVpcRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDBInstanceVpcRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public SwitchDBInstanceVpcRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public SwitchDBInstanceVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchDBInstanceVpcRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public SwitchDBInstanceVpcRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
