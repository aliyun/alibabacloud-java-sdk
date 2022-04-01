// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SshSpec extends TeaModel {
    // passwordLessLogins
    @NameInMap("passwordLessLogins")
    public java.util.List<PasswordLessLoginSpec> passwordLessLogins;

    public static SshSpec build(java.util.Map<String, ?> map) throws Exception {
        SshSpec self = new SshSpec();
        return TeaModel.build(map, self);
    }

    public SshSpec setPasswordLessLogins(java.util.List<PasswordLessLoginSpec> passwordLessLogins) {
        this.passwordLessLogins = passwordLessLogins;
        return this;
    }
    public java.util.List<PasswordLessLoginSpec> getPasswordLessLogins() {
        return this.passwordLessLogins;
    }

}
