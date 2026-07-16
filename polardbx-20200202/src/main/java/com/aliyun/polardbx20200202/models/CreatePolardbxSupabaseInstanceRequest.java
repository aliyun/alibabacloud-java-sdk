// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolardbxSupabaseInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dashboard password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dTyMQem0o3HOAFh!</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <p>The instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>Supabase实例</p>
     */
    @NameInMap("DbInstanceDescription")
    public String dbInstanceDescription;

    /**
     * <p>The database password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dTyMQem0o3HOAFh!</p>
     */
    @NameInMap("DbPassword")
    public String dbPassword;

    /**
     * <p>The node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>polarx.supabase.x2.small</p>
     */
    @NameInMap("NodeSpec")
    public String nodeSpec;

    /**
     * <p>The billing type. Valid values:</p>
     * <ul>
     * <li>PREPAY: subscription.</li>
     * <li>POSTPAY: pay-as-you-go.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * <li>Hour</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to enable multi-tenant mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TenantMode")
    public Boolean tenantMode;

    /**
     * <p>The subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1ndoug37dtwoedlmru0</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreatePolardbxSupabaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolardbxSupabaseInstanceRequest self = new CreatePolardbxSupabaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolardbxSupabaseInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreatePolardbxSupabaseInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePolardbxSupabaseInstanceRequest setDashboardPassword(String dashboardPassword) {
        this.dashboardPassword = dashboardPassword;
        return this;
    }
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    public CreatePolardbxSupabaseInstanceRequest setDbInstanceDescription(String dbInstanceDescription) {
        this.dbInstanceDescription = dbInstanceDescription;
        return this;
    }
    public String getDbInstanceDescription() {
        return this.dbInstanceDescription;
    }

    public CreatePolardbxSupabaseInstanceRequest setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
        return this;
    }
    public String getDbPassword() {
        return this.dbPassword;
    }

    public CreatePolardbxSupabaseInstanceRequest setNodeSpec(String nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public String getNodeSpec() {
        return this.nodeSpec;
    }

    public CreatePolardbxSupabaseInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreatePolardbxSupabaseInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreatePolardbxSupabaseInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePolardbxSupabaseInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePolardbxSupabaseInstanceRequest setTenantMode(Boolean tenantMode) {
        this.tenantMode = tenantMode;
        return this;
    }
    public Boolean getTenantMode() {
        return this.tenantMode;
    }

    public CreatePolardbxSupabaseInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreatePolardbxSupabaseInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreatePolardbxSupabaseInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreatePolardbxSupabaseInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
