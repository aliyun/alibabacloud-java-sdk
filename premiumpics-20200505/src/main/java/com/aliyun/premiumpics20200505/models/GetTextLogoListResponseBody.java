// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetTextLogoListResponseBody extends TeaModel {
    @NameInMap("LogoVersion")
    public String logoVersion;

    @NameInMap("Logos")
    public java.util.List<GetTextLogoListResponseBodyLogos> logos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTextLogoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextLogoListResponseBody self = new GetTextLogoListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextLogoListResponseBody setLogoVersion(String logoVersion) {
        this.logoVersion = logoVersion;
        return this;
    }
    public String getLogoVersion() {
        return this.logoVersion;
    }

    public GetTextLogoListResponseBody setLogos(java.util.List<GetTextLogoListResponseBodyLogos> logos) {
        this.logos = logos;
        return this;
    }
    public java.util.List<GetTextLogoListResponseBodyLogos> getLogos() {
        return this.logos;
    }

    public GetTextLogoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTextLogoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTextLogoListResponseBodyLogos extends TeaModel {
        @NameInMap("GoodsId")
        public String goodsId;

        @NameInMap("Url")
        public String url;

        public static GetTextLogoListResponseBodyLogos build(java.util.Map<String, ?> map) throws Exception {
            GetTextLogoListResponseBodyLogos self = new GetTextLogoListResponseBodyLogos();
            return TeaModel.build(map, self);
        }

        public GetTextLogoListResponseBodyLogos setGoodsId(String goodsId) {
            this.goodsId = goodsId;
            return this;
        }
        public String getGoodsId() {
            return this.goodsId;
        }

        public GetTextLogoListResponseBodyLogos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
