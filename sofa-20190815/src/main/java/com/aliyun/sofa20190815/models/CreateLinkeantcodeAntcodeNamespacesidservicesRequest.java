// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeNamespacesidservicesRequest extends TeaModel {
    @NameInMap("CreateDTOJsonStr")
    public String createDTOJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeNamespacesidservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeNamespacesidservicesRequest self = new CreateLinkeantcodeAntcodeNamespacesidservicesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeNamespacesidservicesRequest setCreateDTOJsonStr(String createDTOJsonStr) {
        this.createDTOJsonStr = createDTOJsonStr;
        return this;
    }
    public String getCreateDTOJsonStr() {
        return this.createDTOJsonStr;
    }

    public CreateLinkeantcodeAntcodeNamespacesidservicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeNamespacesidservicesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
