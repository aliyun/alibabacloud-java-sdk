// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest extends TeaModel {
    @NameInMap("CreateDTOJsonStr")
    public String createDTOJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest self = new BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest setCreateDTOJsonStr(String createDTOJsonStr) {
        this.createDTOJsonStr = createDTOJsonStr;
        return this;
    }
    public String getCreateDTOJsonStr() {
        return this.createDTOJsonStr;
    }

    public BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BatchcreateLinkeantcodeAntcodeProjectsartifactsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
