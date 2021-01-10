// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskAuthProjectRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    public static SaveClriskAuthProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskAuthProjectRequest self = new SaveClriskAuthProjectRequest();
        return TeaModel.build(map, self);
    }

    public SaveClriskAuthProjectRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
