// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class InvokeMotorModelRequest extends TeaModel {
    @NameInMap("PicId")
    public String picId;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PicPath")
    public String picPath;

    @NameInMap("PicUrl")
    public String picUrl;

    public static InvokeMotorModelRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeMotorModelRequest self = new InvokeMotorModelRequest();
        return TeaModel.build(map, self);
    }

    public InvokeMotorModelRequest setPicId(String picId) {
        this.picId = picId;
        return this;
    }
    public String getPicId() {
        return this.picId;
    }

    public InvokeMotorModelRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public InvokeMotorModelRequest setPicPath(String picPath) {
        this.picPath = picPath;
        return this;
    }
    public String getPicPath() {
        return this.picPath;
    }

    public InvokeMotorModelRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
