// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IdOrName")
    public String idOrName;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest self = new QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest setIdOrName(String idOrName) {
        this.idOrName = idOrName;
        return this;
    }
    public String getIdOrName() {
        return this.idOrName;
    }

    public QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
