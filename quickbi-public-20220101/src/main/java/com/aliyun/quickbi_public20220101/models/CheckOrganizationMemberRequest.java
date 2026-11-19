// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckOrganizationMemberRequest extends TeaModel {
    /**
     * <p>The user ID in Quick BI. This is not your Alibaba Cloud account ID. You can call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=api-workbench.api_explorer.0.0.672f50daGq9ooV&params=%7B%7D&tab=DOC&sdkStyle=old&RegionId=cn-hangzhou">QueryUserInfoByAccount</a> operation to obtain the user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adfssd-sdf****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CheckOrganizationMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationMemberRequest self = new CheckOrganizationMemberRequest();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationMemberRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
