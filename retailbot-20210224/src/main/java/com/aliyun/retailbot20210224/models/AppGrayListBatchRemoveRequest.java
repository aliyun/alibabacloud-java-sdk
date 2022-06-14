// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AppGrayListBatchRemoveRequest extends TeaModel {
    // 实例应用appCode
    @NameInMap("AppCode")
    public String appCode;

    // 店铺id列表
    @NameInMap("Content")
    public java.util.List<String> content;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static AppGrayListBatchRemoveRequest build(java.util.Map<String, ?> map) throws Exception {
        AppGrayListBatchRemoveRequest self = new AppGrayListBatchRemoveRequest();
        return TeaModel.build(map, self);
    }

    public AppGrayListBatchRemoveRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public AppGrayListBatchRemoveRequest setContent(java.util.List<String> content) {
        this.content = content;
        return this;
    }
    public java.util.List<String> getContent() {
        return this.content;
    }

    public AppGrayListBatchRemoveRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppGrayListBatchRemoveRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
