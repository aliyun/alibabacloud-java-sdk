// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>The name of the studio. The name can be up to 50 characters in length and cannot contain single quotation marks, semicolons, less-than signs, greater-than signs, equal signs, vertical lines, or parentheses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Video production studio</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The maximum number of users allowed in the studio team. Valid values: 2 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UserCountLimit")
    public Long userCountLimit;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateWorkspaceRequest setUserCountLimit(Long userCountLimit) {
        this.userCountLimit = userCountLimit;
        return this;
    }
    public Long getUserCountLimit() {
        return this.userCountLimit;
    }

}
