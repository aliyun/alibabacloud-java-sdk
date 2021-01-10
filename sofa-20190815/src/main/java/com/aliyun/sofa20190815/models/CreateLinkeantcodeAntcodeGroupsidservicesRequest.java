// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeGroupsidservicesRequest extends TeaModel {
    @NameInMap("CreateDTOJsonStr")
    public String createDTOJsonStr;

    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static CreateLinkeantcodeAntcodeGroupsidservicesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeGroupsidservicesRequest self = new CreateLinkeantcodeAntcodeGroupsidservicesRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeGroupsidservicesRequest setCreateDTOJsonStr(String createDTOJsonStr) {
        this.createDTOJsonStr = createDTOJsonStr;
        return this;
    }
    public String getCreateDTOJsonStr() {
        return this.createDTOJsonStr;
    }

    public CreateLinkeantcodeAntcodeGroupsidservicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeGroupsidservicesRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
