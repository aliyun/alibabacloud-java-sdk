// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListVersionDistributionRequest extends TeaModel {
    /**
     * <p>The terminal type. Valid values:</p>
     * <ul>
     * <li>1: hardware terminal.</li>
     * <li>2: software terminal.</li>
     * <li>3: secure browser plugin.</li>
     * <li>4: GuestOS application.</li>
     * <li>5: DingTalk Wuying plugin.</li>
     * <li>6: cloud application component.</li>
     * <li>7: Cloud Hub.</li>
     * <li>8: H5.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClientType")
    public Integer clientType;

    /**
     * <p>The management status. A value of true indicates managed, and a value of false indicates unmanaged. If this parameter is not specified, all terminals are queried.</p>
     */
    @NameInMap("InManage")
    public Boolean inManage;

    /**
     * <p>The business type. Default value: enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("MainBizType")
    public String mainBizType;

    /**
     * <p>The terminal model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AS05-2DCXG</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The version type. Valid values:</p>
     * <ul>
     * <li>SYS: system version.</li>
     * <li>APP: application version.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SYS</p>
     */
    @NameInMap("VersionType")
    public String versionType;

    public static ListVersionDistributionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionDistributionRequest self = new ListVersionDistributionRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionDistributionRequest setClientType(Integer clientType) {
        this.clientType = clientType;
        return this;
    }
    public Integer getClientType() {
        return this.clientType;
    }

    public ListVersionDistributionRequest setInManage(Boolean inManage) {
        this.inManage = inManage;
        return this;
    }
    public Boolean getInManage() {
        return this.inManage;
    }

    public ListVersionDistributionRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
    }

    public ListVersionDistributionRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListVersionDistributionRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
