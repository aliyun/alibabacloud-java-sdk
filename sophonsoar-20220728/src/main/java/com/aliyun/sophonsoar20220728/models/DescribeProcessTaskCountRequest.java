// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeProcessTaskCountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityUuidList")
    public java.util.List<String> entityUuidList;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>104739******259</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RoleType")
    public String roleType;

    public static DescribeProcessTaskCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessTaskCountRequest self = new DescribeProcessTaskCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessTaskCountRequest setEntityUuidList(java.util.List<String> entityUuidList) {
        this.entityUuidList = entityUuidList;
        return this;
    }
    public java.util.List<String> getEntityUuidList() {
        return this.entityUuidList;
    }

    public DescribeProcessTaskCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeProcessTaskCountRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeProcessTaskCountRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
