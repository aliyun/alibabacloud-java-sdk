// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Key")
    public String key;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    @NameInMap("VariableJsonStr")
    public String variableJsonStr;

    public static UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest self = new UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectvariableRequest setVariableJsonStr(String variableJsonStr) {
        this.variableJsonStr = variableJsonStr;
        return this;
    }
    public String getVariableJsonStr() {
        return this.variableJsonStr;
    }

}
