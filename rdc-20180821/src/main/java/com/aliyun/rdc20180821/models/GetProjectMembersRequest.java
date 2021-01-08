// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetProjectMembersRequest extends TeaModel {
    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("ProjectId")
    public Integer projectId;

    @NameInMap("StaffId")
    public String staffId;

    public static GetProjectMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectMembersRequest self = new GetProjectMembersRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectMembersRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public GetProjectMembersRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public GetProjectMembersRequest setStaffId(String staffId) {
        this.staffId = staffId;
        return this;
    }
    public String getStaffId() {
        return this.staffId;
    }

}
