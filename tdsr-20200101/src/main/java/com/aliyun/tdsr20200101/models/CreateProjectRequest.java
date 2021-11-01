// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("BuilderUserIdList")
    public String builderUserIdList;

    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("BusinessUserIdList")
    public String businessUserIdList;

    @NameInMap("GatherUserIdList")
    public String gatherUserIdList;

    @NameInMap("Name")
    public String name;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setBuilderUserIdList(String builderUserIdList) {
        this.builderUserIdList = builderUserIdList;
        return this;
    }
    public String getBuilderUserIdList() {
        return this.builderUserIdList;
    }

    public CreateProjectRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public CreateProjectRequest setBusinessUserIdList(String businessUserIdList) {
        this.businessUserIdList = businessUserIdList;
        return this;
    }
    public String getBusinessUserIdList() {
        return this.businessUserIdList;
    }

    public CreateProjectRequest setGatherUserIdList(String gatherUserIdList) {
        this.gatherUserIdList = gatherUserIdList;
        return this;
    }
    public String getGatherUserIdList() {
        return this.gatherUserIdList;
    }

    public CreateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
