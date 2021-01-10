// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeTenantmembersRequest extends TeaModel {
    @NameInMap("AccessLevel")
    public String accessLevel;

    @NameInMap("ExternUid")
    public String externUid;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("UserId")
    public String userId;

    public static AddLinkeantcodeAntcodeTenantmembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeTenantmembersRequest self = new AddLinkeantcodeAntcodeTenantmembersRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeTenantmembersRequest setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }

    public AddLinkeantcodeAntcodeTenantmembersRequest setExternUid(String externUid) {
        this.externUid = externUid;
        return this;
    }
    public String getExternUid() {
        return this.externUid;
    }

    public AddLinkeantcodeAntcodeTenantmembersRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public AddLinkeantcodeAntcodeTenantmembersRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
