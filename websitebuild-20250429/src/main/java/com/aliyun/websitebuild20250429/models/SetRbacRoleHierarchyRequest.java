// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SetRbacRoleHierarchyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>fc94cc51-310f-4485-adb2-ed8c706aff3b</p>
     */
    @NameInMap("ChildRoleId")
    public String childRoleId;

    /**
     * <strong>example:</strong>
     * <p>71e07711-9a17-49f4-9f83-387a60ee5b64</p>
     */
    @NameInMap("ParentRoleId")
    public String parentRoleId;

    public static SetRbacRoleHierarchyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRbacRoleHierarchyRequest self = new SetRbacRoleHierarchyRequest();
        return TeaModel.build(map, self);
    }

    public SetRbacRoleHierarchyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SetRbacRoleHierarchyRequest setChildRoleId(String childRoleId) {
        this.childRoleId = childRoleId;
        return this;
    }
    public String getChildRoleId() {
        return this.childRoleId;
    }

    public SetRbacRoleHierarchyRequest setParentRoleId(String parentRoleId) {
        this.parentRoleId = parentRoleId;
        return this;
    }
    public String getParentRoleId() {
        return this.parentRoleId;
    }

}
