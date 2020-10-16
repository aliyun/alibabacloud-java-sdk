// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeFaceQualityRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PicContent")
    public String picContent;

    @NameInMap("PicFormat")
    public String picFormat;

    @NameInMap("PicUrl")
    public String picUrl;

    public static RecognizeFaceQualityRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceQualityRequest self = new RecognizeFaceQualityRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceQualityRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public RecognizeFaceQualityRequest setPicContent(String picContent) {
        this.picContent = picContent;
        return this;
    }
    public String getPicContent() {
        return this.picContent;
    }

    public RecognizeFaceQualityRequest setPicFormat(String picFormat) {
        this.picFormat = picFormat;
        return this;
    }
    public String getPicFormat() {
        return this.picFormat;
    }

    public RecognizeFaceQualityRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
