// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeBatchuploadartifactsRequest extends TeaModel {
    @NameInMap("CreateDTOJsonStr")
    public String createDTOJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static QueryLinkeantcodeAntcodeBatchuploadartifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeBatchuploadartifactsRequest self = new QueryLinkeantcodeAntcodeBatchuploadartifactsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeBatchuploadartifactsRequest setCreateDTOJsonStr(String createDTOJsonStr) {
        this.createDTOJsonStr = createDTOJsonStr;
        return this;
    }
    public String getCreateDTOJsonStr() {
        return this.createDTOJsonStr;
    }

    public QueryLinkeantcodeAntcodeBatchuploadartifactsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeBatchuploadartifactsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
