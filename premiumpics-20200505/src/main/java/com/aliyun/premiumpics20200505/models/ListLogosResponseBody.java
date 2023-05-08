// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListLogosResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListLogosResponseBodyData> data;

    @NameInMap("LogoVersion")
    public String logoVersion;

    @NameInMap("NextPage")
    public Integer nextPage;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Version")
    public String version;

    public static ListLogosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogosResponseBody self = new ListLogosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogosResponseBody setData(java.util.List<ListLogosResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLogosResponseBodyData> getData() {
        return this.data;
    }

    public ListLogosResponseBody setLogoVersion(String logoVersion) {
        this.logoVersion = logoVersion;
        return this;
    }
    public String getLogoVersion() {
        return this.logoVersion;
    }

    public ListLogosResponseBody setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Integer getNextPage() {
        return this.nextPage;
    }

    public ListLogosResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLogosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLogosResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ListLogosResponseBodyData extends TeaModel {
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

        public static ListLogosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLogosResponseBodyData self = new ListLogosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLogosResponseBodyData setCollect(Integer collect) {
            this.collect = collect;
            return this;
        }
        public Integer getCollect() {
            return this.collect;
        }

        public ListLogosResponseBodyData setEnableChangeColor(Boolean enableChangeColor) {
            this.enableChangeColor = enableChangeColor;
            return this;
        }
        public Boolean getEnableChangeColor() {
            return this.enableChangeColor;
        }

        public ListLogosResponseBodyData setEnableChangeFont(Boolean enableChangeFont) {
            this.enableChangeFont = enableChangeFont;
            return this;
        }
        public Boolean getEnableChangeFont() {
            return this.enableChangeFont;
        }

        public ListLogosResponseBodyData setEnableChangeIcon(Boolean enableChangeIcon) {
            this.enableChangeIcon = enableChangeIcon;
            return this;
        }
        public Boolean getEnableChangeIcon() {
            return this.enableChangeIcon;
        }

        public ListLogosResponseBodyData setEnableChangeLayout(Boolean enableChangeLayout) {
            this.enableChangeLayout = enableChangeLayout;
            return this;
        }
        public Boolean getEnableChangeLayout() {
            return this.enableChangeLayout;
        }

        public ListLogosResponseBodyData setGoodsId(String goodsId) {
            this.goodsId = goodsId;
            return this;
        }
        public String getGoodsId() {
            return this.goodsId;
        }

        public ListLogosResponseBodyData setTagId(Integer tagId) {
            this.tagId = tagId;
            return this;
        }
        public Integer getTagId() {
            return this.tagId;
        }

        public ListLogosResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
