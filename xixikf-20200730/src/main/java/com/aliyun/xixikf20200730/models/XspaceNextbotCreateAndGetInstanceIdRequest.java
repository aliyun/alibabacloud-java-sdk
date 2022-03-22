// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class XspaceNextbotCreateAndGetInstanceIdRequest extends TeaModel {
    @NameInMap("BuId")
    public String buId;

    @NameInMap("BuName")
    public String buName;

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

    public static XspaceNextbotCreateAndGetInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        XspaceNextbotCreateAndGetInstanceIdRequest self = new XspaceNextbotCreateAndGetInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setBuName(String buName) {
        this.buName = buName;
        return this;
    }
    public String getBuName() {
        return this.buName;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setProductSource(Long productSource) {
        this.productSource = productSource;
        return this;
    }
    public Long getProductSource() {
        return this.productSource;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setSaleEnv(String saleEnv) {
        this.saleEnv = saleEnv;
        return this;
    }
    public String getSaleEnv() {
        return this.saleEnv;
    }

    public XspaceNextbotCreateAndGetInstanceIdRequest setSaleRegion(String saleRegion) {
        this.saleRegion = saleRegion;
        return this;
    }
    public String getSaleRegion() {
        return this.saleRegion;
    }

}
