// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class MergeDownloadRequest extends TeaModel {
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
     * <p>1,2</p>
     */
    @NameInMap("SubTaskIds")
    public String subTaskIds;

    public static MergeDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeDownloadRequest self = new MergeDownloadRequest();
        return TeaModel.build(map, self);
    }

    public MergeDownloadRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MergeDownloadRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public MergeDownloadRequest setSubTaskIds(String subTaskIds) {
        this.subTaskIds = subTaskIds;
        return this;
    }
    public String getSubTaskIds() {
        return this.subTaskIds;
    }

}
