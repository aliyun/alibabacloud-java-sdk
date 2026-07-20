// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RemoveRbacRoleHierarchyRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The child role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fc94cc51-310f-4485-adb2-ed8c706aff3b</p>
     */
    @NameInMap("ChildRoleId")
    public String childRoleId;

    /**
     * <p>The parent role ID.</p>
     * 
     * <strong>example:</strong>
     * <p>71e07711-9a17-49f4-9f83-387a60ee5b64</p>
     */
    @NameInMap("ParentRoleId")
    public String parentRoleId;

    public static RemoveRbacRoleHierarchyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveRbacRoleHierarchyRequest self = new RemoveRbacRoleHierarchyRequest();
        return TeaModel.build(map, self);
    }

    public RemoveRbacRoleHierarchyRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RemoveRbacRoleHierarchyRequest setChildRoleId(String childRoleId) {
        this.childRoleId = childRoleId;
        return this;
    }
    public String getChildRoleId() {
        return this.childRoleId;
    }

    public RemoveRbacRoleHierarchyRequest setParentRoleId(String parentRoleId) {
        this.parentRoleId = parentRoleId;
        return this;
    }
    public String getParentRoleId() {
        return this.parentRoleId;
    }

}
