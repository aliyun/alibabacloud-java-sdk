// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RollbackAppInstancePublishRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Deployment channel</p>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("DeployChannel")
    public String deployChannel;

    /**
     * <p>Publish number</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PublishNumber")
    public String publishNumber;

    /**
     * <p>Quick rollback.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QuickRollback")
    public String quickRollback;

    public static RollbackAppInstancePublishRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackAppInstancePublishRequest self = new RollbackAppInstancePublishRequest();
        return TeaModel.build(map, self);
    }

    public RollbackAppInstancePublishRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RollbackAppInstancePublishRequest setDeployChannel(String deployChannel) {
        this.deployChannel = deployChannel;
        return this;
    }
    public String getDeployChannel() {
        return this.deployChannel;
    }

    public RollbackAppInstancePublishRequest setPublishNumber(String publishNumber) {
        this.publishNumber = publishNumber;
        return this;
    }
    public String getPublishNumber() {
        return this.publishNumber;
    }

    public RollbackAppInstancePublishRequest setQuickRollback(String quickRollback) {
        this.quickRollback = quickRollback;
        return this;
    }
    public String getQuickRollback() {
        return this.quickRollback;
    }

}
