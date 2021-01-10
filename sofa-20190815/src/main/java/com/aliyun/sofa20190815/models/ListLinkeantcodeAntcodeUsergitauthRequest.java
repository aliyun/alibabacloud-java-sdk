// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeUsergitauthRequest extends TeaModel {
    @NameInMap("ExternalUserId")
    public String externalUserId;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static ListLinkeantcodeAntcodeUsergitauthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeUsergitauthRequest self = new ListLinkeantcodeAntcodeUsergitauthRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeUsergitauthRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public ListLinkeantcodeAntcodeUsergitauthRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListLinkeantcodeAntcodeUsergitauthRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
