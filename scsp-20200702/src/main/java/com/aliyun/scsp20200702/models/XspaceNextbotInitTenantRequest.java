// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class XspaceNextbotInitTenantRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KwLibrary")
    public String kwLibrary;

    @NameInMap("ProductEndTime")
    public Long productEndTime;

    @NameInMap("ProductStartTime")
    public Long productStartTime;

    @NameInMap("ProductValidPeriod")
    public Long productValidPeriod;

    @NameInMap("TenantDesc")
    public String tenantDesc;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("Version")
    public String version;

    public static XspaceNextbotInitTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotInitTenantRequest self = new XspaceNextbotInitTenantRequest();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotInitTenantRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public XspaceNextbotInitTenantRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public XspaceNextbotInitTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public XspaceNextbotInitTenantRequest setKwLibrary(String kwLibrary) {
        this.kwLibrary = kwLibrary;
        return this;
    }
    public String getKwLibrary() {
        return this.kwLibrary;
    }

    public XspaceNextbotInitTenantRequest setProductEndTime(Long productEndTime) {
        this.productEndTime = productEndTime;
        return this;
    }
    public Long getProductEndTime() {
        return this.productEndTime;
    }

    public XspaceNextbotInitTenantRequest setProductStartTime(Long productStartTime) {
        this.productStartTime = productStartTime;
        return this;
    }
    public Long getProductStartTime() {
        return this.productStartTime;
    }

    public XspaceNextbotInitTenantRequest setProductValidPeriod(Long productValidPeriod) {
        this.productValidPeriod = productValidPeriod;
        return this;
    }
    public Long getProductValidPeriod() {
        return this.productValidPeriod;
    }

    public XspaceNextbotInitTenantRequest setTenantDesc(String tenantDesc) {
        this.tenantDesc = tenantDesc;
        return this;
    }
    public String getTenantDesc() {
        return this.tenantDesc;
    }

    public XspaceNextbotInitTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public XspaceNextbotInitTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public XspaceNextbotInitTenantRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
