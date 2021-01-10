// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeUserpasswordRequest extends TeaModel {
    @NameInMap("OldPassword")
    public String oldPassword;

    @NameInMap("Password")
    public String password;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeUserpasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeUserpasswordRequest self = new QueryLinkeantcodeAntcodeUserpasswordRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeUserpasswordRequest setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }
    public String getOldPassword() {
        return this.oldPassword;
    }

    public QueryLinkeantcodeAntcodeUserpasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public QueryLinkeantcodeAntcodeUserpasswordRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
