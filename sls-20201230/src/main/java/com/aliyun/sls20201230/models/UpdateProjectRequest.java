// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    /**
     * <p>The description of the project. The default value is an empty string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of my-project-test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable the recycle bin feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("recycleBinEnabled")
    public Boolean recycleBinEnabled;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProjectRequest setRecycleBinEnabled(Boolean recycleBinEnabled) {
        this.recycleBinEnabled = recycleBinEnabled;
        return this;
    }
    public Boolean getRecycleBinEnabled() {
        return this.recycleBinEnabled;
    }

}
