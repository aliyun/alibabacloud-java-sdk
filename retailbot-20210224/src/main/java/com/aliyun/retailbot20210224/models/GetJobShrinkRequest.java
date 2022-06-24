// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetJobShrinkRequest extends TeaModel {
    // 应用Code
    @NameInMap("AppCode")
    public String appCode;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务ID
    @NameInMap("JobId")
    public Long jobId;

    // 店铺Id
    @NameInMap("ShopId")
    public String shopId;

    @NameInMap("UserProfile")
    public String userProfileShrink;

    public static GetJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobShrinkRequest self = new GetJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetJobShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetJobShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetJobShrinkRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public GetJobShrinkRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GetJobShrinkRequest setUserProfileShrink(String userProfileShrink) {
        this.userProfileShrink = userProfileShrink;
        return this;
    }
    public String getUserProfileShrink() {
        return this.userProfileShrink;
    }

}
