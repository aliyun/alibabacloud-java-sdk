// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class AiStoreUserTask extends TeaModel {
    // ID
    @NameInMap("Id")
    public Long id;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModified")
    public String gmtModified;

    // 地域
    @NameInMap("Region")
    public String region;

    // 地域描述
    @NameInMap("RegionDesc")
    public String regionDesc;

    // 任务名称
    @NameInMap("Name")
    public String name;

    // 产品名称
    @NameInMap("Product")
    public String product;

    // 产品描述
    @NameInMap("ProductDesc")
    public String productDesc;

    // API名称
    @NameInMap("ApiName")
    public String apiName;

    // API描述
    @NameInMap("ApiDesc")
    public String apiDesc;

    // API版本
    @NameInMap("Version")
    public String version;

    // 参数信息
    @NameInMap("ParamInfo")
    public String paramInfo;

    // bucket名称
    @NameInMap("BucketName")
    public String bucketName;

    // bucketKey前缀
    @NameInMap("BucketKeyPrefix")
    public String bucketKeyPrefix;

    // 备注
    @NameInMap("Remark")
    public String remark;

    // 接收消息配置
    @NameInMap("ReceiveConfig")
    public String receiveConfig;

    // 状态
    @NameInMap("Status")
    public String status;

    // 启用时间
    @NameInMap("EnableTime")
    public String enableTime;

    // 停用时间
    @NameInMap("DisableTime")
    public String disableTime;

    public static AiStoreUserTask build(java.util.Map<String, ?> map) throws Exception {
        AiStoreUserTask self = new AiStoreUserTask();
        return TeaModel.build(map, self);
    }

    public AiStoreUserTask setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AiStoreUserTask setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AiStoreUserTask setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AiStoreUserTask setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AiStoreUserTask setRegionDesc(String regionDesc) {
        this.regionDesc = regionDesc;
        return this;
    }
    public String getRegionDesc() {
        return this.regionDesc;
    }

    public AiStoreUserTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AiStoreUserTask setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AiStoreUserTask setProductDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }
    public String getProductDesc() {
        return this.productDesc;
    }

    public AiStoreUserTask setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public AiStoreUserTask setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
        return this;
    }
    public String getApiDesc() {
        return this.apiDesc;
    }

    public AiStoreUserTask setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AiStoreUserTask setParamInfo(String paramInfo) {
        this.paramInfo = paramInfo;
        return this;
    }
    public String getParamInfo() {
        return this.paramInfo;
    }

    public AiStoreUserTask setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public AiStoreUserTask setBucketKeyPrefix(String bucketKeyPrefix) {
        this.bucketKeyPrefix = bucketKeyPrefix;
        return this;
    }
    public String getBucketKeyPrefix() {
        return this.bucketKeyPrefix;
    }

    public AiStoreUserTask setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AiStoreUserTask setReceiveConfig(String receiveConfig) {
        this.receiveConfig = receiveConfig;
        return this;
    }
    public String getReceiveConfig() {
        return this.receiveConfig;
    }

    public AiStoreUserTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AiStoreUserTask setEnableTime(String enableTime) {
        this.enableTime = enableTime;
        return this;
    }
    public String getEnableTime() {
        return this.enableTime;
    }

    public AiStoreUserTask setDisableTime(String disableTime) {
        this.disableTime = disableTime;
        return this;
    }
    public String getDisableTime() {
        return this.disableTime;
    }

}
