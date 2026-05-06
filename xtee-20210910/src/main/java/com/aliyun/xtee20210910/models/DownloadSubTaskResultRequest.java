// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DownloadSubTaskResultRequest extends TeaModel {
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

    public static DownloadSubTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadSubTaskResultRequest self = new DownloadSubTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public DownloadSubTaskResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DownloadSubTaskResultRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DownloadSubTaskResultRequest setSubTaskId(Integer subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

}
