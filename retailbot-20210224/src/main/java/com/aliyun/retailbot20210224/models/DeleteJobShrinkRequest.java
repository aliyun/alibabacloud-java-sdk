// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteJobShrinkRequest extends TeaModel {
    // 应用Code
    @NameInMap("AppCode")
    public String appCode;

    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务ID
    @NameInMap("JobId")
    public Long jobId;

    // 店铺Code
    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static DeleteJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobShrinkRequest self = new DeleteJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteJobShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DeleteJobShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public DeleteJobShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
