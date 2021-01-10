// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("ParamJsonStr")
    public String paramJsonStr;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest self = new QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest setParamJsonStr(String paramJsonStr) {
        this.paramJsonStr = paramJsonStr;
        return this;
    }
    public String getParamJsonStr() {
        return this.paramJsonStr;
    }

    public QueryLinkeantcodeAntcodeProjectsidrepositorylsifdefinitionsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
