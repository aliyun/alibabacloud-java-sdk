// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantConnectionInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tenant")
    public DescribeTenantConnectionInfoResponseBodyTenant tenant;

    public static DescribeTenantConnectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantConnectionInfoResponseBody self = new DescribeTenantConnectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantConnectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantConnectionInfoResponseBody setTenant(DescribeTenantConnectionInfoResponseBodyTenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public DescribeTenantConnectionInfoResponseBodyTenant getTenant() {
        return this.tenant;
    }

    public static class DescribeTenantConnectionInfoResponseBodyTenant extends TeaModel {
        @NameInMap("ClogServiceIntranetAddressStatus")
        public String clogServiceIntranetAddressStatus;

        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        @NameInMap("InternetAddress")
        public String internetAddress;

        @NameInMap("InternetAddressReadOnly")
        public String internetAddressReadOnly;

        @NameInMap("InternetPort")
        public Integer internetPort;

        @NameInMap("InternetPortReadOnly")
        public Integer internetPortReadOnly;

        @NameInMap("InternetStatusReadOnly")
        public String internetStatusReadOnly;

        @NameInMap("IntranetAddress")
        public String intranetAddress;

        @NameInMap("IntranetAddressMasterZoneId")
        public String intranetAddressMasterZoneId;

        @NameInMap("IntranetAddressReadOnly")
        public String intranetAddressReadOnly;

        @NameInMap("IntranetAddressReadOnlyMasterZoneId")
        public String intranetAddressReadOnlyMasterZoneId;

        @NameInMap("IntranetAddressReadOnlySlaveZoneId")
        public String intranetAddressReadOnlySlaveZoneId;

        @NameInMap("IntranetAddressSlaveZoneId")
        public String intranetAddressSlaveZoneId;

        @NameInMap("IntranetPort")
        public Integer intranetPort;

        @NameInMap("IntranetPortReadOnly")
        public Integer intranetPortReadOnly;

        @NameInMap("IntranetStatusReadOnly")
        public String intranetStatusReadOnly;

        @NameInMap("SecurityIps")
        public java.util.List<String> securityIps;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeTenantConnectionInfoResponseBodyTenant build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantConnectionInfoResponseBodyTenant self = new DescribeTenantConnectionInfoResponseBodyTenant();
            return TeaModel.build(map, self);
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setClogServiceIntranetAddressStatus(String clogServiceIntranetAddressStatus) {
            this.clogServiceIntranetAddressStatus = clogServiceIntranetAddressStatus;
            return this;
        }
        public String getClogServiceIntranetAddressStatus() {
            return this.clogServiceIntranetAddressStatus;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setInternetAddress(String internetAddress) {
            this.internetAddress = internetAddress;
            return this;
        }
        public String getInternetAddress() {
            return this.internetAddress;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setInternetAddressReadOnly(String internetAddressReadOnly) {
            this.internetAddressReadOnly = internetAddressReadOnly;
            return this;
        }
        public String getInternetAddressReadOnly() {
            return this.internetAddressReadOnly;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setInternetPort(Integer internetPort) {
            this.internetPort = internetPort;
            return this;
        }
        public Integer getInternetPort() {
            return this.internetPort;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setInternetPortReadOnly(Integer internetPortReadOnly) {
            this.internetPortReadOnly = internetPortReadOnly;
            return this;
        }
        public Integer getInternetPortReadOnly() {
            return this.internetPortReadOnly;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setInternetStatusReadOnly(String internetStatusReadOnly) {
            this.internetStatusReadOnly = internetStatusReadOnly;
            return this;
        }
        public String getInternetStatusReadOnly() {
            return this.internetStatusReadOnly;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetAddress(String intranetAddress) {
            this.intranetAddress = intranetAddress;
            return this;
        }
        public String getIntranetAddress() {
            return this.intranetAddress;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetAddressMasterZoneId(String intranetAddressMasterZoneId) {
            this.intranetAddressMasterZoneId = intranetAddressMasterZoneId;
            return this;
        }
        public String getIntranetAddressMasterZoneId() {
            return this.intranetAddressMasterZoneId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetAddressReadOnly(String intranetAddressReadOnly) {
            this.intranetAddressReadOnly = intranetAddressReadOnly;
            return this;
        }
        public String getIntranetAddressReadOnly() {
            return this.intranetAddressReadOnly;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetAddressReadOnlyMasterZoneId(String intranetAddressReadOnlyMasterZoneId) {
            this.intranetAddressReadOnlyMasterZoneId = intranetAddressReadOnlyMasterZoneId;
            return this;
        }
        public String getIntranetAddressReadOnlyMasterZoneId() {
            return this.intranetAddressReadOnlyMasterZoneId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetAddressReadOnlySlaveZoneId(String intranetAddressReadOnlySlaveZoneId) {
            this.intranetAddressReadOnlySlaveZoneId = intranetAddressReadOnlySlaveZoneId;
            return this;
        }
        public String getIntranetAddressReadOnlySlaveZoneId() {
            return this.intranetAddressReadOnlySlaveZoneId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetAddressSlaveZoneId(String intranetAddressSlaveZoneId) {
            this.intranetAddressSlaveZoneId = intranetAddressSlaveZoneId;
            return this;
        }
        public String getIntranetAddressSlaveZoneId() {
            return this.intranetAddressSlaveZoneId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetPort(Integer intranetPort) {
            this.intranetPort = intranetPort;
            return this;
        }
        public Integer getIntranetPort() {
            return this.intranetPort;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetPortReadOnly(Integer intranetPortReadOnly) {
            this.intranetPortReadOnly = intranetPortReadOnly;
            return this;
        }
        public Integer getIntranetPortReadOnly() {
            return this.intranetPortReadOnly;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setIntranetStatusReadOnly(String intranetStatusReadOnly) {
            this.intranetStatusReadOnly = intranetStatusReadOnly;
            return this;
        }
        public String getIntranetStatusReadOnly() {
            return this.intranetStatusReadOnly;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setSecurityIps(java.util.List<String> securityIps) {
            this.securityIps = securityIps;
            return this;
        }
        public java.util.List<String> getSecurityIps() {
            return this.securityIps;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTenantConnectionInfoResponseBodyTenant setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
