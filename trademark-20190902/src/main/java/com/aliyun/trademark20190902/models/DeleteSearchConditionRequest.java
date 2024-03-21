// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DeleteSearchConditionRequest extends TeaModel {
    @NameInMap("ConditionId")
    public Long conditionId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Umid")
    public String umid;

    public static DeleteSearchConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSearchConditionRequest self = new DeleteSearchConditionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSearchConditionRequest setConditionId(Long conditionId) {
        this.conditionId = conditionId;
        return this;
    }
    public Long getConditionId() {
        return this.conditionId;
    }

    public DeleteSearchConditionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DeleteSearchConditionRequest setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

}
