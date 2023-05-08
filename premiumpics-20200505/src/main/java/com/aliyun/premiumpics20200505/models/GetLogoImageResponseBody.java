// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetLogoImageResponseBody extends TeaModel {
    @NameInMap("GoodsId")
    public String goodsId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Url")
    public String url;

    public static GetLogoImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogoImageResponseBody self = new GetLogoImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogoImageResponseBody setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public GetLogoImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogoImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLogoImageResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
