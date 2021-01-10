// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationaddprojectinfoRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    public static AddLinkeBahamutIterationaddprojectinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationaddprojectinfoRequest self = new AddLinkeBahamutIterationaddprojectinfoRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationaddprojectinfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddLinkeBahamutIterationaddprojectinfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public AddLinkeBahamutIterationaddprojectinfoRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
