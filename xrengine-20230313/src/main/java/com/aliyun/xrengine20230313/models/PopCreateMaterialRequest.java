// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateMaterialRequest extends TeaModel {
    @NameInMap("CheckStatus")
    public String checkStatus;

    @NameInMap("Ext")
    public String ext;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ListStatus")
    public String listStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("Type")
    public String type;

    public static PopCreateMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        PopCreateMaterialRequest self = new PopCreateMaterialRequest();
        return TeaModel.build(map, self);
    }

    public PopCreateMaterialRequest setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public String getCheckStatus() {
        return this.checkStatus;
    }

    public PopCreateMaterialRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public PopCreateMaterialRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public PopCreateMaterialRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopCreateMaterialRequest setListStatus(String listStatus) {
        this.listStatus = listStatus;
        return this;
    }
    public String getListStatus() {
        return this.listStatus;
    }

    public PopCreateMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PopCreateMaterialRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public PopCreateMaterialRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
