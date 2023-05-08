// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ChangeLogoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ChangeLogoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeLogoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeLogoResponseBody self = new ChangeLogoResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeLogoResponseBody setData(java.util.List<ChangeLogoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ChangeLogoResponseBodyData> getData() {
        return this.data;
    }

    public ChangeLogoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ChangeLogoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeLogoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeLogoResponseBodyData extends TeaModel {
        @NameInMap("Collect")
        public Integer collect;

        @NameInMap("EnableChangeColor")
        public Boolean enableChangeColor;

        @NameInMap("EnableChangeFont")
        public Boolean enableChangeFont;

        @NameInMap("EnableChangeIcon")
        public Boolean enableChangeIcon;

        @NameInMap("EnableChangeLayout")
        public Boolean enableChangeLayout;

        @NameInMap("GoodsId")
        public String goodsId;

        @NameInMap("TagId")
        public Integer tagId;

        @NameInMap("Url")
        public String url;

        public static ChangeLogoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeLogoResponseBodyData self = new ChangeLogoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeLogoResponseBodyData setCollect(Integer collect) {
            this.collect = collect;
            return this;
        }
        public Integer getCollect() {
            return this.collect;
        }

        public ChangeLogoResponseBodyData setEnableChangeColor(Boolean enableChangeColor) {
            this.enableChangeColor = enableChangeColor;
            return this;
        }
        public Boolean getEnableChangeColor() {
            return this.enableChangeColor;
        }

        public ChangeLogoResponseBodyData setEnableChangeFont(Boolean enableChangeFont) {
            this.enableChangeFont = enableChangeFont;
            return this;
        }
        public Boolean getEnableChangeFont() {
            return this.enableChangeFont;
        }

        public ChangeLogoResponseBodyData setEnableChangeIcon(Boolean enableChangeIcon) {
            this.enableChangeIcon = enableChangeIcon;
            return this;
        }
        public Boolean getEnableChangeIcon() {
            return this.enableChangeIcon;
        }

        public ChangeLogoResponseBodyData setEnableChangeLayout(Boolean enableChangeLayout) {
            this.enableChangeLayout = enableChangeLayout;
            return this;
        }
        public Boolean getEnableChangeLayout() {
            return this.enableChangeLayout;
        }

        public ChangeLogoResponseBodyData setGoodsId(String goodsId) {
            this.goodsId = goodsId;
            return this;
        }
        public String getGoodsId() {
            return this.goodsId;
        }

        public ChangeLogoResponseBodyData setTagId(Integer tagId) {
            this.tagId = tagId;
            return this;
        }
        public Integer getTagId() {
            return this.tagId;
        }

        public ChangeLogoResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
