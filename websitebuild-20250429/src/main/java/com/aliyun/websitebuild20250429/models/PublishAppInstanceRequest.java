// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class PublishAppInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250821161210000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("DeployChannel")
    public String deployChannel;

    /**
     * <strong>example:</strong>
     * <p>CREATE_BY_NLB.nlb-jcvs5sm9l8um84zbfa</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("LogicalNumber")
    public Integer logicalNumber;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("PublishNumber")
    public String publishNumber;

    /**
     * <strong>example:</strong>
     * <p>BUILD</p>
     */
    @NameInMap("WeappAction")
    public String weappAction;

    public static PublishAppInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAppInstanceRequest self = new PublishAppInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PublishAppInstanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PublishAppInstanceRequest setDeployChannel(String deployChannel) {
        this.deployChannel = deployChannel;
        return this;
    }
    public String getDeployChannel() {
        return this.deployChannel;
    }

    public PublishAppInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishAppInstanceRequest setLogicalNumber(Integer logicalNumber) {
        this.logicalNumber = logicalNumber;
        return this;
    }
    public Integer getLogicalNumber() {
        return this.logicalNumber;
    }

    public PublishAppInstanceRequest setPublishNumber(String publishNumber) {
        this.publishNumber = publishNumber;
        return this;
    }
    public String getPublishNumber() {
        return this.publishNumber;
    }

    public PublishAppInstanceRequest setWeappAction(String weappAction) {
        this.weappAction = weappAction;
        return this;
    }
    public String getWeappAction() {
        return this.weappAction;
    }

}
