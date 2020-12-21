// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetUserDetailRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvSubId")
    public String isvSubId;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("NeedFaceDetail")
    public Boolean needFaceDetail;

    public static GetUserDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDetailRequest self = new GetUserDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDetailRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetUserDetailRequest setIsvSubId(String isvSubId) {
        this.isvSubId = isvSubId;
        return this;
    }
    public String getIsvSubId() {
        return this.isvSubId;
    }

    public GetUserDetailRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public GetUserDetailRequest setNeedFaceDetail(Boolean needFaceDetail) {
        this.needFaceDetail = needFaceDetail;
        return this;
    }
    public Boolean getNeedFaceDetail() {
        return this.needFaceDetail;
    }

}
