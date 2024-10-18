// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables the feature. You must make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
     * </ul>
     * <blockquote>
     * <p> If your account balance is insufficient, you can set AutoPay to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The type of the change that you want to perform on the instance. Valid values:</p>
     * <blockquote>
     * <p> This parameter is optional. The system can automatically determine whether the instance change is an upgrade or a downgrade. If you want to specify this parameter, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li><strong>Upgrade</strong> (default): upgrades the instance type. Make sure that your account balance is sufficient.</li>
     * <li><strong>Down</strong>: downgrades the instance type. If the new instance type specified by InstanceType has lower specifications than the current instance type, set Direction to Down.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and resource inventory.</li>
     * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf62br2491p5l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new instance type. For more information about the instance types that are supported by RDS Custom instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">Instance types of RDS Custom instances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.i8.large.2cm</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hagnzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyRCInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceRequest self = new ModifyRCInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyRCInstanceRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyRCInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyRCInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ModifyRCInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
