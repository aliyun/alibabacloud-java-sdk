// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckOrganizationMemberRequest extends TeaModel {
    /**
     * <p>The ID of the Quick BI user. This is not your Alibaba Cloud account ID. Call the <a href="https://next.api.aliyun.com/api/quickbi-public/2022-01-01/QueryUserInfoByAccount?spm=api-workbench.api_explorer.0.0.672f50daGq9ooV%5C&params=%7B%7D%5C&tab=DOC%5C&sdkStyle=old%5C&RegionId=cn-hangzhou">QueryUserInfoByAccount</a> operation to obtain the user ID.</p>
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
