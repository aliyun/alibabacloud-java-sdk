// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectvariableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("VariableJsonStr")
    public String variableJsonStr;

    public static CreateLinkeantcodeAntcodeCreateprojectvariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectvariableRequest self = new CreateLinkeantcodeAntcodeCreateprojectvariableRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectvariableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreateprojectvariableRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public CreateLinkeantcodeAntcodeCreateprojectvariableRequest setVariableJsonStr(String variableJsonStr) {
        this.variableJsonStr = variableJsonStr;
        return this;
    }
    public String getVariableJsonStr() {
        return this.variableJsonStr;
    }

}
