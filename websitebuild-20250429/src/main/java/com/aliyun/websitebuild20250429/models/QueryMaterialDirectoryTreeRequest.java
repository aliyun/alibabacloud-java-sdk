// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryMaterialDirectoryTreeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WS20250731233102000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("HiddenPublic")
    public Boolean hiddenPublic;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Root")
    public Boolean root;

    public static QueryMaterialDirectoryTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaterialDirectoryTreeRequest self = new QueryMaterialDirectoryTreeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaterialDirectoryTreeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMaterialDirectoryTreeRequest setHiddenPublic(Boolean hiddenPublic) {
        this.hiddenPublic = hiddenPublic;
        return this;
    }
    public Boolean getHiddenPublic() {
        return this.hiddenPublic;
    }

    public QueryMaterialDirectoryTreeRequest setRoot(Boolean root) {
        this.root = root;
        return this;
    }
    public Boolean getRoot() {
        return this.root;
    }

}
