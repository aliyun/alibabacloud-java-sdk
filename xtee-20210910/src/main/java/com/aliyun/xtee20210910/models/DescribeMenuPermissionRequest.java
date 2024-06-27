// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeMenuPermissionRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("permissionType")
    public String permissionType;

    @NameInMap("regId")
    public String regId;

    public static DescribeMenuPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMenuPermissionRequest self = new DescribeMenuPermissionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMenuPermissionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeMenuPermissionRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

    public DescribeMenuPermissionRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
