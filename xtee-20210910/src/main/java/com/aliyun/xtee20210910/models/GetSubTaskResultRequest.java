// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class GetSubTaskResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SubTaskId")
    public Integer subTaskId;

    public static GetSubTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubTaskResultRequest self = new GetSubTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetSubTaskResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetSubTaskResultRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public GetSubTaskResultRequest setSubTaskId(Integer subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

}
