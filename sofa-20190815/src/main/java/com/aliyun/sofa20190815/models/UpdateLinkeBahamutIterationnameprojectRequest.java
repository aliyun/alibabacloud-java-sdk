// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationnameprojectRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Log")
    public String log;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateLinkeBahamutIterationnameprojectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationnameprojectRequest self = new UpdateLinkeBahamutIterationnameprojectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationnameprojectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeBahamutIterationnameprojectRequest setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public UpdateLinkeBahamutIterationnameprojectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeBahamutIterationnameprojectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeBahamutIterationnameprojectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
