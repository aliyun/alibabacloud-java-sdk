// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class PasswordLessLoginSpec extends TeaModel {
    // fromNodeGroups
    @NameInMap("fromNodeGroups")
    public java.util.List<String> fromNodeGroups;

    // fromNodeIndexes
    @NameInMap("fromNodeIndexes")
    public java.util.List<String> fromNodeIndexes;

    // userName
    @NameInMap("userName")
    public String userName;

    public static PasswordLessLoginSpec build(java.util.Map<String, ?> map) throws Exception {
        PasswordLessLoginSpec self = new PasswordLessLoginSpec();
        return TeaModel.build(map, self);
    }

    public PasswordLessLoginSpec setFromNodeGroups(java.util.List<String> fromNodeGroups) {
        this.fromNodeGroups = fromNodeGroups;
        return this;
    }
    public java.util.List<String> getFromNodeGroups() {
        return this.fromNodeGroups;
    }

    public PasswordLessLoginSpec setFromNodeIndexes(java.util.List<String> fromNodeIndexes) {
        this.fromNodeIndexes = fromNodeIndexes;
        return this;
    }
    public java.util.List<String> getFromNodeIndexes() {
        return this.fromNodeIndexes;
    }

    public PasswordLessLoginSpec setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
