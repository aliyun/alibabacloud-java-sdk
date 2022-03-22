// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateAliyunInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("ProductSource")
    public Long productSource;

    @NameInMap("SaleEnv")
    public String saleEnv;

    @NameInMap("SaleRegion")
    public String saleRegion;

    @NameInMap("TenantId")
    public Long tenantId;

    public static XspaceNextbotCreateAliyunInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateAliyunInstanceRequest self = new XspaceNextbotCreateAliyunInstanceRequest();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateAliyunInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public XspaceNextbotCreateAliyunInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public XspaceNextbotCreateAliyunInstanceRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public XspaceNextbotCreateAliyunInstanceRequest setProductSource(Long productSource) {
        this.productSource = productSource;
        return this;
    }
    public Long getProductSource() {
        return this.productSource;
    }

    public XspaceNextbotCreateAliyunInstanceRequest setSaleEnv(String saleEnv) {
        this.saleEnv = saleEnv;
        return this;
    }
    public String getSaleEnv() {
        return this.saleEnv;
    }

    public XspaceNextbotCreateAliyunInstanceRequest setSaleRegion(String saleRegion) {
        this.saleRegion = saleRegion;
        return this;
    }
    public String getSaleRegion() {
        return this.saleRegion;
    }

    public XspaceNextbotCreateAliyunInstanceRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
