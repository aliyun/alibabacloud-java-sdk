// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class EnterpriseDingtalkGroupMember extends TeaModel {
    /**
     * <p>代表资源名称的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAdmin")
    public Boolean isAdmin;

    /**
     * <p>代表资源组的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>130xxxxxxxx</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>代表创建时间的资源属性字段</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("Name")
    public String name;

    public static EnterpriseDingtalkGroupMember build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseDingtalkGroupMember self = new EnterpriseDingtalkGroupMember();
        return TeaModel.build(map, self);
    }

    public EnterpriseDingtalkGroupMember setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public EnterpriseDingtalkGroupMember setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public EnterpriseDingtalkGroupMember setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
